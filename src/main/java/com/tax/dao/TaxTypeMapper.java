package com.tax.dao;

import com.tax.model.TaxType;
import com.tax.model.TaxTypeExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TaxTypeMapper {
    long countByExample(TaxTypeExample example);

    int deleteByExample(TaxTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaxType record);

    int insertSelective(TaxType record);

    List<TaxType> selectByExample(TaxTypeExample example);

    TaxType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    TaxType record, @Param("example")
    TaxTypeExample example);

    int updateByExample(@Param("record")
    TaxType record, @Param("example")
    TaxTypeExample example);

    int updateByPrimaryKeySelective(TaxType record);

    int updateByPrimaryKey(TaxType record);
}

