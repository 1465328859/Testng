package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GamePtBettingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GamePtBettingRecordExample() {
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

        public Criteria andGameCodeIsNull() {
            addCriterion("game_code is null");
            return (Criteria) this;
        }

        public Criteria andGameCodeIsNotNull() {
            addCriterion("game_code is not null");
            return (Criteria) this;
        }

        public Criteria andGameCodeEqualTo(Long value) {
            addCriterion("game_code =", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotEqualTo(Long value) {
            addCriterion("game_code <>", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeGreaterThan(Long value) {
            addCriterion("game_code >", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("game_code >=", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeLessThan(Long value) {
            addCriterion("game_code <", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeLessThanOrEqualTo(Long value) {
            addCriterion("game_code <=", value, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeIn(List<Long> values) {
            addCriterion("game_code in", values, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotIn(List<Long> values) {
            addCriterion("game_code not in", values, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeBetween(Long value1, Long value2) {
            addCriterion("game_code between", value1, value2, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameCodeNotBetween(Long value1, Long value2) {
            addCriterion("game_code not between", value1, value2, "gameCode");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andPlayernameIsNull() {
            addCriterion("playername is null");
            return (Criteria) this;
        }

        public Criteria andPlayernameIsNotNull() {
            addCriterion("playername is not null");
            return (Criteria) this;
        }

        public Criteria andPlayernameEqualTo(String value) {
            addCriterion("playername =", value, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameNotEqualTo(String value) {
            addCriterion("playername <>", value, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameGreaterThan(String value) {
            addCriterion("playername >", value, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameGreaterThanOrEqualTo(String value) {
            addCriterion("playername >=", value, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameLessThan(String value) {
            addCriterion("playername <", value, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameLessThanOrEqualTo(String value) {
            addCriterion("playername <=", value, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameLike(String value) {
            addCriterion("playername like", value, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameNotLike(String value) {
            addCriterion("playername not like", value, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameIn(List<String> values) {
            addCriterion("playername in", values, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameNotIn(List<String> values) {
            addCriterion("playername not in", values, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameBetween(String value1, String value2) {
            addCriterion("playername between", value1, value2, "playername");
            return (Criteria) this;
        }

        public Criteria andPlayernameNotBetween(String value1, String value2) {
            addCriterion("playername not between", value1, value2, "playername");
            return (Criteria) this;
        }

        public Criteria andWindowCodeIsNull() {
            addCriterion("window_code is null");
            return (Criteria) this;
        }

        public Criteria andWindowCodeIsNotNull() {
            addCriterion("window_code is not null");
            return (Criteria) this;
        }

        public Criteria andWindowCodeEqualTo(Integer value) {
            addCriterion("window_code =", value, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeNotEqualTo(Integer value) {
            addCriterion("window_code <>", value, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeGreaterThan(Integer value) {
            addCriterion("window_code >", value, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("window_code >=", value, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeLessThan(Integer value) {
            addCriterion("window_code <", value, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeLessThanOrEqualTo(Integer value) {
            addCriterion("window_code <=", value, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeIn(List<Integer> values) {
            addCriterion("window_code in", values, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeNotIn(List<Integer> values) {
            addCriterion("window_code not in", values, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeBetween(Integer value1, Integer value2) {
            addCriterion("window_code between", value1, value2, "windowCode");
            return (Criteria) this;
        }

        public Criteria andWindowCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("window_code not between", value1, value2, "windowCode");
            return (Criteria) this;
        }

        public Criteria andGameCategoryIsNull() {
            addCriterion("game_category is null");
            return (Criteria) this;
        }

        public Criteria andGameCategoryIsNotNull() {
            addCriterion("game_category is not null");
            return (Criteria) this;
        }

        public Criteria andGameCategoryEqualTo(String value) {
            addCriterion("game_category =", value, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryNotEqualTo(String value) {
            addCriterion("game_category <>", value, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryGreaterThan(String value) {
            addCriterion("game_category >", value, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("game_category >=", value, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryLessThan(String value) {
            addCriterion("game_category <", value, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryLessThanOrEqualTo(String value) {
            addCriterion("game_category <=", value, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryLike(String value) {
            addCriterion("game_category like", value, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryNotLike(String value) {
            addCriterion("game_category not like", value, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryIn(List<String> values) {
            addCriterion("game_category in", values, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryNotIn(List<String> values) {
            addCriterion("game_category not in", values, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryBetween(String value1, String value2) {
            addCriterion("game_category between", value1, value2, "gameCategory");
            return (Criteria) this;
        }

        public Criteria andGameCategoryNotBetween(String value1, String value2) {
            addCriterion("game_category not between", value1, value2, "gameCategory");
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

        public Criteria andGameNameIsNull() {
            addCriterion("game_name is null");
            return (Criteria) this;
        }

        public Criteria andGameNameIsNotNull() {
            addCriterion("game_name is not null");
            return (Criteria) this;
        }

        public Criteria andGameNameEqualTo(String value) {
            addCriterion("game_name =", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotEqualTo(String value) {
            addCriterion("game_name <>", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThan(String value) {
            addCriterion("game_name >", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_name >=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThan(String value) {
            addCriterion("game_name <", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThanOrEqualTo(String value) {
            addCriterion("game_name <=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLike(String value) {
            addCriterion("game_name like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotLike(String value) {
            addCriterion("game_name not like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameIn(List<String> values) {
            addCriterion("game_name in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotIn(List<String> values) {
            addCriterion("game_name not in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameBetween(String value1, String value2) {
            addCriterion("game_name between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotBetween(String value1, String value2) {
            addCriterion("game_name not between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(Long value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(Long value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(Long value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(Long value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(Long value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<Long> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<Long> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(Long value1, Long value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(Long value1, Long value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
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

        public Criteria andProgressiveBetIsNull() {
            addCriterion("progressive_bet is null");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetIsNotNull() {
            addCriterion("progressive_bet is not null");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetEqualTo(BigDecimal value) {
            addCriterion("progressive_bet =", value, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetNotEqualTo(BigDecimal value) {
            addCriterion("progressive_bet <>", value, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetGreaterThan(BigDecimal value) {
            addCriterion("progressive_bet >", value, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("progressive_bet >=", value, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetLessThan(BigDecimal value) {
            addCriterion("progressive_bet <", value, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("progressive_bet <=", value, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetIn(List<BigDecimal> values) {
            addCriterion("progressive_bet in", values, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetNotIn(List<BigDecimal> values) {
            addCriterion("progressive_bet not in", values, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("progressive_bet between", value1, value2, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveBetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("progressive_bet not between", value1, value2, "progressiveBet");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinIsNull() {
            addCriterion("progressive_win is null");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinIsNotNull() {
            addCriterion("progressive_win is not null");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinEqualTo(BigDecimal value) {
            addCriterion("progressive_win =", value, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinNotEqualTo(BigDecimal value) {
            addCriterion("progressive_win <>", value, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinGreaterThan(BigDecimal value) {
            addCriterion("progressive_win >", value, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("progressive_win >=", value, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinLessThan(BigDecimal value) {
            addCriterion("progressive_win <", value, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("progressive_win <=", value, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinIn(List<BigDecimal> values) {
            addCriterion("progressive_win in", values, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinNotIn(List<BigDecimal> values) {
            addCriterion("progressive_win not in", values, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("progressive_win between", value1, value2, "progressiveWin");
            return (Criteria) this;
        }

        public Criteria andProgressiveWinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("progressive_win not between", value1, value2, "progressiveWin");
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

        public Criteria andCurrentBetIsNull() {
            addCriterion("current_bet is null");
            return (Criteria) this;
        }

        public Criteria andCurrentBetIsNotNull() {
            addCriterion("current_bet is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentBetEqualTo(BigDecimal value) {
            addCriterion("current_bet =", value, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetNotEqualTo(BigDecimal value) {
            addCriterion("current_bet <>", value, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetGreaterThan(BigDecimal value) {
            addCriterion("current_bet >", value, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_bet >=", value, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetLessThan(BigDecimal value) {
            addCriterion("current_bet <", value, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_bet <=", value, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetIn(List<BigDecimal> values) {
            addCriterion("current_bet in", values, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetNotIn(List<BigDecimal> values) {
            addCriterion("current_bet not in", values, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_bet between", value1, value2, "currentBet");
            return (Criteria) this;
        }

        public Criteria andCurrentBetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_bet not between", value1, value2, "currentBet");
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

        public Criteria andExitGameIsNull() {
            addCriterion("exit_game is null");
            return (Criteria) this;
        }

        public Criteria andExitGameIsNotNull() {
            addCriterion("exit_game is not null");
            return (Criteria) this;
        }

        public Criteria andExitGameEqualTo(String value) {
            addCriterion("exit_game =", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameNotEqualTo(String value) {
            addCriterion("exit_game <>", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameGreaterThan(String value) {
            addCriterion("exit_game >", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameGreaterThanOrEqualTo(String value) {
            addCriterion("exit_game >=", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameLessThan(String value) {
            addCriterion("exit_game <", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameLessThanOrEqualTo(String value) {
            addCriterion("exit_game <=", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameLike(String value) {
            addCriterion("exit_game like", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameNotLike(String value) {
            addCriterion("exit_game not like", value, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameIn(List<String> values) {
            addCriterion("exit_game in", values, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameNotIn(List<String> values) {
            addCriterion("exit_game not in", values, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameBetween(String value1, String value2) {
            addCriterion("exit_game between", value1, value2, "exitGame");
            return (Criteria) this;
        }

        public Criteria andExitGameNotBetween(String value1, String value2) {
            addCriterion("exit_game not between", value1, value2, "exitGame");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkIsNull() {
            addCriterion("live_network is null");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkIsNotNull() {
            addCriterion("live_network is not null");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkEqualTo(String value) {
            addCriterion("live_network =", value, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkNotEqualTo(String value) {
            addCriterion("live_network <>", value, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkGreaterThan(String value) {
            addCriterion("live_network >", value, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("live_network >=", value, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkLessThan(String value) {
            addCriterion("live_network <", value, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkLessThanOrEqualTo(String value) {
            addCriterion("live_network <=", value, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkLike(String value) {
            addCriterion("live_network like", value, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkNotLike(String value) {
            addCriterion("live_network not like", value, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkIn(List<String> values) {
            addCriterion("live_network in", values, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkNotIn(List<String> values) {
            addCriterion("live_network not in", values, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkBetween(String value1, String value2) {
            addCriterion("live_network between", value1, value2, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andLiveNetworkNotBetween(String value1, String value2) {
            addCriterion("live_network not between", value1, value2, "liveNetwork");
            return (Criteria) this;
        }

        public Criteria andRnumIsNull() {
            addCriterion("rnum is null");
            return (Criteria) this;
        }

        public Criteria andRnumIsNotNull() {
            addCriterion("rnum is not null");
            return (Criteria) this;
        }

        public Criteria andRnumEqualTo(String value) {
            addCriterion("rnum =", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumNotEqualTo(String value) {
            addCriterion("rnum <>", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumGreaterThan(String value) {
            addCriterion("rnum >", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumGreaterThanOrEqualTo(String value) {
            addCriterion("rnum >=", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumLessThan(String value) {
            addCriterion("rnum <", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumLessThanOrEqualTo(String value) {
            addCriterion("rnum <=", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumLike(String value) {
            addCriterion("rnum like", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumNotLike(String value) {
            addCriterion("rnum not like", value, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumIn(List<String> values) {
            addCriterion("rnum in", values, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumNotIn(List<String> values) {
            addCriterion("rnum not in", values, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumBetween(String value1, String value2) {
            addCriterion("rnum between", value1, value2, "rnum");
            return (Criteria) this;
        }

        public Criteria andRnumNotBetween(String value1, String value2) {
            addCriterion("rnum not between", value1, value2, "rnum");
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