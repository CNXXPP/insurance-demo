package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.PaySpanType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PaySpanTypeMapper {
    int insert(PaySpanType record);

    List<PaySpanType> selectAll();

}