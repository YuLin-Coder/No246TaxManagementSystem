package com.tax.model;
import java.util.ArrayList;
import java.util.List;
public class FpLogExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public FpLogExample() {
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
 public Criteria andFpNoIsNull() {
		 addCriterion("fp_no is null");
		return (Criteria) this;
		}
  public Criteria andFpNoIsNotNull(){
		addCriterion("fp_no is not null");
		return (Criteria) this;
		}
  public Criteria andFpNoEqualTo(String value) {
		  addCriterion("fp_no =", value, "fpNo");
		return (Criteria) this;
		}
   public Criteria andFpNoNotEqualTo(String value) {
		  addCriterion("fp_no <>", value, "fpNo");
		return (Criteria) this;
		}
    public Criteria andFpNoGreaterThan(String value) {
		 addCriterion("fp_no >", value, "fpNo");
		return (Criteria) this;
		}
  public Criteria andFpNoGreaterThanOrEqualTo(String value) {
		  addCriterion("fp_no >=", value, "FpNo");
		return (Criteria) this;
		}
   public Criteria andFpNoLessThan(String value) {
		  addCriterion("fp_no <", value, "fpNo");
		return (Criteria) this;
		}
    public Criteria andFpNoLessThanOrEqualTo(String value) {
		  addCriterion("fp_no <=", value, "fpNo");
		return (Criteria) this;
		}
    public Criteria andFpNoIn(List<String> values) {
		  addCriterion("fp_no in", values, "fpNo");
		return (Criteria) this;
		}
    public Criteria andFpNoNotIn(List<String> values) {
		  addCriterion("fp_no not in", values, "fpNo");
		return (Criteria) this;
		}
     public Criteria andFpNoBetween(String value1, String value2) {
		   addCriterion("fp_no between", value1, value2, "fpNo");
		return (Criteria) this;
		}
     public Criteria andFpNoNotBetween(String value1, String value2) {
		   addCriterion("fp_no not between", value1, value2, "fpNo");
		return (Criteria) this;
		}
    public Criteria andFpNoLike(String value) {
		  addCriterion("fp_no like", value, "fpNo");
		return (Criteria) this;
		}
    public Criteria andFpNoNotLike(String value) {
		  addCriterion("fp_no not like", value, "fpNo");
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
 public Criteria andFpReasonIsNull() {
		 addCriterion("fp_reason is null");
		return (Criteria) this;
		}
  public Criteria andFpReasonIsNotNull(){
		addCriterion("fp_reason is not null");
		return (Criteria) this;
		}
  public Criteria andFpReasonEqualTo(String value) {
		  addCriterion("fp_reason =", value, "fpReason");
		return (Criteria) this;
		}
   public Criteria andFpReasonNotEqualTo(String value) {
		  addCriterion("fp_reason <>", value, "fpReason");
		return (Criteria) this;
		}
    public Criteria andFpReasonGreaterThan(String value) {
		 addCriterion("fp_reason >", value, "fpReason");
		return (Criteria) this;
		}
  public Criteria andFpReasonGreaterThanOrEqualTo(String value) {
		  addCriterion("fp_reason >=", value, "FpReason");
		return (Criteria) this;
		}
   public Criteria andFpReasonLessThan(String value) {
		  addCriterion("fp_reason <", value, "fpReason");
		return (Criteria) this;
		}
    public Criteria andFpReasonLessThanOrEqualTo(String value) {
		  addCriterion("fp_reason <=", value, "fpReason");
		return (Criteria) this;
		}
    public Criteria andFpReasonIn(List<String> values) {
		  addCriterion("fp_reason in", values, "fpReason");
		return (Criteria) this;
		}
    public Criteria andFpReasonNotIn(List<String> values) {
		  addCriterion("fp_reason not in", values, "fpReason");
		return (Criteria) this;
		}
     public Criteria andFpReasonBetween(String value1, String value2) {
		   addCriterion("fp_reason between", value1, value2, "fpReason");
		return (Criteria) this;
		}
     public Criteria andFpReasonNotBetween(String value1, String value2) {
		   addCriterion("fp_reason not between", value1, value2, "fpReason");
		return (Criteria) this;
		}
    public Criteria andFpReasonLike(String value) {
		  addCriterion("fp_reason like", value, "fpReason");
		return (Criteria) this;
		}
    public Criteria andFpReasonNotLike(String value) {
		  addCriterion("fp_reason not like", value, "fpReason");
		return (Criteria) this;
		}
 public Criteria andFpAmountIsNull() {
		 addCriterion("fp_amount is null");
		return (Criteria) this;
		}
  public Criteria andFpAmountIsNotNull(){
		addCriterion("fp_amount is not null");
		return (Criteria) this;
		}
  public Criteria andFpAmountEqualTo(Double value) {
		  addCriterion("fp_amount =", value, "fpAmount");
		return (Criteria) this;
		}
   public Criteria andFpAmountNotEqualTo(Double value) {
		  addCriterion("fp_amount <>", value, "fpAmount");
		return (Criteria) this;
		}
    public Criteria andFpAmountGreaterThan(Double value) {
		 addCriterion("fp_amount >", value, "fpAmount");
		return (Criteria) this;
		}
  public Criteria andFpAmountGreaterThanOrEqualTo(Double value) {
		  addCriterion("fp_amount >=", value, "FpAmount");
		return (Criteria) this;
		}
   public Criteria andFpAmountLessThan(Double value) {
		  addCriterion("fp_amount <", value, "fpAmount");
		return (Criteria) this;
		}
    public Criteria andFpAmountLessThanOrEqualTo(Double value) {
		  addCriterion("fp_amount <=", value, "fpAmount");
		return (Criteria) this;
		}
    public Criteria andFpAmountIn(List<Double> values) {
		  addCriterion("fp_amount in", values, "fpAmount");
		return (Criteria) this;
		}
    public Criteria andFpAmountNotIn(List<Double> values) {
		  addCriterion("fp_amount not in", values, "fpAmount");
		return (Criteria) this;
		}
     public Criteria andFpAmountBetween(Double value1, Double value2) {
		   addCriterion("fp_amount between", value1, value2, "fpAmount");
		return (Criteria) this;
		}
     public Criteria andFpAmountNotBetween(Double value1, Double value2) {
		   addCriterion("fp_amount not between", value1, value2, "fpAmount");
		return (Criteria) this;
		}
    public Criteria andFpAmountLike(Double value) {
		  addCriterion("fp_amount like", value, "fpAmount");
		return (Criteria) this;
		}
    public Criteria andFpAmountNotLike(Double value) {
		  addCriterion("fp_amount not like", value, "fpAmount");
		return (Criteria) this;
		}
 public Criteria andCheckStatusIsNull() {
		 addCriterion("check_status is null");
		return (Criteria) this;
		}
  public Criteria andCheckStatusIsNotNull(){
		addCriterion("check_status is not null");
		return (Criteria) this;
		}
  public Criteria andCheckStatusEqualTo(Integer value) {
		  addCriterion("check_status =", value, "checkStatus");
		return (Criteria) this;
		}
   public Criteria andCheckStatusNotEqualTo(Integer value) {
		  addCriterion("check_status <>", value, "checkStatus");
		return (Criteria) this;
		}
    public Criteria andCheckStatusGreaterThan(Integer value) {
		 addCriterion("check_status >", value, "checkStatus");
		return (Criteria) this;
		}
  public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
		  addCriterion("check_status >=", value, "CheckStatus");
		return (Criteria) this;
		}
   public Criteria andCheckStatusLessThan(Integer value) {
		  addCriterion("check_status <", value, "checkStatus");
		return (Criteria) this;
		}
    public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
		  addCriterion("check_status <=", value, "checkStatus");
		return (Criteria) this;
		}
    public Criteria andCheckStatusIn(List<Integer> values) {
		  addCriterion("check_status in", values, "checkStatus");
		return (Criteria) this;
		}
    public Criteria andCheckStatusNotIn(List<Integer> values) {
		  addCriterion("check_status not in", values, "checkStatus");
		return (Criteria) this;
		}
     public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
		   addCriterion("check_status between", value1, value2, "checkStatus");
		return (Criteria) this;
		}
     public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
		   addCriterion("check_status not between", value1, value2, "checkStatus");
		return (Criteria) this;
		}
    public Criteria andCheckStatusLike(Integer value) {
		  addCriterion("check_status like", value, "checkStatus");
		return (Criteria) this;
		}
    public Criteria andCheckStatusNotLike(Integer value) {
		  addCriterion("check_status not like", value, "checkStatus");
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
 public Criteria andZjNoIsNull() {
		 addCriterion("zj_no is null");
		return (Criteria) this;
		}
  public Criteria andZjNoIsNotNull(){
		addCriterion("zj_no is not null");
		return (Criteria) this;
		}
  public Criteria andZjNoEqualTo(String value) {
		  addCriterion("zj_no =", value, "zjNo");
		return (Criteria) this;
		}
   public Criteria andZjNoNotEqualTo(String value) {
		  addCriterion("zj_no <>", value, "zjNo");
		return (Criteria) this;
		}
    public Criteria andZjNoGreaterThan(String value) {
		 addCriterion("zj_no >", value, "zjNo");
		return (Criteria) this;
		}
  public Criteria andZjNoGreaterThanOrEqualTo(String value) {
		  addCriterion("zj_no >=", value, "ZjNo");
		return (Criteria) this;
		}
   public Criteria andZjNoLessThan(String value) {
		  addCriterion("zj_no <", value, "zjNo");
		return (Criteria) this;
		}
    public Criteria andZjNoLessThanOrEqualTo(String value) {
		  addCriterion("zj_no <=", value, "zjNo");
		return (Criteria) this;
		}
    public Criteria andZjNoIn(List<String> values) {
		  addCriterion("zj_no in", values, "zjNo");
		return (Criteria) this;
		}
    public Criteria andZjNoNotIn(List<String> values) {
		  addCriterion("zj_no not in", values, "zjNo");
		return (Criteria) this;
		}
     public Criteria andZjNoBetween(String value1, String value2) {
		   addCriterion("zj_no between", value1, value2, "zjNo");
		return (Criteria) this;
		}
     public Criteria andZjNoNotBetween(String value1, String value2) {
		   addCriterion("zj_no not between", value1, value2, "zjNo");
		return (Criteria) this;
		}
    public Criteria andZjNoLike(String value) {
		  addCriterion("zj_no like", value, "zjNo");
		return (Criteria) this;
		}
    public Criteria andZjNoNotLike(String value) {
		  addCriterion("zj_no not like", value, "zjNo");
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
