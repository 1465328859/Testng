package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UsersGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersGradeExample() {
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRebateIsNull() {
            addCriterion("rebate is null");
            return (Criteria) this;
        }

        public Criteria andRebateIsNotNull() {
            addCriterion("rebate is not null");
            return (Criteria) this;
        }

        public Criteria andRebateEqualTo(BigDecimal value) {
            addCriterion("rebate =", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotEqualTo(BigDecimal value) {
            addCriterion("rebate <>", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThan(BigDecimal value) {
            addCriterion("rebate >", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate >=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThan(BigDecimal value) {
            addCriterion("rebate <", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate <=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateIn(List<BigDecimal> values) {
            addCriterion("rebate in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotIn(List<BigDecimal> values) {
            addCriterion("rebate not in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate not between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andUpChargeIsNull() {
            addCriterion("up_charge is null");
            return (Criteria) this;
        }

        public Criteria andUpChargeIsNotNull() {
            addCriterion("up_charge is not null");
            return (Criteria) this;
        }

        public Criteria andUpChargeEqualTo(BigDecimal value) {
            addCriterion("up_charge =", value, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeNotEqualTo(BigDecimal value) {
            addCriterion("up_charge <>", value, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeGreaterThan(BigDecimal value) {
            addCriterion("up_charge >", value, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("up_charge >=", value, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeLessThan(BigDecimal value) {
            addCriterion("up_charge <", value, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("up_charge <=", value, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeIn(List<BigDecimal> values) {
            addCriterion("up_charge in", values, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeNotIn(List<BigDecimal> values) {
            addCriterion("up_charge not in", values, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_charge between", value1, value2, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_charge not between", value1, value2, "upCharge");
            return (Criteria) this;
        }

        public Criteria andUpBetIsNull() {
            addCriterion("up_bet is null");
            return (Criteria) this;
        }

        public Criteria andUpBetIsNotNull() {
            addCriterion("up_bet is not null");
            return (Criteria) this;
        }

        public Criteria andUpBetEqualTo(BigDecimal value) {
            addCriterion("up_bet =", value, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetNotEqualTo(BigDecimal value) {
            addCriterion("up_bet <>", value, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetGreaterThan(BigDecimal value) {
            addCriterion("up_bet >", value, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("up_bet >=", value, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetLessThan(BigDecimal value) {
            addCriterion("up_bet <", value, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("up_bet <=", value, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetIn(List<BigDecimal> values) {
            addCriterion("up_bet in", values, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetNotIn(List<BigDecimal> values) {
            addCriterion("up_bet not in", values, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_bet between", value1, value2, "upBet");
            return (Criteria) this;
        }

        public Criteria andUpBetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_bet not between", value1, value2, "upBet");
            return (Criteria) this;
        }

        public Criteria andAwardOnceIsNull() {
            addCriterion("award_once is null");
            return (Criteria) this;
        }

        public Criteria andAwardOnceIsNotNull() {
            addCriterion("award_once is not null");
            return (Criteria) this;
        }

        public Criteria andAwardOnceEqualTo(BigDecimal value) {
            addCriterion("award_once =", value, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceNotEqualTo(BigDecimal value) {
            addCriterion("award_once <>", value, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceGreaterThan(BigDecimal value) {
            addCriterion("award_once >", value, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_once >=", value, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceLessThan(BigDecimal value) {
            addCriterion("award_once <", value, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_once <=", value, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceIn(List<BigDecimal> values) {
            addCriterion("award_once in", values, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceNotIn(List<BigDecimal> values) {
            addCriterion("award_once not in", values, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_once between", value1, value2, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardOnceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_once not between", value1, value2, "awardOnce");
            return (Criteria) this;
        }

        public Criteria andAwardMonthIsNull() {
            addCriterion("award_month is null");
            return (Criteria) this;
        }

        public Criteria andAwardMonthIsNotNull() {
            addCriterion("award_month is not null");
            return (Criteria) this;
        }

        public Criteria andAwardMonthEqualTo(BigDecimal value) {
            addCriterion("award_month =", value, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthNotEqualTo(BigDecimal value) {
            addCriterion("award_month <>", value, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthGreaterThan(BigDecimal value) {
            addCriterion("award_month >", value, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_month >=", value, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthLessThan(BigDecimal value) {
            addCriterion("award_month <", value, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_month <=", value, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthIn(List<BigDecimal> values) {
            addCriterion("award_month in", values, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthNotIn(List<BigDecimal> values) {
            addCriterion("award_month not in", values, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_month between", value1, value2, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andAwardMonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_month not between", value1, value2, "awardMonth");
            return (Criteria) this;
        }

        public Criteria andMinBetIsNull() {
            addCriterion("min_bet is null");
            return (Criteria) this;
        }

        public Criteria andMinBetIsNotNull() {
            addCriterion("min_bet is not null");
            return (Criteria) this;
        }

        public Criteria andMinBetEqualTo(BigDecimal value) {
            addCriterion("min_bet =", value, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetNotEqualTo(BigDecimal value) {
            addCriterion("min_bet <>", value, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetGreaterThan(BigDecimal value) {
            addCriterion("min_bet >", value, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_bet >=", value, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetLessThan(BigDecimal value) {
            addCriterion("min_bet <", value, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_bet <=", value, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetIn(List<BigDecimal> values) {
            addCriterion("min_bet in", values, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetNotIn(List<BigDecimal> values) {
            addCriterion("min_bet not in", values, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_bet between", value1, value2, "minBet");
            return (Criteria) this;
        }

        public Criteria andMinBetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_bet not between", value1, value2, "minBet");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(Short value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(Short value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(Short value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(Short value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(Short value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(Short value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<Short> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<Short> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(Short value1, Short value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(Short value1, Short value2) {
            addCriterion("open not between", value1, value2, "open");
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