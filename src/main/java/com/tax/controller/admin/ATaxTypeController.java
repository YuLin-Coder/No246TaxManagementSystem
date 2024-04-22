package com.tax.controller.admin;

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
@RequestMapping("/admin/tax_type")
public class ATaxTypeController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    TaxTypeService taxTypeService;
    @Autowired
    AdminInfoMapper adminInfoMapper;
    @Autowired
    TaxTypeMapper taxTypeMapper;

    /**
    * 返回税务类型列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        AdminInfo adminInfo = adminInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", adminInfo);

        return "admin/tax_type/list";
    }

    /**
     * 根据查询条件分页查询税务类型数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(TaxType model, Integer page, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return taxTypeService.getDataList(model, page, CommonVal.pageSize, login); //分页查询数据
    }

    /**
     进入新增页面
    */
    @RequestMapping("add")
    public String add(ModelMap modelMap, TaxType model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        modelMap.addAttribute("data", model);

        return "admin/tax_type/add_page";
    }

    /**
     新增提交信息接口
    */
    @RequestMapping("add_submit")
    @ResponseBody
    public Object add_submit(TaxType model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = taxTypeService.add(model, login); //执行添加操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "新增成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    /**
     进入修改页面
    */
    @RequestMapping("update")
    public String update(ModelMap modelMap, TaxType model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        TaxType data = taxTypeMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "admin/tax_type/update_page";
    }

    /**
     修改提交信息接口
    */
    @RequestMapping("update_submit")
    @ResponseBody
    public Object update_submit(TaxType model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = taxTypeService.update(model, login); //执行修改操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "修改成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    /**
     删除税务类型接口
    */
    @RequestMapping("del")
    @ResponseBody
    public Object del(Integer id, ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        taxTypeService.delete(id);
        rs.put("code", 1);
        rs.put("msg",
            "删除成功");

        return rs;
    }
}

