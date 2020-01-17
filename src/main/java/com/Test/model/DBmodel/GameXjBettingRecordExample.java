package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameXjBettingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameXjBettingRecordExample() {
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

        public Criteria andBetIdIsNull() {
            addCriterion("bet_id is null");
            return (Criteria) this;
        }

        public Criteria andBetIdIsNotNull() {
            addCriterion("bet_id is not null");
            return (Criteria) this;
        }

        public Criteria andBetIdEqualTo(String value) {
            addCriterion("bet_id =", value, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdNotEqualTo(String value) {
            addCriterion("bet_id <>", value, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdGreaterThan(String value) {
            addCriterion("bet_id >", value, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdGreaterThanOrEqualTo(String value) {
            addCriterion("bet_id >=", value, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdLessThan(String value) {
            addCriterion("bet_id <", value, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdLessThanOrEqualTo(String value) {
            addCriterion("bet_id <=", value, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdLike(String value) {
            addCriterion("bet_id like", value, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdNotLike(String value) {
            addCriterion("bet_id not like", value, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdIn(List<String> values) {
            addCriterion("bet_id in", values, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdNotIn(List<String> values) {
            addCriterion("bet_id not in", values, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdBetween(String value1, String value2) {
            addCriterion("bet_id between", value1, value2, "betId");
            return (Criteria) this;
        }

        public Criteria andBetIdNotBetween(String value1, String value2) {
            addCriterion("bet_id not between", value1, value2, "betId");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIsNull() {
            addCriterion("member_code is null");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIsNotNull() {
            addCriterion("member_code is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCodeEqualTo(String value) {
            addCriterion("member_code =", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotEqualTo(String value) {
            addCriterion("member_code <>", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeGreaterThan(String value) {
            addCriterion("member_code >", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("member_code >=", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLessThan(String value) {
            addCriterion("member_code <", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLessThanOrEqualTo(String value) {
            addCriterion("member_code <=", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLike(String value) {
            addCriterion("member_code like", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotLike(String value) {
            addCriterion("member_code not like", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIn(List<String> values) {
            addCriterion("member_code in", values, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotIn(List<String> values) {
            addCriterion("member_code not in", values, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeBetween(String value1, String value2) {
            addCriterion("member_code between", value1, value2, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotBetween(String value1, String value2) {
            addCriterion("member_code not between", value1, value2, "memberCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNull() {
            addCriterion("currency_code is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNotNull() {
            addCriterion("currency_code is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeEqualTo(String value) {
            addCriterion("currency_code =", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotEqualTo(String value) {
            addCriterion("currency_code <>", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThan(String value) {
            addCriterion("currency_code >", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_code >=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThan(String value) {
            addCriterion("currency_code <", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThanOrEqualTo(String value) {
            addCriterion("currency_code <=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLike(String value) {
            addCriterion("currency_code like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotLike(String value) {
            addCriterion("currency_code not like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIn(List<String> values) {
            addCriterion("currency_code in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotIn(List<String> values) {
            addCriterion("currency_code not in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeBetween(String value1, String value2) {
            addCriterion("currency_code between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotBetween(String value1, String value2) {
            addCriterion("currency_code not between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNull() {
            addCriterion("settle_time is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNotNull() {
            addCriterion("settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeEqualTo(String value) {
            addCriterion("settle_time =", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotEqualTo(String value) {
            addCriterion("settle_time <>", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThan(String value) {
            addCriterion("settle_time >", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("settle_time >=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThan(String value) {
            addCriterion("settle_time <", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThanOrEqualTo(String value) {
            addCriterion("settle_time <=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLike(String value) {
            addCriterion("settle_time like", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotLike(String value) {
            addCriterion("settle_time not like", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIn(List<String> values) {
            addCriterion("settle_time in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotIn(List<String> values) {
            addCriterion("settle_time not in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeBetween(String value1, String value2) {
            addCriterion("settle_time between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotBetween(String value1, String value2) {
            addCriterion("settle_time not between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andWagerStatusIsNull() {
            addCriterion("wager_status is null");
            return (Criteria) this;
        }

        public Criteria andWagerStatusIsNotNull() {
            addCriterion("wager_status is not null");
            return (Criteria) this;
        }

        public Criteria andWagerStatusEqualTo(Integer value) {
            addCriterion("wager_status =", value, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusNotEqualTo(Integer value) {
            addCriterion("wager_status <>", value, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusGreaterThan(Integer value) {
            addCriterion("wager_status >", value, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wager_status >=", value, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusLessThan(Integer value) {
            addCriterion("wager_status <", value, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("wager_status <=", value, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusIn(List<Integer> values) {
            addCriterion("wager_status in", values, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusNotIn(List<Integer> values) {
            addCriterion("wager_status not in", values, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusBetween(Integer value1, Integer value2) {
            addCriterion("wager_status between", value1, value2, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andWagerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wager_status not between", value1, value2, "wagerStatus");
            return (Criteria) this;
        }

        public Criteria andStakeIsNull() {
            addCriterion("stake is null");
            return (Criteria) this;
        }

        public Criteria andStakeIsNotNull() {
            addCriterion("stake is not null");
            return (Criteria) this;
        }

        public Criteria andStakeEqualTo(BigDecimal value) {
            addCriterion("stake =", value, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeNotEqualTo(BigDecimal value) {
            addCriterion("stake <>", value, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeGreaterThan(BigDecimal value) {
            addCriterion("stake >", value, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stake >=", value, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeLessThan(BigDecimal value) {
            addCriterion("stake <", value, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stake <=", value, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeIn(List<BigDecimal> values) {
            addCriterion("stake in", values, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeNotIn(List<BigDecimal> values) {
            addCriterion("stake not in", values, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stake between", value1, value2, "stake");
            return (Criteria) this;
        }

        public Criteria andStakeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stake not between", value1, value2, "stake");
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

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andOddsTypeIsNull() {
            addCriterion("odds_type is null");
            return (Criteria) this;
        }

        public Criteria andOddsTypeIsNotNull() {
            addCriterion("odds_type is not null");
            return (Criteria) this;
        }

        public Criteria andOddsTypeEqualTo(Integer value) {
            addCriterion("odds_type =", value, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeNotEqualTo(Integer value) {
            addCriterion("odds_type <>", value, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeGreaterThan(Integer value) {
            addCriterion("odds_type >", value, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("odds_type >=", value, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeLessThan(Integer value) {
            addCriterion("odds_type <", value, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("odds_type <=", value, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeIn(List<Integer> values) {
            addCriterion("odds_type in", values, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeNotIn(List<Integer> values) {
            addCriterion("odds_type not in", values, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeBetween(Integer value1, Integer value2) {
            addCriterion("odds_type between", value1, value2, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("odds_type not between", value1, value2, "oddsType");
            return (Criteria) this;
        }

        public Criteria andOddsIsNull() {
            addCriterion("odds is null");
            return (Criteria) this;
        }

        public Criteria andOddsIsNotNull() {
            addCriterion("odds is not null");
            return (Criteria) this;
        }

        public Criteria andOddsEqualTo(BigDecimal value) {
            addCriterion("odds =", value, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsNotEqualTo(BigDecimal value) {
            addCriterion("odds <>", value, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsGreaterThan(BigDecimal value) {
            addCriterion("odds >", value, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("odds >=", value, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsLessThan(BigDecimal value) {
            addCriterion("odds <", value, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("odds <=", value, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsIn(List<BigDecimal> values) {
            addCriterion("odds in", values, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsNotIn(List<BigDecimal> values) {
            addCriterion("odds not in", values, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("odds between", value1, value2, "odds");
            return (Criteria) this;
        }

        public Criteria andOddsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("odds not between", value1, value2, "odds");
            return (Criteria) this;
        }

        public Criteria andBetsIsNull() {
            addCriterion("bets is null");
            return (Criteria) this;
        }

        public Criteria andBetsIsNotNull() {
            addCriterion("bets is not null");
            return (Criteria) this;
        }

        public Criteria andBetsEqualTo(String value) {
            addCriterion("bets =", value, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsNotEqualTo(String value) {
            addCriterion("bets <>", value, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsGreaterThan(String value) {
            addCriterion("bets >", value, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsGreaterThanOrEqualTo(String value) {
            addCriterion("bets >=", value, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsLessThan(String value) {
            addCriterion("bets <", value, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsLessThanOrEqualTo(String value) {
            addCriterion("bets <=", value, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsLike(String value) {
            addCriterion("bets like", value, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsNotLike(String value) {
            addCriterion("bets not like", value, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsIn(List<String> values) {
            addCriterion("bets in", values, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsNotIn(List<String> values) {
            addCriterion("bets not in", values, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsBetween(String value1, String value2) {
            addCriterion("bets between", value1, value2, "bets");
            return (Criteria) this;
        }

        public Criteria andBetsNotBetween(String value1, String value2) {
            addCriterion("bets not between", value1, value2, "bets");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("prefix is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("prefix is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("prefix =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("prefix <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("prefix >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("prefix >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("prefix <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("prefix <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("prefix like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("prefix not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("prefix in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("prefix not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("prefix between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("prefix not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andBetTypeIsNull() {
            addCriterion("bet_type is null");
            return (Criteria) this;
        }

        public Criteria andBetTypeIsNotNull() {
            addCriterion("bet_type is not null");
            return (Criteria) this;
        }

        public Criteria andBetTypeEqualTo(String value) {
            addCriterion("bet_type =", value, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeNotEqualTo(String value) {
            addCriterion("bet_type <>", value, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeGreaterThan(String value) {
            addCriterion("bet_type >", value, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bet_type >=", value, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeLessThan(String value) {
            addCriterion("bet_type <", value, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeLessThanOrEqualTo(String value) {
            addCriterion("bet_type <=", value, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeLike(String value) {
            addCriterion("bet_type like", value, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeNotLike(String value) {
            addCriterion("bet_type not like", value, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeIn(List<String> values) {
            addCriterion("bet_type in", values, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeNotIn(List<String> values) {
            addCriterion("bet_type not in", values, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeBetween(String value1, String value2) {
            addCriterion("bet_type between", value1, value2, "betType");
            return (Criteria) this;
        }

        public Criteria andBetTypeNotBetween(String value1, String value2) {
            addCriterion("bet_type not between", value1, value2, "betType");
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

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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