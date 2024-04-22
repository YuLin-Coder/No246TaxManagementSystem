package com.tax.dao;

import com.tax.model.FpLog;
import com.tax.model.FpLogExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface FpLogMapper {
    long countByExample(FpLogExample example);

    int deleteByExample(FpLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FpLog record);

    int insertSelective(FpLog record);

    List<FpLog> selectByExample(FpLogExample example);

    FpLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    FpLog record, @Param("example")
    FpLogExample example);

    int updateByExample(@Param("record")
    FpLog record, @Param("example")
    FpLogExample example);

    int updateByPrimaryKeySelective(FpLog record);

    int updateByPrimaryKey(FpLog record);
}

