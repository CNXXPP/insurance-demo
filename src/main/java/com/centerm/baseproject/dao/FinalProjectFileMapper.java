package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.FinalProjectFile;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public interface FinalProjectFileMapper {

    int insert(@Param("pojo") FinalProjectFile finalProjectFile);

}
