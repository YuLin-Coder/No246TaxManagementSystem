package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface FpLogService {
    /**
      分页查询发票记录数据列表
    */
    public Map<String, Object> getDataList(FpLog queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装发票记录为前台展示的数据形式
    */
    public Map<String, Object> getFpLogModel(FpLog model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      申请发票
    */
    public String add(FpLog model, LoginModel login);

    /**
      审核不通过
    */
    public String btg(FpLog model, LoginModel login);
}

