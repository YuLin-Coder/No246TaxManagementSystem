package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface JfLogService {
    /**
      分页查询缴费记录数据列表
    */
    public Map<String, Object> getDataList(JfLog queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装缴费记录为前台展示的数据形式
    */
    public Map<String, Object> getJfLogModel(JfLog model, LoginModel login);
}

