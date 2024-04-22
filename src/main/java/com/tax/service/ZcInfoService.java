package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface ZcInfoService {
    /**
      分页查询法规政策数据列表
    */
    public Map<String, Object> getDataList(ZcInfo queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装法规政策为前台展示的数据形式
    */
    public Map<String, Object> getZcInfoModel(ZcInfo model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(ZcInfo model, LoginModel login);

    /**
      修改
    */
    public String update(ZcInfo model, LoginModel login);
}

