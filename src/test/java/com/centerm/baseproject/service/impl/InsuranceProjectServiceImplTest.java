package com.centerm.baseproject.service.impl;

import com.centerm.baseproject.BaseProjectApplicationTests;
import com.centerm.baseproject.domain.InsuranceProjectMaster;
import com.centerm.baseproject.dto.ProjectInfo;
import com.centerm.baseproject.service.InsuranceProjectService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

@Component
@Slf4j
public class InsuranceProjectServiceImplTest extends BaseProjectApplicationTests{

    @Autowired
    private InsuranceProjectService insuranceProjectService;

    @Test
    public void selectAllProject(){
        List<ProjectInfo> allProject = insuranceProjectService.getAllProject();
        log.info("所有保险计划：{}",allProject);
        Assert.assertNotEquals(allProject.size(),0);
    }
}