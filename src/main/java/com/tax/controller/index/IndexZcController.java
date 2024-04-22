package com.tax.controller.index;

import com.tax.controller.*;
import com.tax.dao.*;
import com.tax.model.*;
import com.tax.service.*;
import com.tax.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("")
public class IndexZcController {
    @Autowired
    ZcInfoMapper ZcInfoMapper;
    
    
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    /**
            进入搜索列表接口
    **/
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        modelMap.addAttribute("login", login);

        return "index/zc_list";
    }

    @RequestMapping(value = "search")
    @ResponseBody
    public Object search(String searchWord, Integer page,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        int pageSize = 8;

        if (page == null) {
            page = 1;
        }

        ZcInfoExample te = new ZcInfoExample();
        ZcInfoExample.Criteria tc = te.createCriteria();
        te.setOrderByClause("id desc");
        if ((searchWord != null) && (searchWord.trim().equals("") == false)) {
            tc.andTitleLike("%" + searchWord + "%");
        }

        int count = (int) ZcInfoMapper.countByExample(te);
        int totalPage = 0;

        if ((count > 0) && ((count % pageSize) == 0)) {
            totalPage = count / pageSize;
        } else {
            totalPage = (count / pageSize) + 1;
        }

        te.setPageRows(pageSize);
        te.setStartRow((page - 1) * pageSize);

        List<ZcInfo> tl = ZcInfoMapper.selectByExample(te);
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        for (ZcInfo t : tl) {
           	Map<String,Object> map = new HashMap<String,Object>();
        	map.put("t", t);
        	list.add(map);
        }

        Map<String, Object> rs = new HashMap<String, Object>();
        rs.put("data", list);
        rs.put("count", count);
        rs.put("totalPage", totalPage);
        rs.put("pageSize", pageSize);

        return rs;
    }
    
    
    @RequestMapping(value = "detail")
    public String detail(ModelMap modelMap, Integer id,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        modelMap.addAttribute("login", login);

        ZcInfo t = ZcInfoMapper.selectByPrimaryKey(id);

        if (t == null) {
           t = new ZcInfo();
        }

    	 modelMap.addAttribute("detail", t);
    	 
        return "index/zc_detail";
    }
    

}

