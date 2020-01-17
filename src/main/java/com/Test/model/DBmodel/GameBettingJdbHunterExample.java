package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GameBettingJdbHunterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameBettingJdbHunterExample() {
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

        public Criteria andBetOrderNoIsNull() {
            addCriterion("bet_order_no is null");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoIsNotNull() {
            addCriterion("bet_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoEqualTo(String value) {
            addCriterion("bet_order_no =", value, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoNotEqualTo(String value) {
            addCriterion("bet_order_no <>", value, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoGreaterThan(String value) {
            addCriterion("bet_order_no >", value, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("bet_order_no >=", value, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoLessThan(String value) {
            addCriterion("bet_order_no <", value, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoLessThanOrEqualTo(String value) {
            addCriterion("bet_order_no <=", value, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoLike(String value) {
            addCriterion("bet_order_no like", value, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoNotLike(String value) {
            addCriterion("bet_order_no not like", value, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoIn(List<String> values) {
            addCriterion("bet_order_no in", values, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoNotIn(List<String> values) {
            addCriterion("bet_order_no not in", values, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoBetween(String value1, String value2) {
            addCriterion("bet_order_no between", value1, value2, "betOrderNo");
            return (Criteria) this;
        }

        public Criteria andBetOrderNoNotBetween(String value1, String value2) {
            addCriterion("bet_order_no not between", value1, value2, "betOrderNo");
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

        public Criteria andSettlementTimeIsNull() {
            addCriterion("settlement_time is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNotNull() {
            addCriterion("settlement_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeEqualTo(Date value) {
            addCriterion("settlement_time =", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotEqualTo(Date value) {
            addCriterion("settlement_time <>", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThan(Date value) {
            addCriterion("settlement_time >", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settlement_time >=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThan(Date value) {
            addCriterion("settlement_time <", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThanOrEqualTo(Date value) {
            addCriterion("settlement_time <=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIn(List<Date> values) {
            addCriterion("settlement_time in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotIn(List<Date> values) {
            addCriterion("settlement_time not in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeBetween(Date value1, Date value2) {
            addCriterion("settlement_time between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotBetween(Date value1, Date value2) {
            addCriterion("settlement_time not between", value1, value2, "settlementTime");
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

        public Criteria andTopIdEqualTo(String value) {
            addCriterion("top_id =", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotEqualTo(String value) {
            addCriterion("top_id <>", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdGreaterThan(String value) {
            addCriterion("top_id >", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdGreaterThanOrEqualTo(String value) {
            addCriterion("top_id >=", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLessThan(String value) {
            addCriterion("top_id <", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLessThanOrEqualTo(String value) {
            addCriterion("top_id <=", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLike(String value) {
            addCriterion("top_id like", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotLike(String value) {
            addCriterion("top_id not like", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdIn(List<String> values) {
            addCriterion("top_id in", values, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotIn(List<String> values) {
            addCriterion("top_id not in", values, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdBetween(String value1, String value2) {
            addCriterion("top_id between", value1, value2, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotBetween(String value1, String value2) {
            addCriterion("top_id not between", value1, value2, "topId");
            return (Criteria) this;
        }

        public Criteria andIsSwitchIsNull() {
            addCriterion("is_switch is null");
            return (Criteria) this;
        }

        public Criteria andIsSwitchIsNotNull() {
            addCriterion("is_switch is not null");
            return (Criteria) this;
        }

        public Criteria andIsSwitchEqualTo(Byte value) {
            addCriterion("is_switch =", value, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchNotEqualTo(Byte value) {
            addCriterion("is_switch <>", value, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchGreaterThan(Byte value) {
            addCriterion("is_switch >", value, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_switch >=", value, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchLessThan(Byte value) {
            addCriterion("is_switch <", value, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchLessThanOrEqualTo(Byte value) {
            addCriterion("is_switch <=", value, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchIn(List<Byte> values) {
            addCriterion("is_switch in", values, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchNotIn(List<Byte> values) {
            addCriterion("is_switch not in", values, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchBetween(Byte value1, Byte value2) {
            addCriterion("is_switch between", value1, value2, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andIsSwitchNotBetween(Byte value1, Byte value2) {
            addCriterion("is_switch not between", value1, value2, "isSwitch");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeIsNull() {
            addCriterion("up_three_tree is null");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeIsNotNull() {
            addCriterion("up_three_tree is not null");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeEqualTo(String value) {
            addCriterion("up_three_tree =", value, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeNotEqualTo(String value) {
            addCriterion("up_three_tree <>", value, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeGreaterThan(String value) {
            addCriterion("up_three_tree >", value, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeGreaterThanOrEqualTo(String value) {
            addCriterion("up_three_tree >=", value, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeLessThan(String value) {
            addCriterion("up_three_tree <", value, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeLessThanOrEqualTo(String value) {
            addCriterion("up_three_tree <=", value, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeLike(String value) {
            addCriterion("up_three_tree like", value, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeNotLike(String value) {
            addCriterion("up_three_tree not like", value, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeIn(List<String> values) {
            addCriterion("up_three_tree in", values, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeNotIn(List<String> values) {
            addCriterion("up_three_tree not in", values, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeBetween(String value1, String value2) {
            addCriterion("up_three_tree between", value1, value2, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andUpThreeTreeNotBetween(String value1, String value2) {
            addCriterion("up_three_tree not between", value1, value2, "upThreeTree");
            return (Criteria) this;
        }

        public Criteria andGameCnNameIsNull() {
            addCriterion("game_cn_name is null");
            return (Criteria) this;
        }

        public Criteria andGameCnNameIsNotNull() {
            addCriterion("game_cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andGameCnNameEqualTo(String value) {
            addCriterion("game_cn_name =", value, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameNotEqualTo(String value) {
            addCriterion("game_cn_name <>", value, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameGreaterThan(String value) {
            addCriterion("game_cn_name >", value, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_cn_name >=", value, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameLessThan(String value) {
            addCriterion("game_cn_name <", value, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameLessThanOrEqualTo(String value) {
            addCriterion("game_cn_name <=", value, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameLike(String value) {
            addCriterion("game_cn_name like", value, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameNotLike(String value) {
            addCriterion("game_cn_name not like", value, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameIn(List<String> values) {
            addCriterion("game_cn_name in", values, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameNotIn(List<String> values) {
            addCriterion("game_cn_name not in", values, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameBetween(String value1, String value2) {
            addCriterion("game_cn_name between", value1, value2, "gameCnName");
            return (Criteria) this;
        }

        public Criteria andGameCnNameNotBetween(String value1, String value2) {
            addCriterion("game_cn_name not between", value1, value2, "gameCnName");
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

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(BigDecimal value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(BigDecimal value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(BigDecimal value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(BigDecimal value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<BigDecimal> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<BigDecimal> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNull() {
            addCriterion("settlement_status is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNotNull() {
            addCriterion("settlement_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusEqualTo(Byte value) {
            addCriterion("settlement_status =", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotEqualTo(Byte value) {
            addCriterion("settlement_status <>", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThan(Byte value) {
            addCriterion("settlement_status >", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("settlement_status >=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThan(Byte value) {
            addCriterion("settlement_status <", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThanOrEqualTo(Byte value) {
            addCriterion("settlement_status <=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIn(List<Byte> values) {
            addCriterion("settlement_status in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotIn(List<Byte> values) {
            addCriterion("settlement_status not in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusBetween(Byte value1, Byte value2) {
            addCriterion("settlement_status between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("settlement_status not between", value1, value2, "settlementStatus");
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

        public Criteria andRebateIsNull() {
            addCriterion("rebate is null");
            return (Criteria) this;
        }

        public Criteria andRebateIsNotNull() {
            addCriterion("rebate is not null");
            return (Criteria) this;
        }

        public Criteria andRebateEqualTo(BigDecimal value) {
            addCriterion("rebate =", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotEqualTo(BigDecimal value) {
            addCriterion("rebate <>", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThan(BigDecimal value) {
            addCriterion("rebate >", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate >=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThan(BigDecimal value) {
            addCriterion("rebate <", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate <=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateIn(List<BigDecimal> values) {
            addCriterion("rebate in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotIn(List<BigDecimal> values) {
            addCriterion("rebate not in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate not between", value1, value2, "rebate");
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

        public Criteria andTopRebateIsNull() {
            addCriterion("top_rebate is null");
            return (Criteria) this;
        }

        public Criteria andTopRebateIsNotNull() {
            addCriterion("top_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andTopRebateEqualTo(BigDecimal value) {
            addCriterion("top_rebate =", value, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateNotEqualTo(BigDecimal value) {
            addCriterion("top_rebate <>", value, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateGreaterThan(BigDecimal value) {
            addCriterion("top_rebate >", value, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("top_rebate >=", value, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateLessThan(BigDecimal value) {
            addCriterion("top_rebate <", value, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("top_rebate <=", value, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateIn(List<BigDecimal> values) {
            addCriterion("top_rebate in", values, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateNotIn(List<BigDecimal> values) {
            addCriterion("top_rebate not in", values, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_rebate between", value1, value2, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_rebate not between", value1, value2, "topRebate");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountIsNull() {
            addCriterion("top_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountIsNotNull() {
            addCriterion("top_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountEqualTo(BigDecimal value) {
            addCriterion("top_rebate_amount =", value, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("top_rebate_amount <>", value, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("top_rebate_amount >", value, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("top_rebate_amount >=", value, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountLessThan(BigDecimal value) {
            addCriterion("top_rebate_amount <", value, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("top_rebate_amount <=", value, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountIn(List<BigDecimal> values) {
            addCriterion("top_rebate_amount in", values, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("top_rebate_amount not in", values, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_rebate_amount between", value1, value2, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTopRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("top_rebate_amount not between", value1, value2, "topRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateIsNull() {
            addCriterion("primary_rebate is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateIsNotNull() {
            addCriterion("primary_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateEqualTo(BigDecimal value) {
            addCriterion("primary_rebate =", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateNotEqualTo(BigDecimal value) {
            addCriterion("primary_rebate <>", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateGreaterThan(BigDecimal value) {
            addCriterion("primary_rebate >", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("primary_rebate >=", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateLessThan(BigDecimal value) {
            addCriterion("primary_rebate <", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("primary_rebate <=", value, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateIn(List<BigDecimal> values) {
            addCriterion("primary_rebate in", values, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateNotIn(List<BigDecimal> values) {
            addCriterion("primary_rebate not in", values, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("primary_rebate between", value1, value2, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("primary_rebate not between", value1, value2, "primaryRebate");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountIsNull() {
            addCriterion("primary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountIsNotNull() {
            addCriterion("primary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("primary_rebate_amount =", value, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("primary_rebate_amount <>", value, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("primary_rebate_amount >", value, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("primary_rebate_amount >=", value, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("primary_rebate_amount <", value, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("primary_rebate_amount <=", value, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("primary_rebate_amount in", values, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("primary_rebate_amount not in", values, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("primary_rebate_amount between", value1, value2, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andPrimaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("primary_rebate_amount not between", value1, value2, "primaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateIsNull() {
            addCriterion("secondary_rebate is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateIsNotNull() {
            addCriterion("secondary_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateEqualTo(Long value) {
            addCriterion("secondary_rebate =", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateNotEqualTo(Long value) {
            addCriterion("secondary_rebate <>", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateGreaterThan(Long value) {
            addCriterion("secondary_rebate >", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateGreaterThanOrEqualTo(Long value) {
            addCriterion("secondary_rebate >=", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateLessThan(Long value) {
            addCriterion("secondary_rebate <", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateLessThanOrEqualTo(Long value) {
            addCriterion("secondary_rebate <=", value, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateIn(List<Long> values) {
            addCriterion("secondary_rebate in", values, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateNotIn(List<Long> values) {
            addCriterion("secondary_rebate not in", values, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateBetween(Long value1, Long value2) {
            addCriterion("secondary_rebate between", value1, value2, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateNotBetween(Long value1, Long value2) {
            addCriterion("secondary_rebate not between", value1, value2, "secondaryRebate");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountIsNull() {
            addCriterion("secondary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountIsNotNull() {
            addCriterion("secondary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("secondary_rebate_amount =", value, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("secondary_rebate_amount <>", value, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("secondary_rebate_amount >", value, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("secondary_rebate_amount >=", value, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("secondary_rebate_amount <", value, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("secondary_rebate_amount <=", value, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("secondary_rebate_amount in", values, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("secondary_rebate_amount not in", values, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("secondary_rebate_amount between", value1, value2, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andSecondaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("secondary_rebate_amount not between", value1, value2, "secondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateIsNull() {
            addCriterion("tertiary_rebate is null");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateIsNotNull() {
            addCriterion("tertiary_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate =", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateNotEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate <>", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateGreaterThan(BigDecimal value) {
            addCriterion("tertiary_rebate >", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate >=", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateLessThan(BigDecimal value) {
            addCriterion("tertiary_rebate <", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate <=", value, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateIn(List<BigDecimal> values) {
            addCriterion("tertiary_rebate in", values, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateNotIn(List<BigDecimal> values) {
            addCriterion("tertiary_rebate not in", values, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tertiary_rebate between", value1, value2, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tertiary_rebate not between", value1, value2, "tertiaryRebate");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountIsNull() {
            addCriterion("tertiary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountIsNotNull() {
            addCriterion("tertiary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate_amount =", value, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate_amount <>", value, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("tertiary_rebate_amount >", value, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate_amount >=", value, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("tertiary_rebate_amount <", value, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tertiary_rebate_amount <=", value, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("tertiary_rebate_amount in", values, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("tertiary_rebate_amount not in", values, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tertiary_rebate_amount between", value1, value2, "tertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tertiary_rebate_amount not between", value1, value2, "tertiaryRebateAmount");
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