package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface MsgInfoService {
    /**
      分页查询留言反馈数据列表
    */
    public Map<String, Object> getDataList(MsgInfo queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装留言反馈为前台展示的数据形式
    */
    public Map<String, Object> getMsgInfoModel(MsgInfo model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增留言
    */
    public String add(MsgInfo model, LoginModel login);

    /**
      回复
    */
    public String reply(MsgInfo model, LoginModel login);
}

