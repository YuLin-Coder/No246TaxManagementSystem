package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface StaffInfoService {
    /**
      分页查询办税人员数据列表
    */
    public Map<String, Object> getDataList(StaffInfo queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装办税人员为前台展示的数据形式
    */
    public Map<String, Object> getStaffInfoModel(StaffInfo model,
        LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(StaffInfo model, LoginModel login);

    /**
      修改
    */
    public String update(StaffInfo model, LoginModel login);
}

