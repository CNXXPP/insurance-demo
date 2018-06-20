package com.centerm.baseproject.dao;

import com.centerm.baseproject.domain.TemplateType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TemplateTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TemplateType record);

    TemplateType selectByPrimaryKey(Integer id);

    List<TemplateType> selectAll();

    int updateByPrimaryKey(TemplateType record);
}