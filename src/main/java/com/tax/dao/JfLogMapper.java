package com.tax.dao;

import com.tax.model.JfLog;
import com.tax.model.JfLogExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface JfLogMapper {
    long countByExample(JfLogExample example);

    int deleteByExample(JfLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JfLog record);

    int insertSelective(JfLog record);

    List<JfLog> selectByExample(JfLogExample example);

    JfLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    JfLog record, @Param("example")
    JfLogExample example);

    int updateByExample(@Param("record")
    JfLog record, @Param("example")
    JfLogExample example);

    int updateByPrimaryKeySelective(JfLog record);

    int updateByPrimaryKey(JfLog record);
}

