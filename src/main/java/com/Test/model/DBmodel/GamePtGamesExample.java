package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.List;

public class GamePtGamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GamePtGamesExample() {
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

        public Criteria andGameEnNameIsNull() {
            addCriterion("game_en_name is null");
            return (Criteria) this;
        }

        public Criteria andGameEnNameIsNotNull() {
            addCriterion("game_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andGameEnNameEqualTo(String value) {
            addCriterion("game_en_name =", value, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameNotEqualTo(String value) {
            addCriterion("game_en_name <>", value, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameGreaterThan(String value) {
            addCriterion("game_en_name >", value, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_en_name >=", value, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameLessThan(String value) {
            addCriterion("game_en_name <", value, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameLessThanOrEqualTo(String value) {
            addCriterion("game_en_name <=", value, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameLike(String value) {
            addCriterion("game_en_name like", value, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameNotLike(String value) {
            addCriterion("game_en_name not like", value, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameIn(List<String> values) {
            addCriterion("game_en_name in", values, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameNotIn(List<String> values) {
            addCriterion("game_en_name not in", values, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameBetween(String value1, String value2) {
            addCriterion("game_en_name between", value1, value2, "gameEnName");
            return (Criteria) this;
        }

        public Criteria andGameEnNameNotBetween(String value1, String value2) {
            addCriterion("game_en_name not between", value1, value2, "gameEnName");
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

        public Criteria andReelsIsNull() {
            addCriterion("reels is null");
            return (Criteria) this;
        }

        public Criteria andReelsIsNotNull() {
            addCriterion("reels is not null");
            return (Criteria) this;
        }

        public Criteria andReelsEqualTo(String value) {
            addCriterion("reels =", value, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsNotEqualTo(String value) {
            addCriterion("reels <>", value, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsGreaterThan(String value) {
            addCriterion("reels >", value, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsGreaterThanOrEqualTo(String value) {
            addCriterion("reels >=", value, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsLessThan(String value) {
            addCriterion("reels <", value, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsLessThanOrEqualTo(String value) {
            addCriterion("reels <=", value, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsLike(String value) {
            addCriterion("reels like", value, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsNotLike(String value) {
            addCriterion("reels not like", value, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsIn(List<String> values) {
            addCriterion("reels in", values, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsNotIn(List<String> values) {
            addCriterion("reels not in", values, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsBetween(String value1, String value2) {
            addCriterion("reels between", value1, value2, "reels");
            return (Criteria) this;
        }

        public Criteria andReelsNotBetween(String value1, String value2) {
            addCriterion("reels not between", value1, value2, "reels");
            return (Criteria) this;
        }

        public Criteria andLinesIsNull() {
            addCriterion("lines is null");
            return (Criteria) this;
        }

        public Criteria andLinesIsNotNull() {
            addCriterion("lines is not null");
            return (Criteria) this;
        }

        public Criteria andLinesEqualTo(String value) {
            addCriterion("lines =", value, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesNotEqualTo(String value) {
            addCriterion("lines <>", value, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesGreaterThan(String value) {
            addCriterion("lines >", value, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesGreaterThanOrEqualTo(String value) {
            addCriterion("lines >=", value, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesLessThan(String value) {
            addCriterion("lines <", value, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesLessThanOrEqualTo(String value) {
            addCriterion("lines <=", value, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesLike(String value) {
            addCriterion("lines like", value, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesNotLike(String value) {
            addCriterion("lines not like", value, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesIn(List<String> values) {
            addCriterion("lines in", values, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesNotIn(List<String> values) {
            addCriterion("lines not in", values, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesBetween(String value1, String value2) {
            addCriterion("lines between", value1, value2, "lines");
            return (Criteria) this;
        }

        public Criteria andLinesNotBetween(String value1, String value2) {
            addCriterion("lines not between", value1, value2, "lines");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeIsNull() {
            addCriterion("flash_game_code is null");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeIsNotNull() {
            addCriterion("flash_game_code is not null");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeEqualTo(String value) {
            addCriterion("flash_game_code =", value, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeNotEqualTo(String value) {
            addCriterion("flash_game_code <>", value, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeGreaterThan(String value) {
            addCriterion("flash_game_code >", value, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("flash_game_code >=", value, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeLessThan(String value) {
            addCriterion("flash_game_code <", value, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeLessThanOrEqualTo(String value) {
            addCriterion("flash_game_code <=", value, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeLike(String value) {
            addCriterion("flash_game_code like", value, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeNotLike(String value) {
            addCriterion("flash_game_code not like", value, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeIn(List<String> values) {
            addCriterion("flash_game_code in", values, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeNotIn(List<String> values) {
            addCriterion("flash_game_code not in", values, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeBetween(String value1, String value2) {
            addCriterion("flash_game_code between", value1, value2, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andFlashGameCodeNotBetween(String value1, String value2) {
            addCriterion("flash_game_code not between", value1, value2, "flashGameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeIsNull() {
            addCriterion("html5_game_code is null");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeIsNotNull() {
            addCriterion("html5_game_code is not null");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeEqualTo(String value) {
            addCriterion("html5_game_code =", value, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeNotEqualTo(String value) {
            addCriterion("html5_game_code <>", value, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeGreaterThan(String value) {
            addCriterion("html5_game_code >", value, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("html5_game_code >=", value, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeLessThan(String value) {
            addCriterion("html5_game_code <", value, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeLessThanOrEqualTo(String value) {
            addCriterion("html5_game_code <=", value, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeLike(String value) {
            addCriterion("html5_game_code like", value, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeNotLike(String value) {
            addCriterion("html5_game_code not like", value, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeIn(List<String> values) {
            addCriterion("html5_game_code in", values, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeNotIn(List<String> values) {
            addCriterion("html5_game_code not in", values, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeBetween(String value1, String value2) {
            addCriterion("html5_game_code between", value1, value2, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andHtml5GameCodeNotBetween(String value1, String value2) {
            addCriterion("html5_game_code not between", value1, value2, "html5GameCode");
            return (Criteria) this;
        }

        public Criteria andRtpIsNull() {
            addCriterion("rtp is null");
            return (Criteria) this;
        }

        public Criteria andRtpIsNotNull() {
            addCriterion("rtp is not null");
            return (Criteria) this;
        }

        public Criteria andRtpEqualTo(String value) {
            addCriterion("rtp =", value, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpNotEqualTo(String value) {
            addCriterion("rtp <>", value, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpGreaterThan(String value) {
            addCriterion("rtp >", value, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpGreaterThanOrEqualTo(String value) {
            addCriterion("rtp >=", value, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpLessThan(String value) {
            addCriterion("rtp <", value, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpLessThanOrEqualTo(String value) {
            addCriterion("rtp <=", value, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpLike(String value) {
            addCriterion("rtp like", value, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpNotLike(String value) {
            addCriterion("rtp not like", value, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpIn(List<String> values) {
            addCriterion("rtp in", values, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpNotIn(List<String> values) {
            addCriterion("rtp not in", values, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpBetween(String value1, String value2) {
            addCriterion("rtp between", value1, value2, "rtp");
            return (Criteria) this;
        }

        public Criteria andRtpNotBetween(String value1, String value2) {
            addCriterion("rtp not between", value1, value2, "rtp");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadIsNull() {
            addCriterion("support_download is null");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadIsNotNull() {
            addCriterion("support_download is not null");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadEqualTo(Byte value) {
            addCriterion("support_download =", value, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadNotEqualTo(Byte value) {
            addCriterion("support_download <>", value, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadGreaterThan(Byte value) {
            addCriterion("support_download >", value, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadGreaterThanOrEqualTo(Byte value) {
            addCriterion("support_download >=", value, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadLessThan(Byte value) {
            addCriterion("support_download <", value, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadLessThanOrEqualTo(Byte value) {
            addCriterion("support_download <=", value, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadIn(List<Byte> values) {
            addCriterion("support_download in", values, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadNotIn(List<Byte> values) {
            addCriterion("support_download not in", values, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadBetween(Byte value1, Byte value2) {
            addCriterion("support_download between", value1, value2, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportDownloadNotBetween(Byte value1, Byte value2) {
            addCriterion("support_download not between", value1, value2, "supportDownload");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashIsNull() {
            addCriterion("support_pc_flash is null");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashIsNotNull() {
            addCriterion("support_pc_flash is not null");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashEqualTo(Byte value) {
            addCriterion("support_pc_flash =", value, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashNotEqualTo(Byte value) {
            addCriterion("support_pc_flash <>", value, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashGreaterThan(Byte value) {
            addCriterion("support_pc_flash >", value, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashGreaterThanOrEqualTo(Byte value) {
            addCriterion("support_pc_flash >=", value, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashLessThan(Byte value) {
            addCriterion("support_pc_flash <", value, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashLessThanOrEqualTo(Byte value) {
            addCriterion("support_pc_flash <=", value, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashIn(List<Byte> values) {
            addCriterion("support_pc_flash in", values, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashNotIn(List<Byte> values) {
            addCriterion("support_pc_flash not in", values, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashBetween(Byte value1, Byte value2) {
            addCriterion("support_pc_flash between", value1, value2, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportPcFlashNotBetween(Byte value1, Byte value2) {
            addCriterion("support_pc_flash not between", value1, value2, "supportPcFlash");
            return (Criteria) this;
        }

        public Criteria andSupportDemoIsNull() {
            addCriterion("support_demo is null");
            return (Criteria) this;
        }

        public Criteria andSupportDemoIsNotNull() {
            addCriterion("support_demo is not null");
            return (Criteria) this;
        }

        public Criteria andSupportDemoEqualTo(Byte value) {
            addCriterion("support_demo =", value, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoNotEqualTo(Byte value) {
            addCriterion("support_demo <>", value, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoGreaterThan(Byte value) {
            addCriterion("support_demo >", value, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoGreaterThanOrEqualTo(Byte value) {
            addCriterion("support_demo >=", value, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoLessThan(Byte value) {
            addCriterion("support_demo <", value, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoLessThanOrEqualTo(Byte value) {
            addCriterion("support_demo <=", value, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoIn(List<Byte> values) {
            addCriterion("support_demo in", values, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoNotIn(List<Byte> values) {
            addCriterion("support_demo not in", values, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoBetween(Byte value1, Byte value2) {
            addCriterion("support_demo between", value1, value2, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportDemoNotBetween(Byte value1, Byte value2) {
            addCriterion("support_demo not between", value1, value2, "supportDemo");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5IsNull() {
            addCriterion("support_mobile_html5 is null");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5IsNotNull() {
            addCriterion("support_mobile_html5 is not null");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5EqualTo(Byte value) {
            addCriterion("support_mobile_html5 =", value, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5NotEqualTo(Byte value) {
            addCriterion("support_mobile_html5 <>", value, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5GreaterThan(Byte value) {
            addCriterion("support_mobile_html5 >", value, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5GreaterThanOrEqualTo(Byte value) {
            addCriterion("support_mobile_html5 >=", value, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5LessThan(Byte value) {
            addCriterion("support_mobile_html5 <", value, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5LessThanOrEqualTo(Byte value) {
            addCriterion("support_mobile_html5 <=", value, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5In(List<Byte> values) {
            addCriterion("support_mobile_html5 in", values, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5NotIn(List<Byte> values) {
            addCriterion("support_mobile_html5 not in", values, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5Between(Byte value1, Byte value2) {
            addCriterion("support_mobile_html5 between", value1, value2, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileHtml5NotBetween(Byte value1, Byte value2) {
            addCriterion("support_mobile_html5 not between", value1, value2, "supportMobileHtml5");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppIsNull() {
            addCriterion("support_mobile_app is null");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppIsNotNull() {
            addCriterion("support_mobile_app is not null");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppEqualTo(Byte value) {
            addCriterion("support_mobile_app =", value, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppNotEqualTo(Byte value) {
            addCriterion("support_mobile_app <>", value, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppGreaterThan(Byte value) {
            addCriterion("support_mobile_app >", value, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppGreaterThanOrEqualTo(Byte value) {
            addCriterion("support_mobile_app >=", value, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppLessThan(Byte value) {
            addCriterion("support_mobile_app <", value, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppLessThanOrEqualTo(Byte value) {
            addCriterion("support_mobile_app <=", value, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppIn(List<Byte> values) {
            addCriterion("support_mobile_app in", values, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppNotIn(List<Byte> values) {
            addCriterion("support_mobile_app not in", values, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppBetween(Byte value1, Byte value2) {
            addCriterion("support_mobile_app between", value1, value2, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andSupportMobileAppNotBetween(Byte value1, Byte value2) {
            addCriterion("support_mobile_app not between", value1, value2, "supportMobileApp");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Byte value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Byte value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Byte value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Byte value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Byte value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Byte> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Byte> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Byte value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Byte value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Byte value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Byte value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Byte value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Byte> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Byte> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Byte value1, Byte value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Byte value1, Byte value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesIsNull() {
            addCriterion("html5_images is null");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesIsNotNull() {
            addCriterion("html5_images is not null");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesEqualTo(String value) {
            addCriterion("html5_images =", value, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesNotEqualTo(String value) {
            addCriterion("html5_images <>", value, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesGreaterThan(String value) {
            addCriterion("html5_images >", value, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesGreaterThanOrEqualTo(String value) {
            addCriterion("html5_images >=", value, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesLessThan(String value) {
            addCriterion("html5_images <", value, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesLessThanOrEqualTo(String value) {
            addCriterion("html5_images <=", value, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesLike(String value) {
            addCriterion("html5_images like", value, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesNotLike(String value) {
            addCriterion("html5_images not like", value, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesIn(List<String> values) {
            addCriterion("html5_images in", values, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesNotIn(List<String> values) {
            addCriterion("html5_images not in", values, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesBetween(String value1, String value2) {
            addCriterion("html5_images between", value1, value2, "html5Images");
            return (Criteria) this;
        }

        public Criteria andHtml5ImagesNotBetween(String value1, String value2) {
            addCriterion("html5_images not between", value1, value2, "html5Images");
            return (Criteria) this;
        }

        public Criteria andSortbyIsNull() {
            addCriterion("sortby is null");
            return (Criteria) this;
        }

        public Criteria andSortbyIsNotNull() {
            addCriterion("sortby is not null");
            return (Criteria) this;
        }

        public Criteria andSortbyEqualTo(Integer value) {
            addCriterion("sortby =", value, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyNotEqualTo(Integer value) {
            addCriterion("sortby <>", value, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyGreaterThan(Integer value) {
            addCriterion("sortby >", value, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortby >=", value, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyLessThan(Integer value) {
            addCriterion("sortby <", value, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyLessThanOrEqualTo(Integer value) {
            addCriterion("sortby <=", value, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyIn(List<Integer> values) {
            addCriterion("sortby in", values, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyNotIn(List<Integer> values) {
            addCriterion("sortby not in", values, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyBetween(Integer value1, Integer value2) {
            addCriterion("sortby between", value1, value2, "sortby");
            return (Criteria) this;
        }

        public Criteria andSortbyNotBetween(Integer value1, Integer value2) {
            addCriterion("sortby not between", value1, value2, "sortby");
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