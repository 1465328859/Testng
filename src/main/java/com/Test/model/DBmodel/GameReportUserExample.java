package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GameReportUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameReportUserExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andTodayBetMoneyIsNull() {
            addCriterion("today_bet_money is null");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyIsNotNull() {
            addCriterion("today_bet_money is not null");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyEqualTo(BigDecimal value) {
            addCriterion("today_bet_money =", value, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyNotEqualTo(BigDecimal value) {
            addCriterion("today_bet_money <>", value, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyGreaterThan(BigDecimal value) {
            addCriterion("today_bet_money >", value, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_bet_money >=", value, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyLessThan(BigDecimal value) {
            addCriterion("today_bet_money <", value, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_bet_money <=", value, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyIn(List<BigDecimal> values) {
            addCriterion("today_bet_money in", values, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyNotIn(List<BigDecimal> values) {
            addCriterion("today_bet_money not in", values, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_bet_money between", value1, value2, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayBetMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_bet_money not between", value1, value2, "todayBetMoney");
            return (Criteria) this;
        }

        public Criteria andTodayProfitIsNull() {
            addCriterion("today_profit is null");
            return (Criteria) this;
        }

        public Criteria andTodayProfitIsNotNull() {
            addCriterion("today_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTodayProfitEqualTo(BigDecimal value) {
            addCriterion("today_profit =", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotEqualTo(BigDecimal value) {
            addCriterion("today_profit <>", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitGreaterThan(BigDecimal value) {
            addCriterion("today_profit >", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_profit >=", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitLessThan(BigDecimal value) {
            addCriterion("today_profit <", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_profit <=", value, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitIn(List<BigDecimal> values) {
            addCriterion("today_profit in", values, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotIn(List<BigDecimal> values) {
            addCriterion("today_profit not in", values, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_profit between", value1, value2, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_profit not between", value1, value2, "todayProfit");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountIsNull() {
            addCriterion("today_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountIsNotNull() {
            addCriterion("today_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountEqualTo(BigDecimal value) {
            addCriterion("today_rebate_amount =", value, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("today_rebate_amount <>", value, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("today_rebate_amount >", value, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_rebate_amount >=", value, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountLessThan(BigDecimal value) {
            addCriterion("today_rebate_amount <", value, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_rebate_amount <=", value, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountIn(List<BigDecimal> values) {
            addCriterion("today_rebate_amount in", values, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("today_rebate_amount not in", values, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_rebate_amount between", value1, value2, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_rebate_amount not between", value1, value2, "todayRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountIsNull() {
            addCriterion("today_top_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountIsNotNull() {
            addCriterion("today_top_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountEqualTo(BigDecimal value) {
            addCriterion("today_top_rebate_amount =", value, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("today_top_rebate_amount <>", value, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("today_top_rebate_amount >", value, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_top_rebate_amount >=", value, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountLessThan(BigDecimal value) {
            addCriterion("today_top_rebate_amount <", value, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_top_rebate_amount <=", value, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountIn(List<BigDecimal> values) {
            addCriterion("today_top_rebate_amount in", values, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("today_top_rebate_amount not in", values, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_top_rebate_amount between", value1, value2, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTopRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_top_rebate_amount not between", value1, value2, "todayTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountIsNull() {
            addCriterion("today_primary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountIsNotNull() {
            addCriterion("today_primary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("today_primary_rebate_amount =", value, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("today_primary_rebate_amount <>", value, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("today_primary_rebate_amount >", value, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_primary_rebate_amount >=", value, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("today_primary_rebate_amount <", value, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_primary_rebate_amount <=", value, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("today_primary_rebate_amount in", values, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("today_primary_rebate_amount not in", values, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_primary_rebate_amount between", value1, value2, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayPrimaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_primary_rebate_amount not between", value1, value2, "todayPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdIsNull() {
            addCriterion("primary_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdIsNotNull() {
            addCriterion("primary_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdEqualTo(Integer value) {
            addCriterion("primary_user_id =", value, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdNotEqualTo(Integer value) {
            addCriterion("primary_user_id <>", value, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdGreaterThan(Integer value) {
            addCriterion("primary_user_id >", value, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_user_id >=", value, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdLessThan(Integer value) {
            addCriterion("primary_user_id <", value, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("primary_user_id <=", value, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdIn(List<Integer> values) {
            addCriterion("primary_user_id in", values, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdNotIn(List<Integer> values) {
            addCriterion("primary_user_id not in", values, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdBetween(Integer value1, Integer value2) {
            addCriterion("primary_user_id between", value1, value2, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andPrimaryUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_user_id not between", value1, value2, "primaryUserId");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountIsNull() {
            addCriterion("today_secondary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountIsNotNull() {
            addCriterion("today_secondary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("today_secondary_rebate_amount =", value, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("today_secondary_rebate_amount <>", value, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("today_secondary_rebate_amount >", value, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_secondary_rebate_amount >=", value, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("today_secondary_rebate_amount <", value, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_secondary_rebate_amount <=", value, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("today_secondary_rebate_amount in", values, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("today_secondary_rebate_amount not in", values, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_secondary_rebate_amount between", value1, value2, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodaySecondaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_secondary_rebate_amount not between", value1, value2, "todaySecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdIsNull() {
            addCriterion("secondary_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdIsNotNull() {
            addCriterion("secondary_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdEqualTo(Integer value) {
            addCriterion("secondary_user_id =", value, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdNotEqualTo(Integer value) {
            addCriterion("secondary_user_id <>", value, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdGreaterThan(Integer value) {
            addCriterion("secondary_user_id >", value, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondary_user_id >=", value, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdLessThan(Integer value) {
            addCriterion("secondary_user_id <", value, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("secondary_user_id <=", value, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdIn(List<Integer> values) {
            addCriterion("secondary_user_id in", values, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdNotIn(List<Integer> values) {
            addCriterion("secondary_user_id not in", values, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdBetween(Integer value1, Integer value2) {
            addCriterion("secondary_user_id between", value1, value2, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andSecondaryUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("secondary_user_id not between", value1, value2, "secondaryUserId");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountIsNull() {
            addCriterion("today_tertiary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountIsNotNull() {
            addCriterion("today_tertiary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("today_tertiary_rebate_amount =", value, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("today_tertiary_rebate_amount <>", value, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("today_tertiary_rebate_amount >", value, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_tertiary_rebate_amount >=", value, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("today_tertiary_rebate_amount <", value, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_tertiary_rebate_amount <=", value, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("today_tertiary_rebate_amount in", values, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("today_tertiary_rebate_amount not in", values, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_tertiary_rebate_amount between", value1, value2, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTodayTertiaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_tertiary_rebate_amount not between", value1, value2, "todayTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdIsNull() {
            addCriterion("tertiary_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdIsNotNull() {
            addCriterion("tertiary_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdEqualTo(Integer value) {
            addCriterion("tertiary_user_id =", value, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdNotEqualTo(Integer value) {
            addCriterion("tertiary_user_id <>", value, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdGreaterThan(Integer value) {
            addCriterion("tertiary_user_id >", value, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tertiary_user_id >=", value, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdLessThan(Integer value) {
            addCriterion("tertiary_user_id <", value, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("tertiary_user_id <=", value, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdIn(List<Integer> values) {
            addCriterion("tertiary_user_id in", values, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdNotIn(List<Integer> values) {
            addCriterion("tertiary_user_id not in", values, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdBetween(Integer value1, Integer value2) {
            addCriterion("tertiary_user_id between", value1, value2, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andTertiaryUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tertiary_user_id not between", value1, value2, "tertiaryUserId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andWinNumIsNull() {
            addCriterion("win_num is null");
            return (Criteria) this;
        }

        public Criteria andWinNumIsNotNull() {
            addCriterion("win_num is not null");
            return (Criteria) this;
        }

        public Criteria andWinNumEqualTo(Integer value) {
            addCriterion("win_num =", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumNotEqualTo(Integer value) {
            addCriterion("win_num <>", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumGreaterThan(Integer value) {
            addCriterion("win_num >", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("win_num >=", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumLessThan(Integer value) {
            addCriterion("win_num <", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumLessThanOrEqualTo(Integer value) {
            addCriterion("win_num <=", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumIn(List<Integer> values) {
            addCriterion("win_num in", values, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumNotIn(List<Integer> values) {
            addCriterion("win_num not in", values, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumBetween(Integer value1, Integer value2) {
            addCriterion("win_num between", value1, value2, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumNotBetween(Integer value1, Integer value2) {
            addCriterion("win_num not between", value1, value2, "winNum");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
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