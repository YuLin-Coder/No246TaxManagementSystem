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
public class ApplyLogServiceImpl implements ApplyLogService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    ApplyLogMapper applyLogMapper;
    @Autowired
    TaxTypeMapper taxTypeMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;

    /**
      申报税务
    */
    @Override
    public String add(ApplyLog model, LoginModel login) {
        if ((model.getTaxTitle() == null) || model.getTaxTitle().equals("")) {
            return "申报名目为必填属性";
        }

        if (model.getTaxType() == null) {
            return "报税类型为必填属性";
        }

        if ((model.getTaxIntro() == null) || model.getTaxIntro().equals("")) {
            return "报税简述为必填属性";
        }

        if (model.getTaxAmount() == null) {
            return "项目金额为必填属性";
        }

        if ((model.getRealName() == null) || model.getRealName().equals("")) {
            return "报税人为必填属性";
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

        if (model.getTaxUserType() == null) {
            return "主体类型为必填属性";
        }

        if ((model.getZtName() == null) || model.getZtName().equals("")) {
            return "主体名为必填属性";
        }

        if ((model.getZtNo() == null) || model.getZtNo().equals("")) {
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

        model.setTaxNo(sdf3.format(new Date()) +
            RandomCodeUtils.getRandomCode()); //随机码(当前时间+6位随机码)
        model.setUserId(login.getId()); //登录id
        model.setTaxStatus(1); //默认待审核,
        model.setCreateTime(sdf1.format(new Date())); //当前时间格式

        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //查询用户供以下填入其他字段

        if (userInfo != null) {
            model.setCityId(userInfo.getCityId());
        }

        applyLogMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      审核不通过
    */
    @Override
    public String btg(ApplyLog model, LoginModel login) {
        ApplyLog preModel = applyLogMapper.selectByPrimaryKey(model.getId());

        if ((model.getCheckRemark() == null) ||
                model.getCheckRemark().equals("")) {
            return "审核备注为必填属性";
        }

        preModel.setTaxStatus(3); //状态设置为审核不通过
        preModel.setCheckRemark(model.getCheckRemark());
        applyLogMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询申报记录列表数据
    */
    @Override
    public Map<String, Object> getDataList(ApplyLog queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        ApplyLogExample se = new ApplyLogExample();
        ApplyLogExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        if ((queryModel.getTaxNo() != null) &&
                (queryModel.getTaxNo().equals("") == false)) {
            sc.andTaxNoLike("%" + queryModel.getTaxNo() + "%"); //模糊查询
        }

        if ((queryModel.getTaxTitle() != null) &&
                (queryModel.getTaxTitle().equals("") == false)) {
            sc.andTaxTitleLike("%" + queryModel.getTaxTitle() + "%"); //模糊查询
        }

        if (queryModel.getTaxType() != null) {
            sc.andTaxTypeEqualTo(queryModel.getTaxType()); //查询报税类型等于指定值
        }

        if (queryModel.getTaxUserType() != null) {
            sc.andTaxUserTypeEqualTo(queryModel.getTaxUserType()); //查询主体类型等于指定值
        }

        if (queryModel.getTaxStatus() != null) {
            sc.andTaxStatusEqualTo(queryModel.getTaxStatus()); //查询状态等于指定值
        }

        if (queryModel.getUserId() != null) {
            sc.andUserIdEqualTo(queryModel.getUserId());
        }
        if(login.getLoginType()==2){
        	sc.andCityIdEqualTo(login.getCityId());
        }

        int count = (int) applyLogMapper.countByExample(se);
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

        List<ApplyLog> list = applyLogMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (ApplyLog model : list) {
            list2.add(getApplyLogModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装申报记录为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getApplyLogModel(ApplyLog model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("applyLog", model);

        if (model.getTaxType() != null) {
            TaxType taxType = taxTypeMapper.selectByPrimaryKey(model.getTaxType()); //报税类型为外接字段,需要关联税务类型来解释该字段

            if (taxType != null) {
                map.put("taxTypeStr", taxType.getTypeName());
            }
        }

        if (model.getUserId() != null) {
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //报税用户为外接字段,需要关联用户来解释该字段

            if (userInfo != null) {
                map.put("userIdStr", userInfo.getLoginName());
            }
        }

        map.put("taxUserTypeStr",
            DataListUtils.getTaxUserTypeNameById(model.getTaxUserType() + "")); //解释主体类型字段
        map.put("taxStatusStr",
            DataListUtils.getTaxStatusNameById(model.getTaxStatus() + "")); //解释状态字段

        if (model.getCityId() != null) {
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey(model.getCityId()); //用户城市为外接字段,需要关联城市来解释该字段

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
        applyLogMapper.deleteByPrimaryKey(id);
    }
}

