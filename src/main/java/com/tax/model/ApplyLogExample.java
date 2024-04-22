package com.tax.model;
import java.util.ArrayList;
import java.util.List;
public class ApplyLogExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public ApplyLogExample() {
        oredCriteria = new ArrayList<>();
    }
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
    public String getOrderByClause() {
        return orderByClause;
    }
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
    public boolean isDistinct() {
        return distinct;
    }
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }
    public int getStartRow() {
        return startRow;
    }
    public void setPageRows(int pageRows) {
        this.pageRows = pageRows;
    }
    public int getPageRows() {
        return pageRows;
    }
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }
        public boolean isValid() {
            return criteria.size() > 0;
        }
        public List<Criterion> getAllCriteria() {
            return criteria;
        }
        public List<Criterion> getCriteria() {
            return criteria;
        }
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
    public Criteria andIdIsNull() {
		 addCriterion("id is null");
		return (Criteria) this;
		}
  public Criteria andIdIsNotNull(){
		addCriterion("id is not null");
		return (Criteria) this;
		}
  public Criteria andIdEqualTo(Integer value) {
		  addCriterion("id =", value, "id");
		return (Criteria) this;
		}
   public Criteria andIdNotEqualTo(Integer value) {
		  addCriterion("id <>", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdGreaterThan(Integer value) {
		 addCriterion("id >", value, "id");
		return (Criteria) this;
		}
  public Criteria andIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("id >=", value, "Id");
		return (Criteria) this;
		}
   public Criteria andIdLessThan(Integer value) {
		  addCriterion("id <", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdLessThanOrEqualTo(Integer value) {
		  addCriterion("id <=", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdIn(List<Integer> values) {
		  addCriterion("id in", values, "id");
		return (Criteria) this;
		}
    public Criteria andIdNotIn(List<Integer> values) {
		  addCriterion("id not in", values, "id");
		return (Criteria) this;
		}
     public Criteria andIdBetween(Integer value1, Integer value2) {
		   addCriterion("id between", value1, value2, "id");
		return (Criteria) this;
		}
     public Criteria andIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("id not between", value1, value2, "id");
		return (Criteria) this;
		}
    public Criteria andIdLike(Integer value) {
		  addCriterion("id like", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdNotLike(Integer value) {
		  addCriterion("id not like", value, "id");
		return (Criteria) this;
		}
 public Criteria andTaxNoIsNull() {
		 addCriterion("tax_no is null");
		return (Criteria) this;
		}
  public Criteria andTaxNoIsNotNull(){
		addCriterion("tax_no is not null");
		return (Criteria) this;
		}
  public Criteria andTaxNoEqualTo(String value) {
		  addCriterion("tax_no =", value, "taxNo");
		return (Criteria) this;
		}
   public Criteria andTaxNoNotEqualTo(String value) {
		  addCriterion("tax_no <>", value, "taxNo");
		return (Criteria) this;
		}
    public Criteria andTaxNoGreaterThan(String value) {
		 addCriterion("tax_no >", value, "taxNo");
		return (Criteria) this;
		}
  public Criteria andTaxNoGreaterThanOrEqualTo(String value) {
		  addCriterion("tax_no >=", value, "TaxNo");
		return (Criteria) this;
		}
   public Criteria andTaxNoLessThan(String value) {
		  addCriterion("tax_no <", value, "taxNo");
		return (Criteria) this;
		}
    public Criteria andTaxNoLessThanOrEqualTo(String value) {
		  addCriterion("tax_no <=", value, "taxNo");
		return (Criteria) this;
		}
    public Criteria andTaxNoIn(List<String> values) {
		  addCriterion("tax_no in", values, "taxNo");
		return (Criteria) this;
		}
    public Criteria andTaxNoNotIn(List<String> values) {
		  addCriterion("tax_no not in", values, "taxNo");
		return (Criteria) this;
		}
     public Criteria andTaxNoBetween(String value1, String value2) {
		   addCriterion("tax_no between", value1, value2, "taxNo");
		return (Criteria) this;
		}
     public Criteria andTaxNoNotBetween(String value1, String value2) {
		   addCriterion("tax_no not between", value1, value2, "taxNo");
		return (Criteria) this;
		}
    public Criteria andTaxNoLike(String value) {
		  addCriterion("tax_no like", value, "taxNo");
		return (Criteria) this;
		}
    public Criteria andTaxNoNotLike(String value) {
		  addCriterion("tax_no not like", value, "taxNo");
		return (Criteria) this;
		}
 public Criteria andTaxTitleIsNull() {
		 addCriterion("tax_title is null");
		return (Criteria) this;
		}
  public Criteria andTaxTitleIsNotNull(){
		addCriterion("tax_title is not null");
		return (Criteria) this;
		}
  public Criteria andTaxTitleEqualTo(String value) {
		  addCriterion("tax_title =", value, "taxTitle");
		return (Criteria) this;
		}
   public Criteria andTaxTitleNotEqualTo(String value) {
		  addCriterion("tax_title <>", value, "taxTitle");
		return (Criteria) this;
		}
    public Criteria andTaxTitleGreaterThan(String value) {
		 addCriterion("tax_title >", value, "taxTitle");
		return (Criteria) this;
		}
  public Criteria andTaxTitleGreaterThanOrEqualTo(String value) {
		  addCriterion("tax_title >=", value, "TaxTitle");
		return (Criteria) this;
		}
   public Criteria andTaxTitleLessThan(String value) {
		  addCriterion("tax_title <", value, "taxTitle");
		return (Criteria) this;
		}
    public Criteria andTaxTitleLessThanOrEqualTo(String value) {
		  addCriterion("tax_title <=", value, "taxTitle");
		return (Criteria) this;
		}
    public Criteria andTaxTitleIn(List<String> values) {
		  addCriterion("tax_title in", values, "taxTitle");
		return (Criteria) this;
		}
    public Criteria andTaxTitleNotIn(List<String> values) {
		  addCriterion("tax_title not in", values, "taxTitle");
		return (Criteria) this;
		}
     public Criteria andTaxTitleBetween(String value1, String value2) {
		   addCriterion("tax_title between", value1, value2, "taxTitle");
		return (Criteria) this;
		}
     public Criteria andTaxTitleNotBetween(String value1, String value2) {
		   addCriterion("tax_title not between", value1, value2, "taxTitle");
		return (Criteria) this;
		}
    public Criteria andTaxTitleLike(String value) {
		  addCriterion("tax_title like", value, "taxTitle");
		return (Criteria) this;
		}
    public Criteria andTaxTitleNotLike(String value) {
		  addCriterion("tax_title not like", value, "taxTitle");
		return (Criteria) this;
		}
 public Criteria andTaxTypeIsNull() {
		 addCriterion("tax_type is null");
		return (Criteria) this;
		}
  public Criteria andTaxTypeIsNotNull(){
		addCriterion("tax_type is not null");
		return (Criteria) this;
		}
  public Criteria andTaxTypeEqualTo(Integer value) {
		  addCriterion("tax_type =", value, "taxType");
		return (Criteria) this;
		}
   public Criteria andTaxTypeNotEqualTo(Integer value) {
		  addCriterion("tax_type <>", value, "taxType");
		return (Criteria) this;
		}
    public Criteria andTaxTypeGreaterThan(Integer value) {
		 addCriterion("tax_type >", value, "taxType");
		return (Criteria) this;
		}
  public Criteria andTaxTypeGreaterThanOrEqualTo(Integer value) {
		  addCriterion("tax_type >=", value, "TaxType");
		return (Criteria) this;
		}
   public Criteria andTaxTypeLessThan(Integer value) {
		  addCriterion("tax_type <", value, "taxType");
		return (Criteria) this;
		}
    public Criteria andTaxTypeLessThanOrEqualTo(Integer value) {
		  addCriterion("tax_type <=", value, "taxType");
		return (Criteria) this;
		}
    public Criteria andTaxTypeIn(List<Integer> values) {
		  addCriterion("tax_type in", values, "taxType");
		return (Criteria) this;
		}
    public Criteria andTaxTypeNotIn(List<Integer> values) {
		  addCriterion("tax_type not in", values, "taxType");
		return (Criteria) this;
		}
     public Criteria andTaxTypeBetween(Integer value1, Integer value2) {
		   addCriterion("tax_type between", value1, value2, "taxType");
		return (Criteria) this;
		}
     public Criteria andTaxTypeNotBetween(Integer value1, Integer value2) {
		   addCriterion("tax_type not between", value1, value2, "taxType");
		return (Criteria) this;
		}
    public Criteria andTaxTypeLike(Integer value) {
		  addCriterion("tax_type like", value, "taxType");
		return (Criteria) this;
		}
    public Criteria andTaxTypeNotLike(Integer value) {
		  addCriterion("tax_type not like", value, "taxType");
		return (Criteria) this;
		}
 public Criteria andTaxIntroIsNull() {
		 addCriterion("tax_intro is null");
		return (Criteria) this;
		}
  public Criteria andTaxIntroIsNotNull(){
		addCriterion("tax_intro is not null");
		return (Criteria) this;
		}
  public Criteria andTaxIntroEqualTo(String value) {
		  addCriterion("tax_intro =", value, "taxIntro");
		return (Criteria) this;
		}
   public Criteria andTaxIntroNotEqualTo(String value) {
		  addCriterion("tax_intro <>", value, "taxIntro");
		return (Criteria) this;
		}
    public Criteria andTaxIntroGreaterThan(String value) {
		 addCriterion("tax_intro >", value, "taxIntro");
		return (Criteria) this;
		}
  public Criteria andTaxIntroGreaterThanOrEqualTo(String value) {
		  addCriterion("tax_intro >=", value, "TaxIntro");
		return (Criteria) this;
		}
   public Criteria andTaxIntroLessThan(String value) {
		  addCriterion("tax_intro <", value, "taxIntro");
		return (Criteria) this;
		}
    public Criteria andTaxIntroLessThanOrEqualTo(String value) {
		  addCriterion("tax_intro <=", value, "taxIntro");
		return (Criteria) this;
		}
    public Criteria andTaxIntroIn(List<String> values) {
		  addCriterion("tax_intro in", values, "taxIntro");
		return (Criteria) this;
		}
    public Criteria andTaxIntroNotIn(List<String> values) {
		  addCriterion("tax_intro not in", values, "taxIntro");
		return (Criteria) this;
		}
     public Criteria andTaxIntroBetween(String value1, String value2) {
		   addCriterion("tax_intro between", value1, value2, "taxIntro");
		return (Criteria) this;
		}
     public Criteria andTaxIntroNotBetween(String value1, String value2) {
		   addCriterion("tax_intro not between", value1, value2, "taxIntro");
		return (Criteria) this;
		}
    public Criteria andTaxIntroLike(String value) {
		  addCriterion("tax_intro like", value, "taxIntro");
		return (Criteria) this;
		}
    public Criteria andTaxIntroNotLike(String value) {
		  addCriterion("tax_intro not like", value, "taxIntro");
		return (Criteria) this;
		}
 public Criteria andUserIdIsNull() {
		 addCriterion("user_id is null");
		return (Criteria) this;
		}
  public Criteria andUserIdIsNotNull(){
		addCriterion("user_id is not null");
		return (Criteria) this;
		}
  public Criteria andUserIdEqualTo(Integer value) {
		  addCriterion("user_id =", value, "userId");
		return (Criteria) this;
		}
   public Criteria andUserIdNotEqualTo(Integer value) {
		  addCriterion("user_id <>", value, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdGreaterThan(Integer value) {
		 addCriterion("user_id >", value, "userId");
		return (Criteria) this;
		}
  public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("user_id >=", value, "UserId");
		return (Criteria) this;
		}
   public Criteria andUserIdLessThan(Integer value) {
		  addCriterion("user_id <", value, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdLessThanOrEqualTo(Integer value) {
		  addCriterion("user_id <=", value, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdIn(List<Integer> values) {
		  addCriterion("user_id in", values, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdNotIn(List<Integer> values) {
		  addCriterion("user_id not in", values, "userId");
		return (Criteria) this;
		}
     public Criteria andUserIdBetween(Integer value1, Integer value2) {
		   addCriterion("user_id between", value1, value2, "userId");
		return (Criteria) this;
		}
     public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("user_id not between", value1, value2, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdLike(Integer value) {
		  addCriterion("user_id like", value, "userId");
		return (Criteria) this;
		}
    public Criteria andUserIdNotLike(Integer value) {
		  addCriterion("user_id not like", value, "userId");
		return (Criteria) this;
		}
 public Criteria andRealNameIsNull() {
		 addCriterion("real_name is null");
		return (Criteria) this;
		}
  public Criteria andRealNameIsNotNull(){
		addCriterion("real_name is not null");
		return (Criteria) this;
		}
  public Criteria andRealNameEqualTo(String value) {
		  addCriterion("real_name =", value, "realName");
		return (Criteria) this;
		}
   public Criteria andRealNameNotEqualTo(String value) {
		  addCriterion("real_name <>", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameGreaterThan(String value) {
		 addCriterion("real_name >", value, "realName");
		return (Criteria) this;
		}
  public Criteria andRealNameGreaterThanOrEqualTo(String value) {
		  addCriterion("real_name >=", value, "RealName");
		return (Criteria) this;
		}
   public Criteria andRealNameLessThan(String value) {
		  addCriterion("real_name <", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameLessThanOrEqualTo(String value) {
		  addCriterion("real_name <=", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameIn(List<String> values) {
		  addCriterion("real_name in", values, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameNotIn(List<String> values) {
		  addCriterion("real_name not in", values, "realName");
		return (Criteria) this;
		}
     public Criteria andRealNameBetween(String value1, String value2) {
		   addCriterion("real_name between", value1, value2, "realName");
		return (Criteria) this;
		}
     public Criteria andRealNameNotBetween(String value1, String value2) {
		   addCriterion("real_name not between", value1, value2, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameLike(String value) {
		  addCriterion("real_name like", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameNotLike(String value) {
		  addCriterion("real_name not like", value, "realName");
		return (Criteria) this;
		}
 public Criteria andCelPhoneIsNull() {
		 addCriterion("cel_phone is null");
		return (Criteria) this;
		}
  public Criteria andCelPhoneIsNotNull(){
		addCriterion("cel_phone is not null");
		return (Criteria) this;
		}
  public Criteria andCelPhoneEqualTo(String value) {
		  addCriterion("cel_phone =", value, "celPhone");
		return (Criteria) this;
		}
   public Criteria andCelPhoneNotEqualTo(String value) {
		  addCriterion("cel_phone <>", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneGreaterThan(String value) {
		 addCriterion("cel_phone >", value, "celPhone");
		return (Criteria) this;
		}
  public Criteria andCelPhoneGreaterThanOrEqualTo(String value) {
		  addCriterion("cel_phone >=", value, "CelPhone");
		return (Criteria) this;
		}
   public Criteria andCelPhoneLessThan(String value) {
		  addCriterion("cel_phone <", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneLessThanOrEqualTo(String value) {
		  addCriterion("cel_phone <=", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneIn(List<String> values) {
		  addCriterion("cel_phone in", values, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneNotIn(List<String> values) {
		  addCriterion("cel_phone not in", values, "celPhone");
		return (Criteria) this;
		}
     public Criteria andCelPhoneBetween(String value1, String value2) {
		   addCriterion("cel_phone between", value1, value2, "celPhone");
		return (Criteria) this;
		}
     public Criteria andCelPhoneNotBetween(String value1, String value2) {
		   addCriterion("cel_phone not between", value1, value2, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneLike(String value) {
		  addCriterion("cel_phone like", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneNotLike(String value) {
		  addCriterion("cel_phone not like", value, "celPhone");
		return (Criteria) this;
		}
 public Criteria andTaxUserTypeIsNull() {
		 addCriterion("tax_user_type is null");
		return (Criteria) this;
		}
  public Criteria andTaxUserTypeIsNotNull(){
		addCriterion("tax_user_type is not null");
		return (Criteria) this;
		}
  public Criteria andTaxUserTypeEqualTo(Integer value) {
		  addCriterion("tax_user_type =", value, "taxUserType");
		return (Criteria) this;
		}
   public Criteria andTaxUserTypeNotEqualTo(Integer value) {
		  addCriterion("tax_user_type <>", value, "taxUserType");
		return (Criteria) this;
		}
    public Criteria andTaxUserTypeGreaterThan(Integer value) {
		 addCriterion("tax_user_type >", value, "taxUserType");
		return (Criteria) this;
		}
  public Criteria andTaxUserTypeGreaterThanOrEqualTo(Integer value) {
		  addCriterion("tax_user_type >=", value, "TaxUserType");
		return (Criteria) this;
		}
   public Criteria andTaxUserTypeLessThan(Integer value) {
		  addCriterion("tax_user_type <", value, "taxUserType");
		return (Criteria) this;
		}
    public Criteria andTaxUserTypeLessThanOrEqualTo(Integer value) {
		  addCriterion("tax_user_type <=", value, "taxUserType");
		return (Criteria) this;
		}
    public Criteria andTaxUserTypeIn(List<Integer> values) {
		  addCriterion("tax_user_type in", values, "taxUserType");
		return (Criteria) this;
		}
    public Criteria andTaxUserTypeNotIn(List<Integer> values) {
		  addCriterion("tax_user_type not in", values, "taxUserType");
		return (Criteria) this;
		}
     public Criteria andTaxUserTypeBetween(Integer value1, Integer value2) {
		   addCriterion("tax_user_type between", value1, value2, "taxUserType");
		return (Criteria) this;
		}
     public Criteria andTaxUserTypeNotBetween(Integer value1, Integer value2) {
		   addCriterion("tax_user_type not between", value1, value2, "taxUserType");
		return (Criteria) this;
		}
    public Criteria andTaxUserTypeLike(Integer value) {
		  addCriterion("tax_user_type like", value, "taxUserType");
		return (Criteria) this;
		}
    public Criteria andTaxUserTypeNotLike(Integer value) {
		  addCriterion("tax_user_type not like", value, "taxUserType");
		return (Criteria) this;
		}
 public Criteria andZtNameIsNull() {
		 addCriterion("zt_name is null");
		return (Criteria) this;
		}
  public Criteria andZtNameIsNotNull(){
		addCriterion("zt_name is not null");
		return (Criteria) this;
		}
  public Criteria andZtNameEqualTo(String value) {
		  addCriterion("zt_name =", value, "ztName");
		return (Criteria) this;
		}
   public Criteria andZtNameNotEqualTo(String value) {
		  addCriterion("zt_name <>", value, "ztName");
		return (Criteria) this;
		}
    public Criteria andZtNameGreaterThan(String value) {
		 addCriterion("zt_name >", value, "ztName");
		return (Criteria) this;
		}
  public Criteria andZtNameGreaterThanOrEqualTo(String value) {
		  addCriterion("zt_name >=", value, "ZtName");
		return (Criteria) this;
		}
   public Criteria andZtNameLessThan(String value) {
		  addCriterion("zt_name <", value, "ztName");
		return (Criteria) this;
		}
    public Criteria andZtNameLessThanOrEqualTo(String value) {
		  addCriterion("zt_name <=", value, "ztName");
		return (Criteria) this;
		}
    public Criteria andZtNameIn(List<String> values) {
		  addCriterion("zt_name in", values, "ztName");
		return (Criteria) this;
		}
    public Criteria andZtNameNotIn(List<String> values) {
		  addCriterion("zt_name not in", values, "ztName");
		return (Criteria) this;
		}
     public Criteria andZtNameBetween(String value1, String value2) {
		   addCriterion("zt_name between", value1, value2, "ztName");
		return (Criteria) this;
		}
     public Criteria andZtNameNotBetween(String value1, String value2) {
		   addCriterion("zt_name not between", value1, value2, "ztName");
		return (Criteria) this;
		}
    public Criteria andZtNameLike(String value) {
		  addCriterion("zt_name like", value, "ztName");
		return (Criteria) this;
		}
    public Criteria andZtNameNotLike(String value) {
		  addCriterion("zt_name not like", value, "ztName");
		return (Criteria) this;
		}
 public Criteria andZtNoIsNull() {
		 addCriterion("zt_no is null");
		return (Criteria) this;
		}
  public Criteria andZtNoIsNotNull(){
		addCriterion("zt_no is not null");
		return (Criteria) this;
		}
  public Criteria andZtNoEqualTo(String value) {
		  addCriterion("zt_no =", value, "ztNo");
		return (Criteria) this;
		}
   public Criteria andZtNoNotEqualTo(String value) {
		  addCriterion("zt_no <>", value, "ztNo");
		return (Criteria) this;
		}
    public Criteria andZtNoGreaterThan(String value) {
		 addCriterion("zt_no >", value, "ztNo");
		return (Criteria) this;
		}
  public Criteria andZtNoGreaterThanOrEqualTo(String value) {
		  addCriterion("zt_no >=", value, "ZtNo");
		return (Criteria) this;
		}
   public Criteria andZtNoLessThan(String value) {
		  addCriterion("zt_no <", value, "ztNo");
		return (Criteria) this;
		}
    public Criteria andZtNoLessThanOrEqualTo(String value) {
		  addCriterion("zt_no <=", value, "ztNo");
		return (Criteria) this;
		}
    public Criteria andZtNoIn(List<String> values) {
		  addCriterion("zt_no in", values, "ztNo");
		return (Criteria) this;
		}
    public Criteria andZtNoNotIn(List<String> values) {
		  addCriterion("zt_no not in", values, "ztNo");
		return (Criteria) this;
		}
     public Criteria andZtNoBetween(String value1, String value2) {
		   addCriterion("zt_no between", value1, value2, "ztNo");
		return (Criteria) this;
		}
     public Criteria andZtNoNotBetween(String value1, String value2) {
		   addCriterion("zt_no not between", value1, value2, "ztNo");
		return (Criteria) this;
		}
    public Criteria andZtNoLike(String value) {
		  addCriterion("zt_no like", value, "ztNo");
		return (Criteria) this;
		}
    public Criteria andZtNoNotLike(String value) {
		  addCriterion("zt_no not like", value, "ztNo");
		return (Criteria) this;
		}
 public Criteria andTaxStatusIsNull() {
		 addCriterion("tax_status is null");
		return (Criteria) this;
		}
  public Criteria andTaxStatusIsNotNull(){
		addCriterion("tax_status is not null");
		return (Criteria) this;
		}
  public Criteria andTaxStatusEqualTo(Integer value) {
		  addCriterion("tax_status =", value, "taxStatus");
		return (Criteria) this;
		}
   public Criteria andTaxStatusNotEqualTo(Integer value) {
		  addCriterion("tax_status <>", value, "taxStatus");
		return (Criteria) this;
		}
    public Criteria andTaxStatusGreaterThan(Integer value) {
		 addCriterion("tax_status >", value, "taxStatus");
		return (Criteria) this;
		}
  public Criteria andTaxStatusGreaterThanOrEqualTo(Integer value) {
		  addCriterion("tax_status >=", value, "TaxStatus");
		return (Criteria) this;
		}
   public Criteria andTaxStatusLessThan(Integer value) {
		  addCriterion("tax_status <", value, "taxStatus");
		return (Criteria) this;
		}
    public Criteria andTaxStatusLessThanOrEqualTo(Integer value) {
		  addCriterion("tax_status <=", value, "taxStatus");
		return (Criteria) this;
		}
    public Criteria andTaxStatusIn(List<Integer> values) {
		  addCriterion("tax_status in", values, "taxStatus");
		return (Criteria) this;
		}
    public Criteria andTaxStatusNotIn(List<Integer> values) {
		  addCriterion("tax_status not in", values, "taxStatus");
		return (Criteria) this;
		}
     public Criteria andTaxStatusBetween(Integer value1, Integer value2) {
		   addCriterion("tax_status between", value1, value2, "taxStatus");
		return (Criteria) this;
		}
     public Criteria andTaxStatusNotBetween(Integer value1, Integer value2) {
		   addCriterion("tax_status not between", value1, value2, "taxStatus");
		return (Criteria) this;
		}
    public Criteria andTaxStatusLike(Integer value) {
		  addCriterion("tax_status like", value, "taxStatus");
		return (Criteria) this;
		}
    public Criteria andTaxStatusNotLike(Integer value) {
		  addCriterion("tax_status not like", value, "taxStatus");
		return (Criteria) this;
		}
 public Criteria andCheckRemarkIsNull() {
		 addCriterion("check_remark is null");
		return (Criteria) this;
		}
  public Criteria andCheckRemarkIsNotNull(){
		addCriterion("check_remark is not null");
		return (Criteria) this;
		}
  public Criteria andCheckRemarkEqualTo(String value) {
		  addCriterion("check_remark =", value, "checkRemark");
		return (Criteria) this;
		}
   public Criteria andCheckRemarkNotEqualTo(String value) {
		  addCriterion("check_remark <>", value, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkGreaterThan(String value) {
		 addCriterion("check_remark >", value, "checkRemark");
		return (Criteria) this;
		}
  public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
		  addCriterion("check_remark >=", value, "CheckRemark");
		return (Criteria) this;
		}
   public Criteria andCheckRemarkLessThan(String value) {
		  addCriterion("check_remark <", value, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
		  addCriterion("check_remark <=", value, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkIn(List<String> values) {
		  addCriterion("check_remark in", values, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkNotIn(List<String> values) {
		  addCriterion("check_remark not in", values, "checkRemark");
		return (Criteria) this;
		}
     public Criteria andCheckRemarkBetween(String value1, String value2) {
		   addCriterion("check_remark between", value1, value2, "checkRemark");
		return (Criteria) this;
		}
     public Criteria andCheckRemarkNotBetween(String value1, String value2) {
		   addCriterion("check_remark not between", value1, value2, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkLike(String value) {
		  addCriterion("check_remark like", value, "checkRemark");
		return (Criteria) this;
		}
    public Criteria andCheckRemarkNotLike(String value) {
		  addCriterion("check_remark not like", value, "checkRemark");
		return (Criteria) this;
		}
 public Criteria andCreateTimeIsNull() {
		 addCriterion("create_time is null");
		return (Criteria) this;
		}
  public Criteria andCreateTimeIsNotNull(){
		addCriterion("create_time is not null");
		return (Criteria) this;
		}
  public Criteria andCreateTimeEqualTo(String value) {
		  addCriterion("create_time =", value, "createTime");
		return (Criteria) this;
		}
   public Criteria andCreateTimeNotEqualTo(String value) {
		  addCriterion("create_time <>", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeGreaterThan(String value) {
		 addCriterion("create_time >", value, "createTime");
		return (Criteria) this;
		}
  public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
		  addCriterion("create_time >=", value, "CreateTime");
		return (Criteria) this;
		}
   public Criteria andCreateTimeLessThan(String value) {
		  addCriterion("create_time <", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeLessThanOrEqualTo(String value) {
		  addCriterion("create_time <=", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeIn(List<String> values) {
		  addCriterion("create_time in", values, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeNotIn(List<String> values) {
		  addCriterion("create_time not in", values, "createTime");
		return (Criteria) this;
		}
     public Criteria andCreateTimeBetween(String value1, String value2) {
		   addCriterion("create_time between", value1, value2, "createTime");
		return (Criteria) this;
		}
     public Criteria andCreateTimeNotBetween(String value1, String value2) {
		   addCriterion("create_time not between", value1, value2, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeLike(String value) {
		  addCriterion("create_time like", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeNotLike(String value) {
		  addCriterion("create_time not like", value, "createTime");
		return (Criteria) this;
		}
 public Criteria andTaxAmountIsNull() {
		 addCriterion("tax_amount is null");
		return (Criteria) this;
		}
  public Criteria andTaxAmountIsNotNull(){
		addCriterion("tax_amount is not null");
		return (Criteria) this;
		}
  public Criteria andTaxAmountEqualTo(Double value) {
		  addCriterion("tax_amount =", value, "taxAmount");
		return (Criteria) this;
		}
   public Criteria andTaxAmountNotEqualTo(Double value) {
		  addCriterion("tax_amount <>", value, "taxAmount");
		return (Criteria) this;
		}
    public Criteria andTaxAmountGreaterThan(Double value) {
		 addCriterion("tax_amount >", value, "taxAmount");
		return (Criteria) this;
		}
  public Criteria andTaxAmountGreaterThanOrEqualTo(Double value) {
		  addCriterion("tax_amount >=", value, "TaxAmount");
		return (Criteria) this;
		}
   public Criteria andTaxAmountLessThan(Double value) {
		  addCriterion("tax_amount <", value, "taxAmount");
		return (Criteria) this;
		}
    public Criteria andTaxAmountLessThanOrEqualTo(Double value) {
		  addCriterion("tax_amount <=", value, "taxAmount");
		return (Criteria) this;
		}
    public Criteria andTaxAmountIn(List<Double> values) {
		  addCriterion("tax_amount in", values, "taxAmount");
		return (Criteria) this;
		}
    public Criteria andTaxAmountNotIn(List<Double> values) {
		  addCriterion("tax_amount not in", values, "taxAmount");
		return (Criteria) this;
		}
     public Criteria andTaxAmountBetween(Double value1, Double value2) {
		   addCriterion("tax_amount between", value1, value2, "taxAmount");
		return (Criteria) this;
		}
     public Criteria andTaxAmountNotBetween(Double value1, Double value2) {
		   addCriterion("tax_amount not between", value1, value2, "taxAmount");
		return (Criteria) this;
		}
    public Criteria andTaxAmountLike(Double value) {
		  addCriterion("tax_amount like", value, "taxAmount");
		return (Criteria) this;
		}
    public Criteria andTaxAmountNotLike(Double value) {
		  addCriterion("tax_amount not like", value, "taxAmount");
		return (Criteria) this;
		}
 public Criteria andZjImgIsNull() {
		 addCriterion("zj_img is null");
		return (Criteria) this;
		}
  public Criteria andZjImgIsNotNull(){
		addCriterion("zj_img is not null");
		return (Criteria) this;
		}
  public Criteria andZjImgEqualTo(String value) {
		  addCriterion("zj_img =", value, "zjImg");
		return (Criteria) this;
		}
   public Criteria andZjImgNotEqualTo(String value) {
		  addCriterion("zj_img <>", value, "zjImg");
		return (Criteria) this;
		}
    public Criteria andZjImgGreaterThan(String value) {
		 addCriterion("zj_img >", value, "zjImg");
		return (Criteria) this;
		}
  public Criteria andZjImgGreaterThanOrEqualTo(String value) {
		  addCriterion("zj_img >=", value, "ZjImg");
		return (Criteria) this;
		}
   public Criteria andZjImgLessThan(String value) {
		  addCriterion("zj_img <", value, "zjImg");
		return (Criteria) this;
		}
    public Criteria andZjImgLessThanOrEqualTo(String value) {
		  addCriterion("zj_img <=", value, "zjImg");
		return (Criteria) this;
		}
    public Criteria andZjImgIn(List<String> values) {
		  addCriterion("zj_img in", values, "zjImg");
		return (Criteria) this;
		}
    public Criteria andZjImgNotIn(List<String> values) {
		  addCriterion("zj_img not in", values, "zjImg");
		return (Criteria) this;
		}
     public Criteria andZjImgBetween(String value1, String value2) {
		   addCriterion("zj_img between", value1, value2, "zjImg");
		return (Criteria) this;
		}
     public Criteria andZjImgNotBetween(String value1, String value2) {
		   addCriterion("zj_img not between", value1, value2, "zjImg");
		return (Criteria) this;
		}
    public Criteria andZjImgLike(String value) {
		  addCriterion("zj_img like", value, "zjImg");
		return (Criteria) this;
		}
    public Criteria andZjImgNotLike(String value) {
		  addCriterion("zj_img not like", value, "zjImg");
		return (Criteria) this;
		}
 public Criteria andCityIdIsNull() {
		 addCriterion("city_id is null");
		return (Criteria) this;
		}
  public Criteria andCityIdIsNotNull(){
		addCriterion("city_id is not null");
		return (Criteria) this;
		}
  public Criteria andCityIdEqualTo(Integer value) {
		  addCriterion("city_id =", value, "cityId");
		return (Criteria) this;
		}
   public Criteria andCityIdNotEqualTo(Integer value) {
		  addCriterion("city_id <>", value, "cityId");
		return (Criteria) this;
		}
    public Criteria andCityIdGreaterThan(Integer value) {
		 addCriterion("city_id >", value, "cityId");
		return (Criteria) this;
		}
  public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("city_id >=", value, "CityId");
		return (Criteria) this;
		}
   public Criteria andCityIdLessThan(Integer value) {
		  addCriterion("city_id <", value, "cityId");
		return (Criteria) this;
		}
    public Criteria andCityIdLessThanOrEqualTo(Integer value) {
		  addCriterion("city_id <=", value, "cityId");
		return (Criteria) this;
		}
    public Criteria andCityIdIn(List<Integer> values) {
		  addCriterion("city_id in", values, "cityId");
		return (Criteria) this;
		}
    public Criteria andCityIdNotIn(List<Integer> values) {
		  addCriterion("city_id not in", values, "cityId");
		return (Criteria) this;
		}
     public Criteria andCityIdBetween(Integer value1, Integer value2) {
		   addCriterion("city_id between", value1, value2, "cityId");
		return (Criteria) this;
		}
     public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("city_id not between", value1, value2, "cityId");
		return (Criteria) this;
		}
    public Criteria andCityIdLike(Integer value) {
		  addCriterion("city_id like", value, "cityId");
		return (Criteria) this;
		}
    public Criteria andCityIdNotLike(Integer value) {
		  addCriterion("city_id not like", value, "cityId");
		return (Criteria) this;
		}

    }
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;
        public String getCondition() {
            return condition;
        }
        public Object getValue() {
            return value;
        }
        public Object getSecondValue() {
            return secondValue;
        }
        public boolean isNoValue() {
            return noValue;
        }
        public boolean isSingleValue() {
            return singleValue;
        }
        public boolean isBetweenValue() {
            return betweenValue;
        }
        public boolean isListValue() {
            return listValue;
        }
        public String getTypeHandler() {
            return typeHandler;
        }
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
