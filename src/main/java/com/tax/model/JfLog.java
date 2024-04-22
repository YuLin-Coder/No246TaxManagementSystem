package com.tax.model;

public class JfLog {
    private Integer id; //ID
    private String jfNo; //缴费编号
    private String createTime; //缴费时间
    private Integer userId; //缴费用户
    private Integer taxId; //税务编号
    private Double amount; //缴费金额
    private Integer cityId; //用户城市

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJfNo() {
        return jfNo;
    }

    public void setJfNo(String jfNo) {
        this.jfNo = (jfNo == null) ? null : jfNo.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}

