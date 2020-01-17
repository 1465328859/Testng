package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameAgBettingAginVideoRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameAgBettingAginVideoRecordExample() {
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

        public Criteria andBillnoIsNull() {
            addCriterion("billno is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("billno is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("billno =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("billno <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("billno >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("billno >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("billno <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("billno <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("billno like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("billno not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("billno in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("billno not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("billno between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("billno not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andPlaynameIsNull() {
            addCriterion("playname is null");
            return (Criteria) this;
        }

        public Criteria andPlaynameIsNotNull() {
            addCriterion("playname is not null");
            return (Criteria) this;
        }

        public Criteria andPlaynameEqualTo(String value) {
            addCriterion("playname =", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameNotEqualTo(String value) {
            addCriterion("playname <>", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameGreaterThan(String value) {
            addCriterion("playname >", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameGreaterThanOrEqualTo(String value) {
            addCriterion("playname >=", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameLessThan(String value) {
            addCriterion("playname <", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameLessThanOrEqualTo(String value) {
            addCriterion("playname <=", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameLike(String value) {
            addCriterion("playname like", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameNotLike(String value) {
            addCriterion("playname not like", value, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameIn(List<String> values) {
            addCriterion("playname in", values, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameNotIn(List<String> values) {
            addCriterion("playname not in", values, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameBetween(String value1, String value2) {
            addCriterion("playname between", value1, value2, "playname");
            return (Criteria) this;
        }

        public Criteria andPlaynameNotBetween(String value1, String value2) {
            addCriterion("playname not between", value1, value2, "playname");
            return (Criteria) this;
        }

        public Criteria andGameCodeIsNull() {
            addCriterion("game_code is null");
            return (Criteria) this;
        }

        public Criteria andGameCodeIsNotNull() {
            addCriterion("game_code is not null");
            return (Criteria) this;
        }

        public Criteria andGameCodeEqualTo(String value) {
            addCriterion("game_code =", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotEqualTo(String value) {
            addCriterion("game_code <>", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeGreaterThan(String value) {
            addCriterion("game_code >", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("game_code >=", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeLessThan(String value) {
            addCriterion("game_code <", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeLessThanOrEqualTo(String value) {
            addCriterion("game_code <=", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeLike(String value) {
            addCriterion("game_code like", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotLike(String value) {
            addCriterion("game_code not like", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeIn(List<String> values) {
            addCriterion("game_code in", values, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotIn(List<String> values) {
            addCriterion("game_code not in", values, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeBetween(String value1, String value2) {
            addCriterion("game_code between", value1, value2, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotBetween(String value1, String value2) {
            addCriterion("game_code not between", value1, value2, "gameCode");
            return (Criteria) this;
        }

        public Criteria andNetAmountIsNull() {
            addCriterion("net_amount is null");
            return (Criteria) this;
        }

        public Criteria andNetAmountIsNotNull() {
            addCriterion("net_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNetAmountEqualTo(BigDecimal value) {
            addCriterion("net_amount =", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountNotEqualTo(BigDecimal value) {
            addCriterion("net_amount <>", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountGreaterThan(BigDecimal value) {
            addCriterion("net_amount >", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_amount >=", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountLessThan(BigDecimal value) {
            addCriterion("net_amount <", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_amount <=", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountIn(List<BigDecimal> values) {
            addCriterion("net_amount in", values, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountNotIn(List<BigDecimal> values) {
            addCriterion("net_amount not in", values, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_amount between", value1, value2, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_amount not between", value1, value2, "netAmount");
            return (Criteria) this;
        }

        public Criteria andBetTimeIsNull() {
            addCriterion("bet_time is null");
            return (Criteria) this;
        }

        public Criteria andBetTimeIsNotNull() {
            addCriterion("bet_time is not null");
            return (Criteria) this;
        }

        public Criteria andBetTimeEqualTo(Date value) {
            addCriterion("bet_time =", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeNotEqualTo(Date value) {
            addCriterion("bet_time <>", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeGreaterThan(Date value) {
            addCriterion("bet_time >", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bet_time >=", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeLessThan(Date value) {
            addCriterion("bet_time <", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeLessThanOrEqualTo(Date value) {
            addCriterion("bet_time <=", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeIn(List<Date> values) {
            addCriterion("bet_time in", values, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeNotIn(List<Date> values) {
            addCriterion("bet_time not in", values, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeBetween(Date value1, Date value2) {
            addCriterion("bet_time between", value1, value2, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeNotBetween(Date value1, Date value2) {
            addCriterion("bet_time not between", value1, value2, "betTime");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNull() {
            addCriterion("game_type is null");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNotNull() {
            addCriterion("game_type is not null");
            return (Criteria) this;
        }

        public Criteria andGameTypeEqualTo(String value) {
            addCriterion("game_type =", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotEqualTo(String value) {
            addCriterion("game_type <>", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThan(String value) {
            addCriterion("game_type >", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("game_type >=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThan(String value) {
            addCriterion("game_type <", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThanOrEqualTo(String value) {
            addCriterion("game_type <=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLike(String value) {
            addCriterion("game_type like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotLike(String value) {
            addCriterion("game_type not like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeIn(List<String> values) {
            addCriterion("game_type in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotIn(List<String> values) {
            addCriterion("game_type not in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeBetween(String value1, String value2) {
            addCriterion("game_type between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotBetween(String value1, String value2) {
            addCriterion("game_type not between", value1, value2, "gameType");
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

        public Criteria andValidBetAmountIsNull() {
            addCriterion("valid_bet_amount is null");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountIsNotNull() {
            addCriterion("valid_bet_amount is not null");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountEqualTo(BigDecimal value) {
            addCriterion("valid_bet_amount =", value, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountNotEqualTo(BigDecimal value) {
            addCriterion("valid_bet_amount <>", value, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountGreaterThan(BigDecimal value) {
            addCriterion("valid_bet_amount >", value, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valid_bet_amount >=", value, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountLessThan(BigDecimal value) {
            addCriterion("valid_bet_amount <", value, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valid_bet_amount <=", value, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountIn(List<BigDecimal> values) {
            addCriterion("valid_bet_amount in", values, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountNotIn(List<BigDecimal> values) {
            addCriterion("valid_bet_amount not in", values, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valid_bet_amount between", value1, value2, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andValidBetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valid_bet_amount not between", value1, value2, "validBetAmount");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Byte value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Byte value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Byte value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Byte value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Byte value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Byte> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Byte> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Byte value1, Byte value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNull() {
            addCriterion("play_type is null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNotNull() {
            addCriterion("play_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeEqualTo(String value) {
            addCriterion("play_type =", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotEqualTo(String value) {
            addCriterion("play_type <>", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThan(String value) {
            addCriterion("play_type >", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("play_type >=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThan(String value) {
            addCriterion("play_type <", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThanOrEqualTo(String value) {
            addCriterion("play_type <=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLike(String value) {
            addCriterion("play_type like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotLike(String value) {
            addCriterion("play_type not like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIn(List<String> values) {
            addCriterion("play_type in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotIn(List<String> values) {
            addCriterion("play_type not in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeBetween(String value1, String value2) {
            addCriterion("play_type between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotBetween(String value1, String value2) {
            addCriterion("play_type not between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andTablecodeIsNull() {
            addCriterion("tablecode is null");
            return (Criteria) this;
        }

        public Criteria andTablecodeIsNotNull() {
            addCriterion("tablecode is not null");
            return (Criteria) this;
        }

        public Criteria andTablecodeEqualTo(String value) {
            addCriterion("tablecode =", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeNotEqualTo(String value) {
            addCriterion("tablecode <>", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeGreaterThan(String value) {
            addCriterion("tablecode >", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeGreaterThanOrEqualTo(String value) {
            addCriterion("tablecode >=", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeLessThan(String value) {
            addCriterion("tablecode <", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeLessThanOrEqualTo(String value) {
            addCriterion("tablecode <=", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeLike(String value) {
            addCriterion("tablecode like", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeNotLike(String value) {
            addCriterion("tablecode not like", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeIn(List<String> values) {
            addCriterion("tablecode in", values, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeNotIn(List<String> values) {
            addCriterion("tablecode not in", values, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeBetween(String value1, String value2) {
            addCriterion("tablecode between", value1, value2, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeNotBetween(String value1, String value2) {
            addCriterion("tablecode not between", value1, value2, "tablecode");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeIsNull() {
            addCriterion("recalcu_time is null");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeIsNotNull() {
            addCriterion("recalcu_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeEqualTo(Date value) {
            addCriterion("recalcu_time =", value, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeNotEqualTo(Date value) {
            addCriterion("recalcu_time <>", value, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeGreaterThan(Date value) {
            addCriterion("recalcu_time >", value, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recalcu_time >=", value, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeLessThan(Date value) {
            addCriterion("recalcu_time <", value, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeLessThanOrEqualTo(Date value) {
            addCriterion("recalcu_time <=", value, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeIn(List<Date> values) {
            addCriterion("recalcu_time in", values, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeNotIn(List<Date> values) {
            addCriterion("recalcu_time not in", values, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeBetween(Date value1, Date value2) {
            addCriterion("recalcu_time between", value1, value2, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andRecalcuTimeNotBetween(Date value1, Date value2) {
            addCriterion("recalcu_time not between", value1, value2, "recalcuTime");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditIsNull() {
            addCriterion("before_credit is null");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditIsNotNull() {
            addCriterion("before_credit is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditEqualTo(BigDecimal value) {
            addCriterion("before_credit =", value, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditNotEqualTo(BigDecimal value) {
            addCriterion("before_credit <>", value, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditGreaterThan(BigDecimal value) {
            addCriterion("before_credit >", value, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_credit >=", value, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditLessThan(BigDecimal value) {
            addCriterion("before_credit <", value, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_credit <=", value, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditIn(List<BigDecimal> values) {
            addCriterion("before_credit in", values, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditNotIn(List<BigDecimal> values) {
            addCriterion("before_credit not in", values, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_credit between", value1, value2, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBeforeCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_credit not between", value1, value2, "beforeCredit");
            return (Criteria) this;
        }

        public Criteria andBetIpIsNull() {
            addCriterion("bet_ip is null");
            return (Criteria) this;
        }

        public Criteria andBetIpIsNotNull() {
            addCriterion("bet_ip is not null");
            return (Criteria) this;
        }

        public Criteria andBetIpEqualTo(String value) {
            addCriterion("bet_ip =", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpNotEqualTo(String value) {
            addCriterion("bet_ip <>", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpGreaterThan(String value) {
            addCriterion("bet_ip >", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpGreaterThanOrEqualTo(String value) {
            addCriterion("bet_ip >=", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpLessThan(String value) {
            addCriterion("bet_ip <", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpLessThanOrEqualTo(String value) {
            addCriterion("bet_ip <=", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpLike(String value) {
            addCriterion("bet_ip like", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpNotLike(String value) {
            addCriterion("bet_ip not like", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpIn(List<String> values) {
            addCriterion("bet_ip in", values, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpNotIn(List<String> values) {
            addCriterion("bet_ip not in", values, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpBetween(String value1, String value2) {
            addCriterion("bet_ip between", value1, value2, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpNotBetween(String value1, String value2) {
            addCriterion("bet_ip not between", value1, value2, "betIp");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeIsNull() {
            addCriterion("platfrom_type is null");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeIsNotNull() {
            addCriterion("platfrom_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeEqualTo(String value) {
            addCriterion("platfrom_type =", value, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeNotEqualTo(String value) {
            addCriterion("platfrom_type <>", value, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeGreaterThan(String value) {
            addCriterion("platfrom_type >", value, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("platfrom_type >=", value, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeLessThan(String value) {
            addCriterion("platfrom_type <", value, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeLessThanOrEqualTo(String value) {
            addCriterion("platfrom_type <=", value, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeLike(String value) {
            addCriterion("platfrom_type like", value, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeNotLike(String value) {
            addCriterion("platfrom_type not like", value, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeIn(List<String> values) {
            addCriterion("platfrom_type in", values, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeNotIn(List<String> values) {
            addCriterion("platfrom_type not in", values, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeBetween(String value1, String value2) {
            addCriterion("platfrom_type between", value1, value2, "platfromType");
            return (Criteria) this;
        }

        public Criteria andPlatfromTypeNotBetween(String value1, String value2) {
            addCriterion("platfrom_type not between", value1, value2, "platfromType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNull() {
            addCriterion("devicetype is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNotNull() {
            addCriterion("devicetype is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeEqualTo(Byte value) {
            addCriterion("devicetype =", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotEqualTo(Byte value) {
            addCriterion("devicetype <>", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThan(Byte value) {
            addCriterion("devicetype >", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("devicetype >=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThan(Byte value) {
            addCriterion("devicetype <", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThanOrEqualTo(Byte value) {
            addCriterion("devicetype <=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIn(List<Byte> values) {
            addCriterion("devicetype in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotIn(List<Byte> values) {
            addCriterion("devicetype not in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeBetween(Byte value1, Byte value2) {
            addCriterion("devicetype between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("devicetype not between", value1, value2, "devicetype");
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