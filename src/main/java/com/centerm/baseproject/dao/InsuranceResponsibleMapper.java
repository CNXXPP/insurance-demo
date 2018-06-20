package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.InsuranceResponsible;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InsuranceResponsibleMapper {
    int deleteByPrimaryKey(String id);

    int insert(InsuranceResponsible record);

    InsuranceResponsible selectByPrimaryKey(String id);

    List<InsuranceResponsible> selectAll();

    int updateByPrimaryKey(InsuranceResponsible record);

    List<InsuranceResponsible> selectByInsuranceCode(Integer insuranceCode);
}