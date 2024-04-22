package com.tax.controller.staff;

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
@RequestMapping("/staff/tax_log")
public class STaxLogController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    TaxLogService taxLogService;
    @Autowired
    StaffInfoMapper staffInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    ApplyLogMapper applyLogMapper;
    @Autowired
    TaxLogMapper taxLogMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
        modelMap.addAttribute("jfStatusList", DataListUtils.getJfStatusList()); //返回jf_status列表
    }

    /**
     * 返回报税记录列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, Integer applyId,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        StaffInfo staffInfo = staffInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", staffInfo);

        TaxLog model = new TaxLog();
        model.setApplyId(applyId);
        modelMap.addAttribute("data", model);
        getList(modelMap, login); //获取数据列表并返回给前台

        return "staff/tax_log/list";
    }

    /**
     * 根据查询条件分页查询报税记录数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(TaxLog model, Integer page, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return taxLogService.getDataList(model, page, CommonVal.pageSize, login); //分页查询数据
    }

    /**
     进入审核通过页面
    */
    @RequestMapping("sqtg")
    public String sqtg(ModelMap modelMap, TaxLog model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        getList(modelMap, login); //获取前台需要用到的数据列表并返回给前台
        modelMap.addAttribute("data", model);

        return "staff/tax_log/sqtg_page";
    }

    /**
     审核通过提交信息接口
    */
    @RequestMapping("sqtg_submit")
    @ResponseBody
    public Object sqtg_submit(TaxLog model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = taxLogService.sqtg(model, login); //执行添加操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "审核通过成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }
}

