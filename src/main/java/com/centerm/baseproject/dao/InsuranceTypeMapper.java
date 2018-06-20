package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.InsuranceType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InsuranceTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsuranceType record);

    InsuranceType selectByPrimaryKey(Integer id);

    List<InsuranceType> selectAll();

    int updateByPrimaryKey(InsuranceType record);

    InsuranceType selectByInsuranceCode(Integer code);
}