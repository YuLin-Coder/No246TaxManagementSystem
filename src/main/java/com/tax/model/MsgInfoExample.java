package com.tax.model;
import java.util.ArrayList;
import java.util.List;
public class MsgInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public MsgInfoExample() {
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
 public Criteria andMsgContentIsNull() {
		 addCriterion("msg_content is null");
		return (Criteria) this;
		}
  public Criteria andMsgContentIsNotNull(){
		addCriterion("msg_content is not null");
		return (Criteria) this;
		}
  public Criteria andMsgContentEqualTo(String value) {
		  addCriterion("msg_content =", value, "msgContent");
		return (Criteria) this;
		}
   public Criteria andMsgContentNotEqualTo(String value) {
		  addCriterion("msg_content <>", value, "msgContent");
		return (Criteria) this;
		}
    public Criteria andMsgContentGreaterThan(String value) {
		 addCriterion("msg_content >", value, "msgContent");
		return (Criteria) this;
		}
  public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
		  addCriterion("msg_content >=", value, "MsgContent");
		return (Criteria) this;
		}
   public Criteria andMsgContentLessThan(String value) {
		  addCriterion("msg_content <", value, "msgContent");
		return (Criteria) this;
		}
    public Criteria andMsgContentLessThanOrEqualTo(String value) {
		  addCriterion("msg_content <=", value, "msgContent");
		return (Criteria) this;
		}
    public Criteria andMsgContentIn(List<String> values) {
		  addCriterion("msg_content in", values, "msgContent");
		return (Criteria) this;
		}
    public Criteria andMsgContentNotIn(List<String> values) {
		  addCriterion("msg_content not in", values, "msgContent");
		return (Criteria) this;
		}
     public Criteria andMsgContentBetween(String value1, String value2) {
		   addCriterion("msg_content between", value1, value2, "msgContent");
		return (Criteria) this;
		}
     public Criteria andMsgContentNotBetween(String value1, String value2) {
		   addCriterion("msg_content not between", value1, value2, "msgContent");
		return (Criteria) this;
		}
    public Criteria andMsgContentLike(String value) {
		  addCriterion("msg_content like", value, "msgContent");
		return (Criteria) this;
		}
    public Criteria andMsgContentNotLike(String value) {
		  addCriterion("msg_content not like", value, "msgContent");
		return (Criteria) this;
		}
 public Criteria andReplyStatusIsNull() {
		 addCriterion("reply_status is null");
		return (Criteria) this;
		}
  public Criteria andReplyStatusIsNotNull(){
		addCriterion("reply_status is not null");
		return (Criteria) this;
		}
  public Criteria andReplyStatusEqualTo(Integer value) {
		  addCriterion("reply_status =", value, "replyStatus");
		return (Criteria) this;
		}
   public Criteria andReplyStatusNotEqualTo(Integer value) {
		  addCriterion("reply_status <>", value, "replyStatus");
		return (Criteria) this;
		}
    public Criteria andReplyStatusGreaterThan(Integer value) {
		 addCriterion("reply_status >", value, "replyStatus");
		return (Criteria) this;
		}
  public Criteria andReplyStatusGreaterThanOrEqualTo(Integer value) {
		  addCriterion("reply_status >=", value, "ReplyStatus");
		return (Criteria) this;
		}
   public Criteria andReplyStatusLessThan(Integer value) {
		  addCriterion("reply_status <", value, "replyStatus");
		return (Criteria) this;
		}
    public Criteria andReplyStatusLessThanOrEqualTo(Integer value) {
		  addCriterion("reply_status <=", value, "replyStatus");
		return (Criteria) this;
		}
    public Criteria andReplyStatusIn(List<Integer> values) {
		  addCriterion("reply_status in", values, "replyStatus");
		return (Criteria) this;
		}
    public Criteria andReplyStatusNotIn(List<Integer> values) {
		  addCriterion("reply_status not in", values, "replyStatus");
		return (Criteria) this;
		}
     public Criteria andReplyStatusBetween(Integer value1, Integer value2) {
		   addCriterion("reply_status between", value1, value2, "replyStatus");
		return (Criteria) this;
		}
     public Criteria andReplyStatusNotBetween(Integer value1, Integer value2) {
		   addCriterion("reply_status not between", value1, value2, "replyStatus");
		return (Criteria) this;
		}
    public Criteria andReplyStatusLike(Integer value) {
		  addCriterion("reply_status like", value, "replyStatus");
		return (Criteria) this;
		}
    public Criteria andReplyStatusNotLike(Integer value) {
		  addCriterion("reply_status not like", value, "replyStatus");
		return (Criteria) this;
		}
 public Criteria andReplyContentIsNull() {
		 addCriterion("reply_content is null");
		return (Criteria) this;
		}
  public Criteria andReplyContentIsNotNull(){
		addCriterion("reply_content is not null");
		return (Criteria) this;
		}
  public Criteria andReplyContentEqualTo(String value) {
		  addCriterion("reply_content =", value, "replyContent");
		return (Criteria) this;
		}
   public Criteria andReplyContentNotEqualTo(String value) {
		  addCriterion("reply_content <>", value, "replyContent");
		return (Criteria) this;
		}
    public Criteria andReplyContentGreaterThan(String value) {
		 addCriterion("reply_content >", value, "replyContent");
		return (Criteria) this;
		}
  public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
		  addCriterion("reply_content >=", value, "ReplyContent");
		return (Criteria) this;
		}
   public Criteria andReplyContentLessThan(String value) {
		  addCriterion("reply_content <", value, "replyContent");
		return (Criteria) this;
		}
    public Criteria andReplyContentLessThanOrEqualTo(String value) {
		  addCriterion("reply_content <=", value, "replyContent");
		return (Criteria) this;
		}
    public Criteria andReplyContentIn(List<String> values) {
		  addCriterion("reply_content in", values, "replyContent");
		return (Criteria) this;
		}
    public Criteria andReplyContentNotIn(List<String> values) {
		  addCriterion("reply_content not in", values, "replyContent");
		return (Criteria) this;
		}
     public Criteria andReplyContentBetween(String value1, String value2) {
		   addCriterion("reply_content between", value1, value2, "replyContent");
		return (Criteria) this;
		}
     public Criteria andReplyContentNotBetween(String value1, String value2) {
		   addCriterion("reply_content not between", value1, value2, "replyContent");
		return (Criteria) this;
		}
    public Criteria andReplyContentLike(String value) {
		  addCriterion("reply_content like", value, "replyContent");
		return (Criteria) this;
		}
    public Criteria andReplyContentNotLike(String value) {
		  addCriterion("reply_content not like", value, "replyContent");
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
