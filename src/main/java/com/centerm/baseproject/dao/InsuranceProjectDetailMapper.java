package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.InsuranceProjectDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InsuranceProjectDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsuranceProjectDetail record);

    InsuranceProjectDetail selectByPrimaryKey(Integer id);

    List<InsuranceProjectDetail> selectAll();

    int updateByPrimaryKey(InsuranceProjectDetail record);

    List<InsuranceProjectDetail> selectByMasterId(Integer masterId);
}