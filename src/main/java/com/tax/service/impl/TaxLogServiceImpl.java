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
public class TaxLogServiceImpl implements TaxLogService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    TaxLogMapper taxLogMapper;
    @Autowired
    ApplyLogMapper applyLogMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;

    /**
      审核通过
    */
    @Override
    public String sqtg(TaxLog model, LoginModel login) {
        if (model.getTaxAmount() == null) {
            return "税务金额为必填属性";
        }

        if ((model.getRemark() == null) || model.getRemark().equals("")) {
            return "税务说明为必填属性";
        }

        model.setTaxNo(sdf3.format(new Date()) +
            RandomCodeUtils.getRandomCode()); //随机码(当前时间+6位随机码)
        model.setJfStatus(1); //默认未缴费,
        model.setCreateTime(sdf1.format(new Date())); //当前时间格式

        ApplyLog applyLog = applyLogMapper.selectByPrimaryKey(model.getApplyId()); //查询申报记录供以下填入其他字段

        if (applyLog != null) {
            model.setProjectAmount(applyLog.getTaxAmount());
        }

        if (applyLog != null) {
            model.setUserId(applyLog.getUserId());
        }

        if (applyLog != null) {
            model.setUserCity(applyLog.getCityId());
        }
        applyLog.setTaxStatus(2);
        applyLog.setCheckRemark(model.getRemark());
        applyLogMapper.updateByPrimaryKeySelective(applyLog); 

        taxLogMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
    *根据参数查询报税记录列表数据
    */
    @Override
    public Map<String, Object> getDataList(TaxLog queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        TaxLogExample se = new TaxLogExample();
        TaxLogExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        if (queryModel.getApplyId() != null) {
            sc.andApplyIdEqualTo(queryModel.getApplyId());
        }

        if ((queryModel.getTaxNo() != null) &&
                (queryModel.getTaxNo().equals("") == false)) {
            sc.andTaxNoLike("%" + queryModel.getTaxNo() + "%"); //模糊查询
        }

        if (queryModel.getJfStatus() != null) {
            sc.andJfStatusEqualTo(queryModel.getJfStatus()); //查询缴费状态等于指定值
        }

        if (queryModel.getUserId() != null) {
            sc.andUserIdEqualTo(queryModel.getUserId());
        }
        if(login.getLoginType()==2){
        	sc.andUserCityEqualTo(login.getCityId());
        }
        int count = (int) taxLogMapper.countByExample(se);
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

        List<TaxLog> list = taxLogMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (TaxLog model : list) {
            list2.add(getTaxLogModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装报税记录为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getTaxLogModel(TaxLog model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("taxLog", model);
        map.put("jfStatusStr",
            DataListUtils.getJfStatusNameById(model.getJfStatus() + "")); //解释缴费状态字段

        if (model.getApplyId() != null) {
            ApplyLog applyLog = applyLogMapper.selectByPrimaryKey(model.getApplyId()); //申报编号为外接字段,需要关联申报记录来解释该字段

            if (applyLog != null) {
                map.put("applyIdStr", applyLog.getTaxNo());
            }
        }

        if (model.getUserId() != null) {
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //用户ID为外接字段,需要关联用户来解释该字段

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
}

