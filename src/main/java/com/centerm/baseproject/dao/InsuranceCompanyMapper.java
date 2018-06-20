package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.InsuranceCompany;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InsuranceCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsuranceCompany record);

    InsuranceCompany selectByPrimaryKey(Integer id);

    List<InsuranceCompany> selectAll();

    int updateByPrimaryKey(InsuranceCompany record);
}