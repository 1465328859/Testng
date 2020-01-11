package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RptAgentCommissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RptAgentCommissionExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
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
            addCriterion("id >=", value, "id");
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

        public Criteria andUpThreeGradeIsNull() {
            addCriterion("up_three_grade is null");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeIsNotNull() {
            addCriterion("up_three_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeEqualTo(String value) {
            addCriterion("up_three_grade =", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeNotEqualTo(String value) {
            addCriterion("up_three_grade <>", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeGreaterThan(String value) {
            addCriterion("up_three_grade >", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeGreaterThanOrEqualTo(String value) {
            addCriterion("up_three_grade >=", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeLessThan(String value) {
            addCriterion("up_three_grade <", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeLessThanOrEqualTo(String value) {
            addCriterion("up_three_grade <=", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeLike(String value) {
            addCriterion("up_three_grade like", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeNotLike(String value) {
            addCriterion("up_three_grade not like", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeIn(List<String> values) {
            addCriterion("up_three_grade in", values, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeNotIn(List<String> values) {
            addCriterion("up_three_grade not in", values, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeBetween(String value1, String value2) {
            addCriterion("up_three_grade between", value1, value2, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeNotBetween(String value1, String value2) {
            addCriterion("up_three_grade not between", value1, value2, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andTopIdIsNull() {
            addCriterion("top_id is null");
            return (Criteria) this;
        }

        public Criteria andTopIdIsNotNull() {
            addCriterion("top_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopIdEqualTo(Integer value) {
            addCriterion("top_id =", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotEqualTo(Integer value) {
            addCriterion("top_id <>", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdGreaterThan(Integer value) {
            addCriterion("top_id >", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_id >=", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLessThan(Integer value) {
            addCriterion("top_id <", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLessThanOrEqualTo(Integer value) {
            addCriterion("top_id <=", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdIn(List<Integer> values) {
            addCriterion("top_id in", values, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotIn(List<Integer> values) {
            addCriterion("top_id not in", values, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdBetween(Integer value1, Integer value2) {
            addCriterion("top_id between", value1, value2, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("top_id not between", value1, value2, "topId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
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
            addCriterion("user_id >=", value, "userId");
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

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("agent like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("agent not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRebateTypeIsNull() {
            addCriterion("rebate_type is null");
            return (Criteria) this;
        }

        public Criteria andRebateTypeIsNotNull() {
            addCriterion("rebate_type is not null");
            return (Criteria) this;
        }

        public Criteria andRebateTypeEqualTo(Boolean value) {
            addCriterion("rebate_type =", value, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeNotEqualTo(Boolean value) {
            addCriterion("rebate_type <>", value, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeGreaterThan(Boolean value) {
            addCriterion("rebate_type >", value, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rebate_type >=", value, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeLessThan(Boolean value) {
            addCriterion("rebate_type <", value, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("rebate_type <=", value, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeIn(List<Boolean> values) {
            addCriterion("rebate_type in", values, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeNotIn(List<Boolean> values) {
            addCriterion("rebate_type not in", values, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("rebate_type between", value1, value2, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rebate_type not between", value1, value2, "rebateType");
            return (Criteria) this;
        }

        public Criteria andRebateTimeIsNull() {
            addCriterion("rebate_time is null");
            return (Criteria) this;
        }

        public Criteria andRebateTimeIsNotNull() {
            addCriterion("rebate_time is not null");
            return (Criteria) this;
        }

        public Criteria andRebateTimeEqualTo(Integer value) {
            addCriterion("rebate_time =", value, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeNotEqualTo(Integer value) {
            addCriterion("rebate_time <>", value, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeGreaterThan(Integer value) {
            addCriterion("rebate_time >", value, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rebate_time >=", value, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeLessThan(Integer value) {
            addCriterion("rebate_time <", value, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("rebate_time <=", value, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeIn(List<Integer> values) {
            addCriterion("rebate_time in", values, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeNotIn(List<Integer> values) {
            addCriterion("rebate_time not in", values, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeBetween(Integer value1, Integer value2) {
            addCriterion("rebate_time between", value1, value2, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andRebateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("rebate_time not between", value1, value2, "rebateTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andBelongDateIsNull() {
            addCriterion("belong_date is null");
            return (Criteria) this;
        }

        public Criteria andBelongDateIsNotNull() {
            addCriterion("belong_date is not null");
            return (Criteria) this;
        }

        public Criteria andBelongDateEqualTo(Date value) {
            addCriterionForJDBCDate("belong_date =", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("belong_date <>", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateGreaterThan(Date value) {
            addCriterionForJDBCDate("belong_date >", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("belong_date >=", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateLessThan(Date value) {
            addCriterionForJDBCDate("belong_date <", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("belong_date <=", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateIn(List<Date> values) {
            addCriterionForJDBCDate("belong_date in", values, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("belong_date not in", values, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("belong_date between", value1, value2, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("belong_date not between", value1, value2, "belongDate");
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