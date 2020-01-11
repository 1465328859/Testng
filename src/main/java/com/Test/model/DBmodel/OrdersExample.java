package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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

        public Criteria andLotteryNameIsNull() {
            addCriterion("lottery_name is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIsNotNull() {
            addCriterion("lottery_name is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameEqualTo(String value) {
            addCriterion("lottery_name =", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotEqualTo(String value) {
            addCriterion("lottery_name <>", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThan(String value) {
            addCriterion("lottery_name >", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_name >=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThan(String value) {
            addCriterion("lottery_name <", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThanOrEqualTo(String value) {
            addCriterion("lottery_name <=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLike(String value) {
            addCriterion("lottery_name like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotLike(String value) {
            addCriterion("lottery_name not like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIn(List<String> values) {
            addCriterion("lottery_name in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotIn(List<String> values) {
            addCriterion("lottery_name not in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameBetween(String value1, String value2) {
            addCriterion("lottery_name between", value1, value2, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotBetween(String value1, String value2) {
            addCriterion("lottery_name not between", value1, value2, "lotteryName");
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

        public Criteria andMultipleIsNull() {
            addCriterion("multiple is null");
            return (Criteria) this;
        }

        public Criteria andMultipleIsNotNull() {
            addCriterion("multiple is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleEqualTo(Integer value) {
            addCriterion("multiple =", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleNotEqualTo(Integer value) {
            addCriterion("multiple <>", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleGreaterThan(Integer value) {
            addCriterion("multiple >", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleGreaterThanOrEqualTo(Integer value) {
            addCriterion("multiple >=", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleLessThan(Integer value) {
            addCriterion("multiple <", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleLessThanOrEqualTo(Integer value) {
            addCriterion("multiple <=", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleIn(List<Integer> values) {
            addCriterion("multiple in", values, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleNotIn(List<Integer> values) {
            addCriterion("multiple not in", values, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleBetween(Integer value1, Integer value2) {
            addCriterion("multiple between", value1, value2, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleNotBetween(Integer value1, Integer value2) {
            addCriterion("multiple not between", value1, value2, "multiple");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andOpenCodeIsNull() {
            addCriterion("open_code is null");
            return (Criteria) this;
        }

        public Criteria andOpenCodeIsNotNull() {
            addCriterion("open_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpenCodeEqualTo(String value) {
            addCriterion("open_code =", value, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeNotEqualTo(String value) {
            addCriterion("open_code <>", value, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeGreaterThan(String value) {
            addCriterion("open_code >", value, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeGreaterThanOrEqualTo(String value) {
            addCriterion("open_code >=", value, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeLessThan(String value) {
            addCriterion("open_code <", value, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeLessThanOrEqualTo(String value) {
            addCriterion("open_code <=", value, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeLike(String value) {
            addCriterion("open_code like", value, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeNotLike(String value) {
            addCriterion("open_code not like", value, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeIn(List<String> values) {
            addCriterion("open_code in", values, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeNotIn(List<String> values) {
            addCriterion("open_code not in", values, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeBetween(String value1, String value2) {
            addCriterion("open_code between", value1, value2, "openCode");
            return (Criteria) this;
        }

        public Criteria andOpenCodeNotBetween(String value1, String value2) {
            addCriterion("open_code not between", value1, value2, "openCode");
            return (Criteria) this;
        }

        public Criteria andCurRebateIsNull() {
            addCriterion("cur_rebate is null");
            return (Criteria) this;
        }

        public Criteria andCurRebateIsNotNull() {
            addCriterion("cur_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andCurRebateEqualTo(BigDecimal value) {
            addCriterion("cur_rebate =", value, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateNotEqualTo(BigDecimal value) {
            addCriterion("cur_rebate <>", value, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateGreaterThan(BigDecimal value) {
            addCriterion("cur_rebate >", value, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_rebate >=", value, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateLessThan(BigDecimal value) {
            addCriterion("cur_rebate <", value, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_rebate <=", value, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateIn(List<BigDecimal> values) {
            addCriterion("cur_rebate in", values, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateNotIn(List<BigDecimal> values) {
            addCriterion("cur_rebate not in", values, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_rebate between", value1, value2, "curRebate");
            return (Criteria) this;
        }

        public Criteria andCurRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_rebate not between", value1, value2, "curRebate");
            return (Criteria) this;
        }

        public Criteria andModesIsNull() {
            addCriterion("modes is null");
            return (Criteria) this;
        }

        public Criteria andModesIsNotNull() {
            addCriterion("modes is not null");
            return (Criteria) this;
        }

        public Criteria andModesEqualTo(Boolean value) {
            addCriterion("modes =", value, "modes");
            return (Criteria) this;
        }

        public Criteria andModesNotEqualTo(Boolean value) {
            addCriterion("modes <>", value, "modes");
            return (Criteria) this;
        }

        public Criteria andModesGreaterThan(Boolean value) {
            addCriterion("modes >", value, "modes");
            return (Criteria) this;
        }

        public Criteria andModesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("modes >=", value, "modes");
            return (Criteria) this;
        }

        public Criteria andModesLessThan(Boolean value) {
            addCriterion("modes <", value, "modes");
            return (Criteria) this;
        }

        public Criteria andModesLessThanOrEqualTo(Boolean value) {
            addCriterion("modes <=", value, "modes");
            return (Criteria) this;
        }

        public Criteria andModesIn(List<Boolean> values) {
            addCriterion("modes in", values, "modes");
            return (Criteria) this;
        }

        public Criteria andModesNotIn(List<Boolean> values) {
            addCriterion("modes not in", values, "modes");
            return (Criteria) this;
        }

        public Criteria andModesBetween(Boolean value1, Boolean value2) {
            addCriterion("modes between", value1, value2, "modes");
            return (Criteria) this;
        }

        public Criteria andModesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("modes not between", value1, value2, "modes");
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

        public Criteria andCheckPrizeStatusIsNull() {
            addCriterion("check_prize_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusIsNotNull() {
            addCriterion("check_prize_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusEqualTo(Byte value) {
            addCriterion("check_prize_status =", value, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusNotEqualTo(Byte value) {
            addCriterion("check_prize_status <>", value, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusGreaterThan(Byte value) {
            addCriterion("check_prize_status >", value, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_prize_status >=", value, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusLessThan(Byte value) {
            addCriterion("check_prize_status <", value, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("check_prize_status <=", value, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusIn(List<Byte> values) {
            addCriterion("check_prize_status in", values, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusNotIn(List<Byte> values) {
            addCriterion("check_prize_status not in", values, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusBetween(Byte value1, Byte value2) {
            addCriterion("check_prize_status between", value1, value2, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andCheckPrizeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("check_prize_status not between", value1, value2, "checkPrizeStatus");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeIsNull() {
            addCriterion("send_prize_time is null");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeIsNotNull() {
            addCriterion("send_prize_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeEqualTo(Integer value) {
            addCriterion("send_prize_time =", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeNotEqualTo(Integer value) {
            addCriterion("send_prize_time <>", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeGreaterThan(Integer value) {
            addCriterion("send_prize_time >", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_prize_time >=", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeLessThan(Integer value) {
            addCriterion("send_prize_time <", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("send_prize_time <=", value, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeIn(List<Integer> values) {
            addCriterion("send_prize_time in", values, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeNotIn(List<Integer> values) {
            addCriterion("send_prize_time not in", values, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeBetween(Integer value1, Integer value2) {
            addCriterion("send_prize_time between", value1, value2, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andSendPrizeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_prize_time not between", value1, value2, "sendPrizeTime");
            return (Criteria) this;
        }

        public Criteria andCancelStatusIsNull() {
            addCriterion("cancel_status is null");
            return (Criteria) this;
        }

        public Criteria andCancelStatusIsNotNull() {
            addCriterion("cancel_status is not null");
            return (Criteria) this;
        }

        public Criteria andCancelStatusEqualTo(Byte value) {
            addCriterion("cancel_status =", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusNotEqualTo(Byte value) {
            addCriterion("cancel_status <>", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusGreaterThan(Byte value) {
            addCriterion("cancel_status >", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("cancel_status >=", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusLessThan(Byte value) {
            addCriterion("cancel_status <", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusLessThanOrEqualTo(Byte value) {
            addCriterion("cancel_status <=", value, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusIn(List<Byte> values) {
            addCriterion("cancel_status in", values, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusNotIn(List<Byte> values) {
            addCriterion("cancel_status not in", values, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusBetween(Byte value1, Byte value2) {
            addCriterion("cancel_status between", value1, value2, "cancelStatus");
            return (Criteria) this;
        }

        public Criteria andCancelStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("cancel_status not between", value1, value2, "cancelStatus");
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

        public Criteria andCancelAdminIdIsNull() {
            addCriterion("cancel_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdIsNotNull() {
            addCriterion("cancel_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdEqualTo(Short value) {
            addCriterion("cancel_admin_id =", value, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdNotEqualTo(Short value) {
            addCriterion("cancel_admin_id <>", value, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdGreaterThan(Short value) {
            addCriterion("cancel_admin_id >", value, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdGreaterThanOrEqualTo(Short value) {
            addCriterion("cancel_admin_id >=", value, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdLessThan(Short value) {
            addCriterion("cancel_admin_id <", value, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdLessThanOrEqualTo(Short value) {
            addCriterion("cancel_admin_id <=", value, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdIn(List<Short> values) {
            addCriterion("cancel_admin_id in", values, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdNotIn(List<Short> values) {
            addCriterion("cancel_admin_id not in", values, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdBetween(Short value1, Short value2) {
            addCriterion("cancel_admin_id between", value1, value2, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelAdminIdNotBetween(Short value1, Short value2) {
            addCriterion("cancel_admin_id not between", value1, value2, "cancelAdminId");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Integer value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Integer value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Integer value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Integer value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Integer> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Integer> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Integer value1, Integer value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
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

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
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