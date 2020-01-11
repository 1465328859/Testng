package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RptUserBetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RptUserBetExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andTzzsIsNull() {
            addCriterion("tzzs is null");
            return (Criteria) this;
        }

        public Criteria andTzzsIsNotNull() {
            addCriterion("tzzs is not null");
            return (Criteria) this;
        }

        public Criteria andTzzsEqualTo(Integer value) {
            addCriterion("tzzs =", value, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsNotEqualTo(Integer value) {
            addCriterion("tzzs <>", value, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsGreaterThan(Integer value) {
            addCriterion("tzzs >", value, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tzzs >=", value, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsLessThan(Integer value) {
            addCriterion("tzzs <", value, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsLessThanOrEqualTo(Integer value) {
            addCriterion("tzzs <=", value, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsIn(List<Integer> values) {
            addCriterion("tzzs in", values, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsNotIn(List<Integer> values) {
            addCriterion("tzzs not in", values, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsBetween(Integer value1, Integer value2) {
            addCriterion("tzzs between", value1, value2, "tzzs");
            return (Criteria) this;
        }

        public Criteria andTzzsNotBetween(Integer value1, Integer value2) {
            addCriterion("tzzs not between", value1, value2, "tzzs");
            return (Criteria) this;
        }

        public Criteria andZjzsIsNull() {
            addCriterion("zjzs is null");
            return (Criteria) this;
        }

        public Criteria andZjzsIsNotNull() {
            addCriterion("zjzs is not null");
            return (Criteria) this;
        }

        public Criteria andZjzsEqualTo(Integer value) {
            addCriterion("zjzs =", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsNotEqualTo(Integer value) {
            addCriterion("zjzs <>", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsGreaterThan(Integer value) {
            addCriterion("zjzs >", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsGreaterThanOrEqualTo(Integer value) {
            addCriterion("zjzs >=", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsLessThan(Integer value) {
            addCriterion("zjzs <", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsLessThanOrEqualTo(Integer value) {
            addCriterion("zjzs <=", value, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsIn(List<Integer> values) {
            addCriterion("zjzs in", values, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsNotIn(List<Integer> values) {
            addCriterion("zjzs not in", values, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsBetween(Integer value1, Integer value2) {
            addCriterion("zjzs between", value1, value2, "zjzs");
            return (Criteria) this;
        }

        public Criteria andZjzsNotBetween(Integer value1, Integer value2) {
            addCriterion("zjzs not between", value1, value2, "zjzs");
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

        public Criteria andRebateAmountIsNull() {
            addCriterion("rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNotNull() {
            addCriterion("rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountEqualTo(BigDecimal value) {
            addCriterion("rebate_amount =", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("rebate_amount <>", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("rebate_amount >", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate_amount >=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThan(BigDecimal value) {
            addCriterion("rebate_amount <", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate_amount <=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIn(List<BigDecimal> values) {
            addCriterion("rebate_amount in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("rebate_amount not in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate_amount between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate_amount not between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIsNull() {
            addCriterion("prize_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIsNotNull() {
            addCriterion("prize_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountEqualTo(BigDecimal value) {
            addCriterion("prize_amount =", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotEqualTo(BigDecimal value) {
            addCriterion("prize_amount <>", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountGreaterThan(BigDecimal value) {
            addCriterion("prize_amount >", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prize_amount >=", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLessThan(BigDecimal value) {
            addCriterion("prize_amount <", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prize_amount <=", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIn(List<BigDecimal> values) {
            addCriterion("prize_amount in", values, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotIn(List<BigDecimal> values) {
            addCriterion("prize_amount not in", values, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prize_amount between", value1, value2, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prize_amount not between", value1, value2, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountIsNull() {
            addCriterion("online_amount is null");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountIsNotNull() {
            addCriterion("online_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountEqualTo(BigDecimal value) {
            addCriterion("online_amount =", value, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountNotEqualTo(BigDecimal value) {
            addCriterion("online_amount <>", value, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountGreaterThan(BigDecimal value) {
            addCriterion("online_amount >", value, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("online_amount >=", value, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountLessThan(BigDecimal value) {
            addCriterion("online_amount <", value, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("online_amount <=", value, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountIn(List<BigDecimal> values) {
            addCriterion("online_amount in", values, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountNotIn(List<BigDecimal> values) {
            addCriterion("online_amount not in", values, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_amount between", value1, value2, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_amount not between", value1, value2, "onlineAmount");
            return (Criteria) this;
        }

        public Criteria andManualInIsNull() {
            addCriterion("manual_in is null");
            return (Criteria) this;
        }

        public Criteria andManualInIsNotNull() {
            addCriterion("manual_in is not null");
            return (Criteria) this;
        }

        public Criteria andManualInEqualTo(BigDecimal value) {
            addCriterion("manual_in =", value, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInNotEqualTo(BigDecimal value) {
            addCriterion("manual_in <>", value, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInGreaterThan(BigDecimal value) {
            addCriterion("manual_in >", value, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_in >=", value, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInLessThan(BigDecimal value) {
            addCriterion("manual_in <", value, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_in <=", value, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInIn(List<BigDecimal> values) {
            addCriterion("manual_in in", values, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInNotIn(List<BigDecimal> values) {
            addCriterion("manual_in not in", values, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_in between", value1, value2, "manualIn");
            return (Criteria) this;
        }

        public Criteria andManualInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_in not between", value1, value2, "manualIn");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountIsNull() {
            addCriterion("offline_amount is null");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountIsNotNull() {
            addCriterion("offline_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountEqualTo(BigDecimal value) {
            addCriterion("offline_amount =", value, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountNotEqualTo(BigDecimal value) {
            addCriterion("offline_amount <>", value, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountGreaterThan(BigDecimal value) {
            addCriterion("offline_amount >", value, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offline_amount >=", value, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountLessThan(BigDecimal value) {
            addCriterion("offline_amount <", value, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offline_amount <=", value, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountIn(List<BigDecimal> values) {
            addCriterion("offline_amount in", values, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountNotIn(List<BigDecimal> values) {
            addCriterion("offline_amount not in", values, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offline_amount between", value1, value2, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andOfflineAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offline_amount not between", value1, value2, "offlineAmount");
            return (Criteria) this;
        }

        public Criteria andAgentRebateIsNull() {
            addCriterion("agent_rebate is null");
            return (Criteria) this;
        }

        public Criteria andAgentRebateIsNotNull() {
            addCriterion("agent_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andAgentRebateEqualTo(BigDecimal value) {
            addCriterion("agent_rebate =", value, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateNotEqualTo(BigDecimal value) {
            addCriterion("agent_rebate <>", value, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateGreaterThan(BigDecimal value) {
            addCriterion("agent_rebate >", value, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("agent_rebate >=", value, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateLessThan(BigDecimal value) {
            addCriterion("agent_rebate <", value, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("agent_rebate <=", value, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateIn(List<BigDecimal> values) {
            addCriterion("agent_rebate in", values, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateNotIn(List<BigDecimal> values) {
            addCriterion("agent_rebate not in", values, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agent_rebate between", value1, value2, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andAgentRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agent_rebate not between", value1, value2, "agentRebate");
            return (Criteria) this;
        }

        public Criteria andMemberTakeIsNull() {
            addCriterion("member_take is null");
            return (Criteria) this;
        }

        public Criteria andMemberTakeIsNotNull() {
            addCriterion("member_take is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTakeEqualTo(BigDecimal value) {
            addCriterion("member_take =", value, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeNotEqualTo(BigDecimal value) {
            addCriterion("member_take <>", value, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeGreaterThan(BigDecimal value) {
            addCriterion("member_take >", value, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_take >=", value, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeLessThan(BigDecimal value) {
            addCriterion("member_take <", value, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_take <=", value, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeIn(List<BigDecimal> values) {
            addCriterion("member_take in", values, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeNotIn(List<BigDecimal> values) {
            addCriterion("member_take not in", values, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_take between", value1, value2, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_take not between", value1, value2, "memberTake");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountIsNull() {
            addCriterion("member_take_count is null");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountIsNotNull() {
            addCriterion("member_take_count is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountEqualTo(Integer value) {
            addCriterion("member_take_count =", value, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountNotEqualTo(Integer value) {
            addCriterion("member_take_count <>", value, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountGreaterThan(Integer value) {
            addCriterion("member_take_count >", value, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_take_count >=", value, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountLessThan(Integer value) {
            addCriterion("member_take_count <", value, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountLessThanOrEqualTo(Integer value) {
            addCriterion("member_take_count <=", value, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountIn(List<Integer> values) {
            addCriterion("member_take_count in", values, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountNotIn(List<Integer> values) {
            addCriterion("member_take_count not in", values, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountBetween(Integer value1, Integer value2) {
            addCriterion("member_take_count between", value1, value2, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andMemberTakeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("member_take_count not between", value1, value2, "memberTakeCount");
            return (Criteria) this;
        }

        public Criteria andManualOutIsNull() {
            addCriterion("manual_out is null");
            return (Criteria) this;
        }

        public Criteria andManualOutIsNotNull() {
            addCriterion("manual_out is not null");
            return (Criteria) this;
        }

        public Criteria andManualOutEqualTo(BigDecimal value) {
            addCriterion("manual_out =", value, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutNotEqualTo(BigDecimal value) {
            addCriterion("manual_out <>", value, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutGreaterThan(BigDecimal value) {
            addCriterion("manual_out >", value, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_out >=", value, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutLessThan(BigDecimal value) {
            addCriterion("manual_out <", value, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_out <=", value, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutIn(List<BigDecimal> values) {
            addCriterion("manual_out in", values, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutNotIn(List<BigDecimal> values) {
            addCriterion("manual_out not in", values, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_out between", value1, value2, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_out not between", value1, value2, "manualOut");
            return (Criteria) this;
        }

        public Criteria andManualOutCountIsNull() {
            addCriterion("manual_out_count is null");
            return (Criteria) this;
        }

        public Criteria andManualOutCountIsNotNull() {
            addCriterion("manual_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andManualOutCountEqualTo(Integer value) {
            addCriterion("manual_out_count =", value, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountNotEqualTo(Integer value) {
            addCriterion("manual_out_count <>", value, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountGreaterThan(Integer value) {
            addCriterion("manual_out_count >", value, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("manual_out_count >=", value, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountLessThan(Integer value) {
            addCriterion("manual_out_count <", value, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountLessThanOrEqualTo(Integer value) {
            addCriterion("manual_out_count <=", value, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountIn(List<Integer> values) {
            addCriterion("manual_out_count in", values, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountNotIn(List<Integer> values) {
            addCriterion("manual_out_count not in", values, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountBetween(Integer value1, Integer value2) {
            addCriterion("manual_out_count between", value1, value2, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andManualOutCountNotBetween(Integer value1, Integer value2) {
            addCriterion("manual_out_count not between", value1, value2, "manualOutCount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountIsNull() {
            addCriterion("deposits_norpt_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountIsNotNull() {
            addCriterion("deposits_norpt_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountEqualTo(BigDecimal value) {
            addCriterion("deposits_norpt_amount =", value, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountNotEqualTo(BigDecimal value) {
            addCriterion("deposits_norpt_amount <>", value, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountGreaterThan(BigDecimal value) {
            addCriterion("deposits_norpt_amount >", value, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposits_norpt_amount >=", value, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountLessThan(BigDecimal value) {
            addCriterion("deposits_norpt_amount <", value, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposits_norpt_amount <=", value, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountIn(List<BigDecimal> values) {
            addCriterion("deposits_norpt_amount in", values, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountNotIn(List<BigDecimal> values) {
            addCriterion("deposits_norpt_amount not in", values, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposits_norpt_amount between", value1, value2, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andDepositsNorptAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposits_norpt_amount not between", value1, value2, "depositsNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountIsNull() {
            addCriterion("withdrawal_norpt_amount is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountIsNotNull() {
            addCriterion("withdrawal_norpt_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountEqualTo(BigDecimal value) {
            addCriterion("withdrawal_norpt_amount =", value, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountNotEqualTo(BigDecimal value) {
            addCriterion("withdrawal_norpt_amount <>", value, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountGreaterThan(BigDecimal value) {
            addCriterion("withdrawal_norpt_amount >", value, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawal_norpt_amount >=", value, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountLessThan(BigDecimal value) {
            addCriterion("withdrawal_norpt_amount <", value, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawal_norpt_amount <=", value, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountIn(List<BigDecimal> values) {
            addCriterion("withdrawal_norpt_amount in", values, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountNotIn(List<BigDecimal> values) {
            addCriterion("withdrawal_norpt_amount not in", values, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawal_norpt_amount between", value1, value2, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNorptAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawal_norpt_amount not between", value1, value2, "withdrawalNorptAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferIsNull() {
            addCriterion("register_offer is null");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferIsNotNull() {
            addCriterion("register_offer is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferEqualTo(BigDecimal value) {
            addCriterion("register_offer =", value, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferNotEqualTo(BigDecimal value) {
            addCriterion("register_offer <>", value, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferGreaterThan(BigDecimal value) {
            addCriterion("register_offer >", value, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("register_offer >=", value, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferLessThan(BigDecimal value) {
            addCriterion("register_offer <", value, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferLessThanOrEqualTo(BigDecimal value) {
            addCriterion("register_offer <=", value, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferIn(List<BigDecimal> values) {
            addCriterion("register_offer in", values, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferNotIn(List<BigDecimal> values) {
            addCriterion("register_offer not in", values, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("register_offer between", value1, value2, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andRegisterOfferNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("register_offer not between", value1, value2, "registerOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferIsNull() {
            addCriterion("lottery_offer is null");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferIsNotNull() {
            addCriterion("lottery_offer is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferEqualTo(BigDecimal value) {
            addCriterion("lottery_offer =", value, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferNotEqualTo(BigDecimal value) {
            addCriterion("lottery_offer <>", value, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferGreaterThan(BigDecimal value) {
            addCriterion("lottery_offer >", value, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lottery_offer >=", value, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferLessThan(BigDecimal value) {
            addCriterion("lottery_offer <", value, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lottery_offer <=", value, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferIn(List<BigDecimal> values) {
            addCriterion("lottery_offer in", values, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferNotIn(List<BigDecimal> values) {
            addCriterion("lottery_offer not in", values, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lottery_offer between", value1, value2, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andLotteryOfferNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lottery_offer not between", value1, value2, "lotteryOffer");
            return (Criteria) this;
        }

        public Criteria andChargeRebateIsNull() {
            addCriterion("charge_rebate is null");
            return (Criteria) this;
        }

        public Criteria andChargeRebateIsNotNull() {
            addCriterion("charge_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andChargeRebateEqualTo(BigDecimal value) {
            addCriterion("charge_rebate =", value, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateNotEqualTo(BigDecimal value) {
            addCriterion("charge_rebate <>", value, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateGreaterThan(BigDecimal value) {
            addCriterion("charge_rebate >", value, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charge_rebate >=", value, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateLessThan(BigDecimal value) {
            addCriterion("charge_rebate <", value, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charge_rebate <=", value, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateIn(List<BigDecimal> values) {
            addCriterion("charge_rebate in", values, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateNotIn(List<BigDecimal> values) {
            addCriterion("charge_rebate not in", values, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge_rebate between", value1, value2, "chargeRebate");
            return (Criteria) this;
        }

        public Criteria andChargeRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge_rebate not between", value1, value2, "chargeRebate");
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

        public Criteria andCompanyDepositsNumIsNull() {
            addCriterion("company_deposits_num is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumIsNotNull() {
            addCriterion("company_deposits_num is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumEqualTo(Integer value) {
            addCriterion("company_deposits_num =", value, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumNotEqualTo(Integer value) {
            addCriterion("company_deposits_num <>", value, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumGreaterThan(Integer value) {
            addCriterion("company_deposits_num >", value, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_deposits_num >=", value, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumLessThan(Integer value) {
            addCriterion("company_deposits_num <", value, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumLessThanOrEqualTo(Integer value) {
            addCriterion("company_deposits_num <=", value, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumIn(List<Integer> values) {
            addCriterion("company_deposits_num in", values, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumNotIn(List<Integer> values) {
            addCriterion("company_deposits_num not in", values, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumBetween(Integer value1, Integer value2) {
            addCriterion("company_deposits_num between", value1, value2, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("company_deposits_num not between", value1, value2, "companyDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumIsNull() {
            addCriterion("online_deposits_num is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumIsNotNull() {
            addCriterion("online_deposits_num is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumEqualTo(Integer value) {
            addCriterion("online_deposits_num =", value, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumNotEqualTo(Integer value) {
            addCriterion("online_deposits_num <>", value, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumGreaterThan(Integer value) {
            addCriterion("online_deposits_num >", value, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_deposits_num >=", value, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumLessThan(Integer value) {
            addCriterion("online_deposits_num <", value, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumLessThanOrEqualTo(Integer value) {
            addCriterion("online_deposits_num <=", value, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumIn(List<Integer> values) {
            addCriterion("online_deposits_num in", values, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumNotIn(List<Integer> values) {
            addCriterion("online_deposits_num not in", values, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumBetween(Integer value1, Integer value2) {
            addCriterion("online_deposits_num between", value1, value2, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("online_deposits_num not between", value1, value2, "onlineDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumIsNull() {
            addCriterion("manual_deposits_num is null");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumIsNotNull() {
            addCriterion("manual_deposits_num is not null");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumEqualTo(Integer value) {
            addCriterion("manual_deposits_num =", value, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumNotEqualTo(Integer value) {
            addCriterion("manual_deposits_num <>", value, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumGreaterThan(Integer value) {
            addCriterion("manual_deposits_num >", value, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("manual_deposits_num >=", value, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumLessThan(Integer value) {
            addCriterion("manual_deposits_num <", value, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumLessThanOrEqualTo(Integer value) {
            addCriterion("manual_deposits_num <=", value, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumIn(List<Integer> values) {
            addCriterion("manual_deposits_num in", values, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumNotIn(List<Integer> values) {
            addCriterion("manual_deposits_num not in", values, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumBetween(Integer value1, Integer value2) {
            addCriterion("manual_deposits_num between", value1, value2, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andManualDepositsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("manual_deposits_num not between", value1, value2, "manualDepositsNum");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountIsNull() {
            addCriterion("member_withdrawal_count is null");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountIsNotNull() {
            addCriterion("member_withdrawal_count is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountEqualTo(Integer value) {
            addCriterion("member_withdrawal_count =", value, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountNotEqualTo(Integer value) {
            addCriterion("member_withdrawal_count <>", value, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountGreaterThan(Integer value) {
            addCriterion("member_withdrawal_count >", value, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_withdrawal_count >=", value, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountLessThan(Integer value) {
            addCriterion("member_withdrawal_count <", value, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountLessThanOrEqualTo(Integer value) {
            addCriterion("member_withdrawal_count <=", value, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountIn(List<Integer> values) {
            addCriterion("member_withdrawal_count in", values, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountNotIn(List<Integer> values) {
            addCriterion("member_withdrawal_count not in", values, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountBetween(Integer value1, Integer value2) {
            addCriterion("member_withdrawal_count between", value1, value2, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("member_withdrawal_count not between", value1, value2, "memberWithdrawalCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyIsNull() {
            addCriterion("member_withdrawal_money is null");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyIsNotNull() {
            addCriterion("member_withdrawal_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyEqualTo(BigDecimal value) {
            addCriterion("member_withdrawal_money =", value, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("member_withdrawal_money <>", value, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyGreaterThan(BigDecimal value) {
            addCriterion("member_withdrawal_money >", value, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_withdrawal_money >=", value, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyLessThan(BigDecimal value) {
            addCriterion("member_withdrawal_money <", value, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_withdrawal_money <=", value, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyIn(List<BigDecimal> values) {
            addCriterion("member_withdrawal_money in", values, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("member_withdrawal_money not in", values, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_withdrawal_money between", value1, value2, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_withdrawal_money not between", value1, value2, "memberWithdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andVaildUserIsNull() {
            addCriterion("vaild_user is null");
            return (Criteria) this;
        }

        public Criteria andVaildUserIsNotNull() {
            addCriterion("vaild_user is not null");
            return (Criteria) this;
        }

        public Criteria andVaildUserEqualTo(Integer value) {
            addCriterion("vaild_user =", value, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserNotEqualTo(Integer value) {
            addCriterion("vaild_user <>", value, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserGreaterThan(Integer value) {
            addCriterion("vaild_user >", value, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("vaild_user >=", value, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserLessThan(Integer value) {
            addCriterion("vaild_user <", value, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserLessThanOrEqualTo(Integer value) {
            addCriterion("vaild_user <=", value, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserIn(List<Integer> values) {
            addCriterion("vaild_user in", values, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserNotIn(List<Integer> values) {
            addCriterion("vaild_user not in", values, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserBetween(Integer value1, Integer value2) {
            addCriterion("vaild_user between", value1, value2, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andVaildUserNotBetween(Integer value1, Integer value2) {
            addCriterion("vaild_user not between", value1, value2, "vaildUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserIsNull() {
            addCriterion("backwater_user is null");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserIsNotNull() {
            addCriterion("backwater_user is not null");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserEqualTo(Integer value) {
            addCriterion("backwater_user =", value, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserNotEqualTo(Integer value) {
            addCriterion("backwater_user <>", value, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserGreaterThan(Integer value) {
            addCriterion("backwater_user >", value, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("backwater_user >=", value, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserLessThan(Integer value) {
            addCriterion("backwater_user <", value, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserLessThanOrEqualTo(Integer value) {
            addCriterion("backwater_user <=", value, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserIn(List<Integer> values) {
            addCriterion("backwater_user in", values, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserNotIn(List<Integer> values) {
            addCriterion("backwater_user not in", values, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserBetween(Integer value1, Integer value2) {
            addCriterion("backwater_user between", value1, value2, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andBackwaterUserNotBetween(Integer value1, Integer value2) {
            addCriterion("backwater_user not between", value1, value2, "backwaterUser");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountIsNull() {
            addCriterion("lottery_amount is null");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountIsNotNull() {
            addCriterion("lottery_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountEqualTo(String value) {
            addCriterion("lottery_amount =", value, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountNotEqualTo(String value) {
            addCriterion("lottery_amount <>", value, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountGreaterThan(String value) {
            addCriterion("lottery_amount >", value, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_amount >=", value, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountLessThan(String value) {
            addCriterion("lottery_amount <", value, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountLessThanOrEqualTo(String value) {
            addCriterion("lottery_amount <=", value, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountLike(String value) {
            addCriterion("lottery_amount like", value, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountNotLike(String value) {
            addCriterion("lottery_amount not like", value, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountIn(List<String> values) {
            addCriterion("lottery_amount in", values, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountNotIn(List<String> values) {
            addCriterion("lottery_amount not in", values, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountBetween(String value1, String value2) {
            addCriterion("lottery_amount between", value1, value2, "lotteryAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryAmountNotBetween(String value1, String value2) {
            addCriterion("lottery_amount not between", value1, value2, "lotteryAmount");
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