package com.tax.service;

import com.tax.controller.LoginModel;

import com.tax.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface NoticeInfoService {
    /**
      分页查询公告数据列表
    */
    public Map<String, Object> getDataList(NoticeInfo queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装公告为前台展示的数据形式
    */
    public Map<String, Object> getNoticeInfoModel(NoticeInfo model,
        LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(NoticeInfo model, LoginModel login);

    /**
      修改
    */
    public String update(NoticeInfo model, LoginModel login);
}

