package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersTracesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersTracesExample() {
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

        public Criteria andTraceIdIsNull() {
            addCriterion("trace_id is null");
            return (Criteria) this;
        }

        public Criteria andTraceIdIsNotNull() {
            addCriterion("trace_id is not null");
            return (Criteria) this;
        }

        public Criteria andTraceIdEqualTo(Integer value) {
            addCriterion("trace_id =", value, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdNotEqualTo(Integer value) {
            addCriterion("trace_id <>", value, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdGreaterThan(Integer value) {
            addCriterion("trace_id >", value, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trace_id >=", value, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdLessThan(Integer value) {
            addCriterion("trace_id <", value, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdLessThanOrEqualTo(Integer value) {
            addCriterion("trace_id <=", value, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdIn(List<Integer> values) {
            addCriterion("trace_id in", values, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdNotIn(List<Integer> values) {
            addCriterion("trace_id not in", values, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdBetween(Integer value1, Integer value2) {
            addCriterion("trace_id between", value1, value2, "traceId");
            return (Criteria) this;
        }

        public Criteria andTraceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trace_id not between", value1, value2, "traceId");
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

        public Criteria andLotteryIdIsNull() {
            addCriterion("lottery_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("lottery_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(Byte value) {
            addCriterion("lottery_id =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(Byte value) {
            addCriterion("lottery_id <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(Byte value) {
            addCriterion("lottery_id >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("lottery_id >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(Byte value) {
            addCriterion("lottery_id <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(Byte value) {
            addCriterion("lottery_id <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<Byte> values) {
            addCriterion("lottery_id in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<Byte> values) {
            addCriterion("lottery_id not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(Byte value1, Byte value2) {
            addCriterion("lottery_id between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(Byte value1, Byte value2) {
            addCriterion("lottery_id not between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andStartIssueIsNull() {
            addCriterion("start_issue is null");
            return (Criteria) this;
        }

        public Criteria andStartIssueIsNotNull() {
            addCriterion("start_issue is not null");
            return (Criteria) this;
        }

        public Criteria andStartIssueEqualTo(String value) {
            addCriterion("start_issue =", value, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueNotEqualTo(String value) {
            addCriterion("start_issue <>", value, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueGreaterThan(String value) {
            addCriterion("start_issue >", value, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueGreaterThanOrEqualTo(String value) {
            addCriterion("start_issue >=", value, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueLessThan(String value) {
            addCriterion("start_issue <", value, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueLessThanOrEqualTo(String value) {
            addCriterion("start_issue <=", value, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueLike(String value) {
            addCriterion("start_issue like", value, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueNotLike(String value) {
            addCriterion("start_issue not like", value, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueIn(List<String> values) {
            addCriterion("start_issue in", values, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueNotIn(List<String> values) {
            addCriterion("start_issue not in", values, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueBetween(String value1, String value2) {
            addCriterion("start_issue between", value1, value2, "startIssue");
            return (Criteria) this;
        }

        public Criteria andStartIssueNotBetween(String value1, String value2) {
            addCriterion("start_issue not between", value1, value2, "startIssue");
            return (Criteria) this;
        }

        public Criteria andSingleNumIsNull() {
            addCriterion("single_num is null");
            return (Criteria) this;
        }

        public Criteria andSingleNumIsNotNull() {
            addCriterion("single_num is not null");
            return (Criteria) this;
        }

        public Criteria andSingleNumEqualTo(Integer value) {
            addCriterion("single_num =", value, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumNotEqualTo(Integer value) {
            addCriterion("single_num <>", value, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumGreaterThan(Integer value) {
            addCriterion("single_num >", value, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("single_num >=", value, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumLessThan(Integer value) {
            addCriterion("single_num <", value, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumLessThanOrEqualTo(Integer value) {
            addCriterion("single_num <=", value, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumIn(List<Integer> values) {
            addCriterion("single_num in", values, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumNotIn(List<Integer> values) {
            addCriterion("single_num not in", values, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumBetween(Integer value1, Integer value2) {
            addCriterion("single_num between", value1, value2, "singleNum");
            return (Criteria) this;
        }

        public Criteria andSingleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("single_num not between", value1, value2, "singleNum");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIsNull() {
            addCriterion("draw_money is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIsNotNull() {
            addCriterion("draw_money is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyEqualTo(BigDecimal value) {
            addCriterion("draw_money =", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNotEqualTo(BigDecimal value) {
            addCriterion("draw_money <>", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyGreaterThan(BigDecimal value) {
            addCriterion("draw_money >", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("draw_money >=", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyLessThan(BigDecimal value) {
            addCriterion("draw_money <", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("draw_money <=", value, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIn(List<BigDecimal> values) {
            addCriterion("draw_money in", values, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNotIn(List<BigDecimal> values) {
            addCriterion("draw_money not in", values, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("draw_money between", value1, value2, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("draw_money not between", value1, value2, "drawMoney");
            return (Criteria) this;
        }

        public Criteria andDrawNumIsNull() {
            addCriterion("draw_num is null");
            return (Criteria) this;
        }

        public Criteria andDrawNumIsNotNull() {
            addCriterion("draw_num is not null");
            return (Criteria) this;
        }

        public Criteria andDrawNumEqualTo(Integer value) {
            addCriterion("draw_num =", value, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumNotEqualTo(Integer value) {
            addCriterion("draw_num <>", value, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumGreaterThan(Integer value) {
            addCriterion("draw_num >", value, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("draw_num >=", value, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumLessThan(Integer value) {
            addCriterion("draw_num <", value, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumLessThanOrEqualTo(Integer value) {
            addCriterion("draw_num <=", value, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumIn(List<Integer> values) {
            addCriterion("draw_num in", values, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumNotIn(List<Integer> values) {
            addCriterion("draw_num not in", values, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumBetween(Integer value1, Integer value2) {
            addCriterion("draw_num between", value1, value2, "drawNum");
            return (Criteria) this;
        }

        public Criteria andDrawNumNotBetween(Integer value1, Integer value2) {
            addCriterion("draw_num not between", value1, value2, "drawNum");
            return (Criteria) this;
        }

        public Criteria andIsLockedIsNull() {
            addCriterion("is_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsLockedIsNotNull() {
            addCriterion("is_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockedEqualTo(Byte value) {
            addCriterion("is_locked =", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotEqualTo(Byte value) {
            addCriterion("is_locked <>", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedGreaterThan(Byte value) {
            addCriterion("is_locked >", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_locked >=", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedLessThan(Byte value) {
            addCriterion("is_locked <", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedLessThanOrEqualTo(Byte value) {
            addCriterion("is_locked <=", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedIn(List<Byte> values) {
            addCriterion("is_locked in", values, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotIn(List<Byte> values) {
            addCriterion("is_locked not in", values, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedBetween(Byte value1, Byte value2) {
            addCriterion("is_locked between", value1, value2, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_locked not between", value1, value2, "isLocked");
            return (Criteria) this;
        }

        public Criteria andTraceTimesIsNull() {
            addCriterion("trace_times is null");
            return (Criteria) this;
        }

        public Criteria andTraceTimesIsNotNull() {
            addCriterion("trace_times is not null");
            return (Criteria) this;
        }

        public Criteria andTraceTimesEqualTo(Short value) {
            addCriterion("trace_times =", value, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesNotEqualTo(Short value) {
            addCriterion("trace_times <>", value, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesGreaterThan(Short value) {
            addCriterion("trace_times >", value, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("trace_times >=", value, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesLessThan(Short value) {
            addCriterion("trace_times <", value, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesLessThanOrEqualTo(Short value) {
            addCriterion("trace_times <=", value, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesIn(List<Short> values) {
            addCriterion("trace_times in", values, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesNotIn(List<Short> values) {
            addCriterion("trace_times not in", values, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesBetween(Short value1, Short value2) {
            addCriterion("trace_times between", value1, value2, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andTraceTimesNotBetween(Short value1, Short value2) {
            addCriterion("trace_times not between", value1, value2, "traceTimes");
            return (Criteria) this;
        }

        public Criteria andPrizeIsNull() {
            addCriterion("prize is null");
            return (Criteria) this;
        }

        public Criteria andPrizeIsNotNull() {
            addCriterion("prize is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeEqualTo(BigDecimal value) {
            addCriterion("prize =", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotEqualTo(BigDecimal value) {
            addCriterion("prize <>", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeGreaterThan(BigDecimal value) {
            addCriterion("prize >", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prize >=", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeLessThan(BigDecimal value) {
            addCriterion("prize <", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prize <=", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeIn(List<BigDecimal> values) {
            addCriterion("prize in", values, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotIn(List<BigDecimal> values) {
            addCriterion("prize not in", values, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prize between", value1, value2, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prize not between", value1, value2, "prize");
            return (Criteria) this;
        }

        public Criteria andWinTimesIsNull() {
            addCriterion("win_times is null");
            return (Criteria) this;
        }

        public Criteria andWinTimesIsNotNull() {
            addCriterion("win_times is not null");
            return (Criteria) this;
        }

        public Criteria andWinTimesEqualTo(Short value) {
            addCriterion("win_times =", value, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesNotEqualTo(Short value) {
            addCriterion("win_times <>", value, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesGreaterThan(Short value) {
            addCriterion("win_times >", value, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("win_times >=", value, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesLessThan(Short value) {
            addCriterion("win_times <", value, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesLessThanOrEqualTo(Short value) {
            addCriterion("win_times <=", value, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesIn(List<Short> values) {
            addCriterion("win_times in", values, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesNotIn(List<Short> values) {
            addCriterion("win_times not in", values, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesBetween(Short value1, Short value2) {
            addCriterion("win_times between", value1, value2, "winTimes");
            return (Criteria) this;
        }

        public Criteria andWinTimesNotBetween(Short value1, Short value2) {
            addCriterion("win_times not between", value1, value2, "winTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesIsNull() {
            addCriterion("finish_times is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimesIsNotNull() {
            addCriterion("finish_times is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimesEqualTo(Short value) {
            addCriterion("finish_times =", value, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesNotEqualTo(Short value) {
            addCriterion("finish_times <>", value, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesGreaterThan(Short value) {
            addCriterion("finish_times >", value, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("finish_times >=", value, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesLessThan(Short value) {
            addCriterion("finish_times <", value, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesLessThanOrEqualTo(Short value) {
            addCriterion("finish_times <=", value, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesIn(List<Short> values) {
            addCriterion("finish_times in", values, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesNotIn(List<Short> values) {
            addCriterion("finish_times not in", values, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesBetween(Short value1, Short value2) {
            addCriterion("finish_times between", value1, value2, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andFinishTimesNotBetween(Short value1, Short value2) {
            addCriterion("finish_times not between", value1, value2, "finishTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesIsNull() {
            addCriterion("cancel_times is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimesIsNotNull() {
            addCriterion("cancel_times is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimesEqualTo(Short value) {
            addCriterion("cancel_times =", value, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesNotEqualTo(Short value) {
            addCriterion("cancel_times <>", value, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesGreaterThan(Short value) {
            addCriterion("cancel_times >", value, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("cancel_times >=", value, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesLessThan(Short value) {
            addCriterion("cancel_times <", value, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesLessThanOrEqualTo(Short value) {
            addCriterion("cancel_times <=", value, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesIn(List<Short> values) {
            addCriterion("cancel_times in", values, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesNotIn(List<Short> values) {
            addCriterion("cancel_times not in", values, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesBetween(Short value1, Short value2) {
            addCriterion("cancel_times between", value1, value2, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andCancelTimesNotBetween(Short value1, Short value2) {
            addCriterion("cancel_times not between", value1, value2, "cancelTimes");
            return (Criteria) this;
        }

        public Criteria andStopOnWinIsNull() {
            addCriterion("stop_on_win is null");
            return (Criteria) this;
        }

        public Criteria andStopOnWinIsNotNull() {
            addCriterion("stop_on_win is not null");
            return (Criteria) this;
        }

        public Criteria andStopOnWinEqualTo(Boolean value) {
            addCriterion("stop_on_win =", value, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinNotEqualTo(Boolean value) {
            addCriterion("stop_on_win <>", value, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinGreaterThan(Boolean value) {
            addCriterion("stop_on_win >", value, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stop_on_win >=", value, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinLessThan(Boolean value) {
            addCriterion("stop_on_win <", value, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinLessThanOrEqualTo(Boolean value) {
            addCriterion("stop_on_win <=", value, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinIn(List<Boolean> values) {
            addCriterion("stop_on_win in", values, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinNotIn(List<Boolean> values) {
            addCriterion("stop_on_win not in", values, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinBetween(Boolean value1, Boolean value2) {
            addCriterion("stop_on_win between", value1, value2, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andStopOnWinNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stop_on_win not between", value1, value2, "stopOnWin");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeIsNull() {
            addCriterion("is_rejudge is null");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeIsNotNull() {
            addCriterion("is_rejudge is not null");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeEqualTo(Boolean value) {
            addCriterion("is_rejudge =", value, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeNotEqualTo(Boolean value) {
            addCriterion("is_rejudge <>", value, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeGreaterThan(Boolean value) {
            addCriterion("is_rejudge >", value, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_rejudge >=", value, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeLessThan(Boolean value) {
            addCriterion("is_rejudge <", value, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_rejudge <=", value, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeIn(List<Boolean> values) {
            addCriterion("is_rejudge in", values, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeNotIn(List<Boolean> values) {
            addCriterion("is_rejudge not in", values, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_rejudge between", value1, value2, "isRejudge");
            return (Criteria) this;
        }

        public Criteria andIsRejudgeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_rejudge not between", value1, value2, "isRejudge");
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

        public Criteria andClientIpIsNull() {
            addCriterion("client_ip is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("client_ip is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("client_ip =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("client_ip <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("client_ip >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("client_ip >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("client_ip <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("client_ip <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("client_ip like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("client_ip not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("client_ip in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("client_ip not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("client_ip between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("client_ip not between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNull() {
            addCriterion("server_ip is null");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNotNull() {
            addCriterion("server_ip is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpEqualTo(String value) {
            addCriterion("server_ip =", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotEqualTo(String value) {
            addCriterion("server_ip <>", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThan(String value) {
            addCriterion("server_ip >", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("server_ip >=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThan(String value) {
            addCriterion("server_ip <", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThanOrEqualTo(String value) {
            addCriterion("server_ip <=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLike(String value) {
            addCriterion("server_ip like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotLike(String value) {
            addCriterion("server_ip not like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIn(List<String> values) {
            addCriterion("server_ip in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotIn(List<String> values) {
            addCriterion("server_ip not in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpBetween(String value1, String value2) {
            addCriterion("server_ip between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotBetween(String value1, String value2) {
            addCriterion("server_ip not between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("from is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("from is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(Byte value) {
            addCriterion("from =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(Byte value) {
            addCriterion("from <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(Byte value) {
            addCriterion("from >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(Byte value) {
            addCriterion("from >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(Byte value) {
            addCriterion("from <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(Byte value) {
            addCriterion("from <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<Byte> values) {
            addCriterion("from in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<Byte> values) {
            addCriterion("from not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(Byte value1, Byte value2) {
            addCriterion("from between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(Byte value1, Byte value2) {
            addCriterion("from not between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Byte value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Byte value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Byte value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Byte value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Byte value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Byte value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Byte> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Byte> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Byte value1, Byte value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Byte value1, Byte value2) {
            addCriterion("grade not between", value1, value2, "grade");
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