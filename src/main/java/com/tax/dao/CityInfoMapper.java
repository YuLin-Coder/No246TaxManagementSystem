package com.tax.dao;

import com.tax.model.CityInfo;
import com.tax.model.CityInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CityInfoMapper {
    long countByExample(CityInfoExample example);

    int deleteByExample(CityInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CityInfo record);

    int insertSelective(CityInfo record);

    List<CityInfo> selectByExample(CityInfoExample example);

    CityInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    CityInfo record, @Param("example")
    CityInfoExample example);

    int updateByExample(@Param("record")
    CityInfo record, @Param("example")
    CityInfoExample example);

    int updateByPrimaryKeySelective(CityInfo record);

    int updateByPrimaryKey(CityInfo record);
}

