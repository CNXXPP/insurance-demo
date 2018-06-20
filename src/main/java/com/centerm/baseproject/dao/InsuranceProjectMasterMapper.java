package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.InsuranceProjectMaster;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InsuranceProjectMasterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsuranceProjectMaster record);

    InsuranceProjectMaster selectByPrimaryKey(Integer id);

    List<InsuranceProjectMaster> selectAll();

    int updateByPrimaryKey(InsuranceProjectMaster record);

    List<InsuranceProjectMaster> selectByProjectName(String projectName);

    InsuranceProjectMaster selectByProjectId(Integer projectId);

    List<InsuranceProjectMaster> selectAttachProject();
}