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
public class JfLogServiceImpl implements JfLogService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    JfLogMapper jfLogMapper;
    @Autowired
    TaxLogMapper taxLogMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;

    /**
    *根据参数查询缴费记录列表数据
    */
    @Override
    public Map<String, Object> getDataList(JfLog queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        JfLogExample se = new JfLogExample();
        JfLogExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        if ((queryModel.getJfNo() != null) &&
                (queryModel.getJfNo().equals("") == false)) {
            sc.andJfNoLike("%" + queryModel.getJfNo() + "%"); //模糊查询
        }

        if (queryModel.getUserId() != null) {
            sc.andUserIdEqualTo(queryModel.getUserId());
        }
        if(login.getLoginType()==2){
        	sc.andCityIdEqualTo(login.getCityId());
        }
        int count = (int) jfLogMapper.countByExample(se);
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

        List<JfLog> list = jfLogMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (JfLog model : list) {
            list2.add(getJfLogModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装缴费记录为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getJfLogModel(JfLog model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("jfLog", model);

        if (model.getTaxId() != null) {
            TaxLog taxLog = taxLogMapper.selectByPrimaryKey(model.getTaxId()); //税务编号为外接字段,需要关联报税记录来解释该字段

            if (taxLog != null) {
                map.put("taxIdStr", taxLog.getTaxNo());
            }
        }

        if (model.getUserId() != null) {
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //缴费用户为外接字段,需要关联用户来解释该字段

            if (userInfo != null) {
                map.put("userIdStr", userInfo.getLoginName());
            }
        }

        if (model.getCityId() != null) {
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey(model.getCityId()); //用户城市为外接字段,需要关联城市来解释该字段

            if (cityInfo != null) {
                map.put("cityIdStr", cityInfo.getCname());
            }
        }

        return map;
    }
}

