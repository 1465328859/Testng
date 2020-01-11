package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LotteryOddsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryOddsExample() {
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

        public Criteria andLotteryIdIsNull() {
            addCriterion("lottery_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("lottery_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(Integer value) {
            addCriterion("lottery_id =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(Integer value) {
            addCriterion("lottery_id <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(Integer value) {
            addCriterion("lottery_id >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_id >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(Integer value) {
            addCriterion("lottery_id <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(Integer value) {
            addCriterion("lottery_id <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<Integer> values) {
            addCriterion("lottery_id in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<Integer> values) {
            addCriterion("lottery_id not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(Integer value1, Integer value2) {
            addCriterion("lottery_id between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_id not between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andOddsNameIsNull() {
            addCriterion("odds_name is null");
            return (Criteria) this;
        }

        public Criteria andOddsNameIsNotNull() {
            addCriterion("odds_name is not null");
            return (Criteria) this;
        }

        public Criteria andOddsNameEqualTo(String value) {
            addCriterion("odds_name =", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameNotEqualTo(String value) {
            addCriterion("odds_name <>", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameGreaterThan(String value) {
            addCriterion("odds_name >", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameGreaterThanOrEqualTo(String value) {
            addCriterion("odds_name >=", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameLessThan(String value) {
            addCriterion("odds_name <", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameLessThanOrEqualTo(String value) {
            addCriterion("odds_name <=", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameLike(String value) {
            addCriterion("odds_name like", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameNotLike(String value) {
            addCriterion("odds_name not like", value, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameIn(List<String> values) {
            addCriterion("odds_name in", values, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameNotIn(List<String> values) {
            addCriterion("odds_name not in", values, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameBetween(String value1, String value2) {
            addCriterion("odds_name between", value1, value2, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsNameNotBetween(String value1, String value2) {
            addCriterion("odds_name not between", value1, value2, "oddsName");
            return (Criteria) this;
        }

        public Criteria andOddsAliasIsNull() {
            addCriterion("odds_alias is null");
            return (Criteria) this;
        }

        public Criteria andOddsAliasIsNotNull() {
            addCriterion("odds_alias is not null");
            return (Criteria) this;
        }

        public Criteria andOddsAliasEqualTo(String value) {
            addCriterion("odds_alias =", value, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasNotEqualTo(String value) {
            addCriterion("odds_alias <>", value, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasGreaterThan(String value) {
            addCriterion("odds_alias >", value, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasGreaterThanOrEqualTo(String value) {
            addCriterion("odds_alias >=", value, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasLessThan(String value) {
            addCriterion("odds_alias <", value, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasLessThanOrEqualTo(String value) {
            addCriterion("odds_alias <=", value, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasLike(String value) {
            addCriterion("odds_alias like", value, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasNotLike(String value) {
            addCriterion("odds_alias not like", value, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasIn(List<String> values) {
            addCriterion("odds_alias in", values, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasNotIn(List<String> values) {
            addCriterion("odds_alias not in", values, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasBetween(String value1, String value2) {
            addCriterion("odds_alias between", value1, value2, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andOddsAliasNotBetween(String value1, String value2) {
            addCriterion("odds_alias not between", value1, value2, "oddsAlias");
            return (Criteria) this;
        }

        public Criteria andTopOddsIsNull() {
            addCriterion("top_odds is null");
            return (Criteria) this;
        }

        public Criteria andTopOddsIsNotNull() {
            addCriterion("top_odds is not null");
            return (Criteria) this;
        }

        public Criteria andTopOddsEqualTo(BigDecimal value) {
            addCriterion("top_odds =", value, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsNotEqualTo(BigDecimal value) {
            addCriterion("top_odds <>", value, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsGreaterThan(BigDecimal value) {
            addCriterion("top_odds >", value, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("top_odds >=", value, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsLessThan(BigDecimal value) {
            addCriterion("top_odds <", value, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("top_odds <=", value, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsIn(List<BigDecimal> values) {
            addCriterion("top_odds in", values, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsNotIn(List<BigDecimal> values) {
            addCriterion("top_odds not in", values, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_odds between", value1, value2, "topOdds");
            return (Criteria) this;
        }

        public Criteria andTopOddsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_odds not between", value1, value2, "topOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsIsNull() {
            addCriterion("low_odds is null");
            return (Criteria) this;
        }

        public Criteria andLowOddsIsNotNull() {
            addCriterion("low_odds is not null");
            return (Criteria) this;
        }

        public Criteria andLowOddsEqualTo(BigDecimal value) {
            addCriterion("low_odds =", value, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsNotEqualTo(BigDecimal value) {
            addCriterion("low_odds <>", value, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsGreaterThan(BigDecimal value) {
            addCriterion("low_odds >", value, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("low_odds >=", value, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsLessThan(BigDecimal value) {
            addCriterion("low_odds <", value, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("low_odds <=", value, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsIn(List<BigDecimal> values) {
            addCriterion("low_odds in", values, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsNotIn(List<BigDecimal> values) {
            addCriterion("low_odds not in", values, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_odds between", value1, value2, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andLowOddsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_odds not between", value1, value2, "lowOdds");
            return (Criteria) this;
        }

        public Criteria andSpareIsNull() {
            addCriterion("spare is null");
            return (Criteria) this;
        }

        public Criteria andSpareIsNotNull() {
            addCriterion("spare is not null");
            return (Criteria) this;
        }

        public Criteria andSpareEqualTo(String value) {
            addCriterion("spare =", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotEqualTo(String value) {
            addCriterion("spare <>", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareGreaterThan(String value) {
            addCriterion("spare >", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareGreaterThanOrEqualTo(String value) {
            addCriterion("spare >=", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLessThan(String value) {
            addCriterion("spare <", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLessThanOrEqualTo(String value) {
            addCriterion("spare <=", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLike(String value) {
            addCriterion("spare like", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotLike(String value) {
            addCriterion("spare not like", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareIn(List<String> values) {
            addCriterion("spare in", values, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotIn(List<String> values) {
            addCriterion("spare not in", values, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareBetween(String value1, String value2) {
            addCriterion("spare between", value1, value2, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotBetween(String value1, String value2) {
            addCriterion("spare not between", value1, value2, "spare");
            return (Criteria) this;
        }

        public Criteria andIsOriginIsNull() {
            addCriterion("is_origin is null");
            return (Criteria) this;
        }

        public Criteria andIsOriginIsNotNull() {
            addCriterion("is_origin is not null");
            return (Criteria) this;
        }

        public Criteria andIsOriginEqualTo(Boolean value) {
            addCriterion("is_origin =", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginNotEqualTo(Boolean value) {
            addCriterion("is_origin <>", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginGreaterThan(Boolean value) {
            addCriterion("is_origin >", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_origin >=", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginLessThan(Boolean value) {
            addCriterion("is_origin <", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginLessThanOrEqualTo(Boolean value) {
            addCriterion("is_origin <=", value, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginIn(List<Boolean> values) {
            addCriterion("is_origin in", values, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginNotIn(List<Boolean> values) {
            addCriterion("is_origin not in", values, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginBetween(Boolean value1, Boolean value2) {
            addCriterion("is_origin between", value1, value2, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andIsOriginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_origin not between", value1, value2, "isOrigin");
            return (Criteria) this;
        }

        public Criteria andWayClassIdIsNull() {
            addCriterion("way_class_id is null");
            return (Criteria) this;
        }

        public Criteria andWayClassIdIsNotNull() {
            addCriterion("way_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andWayClassIdEqualTo(Integer value) {
            addCriterion("way_class_id =", value, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdNotEqualTo(Integer value) {
            addCriterion("way_class_id <>", value, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdGreaterThan(Integer value) {
            addCriterion("way_class_id >", value, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("way_class_id >=", value, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdLessThan(Integer value) {
            addCriterion("way_class_id <", value, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("way_class_id <=", value, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdIn(List<Integer> values) {
            addCriterion("way_class_id in", values, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdNotIn(List<Integer> values) {
            addCriterion("way_class_id not in", values, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdBetween(Integer value1, Integer value2) {
            addCriterion("way_class_id between", value1, value2, "wayClassId");
            return (Criteria) this;
        }

        public Criteria andWayClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("way_class_id not between", value1, value2, "wayClassId");
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