package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface UserInfoService {
    /**
      分页查询用户数据列表
    */
    public Map<String, Object> getDataList(UserInfo queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装用户为前台展示的数据形式
    */
    public Map<String, Object> getUserInfoModel(UserInfo model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      修改
    */
    public String update(UserInfo model, LoginModel login);
}

