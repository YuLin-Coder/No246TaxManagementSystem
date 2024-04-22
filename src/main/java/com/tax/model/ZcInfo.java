package com.tax.model;

public class ZcInfo {
    private Integer id; //ID
    private String title; //标题
    private String zcIntro; //简述
    private String content; //详情
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

    public String getZcIntro() {
        return zcIntro;
    }

    public void setZcIntro(String zcIntro) {
        this.zcIntro = (zcIntro == null) ? null : zcIntro.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = (content == null) ? null : content.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }
}

