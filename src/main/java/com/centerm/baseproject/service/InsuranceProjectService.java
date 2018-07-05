package com.centerm.baseproject.service;

import com.centerm.baseproject.domain.FinalProjectFile;
import com.centerm.baseproject.domain.InsuranceProjectMaster;
import com.centerm.baseproject.dto.FinalProjectInfo;
import com.centerm.baseproject.dto.ProjectInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InsuranceProjectService {

    List<ProjectInfo> getAllProject(); //所有计划，包含计划详情

    List<ProjectInfo> getAllProjectMaster(String projectName); //所有计划列表

    ProjectInfo getProjectByProjectId(@Param("projectId") Integer projectId); //根据保险计划id获取保险计划信息

    List<ProjectInfo> getAttachProject(List<Integer> projectIdList); //获得可作为附加主险的计划列表

    String FinalProjectSave(FinalProjectInfo finalProjectInfo);  //生成计划书

    FinalProjectInfo getFinalProjectInfoById(String id); //根据id获取最终保险计划书

    int finalProjectFileSave(FinalProjectFile finalProjectFile);
}
