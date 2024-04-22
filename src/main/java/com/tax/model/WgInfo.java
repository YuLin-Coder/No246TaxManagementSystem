package com.tax.model;

public class WgInfo {
    private Integer id; //ID
    private String title; //标题
    private String wgType; //违规类型
    private String wgDetail; //违规详情
    private String createTime; //发布时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = (title == null) ? null : title.trim();
    }

    public String getWgType() {
        return wgType;
    }

    public void setWgType(String wgType) {
        this.wgType = (wgType == null) ? null : wgType.trim();
    }

    public String getWgDetail() {
        return wgDetail;
    }

    public void setWgDetail(String wgDetail) {
        this.wgDetail = (wgDetail == null) ? null : wgDetail.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }
}

