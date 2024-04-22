package com.tax.model;

public class ApplyLog {
    private Integer id; //ID
    private String taxNo; //申报编号
    private String taxTitle; //申报名目
    private Integer taxType; //报税类型
    private String taxIntro; //报税简述
    private Integer userId; //报税用户
    private String realName; //报税人
    private String celPhone; //联系电话
    private Integer taxUserType; //主体类型
    private String ztName; //主体名
    private String ztNo; //主体证件号
    private Integer taxStatus; //状态
    private String checkRemark; //审核备注
    private String createTime; //申请时间
    private Double taxAmount; //项目金额
    private String zjImg; //证件图片
    private Integer cityId; //用户城市

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = (taxNo == null) ? null : taxNo.trim();
    }

    public String getTaxTitle() {
        return taxTitle;
    }

    public void setTaxTitle(String taxTitle) {
        this.taxTitle = (taxTitle == null) ? null : taxTitle.trim();
    }

    public Integer getTaxType() {
        return taxType;
    }

    public void setTaxType(Integer taxType) {
        this.taxType = taxType;
    }

    public String getTaxIntro() {
        return taxIntro;
    }

    public void setTaxIntro(String taxIntro) {
        this.taxIntro = (taxIntro == null) ? null : taxIntro.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = (realName == null) ? null : realName.trim();
    }

    public String getCelPhone() {
        return celPhone;
    }

    public void setCelPhone(String celPhone) {
        this.celPhone = (celPhone == null) ? null : celPhone.trim();
    }

    public Integer getTaxUserType() {
        return taxUserType;
    }

    public void setTaxUserType(Integer taxUserType) {
        this.taxUserType = taxUserType;
    }

    public String getZtName() {
        return ztName;
    }

    public void setZtName(String ztName) {
        this.ztName = (ztName == null) ? null : ztName.trim();
    }

    public String getZtNo() {
        return ztNo;
    }

    public void setZtNo(String ztNo) {
        this.ztNo = (ztNo == null) ? null : ztNo.trim();
    }

    public Integer getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(Integer taxStatus) {
        this.taxStatus = taxStatus;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = (checkRemark == null) ? null : checkRemark.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getZjImg() {
        return zjImg;
    }

    public void setZjImg(String zjImg) {
        this.zjImg = (zjImg == null) ? null : zjImg.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}

