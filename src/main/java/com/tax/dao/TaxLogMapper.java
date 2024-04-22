package com.tax.dao;

import com.tax.model.TaxLog;
import com.tax.model.TaxLogExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TaxLogMapper {
    long countByExample(TaxLogExample example);

    int deleteByExample(TaxLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaxLog record);

    int insertSelective(TaxLog record);

    List<TaxLog> selectByExample(TaxLogExample example);

    TaxLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    TaxLog record, @Param("example")
    TaxLogExample example);

    int updateByExample(@Param("record")
    TaxLog record, @Param("example")
    TaxLogExample example);

    int updateByPrimaryKeySelective(TaxLog record);

    int updateByPrimaryKey(TaxLog record);
}

