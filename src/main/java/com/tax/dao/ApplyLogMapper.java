package com.tax.dao;

import com.tax.model.ApplyLog;
import com.tax.model.ApplyLogExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ApplyLogMapper {
    long countByExample(ApplyLogExample example);

    int deleteByExample(ApplyLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplyLog record);

    int insertSelective(ApplyLog record);

    List<ApplyLog> selectByExample(ApplyLogExample example);

    ApplyLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    ApplyLog record, @Param("example")
    ApplyLogExample example);

    int updateByExample(@Param("record")
    ApplyLog record, @Param("example")
    ApplyLogExample example);

    int updateByPrimaryKeySelective(ApplyLog record);

    int updateByPrimaryKey(ApplyLog record);
}

