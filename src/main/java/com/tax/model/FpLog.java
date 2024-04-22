package com.tax.model;

public class FpLog {
    private Integer id; //ID
    private String fpNo; //发票编号
    private String ztName; //发票抬头
    private String fpReason; //开票项目
    private Double fpAmount; //发票金额
    private Integer checkStatus; //审核状态
    private Integer userId; //申请用户
    private String createTime; //申请时间
    private String checkRemark; //审核备注
    private String zjNo; //主体证件号
    private String zjImg; //证件图片
    private Integer userCity; //用户城市

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFpNo() {
        return fpNo;
    }

    public void setFpNo(String fpNo) {
        this.fpNo = (fpNo == null) ? null : fpNo.trim();
    }

    public String getZtName() {
        return ztName;
    }

    public void setZtName(String ztName) {
        this.ztName = (ztName == null) ? null : ztName.trim();
    }

    public String getFpReason() {
        return fpReason;
    }

    public void setFpReason(String fpReason) {
        this.fpReason = (fpReason == null) ? null : fpReason.trim();
    }

    public Double getFpAmount() {
        return fpAmount;
    }

    public void setFpAmount(Double fpAmount) {
        this.fpAmount = fpAmount;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
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

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = (checkRemark == null) ? null : checkRemark.trim();
    }

    public String getZjNo() {
        return zjNo;
    }

    public void setZjNo(String zjNo) {
        this.zjNo = (zjNo == null) ? null : zjNo.trim();
    }

    public String getZjImg() {
        return zjImg;
    }

    public void setZjImg(String zjImg) {
        this.zjImg = (zjImg == null) ? null : zjImg.trim();
    }

    public Integer getUserCity() {
        return userCity;
    }

    public void setUserCity(Integer userCity) {
        this.userCity = userCity;
    }
}

