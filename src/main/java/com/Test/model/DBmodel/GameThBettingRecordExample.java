package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameThBettingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameThBettingRecordExample() {
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

        public Criteria andDeskUuidIsNull() {
            addCriterion("desk_uuid is null");
            return (Criteria) this;
        }

        public Criteria andDeskUuidIsNotNull() {
            addCriterion("desk_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andDeskUuidEqualTo(String value) {
            addCriterion("desk_uuid =", value, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidNotEqualTo(String value) {
            addCriterion("desk_uuid <>", value, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidGreaterThan(String value) {
            addCriterion("desk_uuid >", value, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidGreaterThanOrEqualTo(String value) {
            addCriterion("desk_uuid >=", value, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidLessThan(String value) {
            addCriterion("desk_uuid <", value, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidLessThanOrEqualTo(String value) {
            addCriterion("desk_uuid <=", value, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidLike(String value) {
            addCriterion("desk_uuid like", value, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidNotLike(String value) {
            addCriterion("desk_uuid not like", value, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidIn(List<String> values) {
            addCriterion("desk_uuid in", values, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidNotIn(List<String> values) {
            addCriterion("desk_uuid not in", values, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidBetween(String value1, String value2) {
            addCriterion("desk_uuid between", value1, value2, "deskUuid");
            return (Criteria) this;
        }

        public Criteria andDeskUuidNotBetween(String value1, String value2) {
            addCriterion("desk_uuid not between", value1, value2, "deskUuid");
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

        public Criteria andGameTypeEqualTo(Short value) {
            addCriterion("game_type =", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotEqualTo(Short value) {
            addCriterion("game_type <>", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThan(Short value) {
            addCriterion("game_type >", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("game_type >=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThan(Short value) {
            addCriterion("game_type <", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThanOrEqualTo(Short value) {
            addCriterion("game_type <=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeIn(List<Short> values) {
            addCriterion("game_type in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotIn(List<Short> values) {
            addCriterion("game_type not in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeBetween(Short value1, Short value2) {
            addCriterion("game_type between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotBetween(Short value1, Short value2) {
            addCriterion("game_type not between", value1, value2, "gameType");
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

        public Criteria andRoomLevelIsNull() {
            addCriterion("room_level is null");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIsNotNull() {
            addCriterion("room_level is not null");
            return (Criteria) this;
        }

        public Criteria andRoomLevelEqualTo(Byte value) {
            addCriterion("room_level =", value, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelNotEqualTo(Byte value) {
            addCriterion("room_level <>", value, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelGreaterThan(Byte value) {
            addCriterion("room_level >", value, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("room_level >=", value, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelLessThan(Byte value) {
            addCriterion("room_level <", value, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelLessThanOrEqualTo(Byte value) {
            addCriterion("room_level <=", value, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIn(List<Byte> values) {
            addCriterion("room_level in", values, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelNotIn(List<Byte> values) {
            addCriterion("room_level not in", values, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelBetween(Byte value1, Byte value2) {
            addCriterion("room_level between", value1, value2, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andRoomLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("room_level not between", value1, value2, "roomLevel");
            return (Criteria) this;
        }

        public Criteria andWinMoneyIsNull() {
            addCriterion("win_money is null");
            return (Criteria) this;
        }

        public Criteria andWinMoneyIsNotNull() {
            addCriterion("win_money is not null");
            return (Criteria) this;
        }

        public Criteria andWinMoneyEqualTo(BigDecimal value) {
            addCriterion("win_money =", value, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyNotEqualTo(BigDecimal value) {
            addCriterion("win_money <>", value, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyGreaterThan(BigDecimal value) {
            addCriterion("win_money >", value, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("win_money >=", value, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyLessThan(BigDecimal value) {
            addCriterion("win_money <", value, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("win_money <=", value, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyIn(List<BigDecimal> values) {
            addCriterion("win_money in", values, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyNotIn(List<BigDecimal> values) {
            addCriterion("win_money not in", values, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("win_money between", value1, value2, "winMoney");
            return (Criteria) this;
        }

        public Criteria andWinMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("win_money not between", value1, value2, "winMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIsNull() {
            addCriterion("start_money is null");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIsNotNull() {
            addCriterion("start_money is not null");
            return (Criteria) this;
        }

        public Criteria andStartMoneyEqualTo(BigDecimal value) {
            addCriterion("start_money =", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotEqualTo(BigDecimal value) {
            addCriterion("start_money <>", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyGreaterThan(BigDecimal value) {
            addCriterion("start_money >", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_money >=", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyLessThan(BigDecimal value) {
            addCriterion("start_money <", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_money <=", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIn(List<BigDecimal> values) {
            addCriterion("start_money in", values, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotIn(List<BigDecimal> values) {
            addCriterion("start_money not in", values, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_money between", value1, value2, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_money not between", value1, value2, "startMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIsNull() {
            addCriterion("end_money is null");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIsNotNull() {
            addCriterion("end_money is not null");
            return (Criteria) this;
        }

        public Criteria andEndMoneyEqualTo(BigDecimal value) {
            addCriterion("end_money =", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotEqualTo(BigDecimal value) {
            addCriterion("end_money <>", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyGreaterThan(BigDecimal value) {
            addCriterion("end_money >", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("end_money >=", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyLessThan(BigDecimal value) {
            addCriterion("end_money <", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("end_money <=", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIn(List<BigDecimal> values) {
            addCriterion("end_money in", values, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotIn(List<BigDecimal> values) {
            addCriterion("end_money not in", values, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_money between", value1, value2, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_money not between", value1, value2, "endMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyIsNull() {
            addCriterion("deal_money is null");
            return (Criteria) this;
        }

        public Criteria andDealMoneyIsNotNull() {
            addCriterion("deal_money is not null");
            return (Criteria) this;
        }

        public Criteria andDealMoneyEqualTo(BigDecimal value) {
            addCriterion("deal_money =", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyNotEqualTo(BigDecimal value) {
            addCriterion("deal_money <>", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyGreaterThan(BigDecimal value) {
            addCriterion("deal_money >", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deal_money >=", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyLessThan(BigDecimal value) {
            addCriterion("deal_money <", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deal_money <=", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyIn(List<BigDecimal> values) {
            addCriterion("deal_money in", values, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyNotIn(List<BigDecimal> values) {
            addCriterion("deal_money not in", values, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deal_money between", value1, value2, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deal_money not between", value1, value2, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyIsNull() {
            addCriterion("bank_money is null");
            return (Criteria) this;
        }

        public Criteria andBankMoneyIsNotNull() {
            addCriterion("bank_money is not null");
            return (Criteria) this;
        }

        public Criteria andBankMoneyEqualTo(BigDecimal value) {
            addCriterion("bank_money =", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyNotEqualTo(BigDecimal value) {
            addCriterion("bank_money <>", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyGreaterThan(BigDecimal value) {
            addCriterion("bank_money >", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_money >=", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyLessThan(BigDecimal value) {
            addCriterion("bank_money <", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_money <=", value, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyIn(List<BigDecimal> values) {
            addCriterion("bank_money in", values, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyNotIn(List<BigDecimal> values) {
            addCriterion("bank_money not in", values, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_money between", value1, value2, "bankMoney");
            return (Criteria) this;
        }

        public Criteria andBankMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_money not between", value1, value2, "bankMoney");
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

        public Criteria andEffectMoneyIsNull() {
            addCriterion("effect_money is null");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyIsNotNull() {
            addCriterion("effect_money is not null");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyEqualTo(BigDecimal value) {
            addCriterion("effect_money =", value, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyNotEqualTo(BigDecimal value) {
            addCriterion("effect_money <>", value, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyGreaterThan(BigDecimal value) {
            addCriterion("effect_money >", value, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_money >=", value, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyLessThan(BigDecimal value) {
            addCriterion("effect_money <", value, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("effect_money <=", value, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyIn(List<BigDecimal> values) {
            addCriterion("effect_money in", values, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyNotIn(List<BigDecimal> values) {
            addCriterion("effect_money not in", values, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_money between", value1, value2, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andEffectMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("effect_money not between", value1, value2, "effectMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIsNull() {
            addCriterion("award_money is null");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIsNotNull() {
            addCriterion("award_money is not null");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyEqualTo(BigDecimal value) {
            addCriterion("award_money =", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotEqualTo(BigDecimal value) {
            addCriterion("award_money <>", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyGreaterThan(BigDecimal value) {
            addCriterion("award_money >", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_money >=", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyLessThan(BigDecimal value) {
            addCriterion("award_money <", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_money <=", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIn(List<BigDecimal> values) {
            addCriterion("award_money in", values, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotIn(List<BigDecimal> values) {
            addCriterion("award_money not in", values, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_money between", value1, value2, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_money not between", value1, value2, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andGameGroupIsNull() {
            addCriterion("game_group is null");
            return (Criteria) this;
        }

        public Criteria andGameGroupIsNotNull() {
            addCriterion("game_group is not null");
            return (Criteria) this;
        }

        public Criteria andGameGroupEqualTo(Byte value) {
            addCriterion("game_group =", value, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupNotEqualTo(Byte value) {
            addCriterion("game_group <>", value, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupGreaterThan(Byte value) {
            addCriterion("game_group >", value, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupGreaterThanOrEqualTo(Byte value) {
            addCriterion("game_group >=", value, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupLessThan(Byte value) {
            addCriterion("game_group <", value, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupLessThanOrEqualTo(Byte value) {
            addCriterion("game_group <=", value, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupIn(List<Byte> values) {
            addCriterion("game_group in", values, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupNotIn(List<Byte> values) {
            addCriterion("game_group not in", values, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupBetween(Byte value1, Byte value2) {
            addCriterion("game_group between", value1, value2, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andGameGroupNotBetween(Byte value1, Byte value2) {
            addCriterion("game_group not between", value1, value2, "gameGroup");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIsNull() {
            addCriterion("tax_money is null");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIsNotNull() {
            addCriterion("tax_money is not null");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyEqualTo(BigDecimal value) {
            addCriterion("tax_money =", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotEqualTo(BigDecimal value) {
            addCriterion("tax_money <>", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyGreaterThan(BigDecimal value) {
            addCriterion("tax_money >", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_money >=", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyLessThan(BigDecimal value) {
            addCriterion("tax_money <", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_money <=", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIn(List<BigDecimal> values) {
            addCriterion("tax_money in", values, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotIn(List<BigDecimal> values) {
            addCriterion("tax_money not in", values, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_money between", value1, value2, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_money not between", value1, value2, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andJackPotIsNull() {
            addCriterion("jack_pot is null");
            return (Criteria) this;
        }

        public Criteria andJackPotIsNotNull() {
            addCriterion("jack_pot is not null");
            return (Criteria) this;
        }

        public Criteria andJackPotEqualTo(BigDecimal value) {
            addCriterion("jack_pot =", value, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotNotEqualTo(BigDecimal value) {
            addCriterion("jack_pot <>", value, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotGreaterThan(BigDecimal value) {
            addCriterion("jack_pot >", value, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jack_pot >=", value, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotLessThan(BigDecimal value) {
            addCriterion("jack_pot <", value, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jack_pot <=", value, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotIn(List<BigDecimal> values) {
            addCriterion("jack_pot in", values, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotNotIn(List<BigDecimal> values) {
            addCriterion("jack_pot not in", values, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jack_pot between", value1, value2, "jackPot");
            return (Criteria) this;
        }

        public Criteria andJackPotNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jack_pot not between", value1, value2, "jackPot");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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