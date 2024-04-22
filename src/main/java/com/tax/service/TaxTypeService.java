package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface TaxTypeService {
    /**
      分页查询税务类型数据列表
    */
    public Map<String, Object> getDataList(TaxType queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装税务类型为前台展示的数据形式
    */
    public Map<String, Object> getTaxTypeModel(TaxType model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(TaxType model, LoginModel login);

    /**
      修改
    */
    public String update(TaxType model, LoginModel login);
}

