package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.FinalProjectMaster;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FinalProjectMasterMapper {
    int deleteByPrimaryKey(String id);

    int insert(FinalProjectMaster record);

    FinalProjectMaster selectByPrimaryKey(String id);

    List<FinalProjectMaster> selectAll();

    int updateByPrimaryKey(FinalProjectMaster record);
}