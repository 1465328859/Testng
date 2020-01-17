package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GamePlayerBetMoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GamePlayerBetMoneyExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIsNull() {
            addCriterion("withdraw_id is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIsNotNull() {
            addCriterion("withdraw_id is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdEqualTo(Integer value) {
            addCriterion("withdraw_id =", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotEqualTo(Integer value) {
            addCriterion("withdraw_id <>", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThan(Integer value) {
            addCriterion("withdraw_id >", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdraw_id >=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThan(Integer value) {
            addCriterion("withdraw_id <", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThanOrEqualTo(Integer value) {
            addCriterion("withdraw_id <=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIn(List<Integer> values) {
            addCriterion("withdraw_id in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotIn(List<Integer> values) {
            addCriterion("withdraw_id not in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_id between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_id not between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeIsNull() {
            addCriterion("last_recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeIsNotNull() {
            addCriterion("last_recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeEqualTo(Date value) {
            addCriterion("last_recharge_time =", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeNotEqualTo(Date value) {
            addCriterion("last_recharge_time <>", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeGreaterThan(Date value) {
            addCriterion("last_recharge_time >", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_recharge_time >=", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeLessThan(Date value) {
            addCriterion("last_recharge_time <", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_recharge_time <=", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeIn(List<Date> values) {
            addCriterion("last_recharge_time in", values, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeNotIn(List<Date> values) {
            addCriterion("last_recharge_time not in", values, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeBetween(Date value1, Date value2) {
            addCriterion("last_recharge_time between", value1, value2, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_recharge_time not between", value1, value2, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdIsNull() {
            addCriterion("last_recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdIsNotNull() {
            addCriterion("last_recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdEqualTo(Integer value) {
            addCriterion("last_recharge_id =", value, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdNotEqualTo(Integer value) {
            addCriterion("last_recharge_id <>", value, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdGreaterThan(Integer value) {
            addCriterion("last_recharge_id >", value, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_recharge_id >=", value, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdLessThan(Integer value) {
            addCriterion("last_recharge_id <", value, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_recharge_id <=", value, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdIn(List<Integer> values) {
            addCriterion("last_recharge_id in", values, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdNotIn(List<Integer> values) {
            addCriterion("last_recharge_id not in", values, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdBetween(Integer value1, Integer value2) {
            addCriterion("last_recharge_id between", value1, value2, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andLastRechargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_recharge_id not between", value1, value2, "lastRechargeId");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Byte value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Byte value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Byte value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Byte value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Byte value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Byte value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Byte> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Byte> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Byte value1, Byte value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Byte value1, Byte value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyIsNull() {
            addCriterion("last_total_in_money is null");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyIsNotNull() {
            addCriterion("last_total_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyEqualTo(BigDecimal value) {
            addCriterion("last_total_in_money =", value, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyNotEqualTo(BigDecimal value) {
            addCriterion("last_total_in_money <>", value, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyGreaterThan(BigDecimal value) {
            addCriterion("last_total_in_money >", value, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_total_in_money >=", value, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyLessThan(BigDecimal value) {
            addCriterion("last_total_in_money <", value, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_total_in_money <=", value, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyIn(List<BigDecimal> values) {
            addCriterion("last_total_in_money in", values, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyNotIn(List<BigDecimal> values) {
            addCriterion("last_total_in_money not in", values, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_total_in_money between", value1, value2, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalInMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_total_in_money not between", value1, value2, "lastTotalInMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyIsNull() {
            addCriterion("last_total_bet_money is null");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyIsNotNull() {
            addCriterion("last_total_bet_money is not null");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyEqualTo(BigDecimal value) {
            addCriterion("last_total_bet_money =", value, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyNotEqualTo(BigDecimal value) {
            addCriterion("last_total_bet_money <>", value, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyGreaterThan(BigDecimal value) {
            addCriterion("last_total_bet_money >", value, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_total_bet_money >=", value, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyLessThan(BigDecimal value) {
            addCriterion("last_total_bet_money <", value, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_total_bet_money <=", value, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyIn(List<BigDecimal> values) {
            addCriterion("last_total_bet_money in", values, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyNotIn(List<BigDecimal> values) {
            addCriterion("last_total_bet_money not in", values, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_total_bet_money between", value1, value2, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalBetMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_total_bet_money not between", value1, value2, "lastTotalBetMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyIsNull() {
            addCriterion("last_total_out_money is null");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyIsNotNull() {
            addCriterion("last_total_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyEqualTo(BigDecimal value) {
            addCriterion("last_total_out_money =", value, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyNotEqualTo(BigDecimal value) {
            addCriterion("last_total_out_money <>", value, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyGreaterThan(BigDecimal value) {
            addCriterion("last_total_out_money >", value, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_total_out_money >=", value, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyLessThan(BigDecimal value) {
            addCriterion("last_total_out_money <", value, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_total_out_money <=", value, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyIn(List<BigDecimal> values) {
            addCriterion("last_total_out_money in", values, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyNotIn(List<BigDecimal> values) {
            addCriterion("last_total_out_money not in", values, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_total_out_money between", value1, value2, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andLastTotalOutMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_total_out_money not between", value1, value2, "lastTotalOutMoney");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
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