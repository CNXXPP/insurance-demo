package com.centerm.baseproject.controller;

import com.alibaba.fastjson.JSONArray;
import com.centerm.baseproject.dto.FinalProjectInfo;
import com.centerm.baseproject.enums.GlobalErrorEnum;
import com.centerm.baseproject.service.InsuranceProjectService;
import com.centerm.baseproject.service.impl.InsuranceProjectServiceImpl;
import com.centerm.constant.validate.Insert;
import com.centerm.constant.validate.Select;
import com.centerm.dto.common.JSONResponse;
import com.centerm.exception.MyRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("insurance")
@Slf4j
public class InsuranceController extends AbstractAPI{

    @Autowired
    private InsuranceProjectService insuranceProjectService;

    @RequestMapping("test")
    public JSONResponse testException(){
        throw new MyRuntimeException(GlobalErrorEnum.UNKNOWN_ERROR);
    }

    /**
     * 所有计划列表（包括计划详情）
     * @return
     */
    @RequestMapping("allProjectList")
    public JSONResponse allProjectList(){
        return success(insuranceProjectService.getAllProject());
    }

    /**
     * 所有计划列表
     * @return
     */
    @RequestMapping("allProjectMasterList")
    public JSONResponse allProjectMaster(){
        return success(insuranceProjectService.getAllProjectMaster(""));
    }

    /**
     * 搜索计划列表
     * @param projectName
     * @return
     */
    @RequestMapping("searchProjectMasterList")
    public JSONResponse searchProjectMaster(@RequestParam("projectName") String projectName){
        return success(insuranceProjectService.getAllProjectMaster(projectName));
    }

    /**
     * 获取指定保险计划详情
     * @param projectId
     * @return
     */
    @RequestMapping("getProjectByProjectId")
    public JSONResponse getProjectByProjectId(@RequestParam("projectId") Integer projectId){
        return success(insuranceProjectService.getProjectByProjectId(projectId));
    }

    /**
     * 获得可作为附加险添加的保险计划列表
     *
     * @return
     */
    @RequestMapping("getAttachProject")
    public JSONResponse getAttachProject(@RequestBody List<Integer> list){
        return success(insuranceProjectService.getAttachProject(list));
    }

    /**
     * 添加最终保险计划
     * @param finalProjectInfo
     */
    @RequestMapping("finalProjectSave")
    public JSONResponse finalProjectSave(@RequestBody @Validated(Insert.class) FinalProjectInfo finalProjectInfo){
        log.info("{}",finalProjectInfo.toString());
        return success(insuranceProjectService.FinalProjectSave(finalProjectInfo));
    }

    /**
     * 获取最终保险计划
     */
    @RequestMapping("getFinalProject")
    public JSONResponse getFinalProject(@RequestParam String finalProjectId){
        return success(insuranceProjectService.getFinalProjectInfoById(finalProjectId));
    }
}
