package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface ApplyLogService {
    /**
      分页查询申报记录数据列表
    */
    public Map<String, Object> getDataList(ApplyLog queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装申报记录为前台展示的数据形式
    */
    public Map<String, Object> getApplyLogModel(ApplyLog model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      申报税务
    */
    public String add(ApplyLog model, LoginModel login);

    /**
      审核不通过
    */
    public String btg(ApplyLog model, LoginModel login);
}

