package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RptAdminIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RptAdminIndexExample() {
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

        public Criteria andStatisticsDayIsNull() {
            addCriterion("statistics_day is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayIsNotNull() {
            addCriterion("statistics_day is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayEqualTo(Date value) {
            addCriterionForJDBCDate("statistics_day =", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayNotEqualTo(Date value) {
            addCriterionForJDBCDate("statistics_day <>", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayGreaterThan(Date value) {
            addCriterionForJDBCDate("statistics_day >", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("statistics_day >=", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayLessThan(Date value) {
            addCriterionForJDBCDate("statistics_day <", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("statistics_day <=", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayIn(List<Date> values) {
            addCriterionForJDBCDate("statistics_day in", values, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayNotIn(List<Date> values) {
            addCriterionForJDBCDate("statistics_day not in", values, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("statistics_day between", value1, value2, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("statistics_day not between", value1, value2, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIsNull() {
            addCriterion("register_num is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIsNotNull() {
            addCriterion("register_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumEqualTo(Integer value) {
            addCriterion("register_num =", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotEqualTo(Integer value) {
            addCriterion("register_num <>", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumGreaterThan(Integer value) {
            addCriterion("register_num >", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_num >=", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumLessThan(Integer value) {
            addCriterion("register_num <", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumLessThanOrEqualTo(Integer value) {
            addCriterion("register_num <=", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIn(List<Integer> values) {
            addCriterion("register_num in", values, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotIn(List<Integer> values) {
            addCriterion("register_num not in", values, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumBetween(Integer value1, Integer value2) {
            addCriterion("register_num between", value1, value2, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("register_num not between", value1, value2, "registerNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumIsNull() {
            addCriterion("first_recharge_num is null");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumIsNotNull() {
            addCriterion("first_recharge_num is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumEqualTo(Integer value) {
            addCriterion("first_recharge_num =", value, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumNotEqualTo(Integer value) {
            addCriterion("first_recharge_num <>", value, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumGreaterThan(Integer value) {
            addCriterion("first_recharge_num >", value, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_recharge_num >=", value, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumLessThan(Integer value) {
            addCriterion("first_recharge_num <", value, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumLessThanOrEqualTo(Integer value) {
            addCriterion("first_recharge_num <=", value, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumIn(List<Integer> values) {
            addCriterion("first_recharge_num in", values, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumNotIn(List<Integer> values) {
            addCriterion("first_recharge_num not in", values, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumBetween(Integer value1, Integer value2) {
            addCriterion("first_recharge_num between", value1, value2, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("first_recharge_num not between", value1, value2, "firstRechargeNum");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountIsNull() {
            addCriterion("first_recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountIsNotNull() {
            addCriterion("first_recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountEqualTo(BigDecimal value) {
            addCriterion("first_recharge_amount =", value, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("first_recharge_amount <>", value, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountGreaterThan(BigDecimal value) {
            addCriterion("first_recharge_amount >", value, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_recharge_amount >=", value, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountLessThan(BigDecimal value) {
            addCriterion("first_recharge_amount <", value, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_recharge_amount <=", value, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountIn(List<BigDecimal> values) {
            addCriterion("first_recharge_amount in", values, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("first_recharge_amount not in", values, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_recharge_amount between", value1, value2, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_recharge_amount not between", value1, value2, "firstRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andBetNumIsNull() {
            addCriterion("bet_num is null");
            return (Criteria) this;
        }

        public Criteria andBetNumIsNotNull() {
            addCriterion("bet_num is not null");
            return (Criteria) this;
        }

        public Criteria andBetNumEqualTo(Integer value) {
            addCriterion("bet_num =", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumNotEqualTo(Integer value) {
            addCriterion("bet_num <>", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumGreaterThan(Integer value) {
            addCriterion("bet_num >", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bet_num >=", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumLessThan(Integer value) {
            addCriterion("bet_num <", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumLessThanOrEqualTo(Integer value) {
            addCriterion("bet_num <=", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumIn(List<Integer> values) {
            addCriterion("bet_num in", values, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumNotIn(List<Integer> values) {
            addCriterion("bet_num not in", values, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumBetween(Integer value1, Integer value2) {
            addCriterion("bet_num between", value1, value2, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bet_num not between", value1, value2, "betNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumIsNull() {
            addCriterion("new_bet_number_num is null");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumIsNotNull() {
            addCriterion("new_bet_number_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumEqualTo(Integer value) {
            addCriterion("new_bet_number_num =", value, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumNotEqualTo(Integer value) {
            addCriterion("new_bet_number_num <>", value, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumGreaterThan(Integer value) {
            addCriterion("new_bet_number_num >", value, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_bet_number_num >=", value, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumLessThan(Integer value) {
            addCriterion("new_bet_number_num <", value, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumLessThanOrEqualTo(Integer value) {
            addCriterion("new_bet_number_num <=", value, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumIn(List<Integer> values) {
            addCriterion("new_bet_number_num in", values, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumNotIn(List<Integer> values) {
            addCriterion("new_bet_number_num not in", values, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumBetween(Integer value1, Integer value2) {
            addCriterion("new_bet_number_num between", value1, value2, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andNewBetNumberNumNotBetween(Integer value1, Integer value2) {
            addCriterion("new_bet_number_num not between", value1, value2, "newBetNumberNum");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionIsNull() {
            addCriterion("agent_commission is null");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionIsNotNull() {
            addCriterion("agent_commission is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionEqualTo(BigDecimal value) {
            addCriterion("agent_commission =", value, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionNotEqualTo(BigDecimal value) {
            addCriterion("agent_commission <>", value, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionGreaterThan(BigDecimal value) {
            addCriterion("agent_commission >", value, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("agent_commission >=", value, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionLessThan(BigDecimal value) {
            addCriterion("agent_commission <", value, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("agent_commission <=", value, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionIn(List<BigDecimal> values) {
            addCriterion("agent_commission in", values, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionNotIn(List<BigDecimal> values) {
            addCriterion("agent_commission not in", values, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agent_commission between", value1, value2, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andAgentCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agent_commission not between", value1, value2, "agentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionIsNull() {
            addCriterion("top_agent_commission is null");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionIsNotNull() {
            addCriterion("top_agent_commission is not null");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionEqualTo(BigDecimal value) {
            addCriterion("top_agent_commission =", value, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionNotEqualTo(BigDecimal value) {
            addCriterion("top_agent_commission <>", value, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionGreaterThan(BigDecimal value) {
            addCriterion("top_agent_commission >", value, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("top_agent_commission >=", value, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionLessThan(BigDecimal value) {
            addCriterion("top_agent_commission <", value, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("top_agent_commission <=", value, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionIn(List<BigDecimal> values) {
            addCriterion("top_agent_commission in", values, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionNotIn(List<BigDecimal> values) {
            addCriterion("top_agent_commission not in", values, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_agent_commission between", value1, value2, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andTopAgentCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_agent_commission not between", value1, value2, "topAgentCommission");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyIsNull() {
            addCriterion("lottery_total_money is null");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyIsNotNull() {
            addCriterion("lottery_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("lottery_total_money =", value, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("lottery_total_money <>", value, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("lottery_total_money >", value, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lottery_total_money >=", value, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyLessThan(BigDecimal value) {
            addCriterion("lottery_total_money <", value, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lottery_total_money <=", value, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("lottery_total_money in", values, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("lottery_total_money not in", values, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lottery_total_money between", value1, value2, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lottery_total_money not between", value1, value2, "lotteryTotalMoney");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountIsNull() {
            addCriterion("lottery_bet_amount is null");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountIsNotNull() {
            addCriterion("lottery_bet_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountEqualTo(BigDecimal value) {
            addCriterion("lottery_bet_amount =", value, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountNotEqualTo(BigDecimal value) {
            addCriterion("lottery_bet_amount <>", value, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountGreaterThan(BigDecimal value) {
            addCriterion("lottery_bet_amount >", value, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lottery_bet_amount >=", value, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountLessThan(BigDecimal value) {
            addCriterion("lottery_bet_amount <", value, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lottery_bet_amount <=", value, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountIn(List<BigDecimal> values) {
            addCriterion("lottery_bet_amount in", values, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountNotIn(List<BigDecimal> values) {
            addCriterion("lottery_bet_amount not in", values, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lottery_bet_amount between", value1, value2, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryBetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lottery_bet_amount not between", value1, value2, "lotteryBetAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountIsNull() {
            addCriterion("payout_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountIsNotNull() {
            addCriterion("payout_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountEqualTo(BigDecimal value) {
            addCriterion("payout_amount =", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountNotEqualTo(BigDecimal value) {
            addCriterion("payout_amount <>", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountGreaterThan(BigDecimal value) {
            addCriterion("payout_amount >", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payout_amount >=", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountLessThan(BigDecimal value) {
            addCriterion("payout_amount <", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payout_amount <=", value, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountIn(List<BigDecimal> values) {
            addCriterion("payout_amount in", values, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountNotIn(List<BigDecimal> values) {
            addCriterion("payout_amount not in", values, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payout_amount between", value1, value2, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andPayoutAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payout_amount not between", value1, value2, "payoutAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNull() {
            addCriterion("return_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNotNull() {
            addCriterion("return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountEqualTo(BigDecimal value) {
            addCriterion("return_amount =", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotEqualTo(BigDecimal value) {
            addCriterion("return_amount <>", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThan(BigDecimal value) {
            addCriterion("return_amount >", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount >=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThan(BigDecimal value) {
            addCriterion("return_amount <", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount <=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIn(List<BigDecimal> values) {
            addCriterion("return_amount in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotIn(List<BigDecimal> values) {
            addCriterion("return_amount not in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount not between", value1, value2, "returnAmount");
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

        public Criteria andManualOutNumIsNull() {
            addCriterion("manual_out_num is null");
            return (Criteria) this;
        }

        public Criteria andManualOutNumIsNotNull() {
            addCriterion("manual_out_num is not null");
            return (Criteria) this;
        }

        public Criteria andManualOutNumEqualTo(Integer value) {
            addCriterion("manual_out_num =", value, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumNotEqualTo(Integer value) {
            addCriterion("manual_out_num <>", value, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumGreaterThan(Integer value) {
            addCriterion("manual_out_num >", value, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("manual_out_num >=", value, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumLessThan(Integer value) {
            addCriterion("manual_out_num <", value, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumLessThanOrEqualTo(Integer value) {
            addCriterion("manual_out_num <=", value, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumIn(List<Integer> values) {
            addCriterion("manual_out_num in", values, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumNotIn(List<Integer> values) {
            addCriterion("manual_out_num not in", values, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumBetween(Integer value1, Integer value2) {
            addCriterion("manual_out_num between", value1, value2, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andManualOutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("manual_out_num not between", value1, value2, "manualOutNum");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserIsNull() {
            addCriterion("company_deposits_user is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserIsNotNull() {
            addCriterion("company_deposits_user is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserEqualTo(Integer value) {
            addCriterion("company_deposits_user =", value, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserNotEqualTo(Integer value) {
            addCriterion("company_deposits_user <>", value, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserGreaterThan(Integer value) {
            addCriterion("company_deposits_user >", value, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_deposits_user >=", value, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserLessThan(Integer value) {
            addCriterion("company_deposits_user <", value, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserLessThanOrEqualTo(Integer value) {
            addCriterion("company_deposits_user <=", value, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserIn(List<Integer> values) {
            addCriterion("company_deposits_user in", values, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserNotIn(List<Integer> values) {
            addCriterion("company_deposits_user not in", values, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserBetween(Integer value1, Integer value2) {
            addCriterion("company_deposits_user between", value1, value2, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsUserNotBetween(Integer value1, Integer value2) {
            addCriterion("company_deposits_user not between", value1, value2, "companyDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserIsNull() {
            addCriterion("online_deposits_user is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserIsNotNull() {
            addCriterion("online_deposits_user is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserEqualTo(Integer value) {
            addCriterion("online_deposits_user =", value, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserNotEqualTo(Integer value) {
            addCriterion("online_deposits_user <>", value, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserGreaterThan(Integer value) {
            addCriterion("online_deposits_user >", value, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_deposits_user >=", value, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserLessThan(Integer value) {
            addCriterion("online_deposits_user <", value, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserLessThanOrEqualTo(Integer value) {
            addCriterion("online_deposits_user <=", value, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserIn(List<Integer> values) {
            addCriterion("online_deposits_user in", values, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserNotIn(List<Integer> values) {
            addCriterion("online_deposits_user not in", values, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserBetween(Integer value1, Integer value2) {
            addCriterion("online_deposits_user between", value1, value2, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsUserNotBetween(Integer value1, Integer value2) {
            addCriterion("online_deposits_user not between", value1, value2, "onlineDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserIsNull() {
            addCriterion("manual_deposits_user is null");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserIsNotNull() {
            addCriterion("manual_deposits_user is not null");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserEqualTo(Integer value) {
            addCriterion("manual_deposits_user =", value, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserNotEqualTo(Integer value) {
            addCriterion("manual_deposits_user <>", value, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserGreaterThan(Integer value) {
            addCriterion("manual_deposits_user >", value, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("manual_deposits_user >=", value, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserLessThan(Integer value) {
            addCriterion("manual_deposits_user <", value, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserLessThanOrEqualTo(Integer value) {
            addCriterion("manual_deposits_user <=", value, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserIn(List<Integer> values) {
            addCriterion("manual_deposits_user in", values, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserNotIn(List<Integer> values) {
            addCriterion("manual_deposits_user not in", values, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserBetween(Integer value1, Integer value2) {
            addCriterion("manual_deposits_user between", value1, value2, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualDepositsUserNotBetween(Integer value1, Integer value2) {
            addCriterion("manual_deposits_user not between", value1, value2, "manualDepositsUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserIsNull() {
            addCriterion("manual_out_user is null");
            return (Criteria) this;
        }

        public Criteria andManualOutUserIsNotNull() {
            addCriterion("manual_out_user is not null");
            return (Criteria) this;
        }

        public Criteria andManualOutUserEqualTo(Integer value) {
            addCriterion("manual_out_user =", value, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserNotEqualTo(Integer value) {
            addCriterion("manual_out_user <>", value, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserGreaterThan(Integer value) {
            addCriterion("manual_out_user >", value, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("manual_out_user >=", value, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserLessThan(Integer value) {
            addCriterion("manual_out_user <", value, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserLessThanOrEqualTo(Integer value) {
            addCriterion("manual_out_user <=", value, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserIn(List<Integer> values) {
            addCriterion("manual_out_user in", values, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserNotIn(List<Integer> values) {
            addCriterion("manual_out_user not in", values, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserBetween(Integer value1, Integer value2) {
            addCriterion("manual_out_user between", value1, value2, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andManualOutUserNotBetween(Integer value1, Integer value2) {
            addCriterion("manual_out_user not between", value1, value2, "manualOutUser");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountIsNull() {
            addCriterion("company_deposits_amount is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountIsNotNull() {
            addCriterion("company_deposits_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountEqualTo(BigDecimal value) {
            addCriterion("company_deposits_amount =", value, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountNotEqualTo(BigDecimal value) {
            addCriterion("company_deposits_amount <>", value, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountGreaterThan(BigDecimal value) {
            addCriterion("company_deposits_amount >", value, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("company_deposits_amount >=", value, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountLessThan(BigDecimal value) {
            addCriterion("company_deposits_amount <", value, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("company_deposits_amount <=", value, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountIn(List<BigDecimal> values) {
            addCriterion("company_deposits_amount in", values, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountNotIn(List<BigDecimal> values) {
            addCriterion("company_deposits_amount not in", values, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("company_deposits_amount between", value1, value2, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andCompanyDepositsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("company_deposits_amount not between", value1, value2, "companyDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountIsNull() {
            addCriterion("online_deposits_amount is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountIsNotNull() {
            addCriterion("online_deposits_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountEqualTo(BigDecimal value) {
            addCriterion("online_deposits_amount =", value, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountNotEqualTo(BigDecimal value) {
            addCriterion("online_deposits_amount <>", value, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountGreaterThan(BigDecimal value) {
            addCriterion("online_deposits_amount >", value, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("online_deposits_amount >=", value, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountLessThan(BigDecimal value) {
            addCriterion("online_deposits_amount <", value, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("online_deposits_amount <=", value, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountIn(List<BigDecimal> values) {
            addCriterion("online_deposits_amount in", values, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountNotIn(List<BigDecimal> values) {
            addCriterion("online_deposits_amount not in", values, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_deposits_amount between", value1, value2, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andOnlineDepositsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("online_deposits_amount not between", value1, value2, "onlineDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountIsNull() {
            addCriterion("manual_deposits_amount is null");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountIsNotNull() {
            addCriterion("manual_deposits_amount is not null");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountEqualTo(BigDecimal value) {
            addCriterion("manual_deposits_amount =", value, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountNotEqualTo(BigDecimal value) {
            addCriterion("manual_deposits_amount <>", value, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountGreaterThan(BigDecimal value) {
            addCriterion("manual_deposits_amount >", value, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_deposits_amount >=", value, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountLessThan(BigDecimal value) {
            addCriterion("manual_deposits_amount <", value, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_deposits_amount <=", value, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountIn(List<BigDecimal> values) {
            addCriterion("manual_deposits_amount in", values, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountNotIn(List<BigDecimal> values) {
            addCriterion("manual_deposits_amount not in", values, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_deposits_amount between", value1, value2, "manualDepositsAmount");
            return (Criteria) this;
        }

        public Criteria andManualDepositsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_deposits_amount not between", value1, value2, "manualDepositsAmount");
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

        public Criteria andBackstagePaymentCountIsNull() {
            addCriterion("backstage_payment_count is null");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountIsNotNull() {
            addCriterion("backstage_payment_count is not null");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountEqualTo(Integer value) {
            addCriterion("backstage_payment_count =", value, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountNotEqualTo(Integer value) {
            addCriterion("backstage_payment_count <>", value, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountGreaterThan(Integer value) {
            addCriterion("backstage_payment_count >", value, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("backstage_payment_count >=", value, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountLessThan(Integer value) {
            addCriterion("backstage_payment_count <", value, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountLessThanOrEqualTo(Integer value) {
            addCriterion("backstage_payment_count <=", value, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountIn(List<Integer> values) {
            addCriterion("backstage_payment_count in", values, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountNotIn(List<Integer> values) {
            addCriterion("backstage_payment_count not in", values, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountBetween(Integer value1, Integer value2) {
            addCriterion("backstage_payment_count between", value1, value2, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("backstage_payment_count not between", value1, value2, "backstagePaymentCount");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserIsNull() {
            addCriterion("member_withdrawal_user is null");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserIsNotNull() {
            addCriterion("member_withdrawal_user is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserEqualTo(Integer value) {
            addCriterion("member_withdrawal_user =", value, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserNotEqualTo(Integer value) {
            addCriterion("member_withdrawal_user <>", value, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserGreaterThan(Integer value) {
            addCriterion("member_withdrawal_user >", value, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_withdrawal_user >=", value, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserLessThan(Integer value) {
            addCriterion("member_withdrawal_user <", value, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserLessThanOrEqualTo(Integer value) {
            addCriterion("member_withdrawal_user <=", value, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserIn(List<Integer> values) {
            addCriterion("member_withdrawal_user in", values, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserNotIn(List<Integer> values) {
            addCriterion("member_withdrawal_user not in", values, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserBetween(Integer value1, Integer value2) {
            addCriterion("member_withdrawal_user between", value1, value2, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andMemberWithdrawalUserNotBetween(Integer value1, Integer value2) {
            addCriterion("member_withdrawal_user not between", value1, value2, "memberWithdrawalUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserIsNull() {
            addCriterion("backstage_payment_user is null");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserIsNotNull() {
            addCriterion("backstage_payment_user is not null");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserEqualTo(Integer value) {
            addCriterion("backstage_payment_user =", value, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserNotEqualTo(Integer value) {
            addCriterion("backstage_payment_user <>", value, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserGreaterThan(Integer value) {
            addCriterion("backstage_payment_user >", value, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("backstage_payment_user >=", value, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserLessThan(Integer value) {
            addCriterion("backstage_payment_user <", value, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserLessThanOrEqualTo(Integer value) {
            addCriterion("backstage_payment_user <=", value, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserIn(List<Integer> values) {
            addCriterion("backstage_payment_user in", values, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserNotIn(List<Integer> values) {
            addCriterion("backstage_payment_user not in", values, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserBetween(Integer value1, Integer value2) {
            addCriterion("backstage_payment_user between", value1, value2, "backstagePaymentUser");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentUserNotBetween(Integer value1, Integer value2) {
            addCriterion("backstage_payment_user not between", value1, value2, "backstagePaymentUser");
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

        public Criteria andBackstagePaymentMoneyIsNull() {
            addCriterion("backstage_payment_money is null");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyIsNotNull() {
            addCriterion("backstage_payment_money is not null");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyEqualTo(BigDecimal value) {
            addCriterion("backstage_payment_money =", value, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyNotEqualTo(BigDecimal value) {
            addCriterion("backstage_payment_money <>", value, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyGreaterThan(BigDecimal value) {
            addCriterion("backstage_payment_money >", value, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("backstage_payment_money >=", value, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyLessThan(BigDecimal value) {
            addCriterion("backstage_payment_money <", value, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("backstage_payment_money <=", value, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyIn(List<BigDecimal> values) {
            addCriterion("backstage_payment_money in", values, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyNotIn(List<BigDecimal> values) {
            addCriterion("backstage_payment_money not in", values, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backstage_payment_money between", value1, value2, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andBackstagePaymentMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backstage_payment_money not between", value1, value2, "backstagePaymentMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyIsNull() {
            addCriterion("manual_out_money is null");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyIsNotNull() {
            addCriterion("manual_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyEqualTo(BigDecimal value) {
            addCriterion("manual_out_money =", value, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyNotEqualTo(BigDecimal value) {
            addCriterion("manual_out_money <>", value, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyGreaterThan(BigDecimal value) {
            addCriterion("manual_out_money >", value, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_out_money >=", value, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyLessThan(BigDecimal value) {
            addCriterion("manual_out_money <", value, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_out_money <=", value, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyIn(List<BigDecimal> values) {
            addCriterion("manual_out_money in", values, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyNotIn(List<BigDecimal> values) {
            addCriterion("manual_out_money not in", values, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_out_money between", value1, value2, "manualOutMoney");
            return (Criteria) this;
        }

        public Criteria andManualOutMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_out_money not between", value1, value2, "manualOutMoney");
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