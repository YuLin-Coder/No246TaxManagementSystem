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
public class UserInfoServiceImpl implements UserInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;

    /**
      修改
    */
    @Override
    public String update(UserInfo model, LoginModel login) {
        UserInfo preModel = userInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getRealName() == null) || model.getRealName().equals("")) {
            return "姓名为必填属性";
        }

        if ((model.getCelPhone() == null) || model.getCelPhone().equals("")) {
            return "联系电话为必填属性";
        }

        if (model.getCelPhone() != null) {
            Pattern p = Pattern.compile(
                    "^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
            Matcher m = p.matcher(model.getCelPhone());

            if (m.matches() == false) {
                return "请输入正确的联系电话";
            }
        }

        if ((model.getIdNumber() == null) || model.getIdNumber().equals("")) {
            return "身份证号码为必填属性";
        }

        if (model.getIdNumber() != null) {
            Pattern p = Pattern.compile(
                    "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)");
            Matcher m = p.matcher(model.getIdNumber());

            if (m.matches() == false) {
                return "请输入正确的身份证号码";
            }
        }

        if ((model.getEmail() == null) || model.getEmail().equals("")) {
            return "邮箱为必填属性";
        }

        if (model.getEmail() != null) {
            Pattern p = Pattern.compile(
                    "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
            Matcher m = p.matcher(model.getEmail());

            if (m.matches() == false) {
                return "请输入正确的邮箱";
            }
        }

        if (model.getCityId() == null) {
            return "城市为必填属性";
        }

        if ((model.getAddress() == null) || model.getAddress().equals("")) {
            return "地址为必填属性";
        }

        preModel.setRealName(model.getRealName());
        preModel.setCelPhone(model.getCelPhone());
        preModel.setIdNumber(model.getIdNumber());
        preModel.setEmail(model.getEmail());
        preModel.setCityId(model.getCityId());
        preModel.setAddress(model.getAddress());
        userInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询用户列表数据
    */
    @Override
    public Map<String, Object> getDataList(UserInfo queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        UserInfoExample se = new UserInfoExample();
        UserInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        if ((queryModel.getLoginName() != null) &&
                (queryModel.getLoginName().equals("") == false)) {
            sc.andLoginNameLike("%" + queryModel.getLoginName() + "%"); //模糊查询
        }

        if ((queryModel.getRealName() != null) &&
                (queryModel.getRealName().equals("") == false)) {
            sc.andRealNameLike("%" + queryModel.getRealName() + "%"); //模糊查询
        }

        if (queryModel.getCityId() != null) {
            sc.andCityIdEqualTo(queryModel.getCityId()); //查询城市等于指定值
        }

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        int count = (int) userInfoMapper.countByExample(se);
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

        List<UserInfo> list = userInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (UserInfo model : list) {
            list2.add(getUserInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装用户为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getUserInfoModel(UserInfo model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userInfo", model);

        if (model.getCityId() != null) {
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey(model.getCityId()); //城市为外接字段,需要关联城市来解释该字段

            if (cityInfo != null) {
                map.put("cityIdStr", cityInfo.getCname());
            }
        }

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }
}

