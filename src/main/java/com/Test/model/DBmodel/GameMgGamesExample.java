package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.List;

public class GameMgGamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameMgGamesExample() {
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

        public Criteria andFlashIdIsNull() {
            addCriterion("flash_id is null");
            return (Criteria) this;
        }

        public Criteria andFlashIdIsNotNull() {
            addCriterion("flash_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlashIdEqualTo(Integer value) {
            addCriterion("flash_id =", value, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdNotEqualTo(Integer value) {
            addCriterion("flash_id <>", value, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdGreaterThan(Integer value) {
            addCriterion("flash_id >", value, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flash_id >=", value, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdLessThan(Integer value) {
            addCriterion("flash_id <", value, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdLessThanOrEqualTo(Integer value) {
            addCriterion("flash_id <=", value, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdIn(List<Integer> values) {
            addCriterion("flash_id in", values, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdNotIn(List<Integer> values) {
            addCriterion("flash_id not in", values, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdBetween(Integer value1, Integer value2) {
            addCriterion("flash_id between", value1, value2, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flash_id not between", value1, value2, "flashId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdIsNull() {
            addCriterion("flash_app_id is null");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdIsNotNull() {
            addCriterion("flash_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdEqualTo(Integer value) {
            addCriterion("flash_app_id =", value, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdNotEqualTo(Integer value) {
            addCriterion("flash_app_id <>", value, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdGreaterThan(Integer value) {
            addCriterion("flash_app_id >", value, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flash_app_id >=", value, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdLessThan(Integer value) {
            addCriterion("flash_app_id <", value, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("flash_app_id <=", value, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdIn(List<Integer> values) {
            addCriterion("flash_app_id in", values, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdNotIn(List<Integer> values) {
            addCriterion("flash_app_id not in", values, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdBetween(Integer value1, Integer value2) {
            addCriterion("flash_app_id between", value1, value2, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andFlashAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flash_app_id not between", value1, value2, "flashAppId");
            return (Criteria) this;
        }

        public Criteria andH5IdIsNull() {
            addCriterion("h5_id is null");
            return (Criteria) this;
        }

        public Criteria andH5IdIsNotNull() {
            addCriterion("h5_id is not null");
            return (Criteria) this;
        }

        public Criteria andH5IdEqualTo(Integer value) {
            addCriterion("h5_id =", value, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdNotEqualTo(Integer value) {
            addCriterion("h5_id <>", value, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdGreaterThan(Integer value) {
            addCriterion("h5_id >", value, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h5_id >=", value, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdLessThan(Integer value) {
            addCriterion("h5_id <", value, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdLessThanOrEqualTo(Integer value) {
            addCriterion("h5_id <=", value, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdIn(List<Integer> values) {
            addCriterion("h5_id in", values, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdNotIn(List<Integer> values) {
            addCriterion("h5_id not in", values, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdBetween(Integer value1, Integer value2) {
            addCriterion("h5_id between", value1, value2, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5IdNotBetween(Integer value1, Integer value2) {
            addCriterion("h5_id not between", value1, value2, "h5Id");
            return (Criteria) this;
        }

        public Criteria andH5AppIdIsNull() {
            addCriterion("h5_app_id is null");
            return (Criteria) this;
        }

        public Criteria andH5AppIdIsNotNull() {
            addCriterion("h5_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andH5AppIdEqualTo(Integer value) {
            addCriterion("h5_app_id =", value, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdNotEqualTo(Integer value) {
            addCriterion("h5_app_id <>", value, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdGreaterThan(Integer value) {
            addCriterion("h5_app_id >", value, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h5_app_id >=", value, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdLessThan(Integer value) {
            addCriterion("h5_app_id <", value, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdLessThanOrEqualTo(Integer value) {
            addCriterion("h5_app_id <=", value, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdIn(List<Integer> values) {
            addCriterion("h5_app_id in", values, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdNotIn(List<Integer> values) {
            addCriterion("h5_app_id not in", values, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdBetween(Integer value1, Integer value2) {
            addCriterion("h5_app_id between", value1, value2, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andH5AppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h5_app_id not between", value1, value2, "h5AppId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdIsNull() {
            addCriterion("download_id is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIdIsNotNull() {
            addCriterion("download_id is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadIdEqualTo(Integer value) {
            addCriterion("download_id =", value, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdNotEqualTo(Integer value) {
            addCriterion("download_id <>", value, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdGreaterThan(Integer value) {
            addCriterion("download_id >", value, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_id >=", value, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdLessThan(Integer value) {
            addCriterion("download_id <", value, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdLessThanOrEqualTo(Integer value) {
            addCriterion("download_id <=", value, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdIn(List<Integer> values) {
            addCriterion("download_id in", values, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdNotIn(List<Integer> values) {
            addCriterion("download_id not in", values, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdBetween(Integer value1, Integer value2) {
            addCriterion("download_id between", value1, value2, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("download_id not between", value1, value2, "downloadId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdIsNull() {
            addCriterion("download_app_id is null");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdIsNotNull() {
            addCriterion("download_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdEqualTo(Integer value) {
            addCriterion("download_app_id =", value, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdNotEqualTo(Integer value) {
            addCriterion("download_app_id <>", value, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdGreaterThan(Integer value) {
            addCriterion("download_app_id >", value, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_app_id >=", value, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdLessThan(Integer value) {
            addCriterion("download_app_id <", value, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("download_app_id <=", value, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdIn(List<Integer> values) {
            addCriterion("download_app_id in", values, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdNotIn(List<Integer> values) {
            addCriterion("download_app_id not in", values, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdBetween(Integer value1, Integer value2) {
            addCriterion("download_app_id between", value1, value2, "downloadAppId");
            return (Criteria) this;
        }

        public Criteria andDownloadAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("download_app_id not between", value1, value2, "downloadAppId");
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

        public Criteria andGameSubCategoryIsNull() {
            addCriterion("game_sub_category is null");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryIsNotNull() {
            addCriterion("game_sub_category is not null");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryEqualTo(String value) {
            addCriterion("game_sub_category =", value, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryNotEqualTo(String value) {
            addCriterion("game_sub_category <>", value, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryGreaterThan(String value) {
            addCriterion("game_sub_category >", value, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("game_sub_category >=", value, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryLessThan(String value) {
            addCriterion("game_sub_category <", value, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryLessThanOrEqualTo(String value) {
            addCriterion("game_sub_category <=", value, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryLike(String value) {
            addCriterion("game_sub_category like", value, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryNotLike(String value) {
            addCriterion("game_sub_category not like", value, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryIn(List<String> values) {
            addCriterion("game_sub_category in", values, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryNotIn(List<String> values) {
            addCriterion("game_sub_category not in", values, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryBetween(String value1, String value2) {
            addCriterion("game_sub_category between", value1, value2, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameSubCategoryNotBetween(String value1, String value2) {
            addCriterion("game_sub_category not between", value1, value2, "gameSubCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryIsNull() {
            addCriterion("game_grandson_category is null");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryIsNotNull() {
            addCriterion("game_grandson_category is not null");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryEqualTo(String value) {
            addCriterion("game_grandson_category =", value, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryNotEqualTo(String value) {
            addCriterion("game_grandson_category <>", value, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryGreaterThan(String value) {
            addCriterion("game_grandson_category >", value, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("game_grandson_category >=", value, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryLessThan(String value) {
            addCriterion("game_grandson_category <", value, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryLessThanOrEqualTo(String value) {
            addCriterion("game_grandson_category <=", value, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryLike(String value) {
            addCriterion("game_grandson_category like", value, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryNotLike(String value) {
            addCriterion("game_grandson_category not like", value, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryIn(List<String> values) {
            addCriterion("game_grandson_category in", values, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryNotIn(List<String> values) {
            addCriterion("game_grandson_category not in", values, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryBetween(String value1, String value2) {
            addCriterion("game_grandson_category between", value1, value2, "gameGrandsonCategory");
            return (Criteria) this;
        }

        public Criteria andGameGrandsonCategoryNotBetween(String value1, String value2) {
            addCriterion("game_grandson_category not between", value1, value2, "gameGrandsonCategory");
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

        public Criteria andFlashIsNull() {
            addCriterion("flash is null");
            return (Criteria) this;
        }

        public Criteria andFlashIsNotNull() {
            addCriterion("flash is not null");
            return (Criteria) this;
        }

        public Criteria andFlashEqualTo(String value) {
            addCriterion("flash =", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotEqualTo(String value) {
            addCriterion("flash <>", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashGreaterThan(String value) {
            addCriterion("flash >", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashGreaterThanOrEqualTo(String value) {
            addCriterion("flash >=", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLessThan(String value) {
            addCriterion("flash <", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLessThanOrEqualTo(String value) {
            addCriterion("flash <=", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashLike(String value) {
            addCriterion("flash like", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotLike(String value) {
            addCriterion("flash not like", value, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashIn(List<String> values) {
            addCriterion("flash in", values, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotIn(List<String> values) {
            addCriterion("flash not in", values, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashBetween(String value1, String value2) {
            addCriterion("flash between", value1, value2, "flash");
            return (Criteria) this;
        }

        public Criteria andFlashNotBetween(String value1, String value2) {
            addCriterion("flash not between", value1, value2, "flash");
            return (Criteria) this;
        }

        public Criteria andHtml5IsNull() {
            addCriterion("html5 is null");
            return (Criteria) this;
        }

        public Criteria andHtml5IsNotNull() {
            addCriterion("html5 is not null");
            return (Criteria) this;
        }

        public Criteria andHtml5EqualTo(String value) {
            addCriterion("html5 =", value, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5NotEqualTo(String value) {
            addCriterion("html5 <>", value, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5GreaterThan(String value) {
            addCriterion("html5 >", value, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5GreaterThanOrEqualTo(String value) {
            addCriterion("html5 >=", value, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5LessThan(String value) {
            addCriterion("html5 <", value, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5LessThanOrEqualTo(String value) {
            addCriterion("html5 <=", value, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5Like(String value) {
            addCriterion("html5 like", value, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5NotLike(String value) {
            addCriterion("html5 not like", value, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5In(List<String> values) {
            addCriterion("html5 in", values, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5NotIn(List<String> values) {
            addCriterion("html5 not in", values, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5Between(String value1, String value2) {
            addCriterion("html5 between", value1, value2, "html5");
            return (Criteria) this;
        }

        public Criteria andHtml5NotBetween(String value1, String value2) {
            addCriterion("html5 not between", value1, value2, "html5");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNull() {
            addCriterion("download is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNotNull() {
            addCriterion("download is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadEqualTo(String value) {
            addCriterion("download =", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotEqualTo(String value) {
            addCriterion("download <>", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThan(String value) {
            addCriterion("download >", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("download >=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThan(String value) {
            addCriterion("download <", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThanOrEqualTo(String value) {
            addCriterion("download <=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLike(String value) {
            addCriterion("download like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotLike(String value) {
            addCriterion("download not like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadIn(List<String> values) {
            addCriterion("download in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotIn(List<String> values) {
            addCriterion("download not in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadBetween(String value1, String value2) {
            addCriterion("download between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotBetween(String value1, String value2) {
            addCriterion("download not between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("image_path is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("image_path is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("image_path =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("image_path <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("image_path >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("image_path >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("image_path <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("image_path <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("image_path like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("image_path not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("image_path in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("image_path not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("image_path between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("image_path not between", value1, value2, "imagePath");
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

        public Criteria andSortNoIsNull() {
            addCriterion("sort_no is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("sort_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(Integer value) {
            addCriterion("sort_no =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(Integer value) {
            addCriterion("sort_no <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(Integer value) {
            addCriterion("sort_no >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_no >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(Integer value) {
            addCriterion("sort_no <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(Integer value) {
            addCriterion("sort_no <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<Integer> values) {
            addCriterion("sort_no in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<Integer> values) {
            addCriterion("sort_no not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(Integer value1, Integer value2) {
            addCriterion("sort_no between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_no not between", value1, value2, "sortNo");
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