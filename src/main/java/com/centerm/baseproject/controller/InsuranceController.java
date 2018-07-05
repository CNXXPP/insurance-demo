package com.centerm.baseproject.controller;

import com.alibaba.fastjson.JSONArray;
import com.centerm.baseproject.domain.FinalProjectFile;
import com.centerm.baseproject.dto.FinalProjectInfo;
import com.centerm.baseproject.enums.FinalProjectEnum;
import com.centerm.baseproject.enums.GlobalErrorEnum;
import com.centerm.baseproject.service.InsuranceProjectService;
import com.centerm.baseproject.service.impl.InsuranceProjectServiceImpl;
import com.centerm.constant.validate.Insert;
import com.centerm.constant.validate.Select;
import com.centerm.dto.common.JSONResponse;
import com.centerm.exception.MyRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("insurance")
@Slf4j
public class InsuranceController extends AbstractAPI implements ErrorController  {

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

    /***
     * 存储文件
     * @param upfile
     * @return
     * @throws Exception
     */
    @RequestMapping("upload")
    public  JSONResponse upload(@RequestParam("file") MultipartFile upfile) throws Exception {
        String originalFilename = upfile.getOriginalFilename();
        String[] split = originalFilename.split("\\.");
        if(split.length != 2) {
            throw new  MyRuntimeException(FinalProjectEnum.FILE_NAME_ERROR);
        }
        String newName = split[0] + "_" + System.currentTimeMillis() + "." + split[1];
        InputStream is = upfile.getInputStream();
        byte[] b = new byte[is.available()];
        is.read(b);
        File dir = new File("D://insurance");
        if(!dir.exists()){
            dir.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(new File("D://insurance/"+newName));
        insuranceProjectService.finalProjectFileSave(new FinalProjectFile(split[0],"D://insurance/"+newName));
        fos.write(b);
        fos.flush();
        fos.close();
        return success();
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
