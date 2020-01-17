package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdIsNull() {
            addCriterion("safe_pwd is null");
            return (Criteria) this;
        }

        public Criteria andSafePwdIsNotNull() {
            addCriterion("safe_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andSafePwdEqualTo(String value) {
            addCriterion("safe_pwd =", value, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdNotEqualTo(String value) {
            addCriterion("safe_pwd <>", value, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdGreaterThan(String value) {
            addCriterion("safe_pwd >", value, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdGreaterThanOrEqualTo(String value) {
            addCriterion("safe_pwd >=", value, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdLessThan(String value) {
            addCriterion("safe_pwd <", value, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdLessThanOrEqualTo(String value) {
            addCriterion("safe_pwd <=", value, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdLike(String value) {
            addCriterion("safe_pwd like", value, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdNotLike(String value) {
            addCriterion("safe_pwd not like", value, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdIn(List<String> values) {
            addCriterion("safe_pwd in", values, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdNotIn(List<String> values) {
            addCriterion("safe_pwd not in", values, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdBetween(String value1, String value2) {
            addCriterion("safe_pwd between", value1, value2, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSafePwdNotBetween(String value1, String value2) {
            addCriterion("safe_pwd not between", value1, value2, "safePwd");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
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

        public Criteria andTotalBetMoneyIsNull() {
            addCriterion("total_bet_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyIsNotNull() {
            addCriterion("total_bet_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyEqualTo(BigDecimal value) {
            addCriterion("total_bet_money =", value, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_bet_money <>", value, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_bet_money >", value, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_bet_money >=", value, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyLessThan(BigDecimal value) {
            addCriterion("total_bet_money <", value, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_bet_money <=", value, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyIn(List<BigDecimal> values) {
            addCriterion("total_bet_money in", values, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_bet_money not in", values, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_bet_money between", value1, value2, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalBetMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_bet_money not between", value1, value2, "totalBetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyIsNull() {
            addCriterion("total_deposit_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyIsNotNull() {
            addCriterion("total_deposit_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyEqualTo(BigDecimal value) {
            addCriterion("total_deposit_money =", value, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_deposit_money <>", value, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_deposit_money >", value, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_deposit_money >=", value, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyLessThan(BigDecimal value) {
            addCriterion("total_deposit_money <", value, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_deposit_money <=", value, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyIn(List<BigDecimal> values) {
            addCriterion("total_deposit_money in", values, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_deposit_money not in", values, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_deposit_money between", value1, value2, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalDepositMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_deposit_money not between", value1, value2, "totalDepositMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyIsNull() {
            addCriterion("total_withdraw_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyIsNotNull() {
            addCriterion("total_withdraw_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyEqualTo(BigDecimal value) {
            addCriterion("total_withdraw_money =", value, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_withdraw_money <>", value, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_withdraw_money >", value, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_withdraw_money >=", value, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyLessThan(BigDecimal value) {
            addCriterion("total_withdraw_money <", value, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_withdraw_money <=", value, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyIn(List<BigDecimal> values) {
            addCriterion("total_withdraw_money in", values, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_withdraw_money not in", values, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_withdraw_money between", value1, value2, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andTotalWithdrawMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_withdraw_money not between", value1, value2, "totalWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyIsNull() {
            addCriterion("bet_money is null");
            return (Criteria) this;
        }

        public Criteria andBetMoneyIsNotNull() {
            addCriterion("bet_money is not null");
            return (Criteria) this;
        }

        public Criteria andBetMoneyEqualTo(BigDecimal value) {
            addCriterion("bet_money =", value, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyNotEqualTo(BigDecimal value) {
            addCriterion("bet_money <>", value, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyGreaterThan(BigDecimal value) {
            addCriterion("bet_money >", value, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bet_money >=", value, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyLessThan(BigDecimal value) {
            addCriterion("bet_money <", value, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bet_money <=", value, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyIn(List<BigDecimal> values) {
            addCriterion("bet_money in", values, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyNotIn(List<BigDecimal> values) {
            addCriterion("bet_money not in", values, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet_money between", value1, value2, "betMoney");
            return (Criteria) this;
        }

        public Criteria andBetMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet_money not between", value1, value2, "betMoney");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andLastGameIsNull() {
            addCriterion("last_game is null");
            return (Criteria) this;
        }

        public Criteria andLastGameIsNotNull() {
            addCriterion("last_game is not null");
            return (Criteria) this;
        }

        public Criteria andLastGameEqualTo(Byte value) {
            addCriterion("last_game =", value, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameNotEqualTo(Byte value) {
            addCriterion("last_game <>", value, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameGreaterThan(Byte value) {
            addCriterion("last_game >", value, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameGreaterThanOrEqualTo(Byte value) {
            addCriterion("last_game >=", value, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameLessThan(Byte value) {
            addCriterion("last_game <", value, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameLessThanOrEqualTo(Byte value) {
            addCriterion("last_game <=", value, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameIn(List<Byte> values) {
            addCriterion("last_game in", values, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameNotIn(List<Byte> values) {
            addCriterion("last_game not in", values, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameBetween(Byte value1, Byte value2) {
            addCriterion("last_game between", value1, value2, "lastGame");
            return (Criteria) this;
        }

        public Criteria andLastGameNotBetween(Byte value1, Byte value2) {
            addCriterion("last_game not between", value1, value2, "lastGame");
            return (Criteria) this;
        }

        public Criteria andGameAmountIsNull() {
            addCriterion("game_amount is null");
            return (Criteria) this;
        }

        public Criteria andGameAmountIsNotNull() {
            addCriterion("game_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGameAmountEqualTo(BigDecimal value) {
            addCriterion("game_amount =", value, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountNotEqualTo(BigDecimal value) {
            addCriterion("game_amount <>", value, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountGreaterThan(BigDecimal value) {
            addCriterion("game_amount >", value, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("game_amount >=", value, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountLessThan(BigDecimal value) {
            addCriterion("game_amount <", value, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("game_amount <=", value, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountIn(List<BigDecimal> values) {
            addCriterion("game_amount in", values, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountNotIn(List<BigDecimal> values) {
            addCriterion("game_amount not in", values, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("game_amount between", value1, value2, "gameAmount");
            return (Criteria) this;
        }

        public Criteria andGameAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("game_amount not between", value1, value2, "gameAmount");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRegFromIsNull() {
            addCriterion("reg_from is null");
            return (Criteria) this;
        }

        public Criteria andRegFromIsNotNull() {
            addCriterion("reg_from is not null");
            return (Criteria) this;
        }

        public Criteria andRegFromEqualTo(Byte value) {
            addCriterion("reg_from =", value, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromNotEqualTo(Byte value) {
            addCriterion("reg_from <>", value, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromGreaterThan(Byte value) {
            addCriterion("reg_from >", value, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromGreaterThanOrEqualTo(Byte value) {
            addCriterion("reg_from >=", value, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromLessThan(Byte value) {
            addCriterion("reg_from <", value, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromLessThanOrEqualTo(Byte value) {
            addCriterion("reg_from <=", value, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromIn(List<Byte> values) {
            addCriterion("reg_from in", values, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromNotIn(List<Byte> values) {
            addCriterion("reg_from not in", values, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromBetween(Byte value1, Byte value2) {
            addCriterion("reg_from between", value1, value2, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegFromNotBetween(Byte value1, Byte value2) {
            addCriterion("reg_from not between", value1, value2, "regFrom");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("reg_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("reg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(String value) {
            addCriterion("reg_ip =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(String value) {
            addCriterion("reg_ip <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(String value) {
            addCriterion("reg_ip >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(String value) {
            addCriterion("reg_ip >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(String value) {
            addCriterion("reg_ip <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(String value) {
            addCriterion("reg_ip <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLike(String value) {
            addCriterion("reg_ip like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotLike(String value) {
            addCriterion("reg_ip not like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<String> values) {
            addCriterion("reg_ip in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<String> values) {
            addCriterion("reg_ip not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(String value1, String value2) {
            addCriterion("reg_ip between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(String value1, String value2) {
            addCriterion("reg_ip not between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {
            addCriterion("last_login is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("last_login is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Integer value) {
            addCriterion("last_login =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Integer value) {
            addCriterion("last_login <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Integer value) {
            addCriterion("last_login >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Integer value) {
            addCriterion("last_login <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Integer value) {
            addCriterion("last_login <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Integer> values) {
            addCriterion("last_login in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Integer> values) {
            addCriterion("last_login not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Integer value1, Integer value2) {
            addCriterion("last_login between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("last_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("last_ip =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("last_ip <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("last_ip >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_ip >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("last_ip <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("last_ip <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("last_ip like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("last_ip not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("last_ip in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("last_ip not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("last_ip between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("last_ip not between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count not between", value1, value2, "loginCount");
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

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Integer value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Integer value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Integer value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Integer value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Integer> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Integer> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Integer value1, Integer value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
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