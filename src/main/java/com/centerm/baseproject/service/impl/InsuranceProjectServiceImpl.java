package com.centerm.baseproject.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.centerm.baseproject.dao.*;
import com.centerm.baseproject.domain.*;
import com.centerm.baseproject.dto.*;
import com.centerm.baseproject.service.InsuranceProjectService;
import com.centerm.exception.MyRuntimeException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class InsuranceProjectServiceImpl implements InsuranceProjectService {

    @Autowired
    private InsuranceProjectMasterMapper insuranceProjectMasterMapper;

    @Autowired
    private InsuranceProjectDetailMapper insuranceProjectDetailMapper;

    @Autowired
    private InsuranceTypeMapper insuranceTypeMapper;

    @Autowired
    private InsurancePaySpanMapper paySpanMapper;

    @Autowired
    private FinalProjectMasterMapper finalProjectMasterMapper;

    @Autowired
    private FinalProjectDetailMapper finalProjectDetailMapper;

    @Autowired
    private InsuranceResponsibleMapper insuranceResponsibleMapper;

    @Override
    public List<ProjectInfo> getAllProject() {
        //获得所有计划列表
        List<InsuranceProjectMaster> insuranceProjectMasters = insuranceProjectMasterMapper.selectAll();
        List<ProjectInfo> projectInfoList = new ArrayList<>();
        //转化dto
        insuranceProjectMasters.forEach(e -> {
            ProjectInfo projectInfo = new ProjectInfo();
            BeanUtils.copyProperties(e,projectInfo);
            projectInfoList.add(projectInfo);
        });

        //添加计划中的保险详情
        for (ProjectInfo projectInfo : projectInfoList) {
            List<InsuranceProjectDetail> insuranceProjectDetails = insuranceProjectDetailMapper.selectByMasterId(projectInfo.getId());
            List<ProjectDetailInfo> projectDetailInfos = new ArrayList<>();
            insuranceProjectDetails.forEach(e -> {
                ProjectDetailInfo projectDetailInfo = new ProjectDetailInfo();
                BeanUtils.copyProperties(e,projectDetailInfo);
                InsuranceType insuranceType = insuranceTypeMapper.selectByPrimaryKey(projectInfo.getId());
                projectDetailInfo.setPremiumFactorPerAge(insuranceType.getPremiumFactorPerAge());
                projectDetailInfos.add(projectDetailInfo);
            });
            projectInfo.setProjectDetailInfoList(projectDetailInfos);
        }
        return projectInfoList;
    }

    @Override
    public List<ProjectInfo> getAllProjectMaster(String projectName) {
        //获得所有计划列表
        List<InsuranceProjectMaster> insuranceProjectMasters = insuranceProjectMasterMapper.selectByProjectName(projectName);
        List<ProjectInfo> projectInfoList = new ArrayList<>();
        //转化dto
        insuranceProjectMasters.forEach(e -> {
            ProjectInfo projectInfo = new ProjectInfo();
            BeanUtils.copyProperties(e,projectInfo);
            projectInfoList.add(projectInfo);
        });
        return projectInfoList;
    }

    @Override
    public ProjectInfo getProjectByProjectId(Integer projectId) {
        //获取主计划
        InsuranceProjectMaster projectMaster = insuranceProjectMasterMapper.selectByProjectId(projectId);
        ProjectInfo projectInfo = new ProjectInfo();
        BeanUtils.copyProperties(projectMaster,projectInfo);
        //获取详情
        List<InsuranceProjectDetail> insuranceProjectDetails = insuranceProjectDetailMapper.selectByMasterId(projectInfo.getId());
        //生成dto
        List<ProjectDetailInfo> projectDetailInfoList = insuranceProjectDetails.stream().map(e-> {
            ProjectDetailInfo projectDetailInfo = new ProjectDetailInfo();
            BeanUtils.copyProperties(e,projectDetailInfo);
            InsuranceType insuranceType = insuranceTypeMapper.selectByInsuranceCode(e.getInsuranceCode());
            //该险种可选缴费年限
            List<Map<String,Integer>> paySpanMapList = paySpanMapper.selectPaySpanList(e.getInsuranceCode());
            List<Integer> paySpanList = new ArrayList<>();
            paySpanMapList.forEach(s ->{
                paySpanList.add(s.get("pay_year"));
            });
            BeanUtils.copyProperties(insuranceType,projectDetailInfo);
            paySpanList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 < o2 ? -1 : 1;
                }
            });
            String expire = insuranceType.getExpire();
            JSONArray expires = JSON.parseArray(expire);
            projectDetailInfo.setExpire(expires);
            projectDetailInfo.setPaySpanList(paySpanList);
            projectDetailInfo.setpCode(e.getpId());
            return projectDetailInfo;
        }).collect(Collectors.toList());
        projectInfo.setProjectDetailInfoList(projectDetailInfoList);
        return projectInfo;
    }

    @Override
    public List<ProjectInfo> getAttachProject(List<Integer> projectIdList) {
        List<InsuranceProjectMaster>  masterLsit = insuranceProjectMasterMapper.selectAttachProject();
        List<ProjectInfo> projectInfoList = new ArrayList<>();
        masterLsit.forEach(e->{
            ProjectInfo projectInfo = new ProjectInfo();
            if(!projectIdList.contains(e.getId())){ //不存在该计划id，则添加到dto数据中
                BeanUtils.copyProperties(e,projectInfo);
                projectInfoList.add(projectInfo);
            }
        });
        return projectInfoList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String FinalProjectSave(FinalProjectInfo finalProjectInfo) {
        FinalProjectMaster finalProjectMaster = new FinalProjectMaster();
        BeanUtils.copyProperties(finalProjectInfo,finalProjectMaster);
        String uuid = UUID.randomUUID().toString();
        finalProjectMaster.setId(uuid);
        int insert = finalProjectMasterMapper.insert(finalProjectMaster);
        List<FinalProjectDetailInfo> finalProjectDetailInfoList = finalProjectInfo.getFinalProjectDetailInfoList();
        finalProjectDetailInfoList.forEach(e->{
            FinalProjectDetail finalProjectDetail = new FinalProjectDetail();
            BeanUtils.copyProperties(e,finalProjectDetail);
            finalProjectDetail.setMasterProjectId(uuid);
            finalProjectDetailMapper.insert(finalProjectDetail);
        });
        return uuid;
    }

    @Override
    public FinalProjectInfo getFinalProjectInfoById(String id) {
        FinalProjectMaster finalProjectMaster = finalProjectMasterMapper.selectByPrimaryKey(id);
        List<FinalProjectDetail> finalProjectDetails = finalProjectDetailMapper.selectByInsuranceCode(id);
        FinalProjectInfo finalProjectInfo = new FinalProjectInfo();
        BeanUtils.copyProperties(finalProjectMaster,finalProjectInfo);
        //计划险种详情
        Set<String> responsibleSet = new HashSet<>();
        finalProjectInfo.setFinalProjectDetailInfoList(finalProjectDetails.stream().map(e->{
            FinalProjectDetailInfo detailInfo = new FinalProjectDetailInfo();
            BeanUtils.copyProperties(e,detailInfo);
            List<InsuranceResponsible> insuranceResponsibles = insuranceResponsibleMapper.selectByInsuranceCode(e.getInsuranceCode());
            InsuranceType insuranceType = insuranceTypeMapper.selectByInsuranceCode(e.getInsuranceCode());
            detailInfo.setName(insuranceType.getName());
            detailInfo.setIsMainInsurance(insuranceType.getIsSub() == 0 ? 1 : 0); //设置主险标识
            detailInfo.setIntroduce(insuranceType.getIntroduce());
            if(insuranceType.getIsSub() == 0){   //若该险种为主险，总保险计划保险期间，交费期间同该主险
                finalProjectInfo.setPaySpan(detailInfo.getPaySpan());
                finalProjectInfo.setInsuranceSpan(detailInfo.getInsuranceSpan());
            }
            //保险责任
            detailInfo.setResponsibleInfoList(insuranceResponsibles.stream().map(s->{
                InsuranceResponsibleInfo responsibleInfo = new InsuranceResponsibleInfo();
                BeanUtils.copyProperties(s,responsibleInfo);
                responsibleInfo.setPremium(s.getPremiumFactor().multiply(e.getInsuranceCoverage())); //计算出该责任额度
                responsibleSet.add(s.getResponsibleType());//将责任类型加入保险责任set中
                return responsibleInfo;
            }).collect(Collectors.toList()));
            return detailInfo;
        }).collect(Collectors.toList()));
        finalProjectInfo.setResponsibleSet(responsibleSet);
        return finalProjectInfo;
    }
}
