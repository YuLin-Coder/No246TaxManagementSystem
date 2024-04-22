package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface WgInfoService {
    /**
      分页查询违规公示数据列表
    */
    public Map<String, Object> getDataList(WgInfo queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装违规公示为前台展示的数据形式
    */
    public Map<String, Object> getWgInfoModel(WgInfo model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(WgInfo model, LoginModel login);

    /**
      修改
    */
    public String update(WgInfo model, LoginModel login);
}

