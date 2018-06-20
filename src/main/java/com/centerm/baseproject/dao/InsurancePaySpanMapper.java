package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.InsurancePaySpan;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface InsurancePaySpanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsurancePaySpan record);

    InsurancePaySpan selectByPrimaryKey(Integer id);

    List<InsurancePaySpan> selectAll();

    int updateByPrimaryKey(InsurancePaySpan record);

    List<Map<String,Integer>> selectPaySpanList(Integer insuranceId);

}