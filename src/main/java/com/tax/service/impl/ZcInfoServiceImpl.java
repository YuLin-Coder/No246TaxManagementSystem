package com.tax.service.impl;

import com.tax.controller.LoginModel;

import com.tax.dao.*;

import com.tax.model.*;

import com.tax.service.*;

import com.tax.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.ui.ModelMap;

import java.io.IOException;
import java.io.InputStream;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Service
public class ZcInfoServiceImpl implements ZcInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    ZcInfoMapper zcInfoMapper;

    /**
      新增
    */
    @Override
    public String add(ZcInfo model, LoginModel login) {
        if ((model.getTitle() == null) || model.getTitle().equals("")) {
            return "标题为必填属性";
        }

        if ((model.getZcIntro() == null) || model.getZcIntro().equals("")) {
            return "简述为必填属性";
        }

        if ((model.getContent() == null) || model.getContent().equals("")) {
            return "详情为必填属性";
        }

        model.setCreateTime(sdf1.format(new Date())); //当前时间格式
        zcInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(ZcInfo model, LoginModel login) {
        ZcInfo preModel = zcInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getTitle() == null) || model.getTitle().equals("")) {
            return "标题为必填属性";
        }

        if ((model.getZcIntro() == null) || model.getZcIntro().equals("")) {
            return "简述为必填属性";
        }

        if ((model.getContent() == null) || model.getContent().equals("")) {
            return "详情为必填属性";
        }

        preModel.setTitle(model.getTitle());
        preModel.setZcIntro(model.getZcIntro());
        preModel.setContent(model.getContent());
        zcInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询法规政策列表数据
    */
    @Override
    public Map<String, Object> getDataList(ZcInfo queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        ZcInfoExample se = new ZcInfoExample();
        ZcInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        if ((queryModel.getTitle() != null) &&
                (queryModel.getTitle().equals("") == false)) {
            sc.andTitleLike("%" + queryModel.getTitle() + "%"); //模糊查询
        }

        int count = (int) zcInfoMapper.countByExample(se);
        int totalPage = 0;

        if ((page != null) && (pageSize != null)) { //分页

            if ((count > 0) && ((count % pageSize) == 0)) {
                totalPage = count / pageSize;
            } else {
                totalPage = (count / pageSize) + 1;
            }

            se.setPageRows(pageSize);
            se.setStartRow((page - 1) * pageSize);
        }

        List<ZcInfo> list = zcInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (ZcInfo model : list) {
            list2.add(getZcInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装法规政策为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getZcInfoModel(ZcInfo model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("zcInfo", model);

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        zcInfoMapper.deleteByPrimaryKey(id);
    }
}

