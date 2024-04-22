package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface TaxLogService {
    /**
      分页查询报税记录数据列表
    */
    public Map<String, Object> getDataList(TaxLog queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装报税记录为前台展示的数据形式
    */
    public Map<String, Object> getTaxLogModel(TaxLog model, LoginModel login);

    /**
      审核通过
    */
    public String sqtg(TaxLog model, LoginModel login);
}

