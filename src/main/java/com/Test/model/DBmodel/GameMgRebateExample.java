package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameMgRebateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameMgRebateExample() {
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

        public Criteria andMerchantCodeIsNull() {
            addCriterion("merchant_code is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIsNotNull() {
            addCriterion("merchant_code is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeEqualTo(String value) {
            addCriterion("merchant_code =", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotEqualTo(String value) {
            addCriterion("merchant_code <>", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeGreaterThan(String value) {
            addCriterion("merchant_code >", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_code >=", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLessThan(String value) {
            addCriterion("merchant_code <", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLessThanOrEqualTo(String value) {
            addCriterion("merchant_code <=", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLike(String value) {
            addCriterion("merchant_code like", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotLike(String value) {
            addCriterion("merchant_code not like", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIn(List<String> values) {
            addCriterion("merchant_code in", values, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotIn(List<String> values) {
            addCriterion("merchant_code not in", values, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeBetween(String value1, String value2) {
            addCriterion("merchant_code between", value1, value2, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotBetween(String value1, String value2) {
            addCriterion("merchant_code not between", value1, value2, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andConditionIsNull() {
            addCriterion("condition is null");
            return (Criteria) this;
        }

        public Criteria andConditionIsNotNull() {
            addCriterion("condition is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEqualTo(String value) {
            addCriterion("condition =", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotEqualTo(String value) {
            addCriterion("condition <>", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThan(String value) {
            addCriterion("condition >", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThanOrEqualTo(String value) {
            addCriterion("condition >=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThan(String value) {
            addCriterion("condition <", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThanOrEqualTo(String value) {
            addCriterion("condition <=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLike(String value) {
            addCriterion("condition like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotLike(String value) {
            addCriterion("condition not like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionIn(List<String> values) {
            addCriterion("condition in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotIn(List<String> values) {
            addCriterion("condition not in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionBetween(String value1, String value2) {
            addCriterion("condition between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotBetween(String value1, String value2) {
            addCriterion("condition not between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andBetAmountIsNull() {
            addCriterion("bet_amount is null");
            return (Criteria) this;
        }

        public Criteria andBetAmountIsNotNull() {
            addCriterion("bet_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBetAmountEqualTo(BigDecimal value) {
            addCriterion("bet_amount =", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotEqualTo(BigDecimal value) {
            addCriterion("bet_amount <>", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountGreaterThan(BigDecimal value) {
            addCriterion("bet_amount >", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bet_amount >=", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountLessThan(BigDecimal value) {
            addCriterion("bet_amount <", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bet_amount <=", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountIn(List<BigDecimal> values) {
            addCriterion("bet_amount in", values, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotIn(List<BigDecimal> values) {
            addCriterion("bet_amount not in", values, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet_amount between", value1, value2, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet_amount not between", value1, value2, "betAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountIsNull() {
            addCriterion("upper_limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountIsNotNull() {
            addCriterion("upper_limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountEqualTo(BigDecimal value) {
            addCriterion("upper_limit_amount =", value, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("upper_limit_amount <>", value, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("upper_limit_amount >", value, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("upper_limit_amount >=", value, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountLessThan(BigDecimal value) {
            addCriterion("upper_limit_amount <", value, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("upper_limit_amount <=", value, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountIn(List<BigDecimal> values) {
            addCriterion("upper_limit_amount in", values, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("upper_limit_amount not in", values, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("upper_limit_amount between", value1, value2, "upperLimitAmount");
            return (Criteria) this;
        }

        public Criteria andUpperLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("upper_limit_amount not between", value1, value2, "upperLimitAmount");
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

        public Criteria andPrimaryRebateIsNull() {
            addCriterion("primary_rebate is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateIsNotNull() {
            addCriterion("primary_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateEqualTo(BigDecimal value) {
            addCriterion("primary_rebate =", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateNotEqualTo(BigDecimal value) {
            addCriterion("primary_rebate <>", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateGreaterThan(BigDecimal value) {
            addCriterion("primary_rebate >", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("primary_rebate >=", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateLessThan(BigDecimal value) {
            addCriterion("primary_rebate <", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("primary_rebate <=", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateIn(List<BigDecimal> values) {
            addCriterion("primary_rebate in", values, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateNotIn(List<BigDecimal> values) {
            addCriterion("primary_rebate not in", values, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("primary_rebate between", value1, value2, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("primary_rebate not between", value1, value2, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateIsNull() {
            addCriterion("secondary_rebate is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateIsNotNull() {
            addCriterion("secondary_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateEqualTo(BigDecimal value) {
            addCriterion("secondary_rebate =", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateNotEqualTo(BigDecimal value) {
            addCriterion("secondary_rebate <>", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateGreaterThan(BigDecimal value) {
            addCriterion("secondary_rebate >", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("secondary_rebate >=", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateLessThan(BigDecimal value) {
            addCriterion("secondary_rebate <", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("secondary_rebate <=", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateIn(List<BigDecimal> values) {
            addCriterion("secondary_rebate in", values, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateNotIn(List<BigDecimal> values) {
            addCriterion("secondary_rebate not in", values, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("secondary_rebate between", value1, value2, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("secondary_rebate not between", value1, value2, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateIsNull() {
            addCriterion("tertiary_rebate is null");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateIsNotNull() {
            addCriterion("tertiary_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate =", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateNotEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate <>", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateGreaterThan(BigDecimal value) {
            addCriterion("tertiary_rebate >", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate >=", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateLessThan(BigDecimal value) {
            addCriterion("tertiary_rebate <", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate <=", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateIn(List<BigDecimal> values) {
            addCriterion("tertiary_rebate in", values, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateNotIn(List<BigDecimal> values) {
            addCriterion("tertiary_rebate not in", values, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tertiary_rebate between", value1, value2, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tertiary_rebate not between", value1, value2, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
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