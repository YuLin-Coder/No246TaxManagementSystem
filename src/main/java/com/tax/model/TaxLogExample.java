package com.tax.model;
import java.util.ArrayList;
import java.util.List;
public class TaxLogExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public TaxLogExample() {
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
 public Criteria andApplyIdIsNull() {
		 addCriterion("apply_id is null");
		return (Criteria) this;
		}
  public Criteria andApplyIdIsNotNull(){
		addCriterion("apply_id is not null");
		return (Criteria) this;
		}
  public Criteria andApplyIdEqualTo(Integer value) {
		  addCriterion("apply_id =", value, "applyId");
		return (Criteria) this;
		}
   public Criteria andApplyIdNotEqualTo(Integer value) {
		  addCriterion("apply_id <>", value, "applyId");
		return (Criteria) this;
		}
    public Criteria andApplyIdGreaterThan(Integer value) {
		 addCriterion("apply_id >", value, "applyId");
		return (Criteria) this;
		}
  public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("apply_id >=", value, "ApplyId");
		return (Criteria) this;
		}
   public Criteria andApplyIdLessThan(Integer value) {
		  addCriterion("apply_id <", value, "applyId");
		return (Criteria) this;
		}
    public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
		  addCriterion("apply_id <=", value, "applyId");
		return (Criteria) this;
		}
    public Criteria andApplyIdIn(List<Integer> values) {
		  addCriterion("apply_id in", values, "applyId");
		return (Criteria) this;
		}
    public Criteria andApplyIdNotIn(List<Integer> values) {
		  addCriterion("apply_id not in", values, "applyId");
		return (Criteria) this;
		}
     public Criteria andApplyIdBetween(Integer value1, Integer value2) {
		   addCriterion("apply_id between", value1, value2, "applyId");
		return (Criteria) this;
		}
     public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("apply_id not between", value1, value2, "applyId");
		return (Criteria) this;
		}
    public Criteria andApplyIdLike(Integer value) {
		  addCriterion("apply_id like", value, "applyId");
		return (Criteria) this;
		}
    public Criteria andApplyIdNotLike(Integer value) {
		  addCriterion("apply_id not like", value, "applyId");
		return (Criteria) this;
		}
 public Criteria andProjectAmountIsNull() {
		 addCriterion("project_amount is null");
		return (Criteria) this;
		}
  public Criteria andProjectAmountIsNotNull(){
		addCriterion("project_amount is not null");
		return (Criteria) this;
		}
  public Criteria andProjectAmountEqualTo(Double value) {
		  addCriterion("project_amount =", value, "projectAmount");
		return (Criteria) this;
		}
   public Criteria andProjectAmountNotEqualTo(Double value) {
		  addCriterion("project_amount <>", value, "projectAmount");
		return (Criteria) this;
		}
    public Criteria andProjectAmountGreaterThan(Double value) {
		 addCriterion("project_amount >", value, "projectAmount");
		return (Criteria) this;
		}
  public Criteria andProjectAmountGreaterThanOrEqualTo(Double value) {
		  addCriterion("project_amount >=", value, "ProjectAmount");
		return (Criteria) this;
		}
   public Criteria andProjectAmountLessThan(Double value) {
		  addCriterion("project_amount <", value, "projectAmount");
		return (Criteria) this;
		}
    public Criteria andProjectAmountLessThanOrEqualTo(Double value) {
		  addCriterion("project_amount <=", value, "projectAmount");
		return (Criteria) this;
		}
    public Criteria andProjectAmountIn(List<Double> values) {
		  addCriterion("project_amount in", values, "projectAmount");
		return (Criteria) this;
		}
    public Criteria andProjectAmountNotIn(List<Double> values) {
		  addCriterion("project_amount not in", values, "projectAmount");
		return (Criteria) this;
		}
     public Criteria andProjectAmountBetween(Double value1, Double value2) {
		   addCriterion("project_amount between", value1, value2, "projectAmount");
		return (Criteria) this;
		}
     public Criteria andProjectAmountNotBetween(Double value1, Double value2) {
		   addCriterion("project_amount not between", value1, value2, "projectAmount");
		return (Criteria) this;
		}
    public Criteria andProjectAmountLike(Double value) {
		  addCriterion("project_amount like", value, "projectAmount");
		return (Criteria) this;
		}
    public Criteria andProjectAmountNotLike(Double value) {
		  addCriterion("project_amount not like", value, "projectAmount");
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
 public Criteria andRemarkIsNull() {
		 addCriterion("remark is null");
		return (Criteria) this;
		}
  public Criteria andRemarkIsNotNull(){
		addCriterion("remark is not null");
		return (Criteria) this;
		}
  public Criteria andRemarkEqualTo(String value) {
		  addCriterion("remark =", value, "remark");
		return (Criteria) this;
		}
   public Criteria andRemarkNotEqualTo(String value) {
		  addCriterion("remark <>", value, "remark");
		return (Criteria) this;
		}
    public Criteria andRemarkGreaterThan(String value) {
		 addCriterion("remark >", value, "remark");
		return (Criteria) this;
		}
  public Criteria andRemarkGreaterThanOrEqualTo(String value) {
		  addCriterion("remark >=", value, "Remark");
		return (Criteria) this;
		}
   public Criteria andRemarkLessThan(String value) {
		  addCriterion("remark <", value, "remark");
		return (Criteria) this;
		}
    public Criteria andRemarkLessThanOrEqualTo(String value) {
		  addCriterion("remark <=", value, "remark");
		return (Criteria) this;
		}
    public Criteria andRemarkIn(List<String> values) {
		  addCriterion("remark in", values, "remark");
		return (Criteria) this;
		}
    public Criteria andRemarkNotIn(List<String> values) {
		  addCriterion("remark not in", values, "remark");
		return (Criteria) this;
		}
     public Criteria andRemarkBetween(String value1, String value2) {
		   addCriterion("remark between", value1, value2, "remark");
		return (Criteria) this;
		}
     public Criteria andRemarkNotBetween(String value1, String value2) {
		   addCriterion("remark not between", value1, value2, "remark");
		return (Criteria) this;
		}
    public Criteria andRemarkLike(String value) {
		  addCriterion("remark like", value, "remark");
		return (Criteria) this;
		}
    public Criteria andRemarkNotLike(String value) {
		  addCriterion("remark not like", value, "remark");
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
 public Criteria andUserCityIsNull() {
		 addCriterion("user_city is null");
		return (Criteria) this;
		}
  public Criteria andUserCityIsNotNull(){
		addCriterion("user_city is not null");
		return (Criteria) this;
		}
  public Criteria andUserCityEqualTo(Integer value) {
		  addCriterion("user_city =", value, "userCity");
		return (Criteria) this;
		}
   public Criteria andUserCityNotEqualTo(Integer value) {
		  addCriterion("user_city <>", value, "userCity");
		return (Criteria) this;
		}
    public Criteria andUserCityGreaterThan(Integer value) {
		 addCriterion("user_city >", value, "userCity");
		return (Criteria) this;
		}
  public Criteria andUserCityGreaterThanOrEqualTo(Integer value) {
		  addCriterion("user_city >=", value, "UserCity");
		return (Criteria) this;
		}
   public Criteria andUserCityLessThan(Integer value) {
		  addCriterion("user_city <", value, "userCity");
		return (Criteria) this;
		}
    public Criteria andUserCityLessThanOrEqualTo(Integer value) {
		  addCriterion("user_city <=", value, "userCity");
		return (Criteria) this;
		}
    public Criteria andUserCityIn(List<Integer> values) {
		  addCriterion("user_city in", values, "userCity");
		return (Criteria) this;
		}
    public Criteria andUserCityNotIn(List<Integer> values) {
		  addCriterion("user_city not in", values, "userCity");
		return (Criteria) this;
		}
     public Criteria andUserCityBetween(Integer value1, Integer value2) {
		   addCriterion("user_city between", value1, value2, "userCity");
		return (Criteria) this;
		}
     public Criteria andUserCityNotBetween(Integer value1, Integer value2) {
		   addCriterion("user_city not between", value1, value2, "userCity");
		return (Criteria) this;
		}
    public Criteria andUserCityLike(Integer value) {
		  addCriterion("user_city like", value, "userCity");
		return (Criteria) this;
		}
    public Criteria andUserCityNotLike(Integer value) {
		  addCriterion("user_city not like", value, "userCity");
		return (Criteria) this;
		}
 public Criteria andJfStatusIsNull() {
		 addCriterion("jf_status is null");
		return (Criteria) this;
		}
  public Criteria andJfStatusIsNotNull(){
		addCriterion("jf_status is not null");
		return (Criteria) this;
		}
  public Criteria andJfStatusEqualTo(Integer value) {
		  addCriterion("jf_status =", value, "jfStatus");
		return (Criteria) this;
		}
   public Criteria andJfStatusNotEqualTo(Integer value) {
		  addCriterion("jf_status <>", value, "jfStatus");
		return (Criteria) this;
		}
    public Criteria andJfStatusGreaterThan(Integer value) {
		 addCriterion("jf_status >", value, "jfStatus");
		return (Criteria) this;
		}
  public Criteria andJfStatusGreaterThanOrEqualTo(Integer value) {
		  addCriterion("jf_status >=", value, "JfStatus");
		return (Criteria) this;
		}
   public Criteria andJfStatusLessThan(Integer value) {
		  addCriterion("jf_status <", value, "jfStatus");
		return (Criteria) this;
		}
    public Criteria andJfStatusLessThanOrEqualTo(Integer value) {
		  addCriterion("jf_status <=", value, "jfStatus");
		return (Criteria) this;
		}
    public Criteria andJfStatusIn(List<Integer> values) {
		  addCriterion("jf_status in", values, "jfStatus");
		return (Criteria) this;
		}
    public Criteria andJfStatusNotIn(List<Integer> values) {
		  addCriterion("jf_status not in", values, "jfStatus");
		return (Criteria) this;
		}
     public Criteria andJfStatusBetween(Integer value1, Integer value2) {
		   addCriterion("jf_status between", value1, value2, "jfStatus");
		return (Criteria) this;
		}
     public Criteria andJfStatusNotBetween(Integer value1, Integer value2) {
		   addCriterion("jf_status not between", value1, value2, "jfStatus");
		return (Criteria) this;
		}
    public Criteria andJfStatusLike(Integer value) {
		  addCriterion("jf_status like", value, "jfStatus");
		return (Criteria) this;
		}
    public Criteria andJfStatusNotLike(Integer value) {
		  addCriterion("jf_status not like", value, "jfStatus");
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
