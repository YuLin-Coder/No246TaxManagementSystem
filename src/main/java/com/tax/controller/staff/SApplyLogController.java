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
@RequestMapping("/staff/apply_log")
public class SApplyLogController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    ApplyLogService applyLogService;
    @Autowired
    StaffInfoMapper staffInfoMapper;
    @Autowired
    CityInfoMapper cityInfoMapper;
    @Autowired
    TaxTypeMapper taxTypeMapper;
    @Autowired
    ApplyLogMapper applyLogMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
        TaxTypeExample taxTypeE = new TaxTypeExample();
        TaxTypeExample.Criteria taxTypeC = taxTypeE.createCriteria();
        List<TaxType> taxTypeList = taxTypeMapper.selectByExample(taxTypeE);
        List<Map<String, Object>> taxTypeList2 = new ArrayList<Map<String, Object>>();

        for (TaxType m : taxTypeList) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", m.getId());
            map.put("name", m.getTypeName());
            taxTypeList2.add(map);
        }

        modelMap.addAttribute("taxTypeList", taxTypeList2);
        modelMap.addAttribute("taxUserTypeList",
            DataListUtils.getTaxUserTypeList()); //返回tax_user_type列表
        modelMap.addAttribute("taxStatusList", DataListUtils.getTaxStatusList()); //返回tax_status列表
    }

    /**
     * 返回申报记录列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        StaffInfo staffInfo = staffInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", staffInfo);
        getList(modelMap, login); //获取数据列表并返回给前台

        return "staff/apply_log/list";
    }

    /**
     * 根据查询条件分页查询申报记录数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(ApplyLog model, Integer page,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return applyLogService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }

    /**
     进入审核不通过页面
    */
    @RequestMapping("btg")
    public String btg(ModelMap modelMap, ApplyLog model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        getList(modelMap, login); //获取前台需要用到的数据列表并返回给前台

        ApplyLog data = applyLogMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "staff/apply_log/btg_page";
    }

    /**
     审核不通过提交信息接口
    */
    @RequestMapping("btg_submit")
    @ResponseBody
    public Object btg_submit(ApplyLog model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = applyLogService.btg(model, login); //执行修改操作

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
}

