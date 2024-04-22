package com.tax.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 固定下拉列表解释器
 * @author Administrator
 *
 */
public class DataListUtils {
    public static void main(String[] args) {
    }

    /**
    **获取登录角色列表
    */
    public static List<Map<String, Object>> getLoginTypeList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "admin"));
        list.add(getMap("2", "staff"));
        list.add(getMap("3", "user"));

        return list;
    }

    /**
    **获取tax_user_type数据列表
    */
    public static List<Map<String, Object>> getTaxUserTypeList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "个人"));
        list.add(getMap("2", "公司"));

        return list;
    }

    public static String getTaxUserTypeNameById(String id) { //根据tax_user_type的key值获取名称

        List<Map<String, Object>> list = getTaxUserTypeList();

        return getNameById(id, list);
    }

    /**
    **获取tax_status数据列表
    */
    public static List<Map<String, Object>> getTaxStatusList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "待审核"));
        list.add(getMap("2",
                "审核通过"));
        list.add(getMap("3",
                "审核不通过"));

        return list;
    }

    public static String getTaxStatusNameById(String id) { //根据tax_status的key值获取名称

        List<Map<String, Object>> list = getTaxStatusList();

        return getNameById(id, list);
    }

    /**
    **获取reply_status数据列表
    */
    public static List<Map<String, Object>> getReplyStatusList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "未回复"));
        list.add(getMap("2", "已回复"));

        return list;
    }

    public static String getReplyStatusNameById(String id) { //根据reply_status的key值获取名称

        List<Map<String, Object>> list = getReplyStatusList();

        return getNameById(id, list);
    }

    /**
    **获取jf_status数据列表
    */
    public static List<Map<String, Object>> getJfStatusList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "未缴费"));
        list.add(getMap("2", "已缴费"));

        return list;
    }

    public static String getJfStatusNameById(String id) { //根据jf_status的key值获取名称

        List<Map<String, Object>> list = getJfStatusList();

        return getNameById(id, list);
    }

    public static String getNameById(String id, List<Map<String, Object>> list) {
        if (id == null) {
            return null;
        }

        if (id.endsWith(",")) {
            id = id.substring(0, id.length() - 1);
        }

        String[] idsplit = id.split(",");
        String rs = "";

        for (String tmp : idsplit) {
            for (Map<String, Object> map : list) {
                if (map.get("id").toString().equals(tmp)) {
                    rs += (map.get("name").toString() + ",");
                }
            }
        }

        if (rs.endsWith(",")) {
            rs = rs.substring(0, rs.length() - 1);
        }

        return rs;
    }

    private static Map<String, Object> getMap(String id, String name) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("name", name);

        return map;
    }
}

