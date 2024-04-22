package com.tax.dao;

import com.tax.model.WgInfo;
import com.tax.model.WgInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface WgInfoMapper {
    long countByExample(WgInfoExample example);

    int deleteByExample(WgInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WgInfo record);

    int insertSelective(WgInfo record);

    List<WgInfo> selectByExample(WgInfoExample example);

    WgInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    WgInfo record, @Param("example")
    WgInfoExample example);

    int updateByExample(@Param("record")
    WgInfo record, @Param("example")
    WgInfoExample example);

    int updateByPrimaryKeySelective(WgInfo record);

    int updateByPrimaryKey(WgInfo record);
}

