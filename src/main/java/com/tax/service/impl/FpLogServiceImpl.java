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
public class FpLogServiceImpl implements FpLogService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    FpLogMapper fpLogMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;

    /**
      申请发票
    */
    @Override
    public String add(FpLog model, LoginModel login) {
        if ((model.getZtName() == null) || model.getZtName().equals("")) {
            return "发票抬头为必填属性";
        }

        if ((model.getZjNo() == null) || model.getZjNo().equals("")) {
            return "主体证件号为必填属性";
        }

        if ((model.getZjImg() == null) || model.getZjImg().equals("")) {
            return "证件图片为必填属性";
        }

        if (model.getZjImg() != null) {
            String[] fileSplit = model.getZjImg().split(";");

            if (fileSplit.length > 2) {
                return "证件图片的图片数量不能大于2";
            }
        }

        if ((model.getFpReason() == null) || model.getFpReason().equals("")) {
            return "开票项目为必填属性";
        }

        if (model.getFpAmount() == null) {
            return "发票金额为必填属性";
        }

        model.setFpNo(sdf3.format(new Date()) +
            RandomCodeUtils.getRandomCode()); //随机码(当前时间+6位随机码)
        model.setCheckStatus(1); //默认待审核,
        model.setUserId(login.getId()); //登录id
        model.setCreateTime(sdf1.format(new Date())); //当前时间格式

        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //查询用户供以下填入其他字段

        if (userInfo != null) {
            model.setUserCity(userInfo.getCityId());
        }

        fpLogMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      审核不通过
    */
    @Override
    public String btg(FpLog model, LoginModel login) {
        FpLog preModel = fpLogMapper.selectByPrimaryKey(model.getId());

        if ((model.getCheckRemark() == null) ||
                model.getCheckRemark().equals("")) {
            return "审核备注为必填属性";
        }

        preModel.setCheckStatus(3); //审核状态设置为审核不通过
        preModel.setCheckRemark(model.getCheckRemark());
        fpLogMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询发票记录列表数据
    */
    @Override
    public Map<String, Object> getDataList(FpLog queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        FpLogExample se = new FpLogExample();
        FpLogExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        if ((queryModel.getFpNo() != null) &&
                (queryModel.getFpNo().equals("") == false)) {
            sc.andFpNoLike("%" + queryModel.getFpNo() + "%"); //模糊查询
        }

        if (queryModel.getCheckStatus() != null) {
            sc.andCheckStatusEqualTo(queryModel.getCheckStatus()); //查询审核状态等于指定值
        }

        if (queryModel.getUserId() != null) {
            sc.andUserIdEqualTo(queryModel.getUserId());
        }
        if(login.getLoginType()==2){
        	sc.andUserCityEqualTo(login.getCityId());
        }
        int count = (int) fpLogMapper.countByExample(se);
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

        List<FpLog> list = fpLogMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (FpLog model : list) {
            list2.add(getFpLogModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装发票记录为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getFpLogModel(FpLog model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("fpLog", model);
        map.put("checkStatusStr",
            DataListUtils.getTaxStatusNameById(model.getCheckStatus() + "")); //解释审核状态字段

        if (model.getUserId() != null) {
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //申请用户为外接字段,需要关联用户来解释该字段

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
        fpLogMapper.deleteByPrimaryKey(id);
    }
}

