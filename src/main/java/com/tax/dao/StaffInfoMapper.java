package com.tax.dao;

import com.tax.model.StaffInfo;
import com.tax.model.StaffInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StaffInfoMapper {
    long countByExample(StaffInfoExample example);

    int deleteByExample(StaffInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StaffInfo record);

    int insertSelective(StaffInfo record);

    List<StaffInfo> selectByExample(StaffInfoExample example);

    StaffInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    StaffInfo record, @Param("example")
    StaffInfoExample example);

    int updateByExample(@Param("record")
    StaffInfo record, @Param("example")
    StaffInfoExample example);

    int updateByPrimaryKeySelective(StaffInfo record);

    int updateByPrimaryKey(StaffInfo record);
}

