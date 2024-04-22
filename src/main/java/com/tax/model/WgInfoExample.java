package com.tax.model;
import java.util.ArrayList;
import java.util.List;
public class WgInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public WgInfoExample() {
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
 public Criteria andTitleIsNull() {
		 addCriterion("title is null");
		return (Criteria) this;
		}
  public Criteria andTitleIsNotNull(){
		addCriterion("title is not null");
		return (Criteria) this;
		}
  public Criteria andTitleEqualTo(String value) {
		  addCriterion("title =", value, "title");
		return (Criteria) this;
		}
   public Criteria andTitleNotEqualTo(String value) {
		  addCriterion("title <>", value, "title");
		return (Criteria) this;
		}
    public Criteria andTitleGreaterThan(String value) {
		 addCriterion("title >", value, "title");
		return (Criteria) this;
		}
  public Criteria andTitleGreaterThanOrEqualTo(String value) {
		  addCriterion("title >=", value, "Title");
		return (Criteria) this;
		}
   public Criteria andTitleLessThan(String value) {
		  addCriterion("title <", value, "title");
		return (Criteria) this;
		}
    public Criteria andTitleLessThanOrEqualTo(String value) {
		  addCriterion("title <=", value, "title");
		return (Criteria) this;
		}
    public Criteria andTitleIn(List<String> values) {
		  addCriterion("title in", values, "title");
		return (Criteria) this;
		}
    public Criteria andTitleNotIn(List<String> values) {
		  addCriterion("title not in", values, "title");
		return (Criteria) this;
		}
     public Criteria andTitleBetween(String value1, String value2) {
		   addCriterion("title between", value1, value2, "title");
		return (Criteria) this;
		}
     public Criteria andTitleNotBetween(String value1, String value2) {
		   addCriterion("title not between", value1, value2, "title");
		return (Criteria) this;
		}
    public Criteria andTitleLike(String value) {
		  addCriterion("title like", value, "title");
		return (Criteria) this;
		}
    public Criteria andTitleNotLike(String value) {
		  addCriterion("title not like", value, "title");
		return (Criteria) this;
		}
 public Criteria andWgTypeIsNull() {
		 addCriterion("wg_type is null");
		return (Criteria) this;
		}
  public Criteria andWgTypeIsNotNull(){
		addCriterion("wg_type is not null");
		return (Criteria) this;
		}
  public Criteria andWgTypeEqualTo(String value) {
		  addCriterion("wg_type =", value, "wgType");
		return (Criteria) this;
		}
   public Criteria andWgTypeNotEqualTo(String value) {
		  addCriterion("wg_type <>", value, "wgType");
		return (Criteria) this;
		}
    public Criteria andWgTypeGreaterThan(String value) {
		 addCriterion("wg_type >", value, "wgType");
		return (Criteria) this;
		}
  public Criteria andWgTypeGreaterThanOrEqualTo(String value) {
		  addCriterion("wg_type >=", value, "WgType");
		return (Criteria) this;
		}
   public Criteria andWgTypeLessThan(String value) {
		  addCriterion("wg_type <", value, "wgType");
		return (Criteria) this;
		}
    public Criteria andWgTypeLessThanOrEqualTo(String value) {
		  addCriterion("wg_type <=", value, "wgType");
		return (Criteria) this;
		}
    public Criteria andWgTypeIn(List<String> values) {
		  addCriterion("wg_type in", values, "wgType");
		return (Criteria) this;
		}
    public Criteria andWgTypeNotIn(List<String> values) {
		  addCriterion("wg_type not in", values, "wgType");
		return (Criteria) this;
		}
     public Criteria andWgTypeBetween(String value1, String value2) {
		   addCriterion("wg_type between", value1, value2, "wgType");
		return (Criteria) this;
		}
     public Criteria andWgTypeNotBetween(String value1, String value2) {
		   addCriterion("wg_type not between", value1, value2, "wgType");
		return (Criteria) this;
		}
    public Criteria andWgTypeLike(String value) {
		  addCriterion("wg_type like", value, "wgType");
		return (Criteria) this;
		}
    public Criteria andWgTypeNotLike(String value) {
		  addCriterion("wg_type not like", value, "wgType");
		return (Criteria) this;
		}
 public Criteria andWgDetailIsNull() {
		 addCriterion("wg_detail is null");
		return (Criteria) this;
		}
  public Criteria andWgDetailIsNotNull(){
		addCriterion("wg_detail is not null");
		return (Criteria) this;
		}
  public Criteria andWgDetailEqualTo(String value) {
		  addCriterion("wg_detail =", value, "wgDetail");
		return (Criteria) this;
		}
   public Criteria andWgDetailNotEqualTo(String value) {
		  addCriterion("wg_detail <>", value, "wgDetail");
		return (Criteria) this;
		}
    public Criteria andWgDetailGreaterThan(String value) {
		 addCriterion("wg_detail >", value, "wgDetail");
		return (Criteria) this;
		}
  public Criteria andWgDetailGreaterThanOrEqualTo(String value) {
		  addCriterion("wg_detail >=", value, "WgDetail");
		return (Criteria) this;
		}
   public Criteria andWgDetailLessThan(String value) {
		  addCriterion("wg_detail <", value, "wgDetail");
		return (Criteria) this;
		}
    public Criteria andWgDetailLessThanOrEqualTo(String value) {
		  addCriterion("wg_detail <=", value, "wgDetail");
		return (Criteria) this;
		}
    public Criteria andWgDetailIn(List<String> values) {
		  addCriterion("wg_detail in", values, "wgDetail");
		return (Criteria) this;
		}
    public Criteria andWgDetailNotIn(List<String> values) {
		  addCriterion("wg_detail not in", values, "wgDetail");
		return (Criteria) this;
		}
     public Criteria andWgDetailBetween(String value1, String value2) {
		   addCriterion("wg_detail between", value1, value2, "wgDetail");
		return (Criteria) this;
		}
     public Criteria andWgDetailNotBetween(String value1, String value2) {
		   addCriterion("wg_detail not between", value1, value2, "wgDetail");
		return (Criteria) this;
		}
    public Criteria andWgDetailLike(String value) {
		  addCriterion("wg_detail like", value, "wgDetail");
		return (Criteria) this;
		}
    public Criteria andWgDetailNotLike(String value) {
		  addCriterion("wg_detail not like", value, "wgDetail");
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
