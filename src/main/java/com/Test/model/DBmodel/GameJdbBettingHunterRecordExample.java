package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameJdbBettingHunterRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameJdbBettingHunterRecordExample() {
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

        public Criteria andSeqNoIsNull() {
            addCriterion("seq_no is null");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNotNull() {
            addCriterion("seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNoEqualTo(Long value) {
            addCriterion("seq_no =", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotEqualTo(Long value) {
            addCriterion("seq_no <>", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThan(Long value) {
            addCriterion("seq_no >", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThanOrEqualTo(Long value) {
            addCriterion("seq_no >=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThan(Long value) {
            addCriterion("seq_no <", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThanOrEqualTo(Long value) {
            addCriterion("seq_no <=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoIn(List<Long> values) {
            addCriterion("seq_no in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotIn(List<Long> values) {
            addCriterion("seq_no not in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoBetween(Long value1, Long value2) {
            addCriterion("seq_no between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotBetween(Long value1, Long value2) {
            addCriterion("seq_no not between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNull() {
            addCriterion("player_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("player_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(String value) {
            addCriterion("player_id =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(String value) {
            addCriterion("player_id <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(String value) {
            addCriterion("player_id >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("player_id >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(String value) {
            addCriterion("player_id <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(String value) {
            addCriterion("player_id <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLike(String value) {
            addCriterion("player_id like", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotLike(String value) {
            addCriterion("player_id not like", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<String> values) {
            addCriterion("player_id in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<String> values) {
            addCriterion("player_id not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(String value1, String value2) {
            addCriterion("player_id between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(String value1, String value2) {
            addCriterion("player_id not between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andGameDateIsNull() {
            addCriterion("game_date is null");
            return (Criteria) this;
        }

        public Criteria andGameDateIsNotNull() {
            addCriterion("game_date is not null");
            return (Criteria) this;
        }

        public Criteria andGameDateEqualTo(Date value) {
            addCriterion("game_date =", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotEqualTo(Date value) {
            addCriterion("game_date <>", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateGreaterThan(Date value) {
            addCriterion("game_date >", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateGreaterThanOrEqualTo(Date value) {
            addCriterion("game_date >=", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateLessThan(Date value) {
            addCriterion("game_date <", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateLessThanOrEqualTo(Date value) {
            addCriterion("game_date <=", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateIn(List<Date> values) {
            addCriterion("game_date in", values, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotIn(List<Date> values) {
            addCriterion("game_date not in", values, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateBetween(Date value1, Date value2) {
            addCriterion("game_date between", value1, value2, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotBetween(Date value1, Date value2) {
            addCriterion("game_date not between", value1, value2, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGTypeIsNull() {
            addCriterion("g_type is null");
            return (Criteria) this;
        }

        public Criteria andGTypeIsNotNull() {
            addCriterion("g_type is not null");
            return (Criteria) this;
        }

        public Criteria andGTypeEqualTo(String value) {
            addCriterion("g_type =", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotEqualTo(String value) {
            addCriterion("g_type <>", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThan(String value) {
            addCriterion("g_type >", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThanOrEqualTo(String value) {
            addCriterion("g_type >=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThan(String value) {
            addCriterion("g_type <", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThanOrEqualTo(String value) {
            addCriterion("g_type <=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLike(String value) {
            addCriterion("g_type like", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotLike(String value) {
            addCriterion("g_type not like", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeIn(List<String> values) {
            addCriterion("g_type in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotIn(List<String> values) {
            addCriterion("g_type not in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeBetween(String value1, String value2) {
            addCriterion("g_type between", value1, value2, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotBetween(String value1, String value2) {
            addCriterion("g_type not between", value1, value2, "gType");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNull() {
            addCriterion("m_type is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNotNull() {
            addCriterion("m_type is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeEqualTo(Integer value) {
            addCriterion("m_type =", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotEqualTo(Integer value) {
            addCriterion("m_type <>", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThan(Integer value) {
            addCriterion("m_type >", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_type >=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThan(Integer value) {
            addCriterion("m_type <", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThanOrEqualTo(Integer value) {
            addCriterion("m_type <=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeIn(List<Integer> values) {
            addCriterion("m_type in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotIn(List<Integer> values) {
            addCriterion("m_type not in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeBetween(Integer value1, Integer value2) {
            addCriterion("m_type between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("m_type not between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(Byte value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(Byte value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(Byte value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(Byte value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(Byte value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<Byte> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<Byte> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(Byte value1, Byte value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
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

        public Criteria andBetIsNull() {
            addCriterion("bet is null");
            return (Criteria) this;
        }

        public Criteria andBetIsNotNull() {
            addCriterion("bet is not null");
            return (Criteria) this;
        }

        public Criteria andBetEqualTo(BigDecimal value) {
            addCriterion("bet =", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetNotEqualTo(BigDecimal value) {
            addCriterion("bet <>", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetGreaterThan(BigDecimal value) {
            addCriterion("bet >", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bet >=", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetLessThan(BigDecimal value) {
            addCriterion("bet <", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bet <=", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetIn(List<BigDecimal> values) {
            addCriterion("bet in", values, "bet");
            return (Criteria) this;
        }

        public Criteria andBetNotIn(List<BigDecimal> values) {
            addCriterion("bet not in", values, "bet");
            return (Criteria) this;
        }

        public Criteria andBetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet between", value1, value2, "bet");
            return (Criteria) this;
        }

        public Criteria andBetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet not between", value1, value2, "bet");
            return (Criteria) this;
        }

        public Criteria andWinIsNull() {
            addCriterion("win is null");
            return (Criteria) this;
        }

        public Criteria andWinIsNotNull() {
            addCriterion("win is not null");
            return (Criteria) this;
        }

        public Criteria andWinEqualTo(BigDecimal value) {
            addCriterion("win =", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotEqualTo(BigDecimal value) {
            addCriterion("win <>", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinGreaterThan(BigDecimal value) {
            addCriterion("win >", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("win >=", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinLessThan(BigDecimal value) {
            addCriterion("win <", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("win <=", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinIn(List<BigDecimal> values) {
            addCriterion("win in", values, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotIn(List<BigDecimal> values) {
            addCriterion("win not in", values, "win");
            return (Criteria) this;
        }

        public Criteria andWinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("win between", value1, value2, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("win not between", value1, value2, "win");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andDenomIsNull() {
            addCriterion("denom is null");
            return (Criteria) this;
        }

        public Criteria andDenomIsNotNull() {
            addCriterion("denom is not null");
            return (Criteria) this;
        }

        public Criteria andDenomEqualTo(BigDecimal value) {
            addCriterion("denom =", value, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomNotEqualTo(BigDecimal value) {
            addCriterion("denom <>", value, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomGreaterThan(BigDecimal value) {
            addCriterion("denom >", value, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("denom >=", value, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomLessThan(BigDecimal value) {
            addCriterion("denom <", value, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomLessThanOrEqualTo(BigDecimal value) {
            addCriterion("denom <=", value, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomIn(List<BigDecimal> values) {
            addCriterion("denom in", values, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomNotIn(List<BigDecimal> values) {
            addCriterion("denom not in", values, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("denom between", value1, value2, "denom");
            return (Criteria) this;
        }

        public Criteria andDenomNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("denom not between", value1, value2, "denom");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceIsNull() {
            addCriterion("before_balance is null");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceIsNotNull() {
            addCriterion("before_balance is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceEqualTo(BigDecimal value) {
            addCriterion("before_balance =", value, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceNotEqualTo(BigDecimal value) {
            addCriterion("before_balance <>", value, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceGreaterThan(BigDecimal value) {
            addCriterion("before_balance >", value, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_balance >=", value, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceLessThan(BigDecimal value) {
            addCriterion("before_balance <", value, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_balance <=", value, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceIn(List<BigDecimal> values) {
            addCriterion("before_balance in", values, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceNotIn(List<BigDecimal> values) {
            addCriterion("before_balance not in", values, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_balance between", value1, value2, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andBeforeBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_balance not between", value1, value2, "beforeBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceIsNull() {
            addCriterion("after_balance is null");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceIsNotNull() {
            addCriterion("after_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceEqualTo(BigDecimal value) {
            addCriterion("after_balance =", value, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceNotEqualTo(BigDecimal value) {
            addCriterion("after_balance <>", value, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceGreaterThan(BigDecimal value) {
            addCriterion("after_balance >", value, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("after_balance >=", value, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceLessThan(BigDecimal value) {
            addCriterion("after_balance <", value, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("after_balance <=", value, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceIn(List<BigDecimal> values) {
            addCriterion("after_balance in", values, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceNotIn(List<BigDecimal> values) {
            addCriterion("after_balance not in", values, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_balance between", value1, value2, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andAfterBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_balance not between", value1, value2, "afterBalance");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andPlayerIpIsNull() {
            addCriterion("player_ip is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIpIsNotNull() {
            addCriterion("player_ip is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIpEqualTo(String value) {
            addCriterion("player_ip =", value, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpNotEqualTo(String value) {
            addCriterion("player_ip <>", value, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpGreaterThan(String value) {
            addCriterion("player_ip >", value, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpGreaterThanOrEqualTo(String value) {
            addCriterion("player_ip >=", value, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpLessThan(String value) {
            addCriterion("player_ip <", value, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpLessThanOrEqualTo(String value) {
            addCriterion("player_ip <=", value, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpLike(String value) {
            addCriterion("player_ip like", value, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpNotLike(String value) {
            addCriterion("player_ip not like", value, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpIn(List<String> values) {
            addCriterion("player_ip in", values, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpNotIn(List<String> values) {
            addCriterion("player_ip not in", values, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpBetween(String value1, String value2) {
            addCriterion("player_ip between", value1, value2, "playerIp");
            return (Criteria) this;
        }

        public Criteria andPlayerIpNotBetween(String value1, String value2) {
            addCriterion("player_ip not between", value1, value2, "playerIp");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("client_type like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("client_type not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
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