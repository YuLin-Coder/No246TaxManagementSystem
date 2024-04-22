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
public class MsgInfoServiceImpl implements MsgInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    MsgInfoMapper msgInfoMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;

    /**
      新增留言
    */
    @Override
    public String add(MsgInfo model, LoginModel login) {
        if ((model.getMsgContent() == null) ||
                model.getMsgContent().equals("")) {
            return "留言内容为必填属性";
        }

        model.setReplyStatus(1); //默认未回复,
        model.setUserId(login.getId()); //登录id
        model.setCreateTime(sdf1.format(new Date())); //当前时间格式

        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //查询用户供以下填入其他字段

        if (userInfo != null) {
            model.setUserCity(userInfo.getCityId());
        }

        msgInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      回复
    */
    @Override
    public String reply(MsgInfo model, LoginModel login) {
        MsgInfo preModel = msgInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getReplyContent() == null) ||
                model.getReplyContent().equals("")) {
            return "回复内容为必填属性";
        }

        preModel.setReplyStatus(2); //回复状态设置为已回复
        preModel.setReplyContent(model.getReplyContent());
        msgInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询留言反馈列表数据
    */
    @Override
    public Map<String, Object> getDataList(MsgInfo queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        MsgInfoExample se = new MsgInfoExample();
        MsgInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        if (queryModel.getReplyStatus() != null) {
            sc.andReplyStatusEqualTo(queryModel.getReplyStatus()); //查询回复状态等于指定值
        }

        if (queryModel.getUserId() != null) {
            sc.andUserIdEqualTo(queryModel.getUserId());
        }
        if(login.getLoginType()==2){
        	sc.andUserCityEqualTo(login.getCityId());
        }
        int count = (int) msgInfoMapper.countByExample(se);
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

        List<MsgInfo> list = msgInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (MsgInfo model : list) {
            list2.add(getMsgInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装留言反馈为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getMsgInfoModel(MsgInfo model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msgInfo", model);
        map.put("replyStatusStr",
            DataListUtils.getReplyStatusNameById(model.getReplyStatus() + "")); //解释回复状态字段

        if (model.getUserId() != null) {
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //留言用户为外接字段,需要关联用户来解释该字段

            if (userInfo != null) {
                map.put("userIdStr", userInfo.getLoginName());
            }
        }

        if (model.getUserCity() != null) {
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey(model.getUserCity()); //用户城市为外接字段,需要关联城市来解释该字段

            if (cityInfo != null) {
                map.put("userCityStr", cityInfo.getCname());
            }
        }

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        msgInfoMapper.deleteByPrimaryKey(id);
    }
}

