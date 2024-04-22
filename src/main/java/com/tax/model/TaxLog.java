package com.tax.model;

public class TaxLog {
    private Integer id; //ID
    private Integer applyId; //申报编号
    private Double projectAmount; //项目金额
    private Double taxAmount; //税务金额
    private String remark; //税务说明
    private Integer userId; //用户ID
    private String createTime; //创建时间
    private String taxNo; //税务编号
    private Integer userCity; //用户城市
    private Integer jfStatus; //缴费状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public Double getProjectAmount() {
        return projectAmount;
    }

    public void setProjectAmount(Double projectAmount) {
        this.projectAmount = projectAmount;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = (remark == null) ? null : remark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = (taxNo == null) ? null : taxNo.trim();
    }

    public Integer getUserCity() {
        return userCity;
    }

    public void setUserCity(Integer userCity) {
        this.userCity = userCity;
    }

    public Integer getJfStatus() {
        return jfStatus;
    }

    public void setJfStatus(Integer jfStatus) {
        this.jfStatus = jfStatus;
    }
}

