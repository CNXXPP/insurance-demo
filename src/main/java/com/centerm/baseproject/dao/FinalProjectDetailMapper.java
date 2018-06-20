package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.FinalProjectDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FinalProjectDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinalProjectDetail record);

    FinalProjectDetail selectByPrimaryKey(Integer id);

    List<FinalProjectDetail> selectAll();

    int updateByPrimaryKey(FinalProjectDetail record);

    List<FinalProjectDetail> selectByInsuranceCode(String id);
}