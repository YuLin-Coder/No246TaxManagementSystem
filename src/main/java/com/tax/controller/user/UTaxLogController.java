package com.tax.controller.user;

import com.tax.controller.LoginModel;

import com.tax.dao.*;

import com.tax.model.*;

import com.tax.service.*;
import com.tax.service.impl.*;

import com.tax.util.*;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user/tax_log")
public class UTaxLogController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    TaxLogService taxLogService;
    @Autowired
    CityInfoMapper cityInfoMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    ApplyLogMapper applyLogMapper;
    @Autowired
    TaxLogMapper taxLogMapper;
    @Autowired
    JfLogMapper JfLogMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
        modelMap.addAttribute("jfStatusList", DataListUtils.getJfStatusList()); //返回jf_status列表
    }

    /**
     * 返回报税记录列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", userInfo);
        getList(modelMap, login); //获取数据列表并返回给前台

        return "user/tax_log/list";
    }

    /**
     * 根据查询条件分页查询报税记录数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(TaxLog model, Integer page, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        model.setUserId(login.getId()); //用户ID等于当前登录id

        return taxLogService.getDataList(model, page, CommonVal.pageSize, login); //分页查询数据
    }

    @RequestMapping(value = "jf")
    @ResponseBody
    public Object jf(Integer id, ModelMap modelMap, HttpServletRequest request,
        HttpServletResponse response) {
        Map<String, Object> rs = new HashMap<String, Object>();
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        TaxLog model = taxLogMapper.selectByPrimaryKey(id);

        if (model == null) {
            rs.put("code", 0);
            rs.put("msg",
                "该报税记录已不存在");

            return rs;
        }

        model.setJfStatus(2);
        taxLogMapper.updateByPrimaryKey(model);
        
        JfLog jf = new JfLog();
        jf.setAmount(model.getTaxAmount());
        jf.setCityId(model.getUserCity());
        jf.setCreateTime(sdf1.format(new Date()));
        jf.setJfNo(sdf3.format(new Date())+RandomCodeUtils.getRandomCode());
        jf.setTaxId(model.getId());
        jf.setUserId(model.getUserId());
        JfLogMapper.insertSelective(jf);
        rs.put("code", 1);
        rs.put("msg",
            "缴费成功");

        return rs;
    }
}

