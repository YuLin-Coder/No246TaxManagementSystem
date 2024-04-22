package com.tax.dao;

import com.tax.model.MsgInfo;
import com.tax.model.MsgInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MsgInfoMapper {
    long countByExample(MsgInfoExample example);

    int deleteByExample(MsgInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgInfo record);

    int insertSelective(MsgInfo record);

    List<MsgInfo> selectByExample(MsgInfoExample example);

    MsgInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    MsgInfo record, @Param("example")
    MsgInfoExample example);

    int updateByExample(@Param("record")
    MsgInfo record, @Param("example")
    MsgInfoExample example);

    int updateByPrimaryKeySelective(MsgInfo record);

    int updateByPrimaryKey(MsgInfo record);
}

