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
@RequestMapping("/staff/fp_log")
public class SFpLogController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    FpLogService fpLogService;
    @Autowired
    FpLogMapper fpLogMapper;
    @Autowired
    StaffInfoMapper staffInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
        modelMap.addAttribute("taxStatusList", DataListUtils.getTaxStatusList()); //返回tax_status列表
    }

    /**
     * 返回发票记录列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        StaffInfo staffInfo = staffInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", staffInfo);
        getList(modelMap, login); //获取数据列表并返回给前台

        return "staff/fp_log/list";
    }

    /**
     * 根据查询条件分页查询发票记录数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(FpLog model, Integer page, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return fpLogService.getDataList(model, page, CommonVal.pageSize, login); //分页查询数据
    }

    /**
     进入审核不通过页面
    */
    @RequestMapping("btg")
    public String btg(ModelMap modelMap, FpLog model, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        getList(modelMap, login); //获取前台需要用到的数据列表并返回给前台

        FpLog data = fpLogMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "staff/fp_log/btg_page";
    }

    /**
     审核不通过提交信息接口
    */
    @RequestMapping("btg_submit")
    @ResponseBody
    public Object btg_submit(FpLog model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = fpLogService.btg(model, login); //执行修改操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "审核不通过成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    @RequestMapping(value = "tg")
    @ResponseBody
    public Object tg(Integer id, ModelMap modelMap, HttpServletRequest request,
        HttpServletResponse response) {
        Map<String, Object> rs = new HashMap<String, Object>();
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        FpLog model = fpLogMapper.selectByPrimaryKey(id);

        if (model == null) {
            rs.put("code", 0);
            rs.put("msg",
                "该发票记录已不存在");

            return rs;
        }

        model.setCheckStatus(2);
        fpLogMapper.updateByPrimaryKey(model);
        rs.put("code", 1);
        rs.put("msg",
            "审核通过成功");

        return rs;
    }
}

