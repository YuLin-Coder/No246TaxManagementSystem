package com.tax.dao;

import com.tax.model.ZcInfo;
import com.tax.model.ZcInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ZcInfoMapper {
    long countByExample(ZcInfoExample example);

    int deleteByExample(ZcInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZcInfo record);

    int insertSelective(ZcInfo record);

    List<ZcInfo> selectByExample(ZcInfoExample example);

    ZcInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    ZcInfo record, @Param("example")
    ZcInfoExample example);

    int updateByExample(@Param("record")
    ZcInfo record, @Param("example")
    ZcInfoExample example);

    int updateByPrimaryKeySelective(ZcInfo record);

    int updateByPrimaryKey(ZcInfo record);
}

