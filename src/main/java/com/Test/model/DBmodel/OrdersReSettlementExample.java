package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdersReSettlementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersReSettlementExample() {
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

        public Criteria andBeforeCodeIsNull() {
            addCriterion("before_code is null");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeIsNotNull() {
            addCriterion("before_code is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeEqualTo(String value) {
            addCriterion("before_code =", value, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeNotEqualTo(String value) {
            addCriterion("before_code <>", value, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeGreaterThan(String value) {
            addCriterion("before_code >", value, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("before_code >=", value, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeLessThan(String value) {
            addCriterion("before_code <", value, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeLessThanOrEqualTo(String value) {
            addCriterion("before_code <=", value, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeLike(String value) {
            addCriterion("before_code like", value, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeNotLike(String value) {
            addCriterion("before_code not like", value, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeIn(List<String> values) {
            addCriterion("before_code in", values, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeNotIn(List<String> values) {
            addCriterion("before_code not in", values, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeBetween(String value1, String value2) {
            addCriterion("before_code between", value1, value2, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andBeforeCodeNotBetween(String value1, String value2) {
            addCriterion("before_code not between", value1, value2, "beforeCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeIsNull() {
            addCriterion("after_code is null");
            return (Criteria) this;
        }

        public Criteria andAfterCodeIsNotNull() {
            addCriterion("after_code is not null");
            return (Criteria) this;
        }

        public Criteria andAfterCodeEqualTo(String value) {
            addCriterion("after_code =", value, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeNotEqualTo(String value) {
            addCriterion("after_code <>", value, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeGreaterThan(String value) {
            addCriterion("after_code >", value, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("after_code >=", value, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeLessThan(String value) {
            addCriterion("after_code <", value, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeLessThanOrEqualTo(String value) {
            addCriterion("after_code <=", value, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeLike(String value) {
            addCriterion("after_code like", value, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeNotLike(String value) {
            addCriterion("after_code not like", value, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeIn(List<String> values) {
            addCriterion("after_code in", values, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeNotIn(List<String> values) {
            addCriterion("after_code not in", values, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeBetween(String value1, String value2) {
            addCriterion("after_code between", value1, value2, "afterCode");
            return (Criteria) this;
        }

        public Criteria andAfterCodeNotBetween(String value1, String value2) {
            addCriterion("after_code not between", value1, value2, "afterCode");
            return (Criteria) this;
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

        public Criteria andUserBeforeBalanceIsNull() {
            addCriterion("user_before_balance is null");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceIsNotNull() {
            addCriterion("user_before_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceEqualTo(BigDecimal value) {
            addCriterion("user_before_balance =", value, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceNotEqualTo(BigDecimal value) {
            addCriterion("user_before_balance <>", value, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceGreaterThan(BigDecimal value) {
            addCriterion("user_before_balance >", value, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_before_balance >=", value, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceLessThan(BigDecimal value) {
            addCriterion("user_before_balance <", value, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_before_balance <=", value, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceIn(List<BigDecimal> values) {
            addCriterion("user_before_balance in", values, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceNotIn(List<BigDecimal> values) {
            addCriterion("user_before_balance not in", values, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_before_balance between", value1, value2, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andUserBeforeBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_before_balance not between", value1, value2, "userBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andLossIsNull() {
            addCriterion("loss is null");
            return (Criteria) this;
        }

        public Criteria andLossIsNotNull() {
            addCriterion("loss is not null");
            return (Criteria) this;
        }

        public Criteria andLossEqualTo(BigDecimal value) {
            addCriterion("loss =", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotEqualTo(BigDecimal value) {
            addCriterion("loss <>", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThan(BigDecimal value) {
            addCriterion("loss >", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loss >=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThan(BigDecimal value) {
            addCriterion("loss <", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loss <=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossIn(List<BigDecimal> values) {
            addCriterion("loss in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotIn(List<BigDecimal> values) {
            addCriterion("loss not in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loss between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loss not between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceIsNull() {
            addCriterion("user_after_balance is null");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceIsNotNull() {
            addCriterion("user_after_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceEqualTo(BigDecimal value) {
            addCriterion("user_after_balance =", value, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceNotEqualTo(BigDecimal value) {
            addCriterion("user_after_balance <>", value, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceGreaterThan(BigDecimal value) {
            addCriterion("user_after_balance >", value, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_after_balance >=", value, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceLessThan(BigDecimal value) {
            addCriterion("user_after_balance <", value, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_after_balance <=", value, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceIn(List<BigDecimal> values) {
            addCriterion("user_after_balance in", values, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceNotIn(List<BigDecimal> values) {
            addCriterion("user_after_balance not in", values, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_after_balance between", value1, value2, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andUserAfterBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_after_balance not between", value1, value2, "userAfterBalance");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeIsNull() {
            addCriterion("order_before_prize is null");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeIsNotNull() {
            addCriterion("order_before_prize is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeEqualTo(BigDecimal value) {
            addCriterion("order_before_prize =", value, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeNotEqualTo(BigDecimal value) {
            addCriterion("order_before_prize <>", value, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeGreaterThan(BigDecimal value) {
            addCriterion("order_before_prize >", value, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_before_prize >=", value, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeLessThan(BigDecimal value) {
            addCriterion("order_before_prize <", value, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_before_prize <=", value, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeIn(List<BigDecimal> values) {
            addCriterion("order_before_prize in", values, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeNotIn(List<BigDecimal> values) {
            addCriterion("order_before_prize not in", values, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_before_prize between", value1, value2, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderBeforePrizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_before_prize not between", value1, value2, "orderBeforePrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeIsNull() {
            addCriterion("order_after_prize is null");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeIsNotNull() {
            addCriterion("order_after_prize is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeEqualTo(BigDecimal value) {
            addCriterion("order_after_prize =", value, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeNotEqualTo(BigDecimal value) {
            addCriterion("order_after_prize <>", value, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeGreaterThan(BigDecimal value) {
            addCriterion("order_after_prize >", value, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_after_prize >=", value, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeLessThan(BigDecimal value) {
            addCriterion("order_after_prize <", value, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_after_prize <=", value, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeIn(List<BigDecimal> values) {
            addCriterion("order_after_prize in", values, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeNotIn(List<BigDecimal> values) {
            addCriterion("order_after_prize not in", values, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_after_prize between", value1, value2, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andOrderAfterPrizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_after_prize not between", value1, value2, "orderAfterPrize");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
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