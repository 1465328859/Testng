package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.List;

public class GameJdbGamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameJdbGamesExample() {
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

        public Criteria andGTypeIsNull() {
            addCriterion("g_type is null");
            return (Criteria) this;
        }

        public Criteria andGTypeIsNotNull() {
            addCriterion("g_type is not null");
            return (Criteria) this;
        }

        public Criteria andGTypeEqualTo(Integer value) {
            addCriterion("g_type =", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotEqualTo(Integer value) {
            addCriterion("g_type <>", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThan(Integer value) {
            addCriterion("g_type >", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_type >=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThan(Integer value) {
            addCriterion("g_type <", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThanOrEqualTo(Integer value) {
            addCriterion("g_type <=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeIn(List<Integer> values) {
            addCriterion("g_type in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotIn(List<Integer> values) {
            addCriterion("g_type not in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeBetween(Integer value1, Integer value2) {
            addCriterion("g_type between", value1, value2, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andImageCnIsNull() {
            addCriterion("image_cn is null");
            return (Criteria) this;
        }

        public Criteria andImageCnIsNotNull() {
            addCriterion("image_cn is not null");
            return (Criteria) this;
        }

        public Criteria andImageCnEqualTo(String value) {
            addCriterion("image_cn =", value, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnNotEqualTo(String value) {
            addCriterion("image_cn <>", value, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnGreaterThan(String value) {
            addCriterion("image_cn >", value, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnGreaterThanOrEqualTo(String value) {
            addCriterion("image_cn >=", value, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnLessThan(String value) {
            addCriterion("image_cn <", value, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnLessThanOrEqualTo(String value) {
            addCriterion("image_cn <=", value, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnLike(String value) {
            addCriterion("image_cn like", value, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnNotLike(String value) {
            addCriterion("image_cn not like", value, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnIn(List<String> values) {
            addCriterion("image_cn in", values, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnNotIn(List<String> values) {
            addCriterion("image_cn not in", values, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnBetween(String value1, String value2) {
            addCriterion("image_cn between", value1, value2, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageCnNotBetween(String value1, String value2) {
            addCriterion("image_cn not between", value1, value2, "imageCn");
            return (Criteria) this;
        }

        public Criteria andImageEnIsNull() {
            addCriterion("image_en is null");
            return (Criteria) this;
        }

        public Criteria andImageEnIsNotNull() {
            addCriterion("image_en is not null");
            return (Criteria) this;
        }

        public Criteria andImageEnEqualTo(String value) {
            addCriterion("image_en =", value, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnNotEqualTo(String value) {
            addCriterion("image_en <>", value, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnGreaterThan(String value) {
            addCriterion("image_en >", value, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnGreaterThanOrEqualTo(String value) {
            addCriterion("image_en >=", value, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnLessThan(String value) {
            addCriterion("image_en <", value, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnLessThanOrEqualTo(String value) {
            addCriterion("image_en <=", value, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnLike(String value) {
            addCriterion("image_en like", value, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnNotLike(String value) {
            addCriterion("image_en not like", value, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnIn(List<String> values) {
            addCriterion("image_en in", values, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnNotIn(List<String> values) {
            addCriterion("image_en not in", values, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnBetween(String value1, String value2) {
            addCriterion("image_en between", value1, value2, "imageEn");
            return (Criteria) this;
        }

        public Criteria andImageEnNotBetween(String value1, String value2) {
            addCriterion("image_en not between", value1, value2, "imageEn");
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

        public Criteria andSortNoIsNull() {
            addCriterion("sort_no is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("sort_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(Byte value) {
            addCriterion("sort_no =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(Byte value) {
            addCriterion("sort_no <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(Byte value) {
            addCriterion("sort_no >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort_no >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(Byte value) {
            addCriterion("sort_no <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(Byte value) {
            addCriterion("sort_no <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<Byte> values) {
            addCriterion("sort_no in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<Byte> values) {
            addCriterion("sort_no not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(Byte value1, Byte value2) {
            addCriterion("sort_no between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(Byte value1, Byte value2) {
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