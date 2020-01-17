package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.List;

public class GameKyGamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameKyGamesExample() {
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

        public Criteria andKindIdIsNull() {
            addCriterion("kind_id is null");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNotNull() {
            addCriterion("kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andKindIdEqualTo(Integer value) {
            addCriterion("kind_id =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(Integer value) {
            addCriterion("kind_id <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(Integer value) {
            addCriterion("kind_id >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_id >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(Integer value) {
            addCriterion("kind_id <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("kind_id <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<Integer> values) {
            addCriterion("kind_id in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<Integer> values) {
            addCriterion("kind_id not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(Integer value1, Integer value2) {
            addCriterion("kind_id between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_id not between", value1, value2, "kindId");
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

        public Criteria andImage128IsNull() {
            addCriterion("image_128 is null");
            return (Criteria) this;
        }

        public Criteria andImage128IsNotNull() {
            addCriterion("image_128 is not null");
            return (Criteria) this;
        }

        public Criteria andImage128EqualTo(String value) {
            addCriterion("image_128 =", value, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128NotEqualTo(String value) {
            addCriterion("image_128 <>", value, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128GreaterThan(String value) {
            addCriterion("image_128 >", value, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128GreaterThanOrEqualTo(String value) {
            addCriterion("image_128 >=", value, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128LessThan(String value) {
            addCriterion("image_128 <", value, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128LessThanOrEqualTo(String value) {
            addCriterion("image_128 <=", value, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128Like(String value) {
            addCriterion("image_128 like", value, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128NotLike(String value) {
            addCriterion("image_128 not like", value, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128In(List<String> values) {
            addCriterion("image_128 in", values, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128NotIn(List<String> values) {
            addCriterion("image_128 not in", values, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128Between(String value1, String value2) {
            addCriterion("image_128 between", value1, value2, "image128");
            return (Criteria) this;
        }

        public Criteria andImage128NotBetween(String value1, String value2) {
            addCriterion("image_128 not between", value1, value2, "image128");
            return (Criteria) this;
        }

        public Criteria andImage180IsNull() {
            addCriterion("image_180 is null");
            return (Criteria) this;
        }

        public Criteria andImage180IsNotNull() {
            addCriterion("image_180 is not null");
            return (Criteria) this;
        }

        public Criteria andImage180EqualTo(String value) {
            addCriterion("image_180 =", value, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180NotEqualTo(String value) {
            addCriterion("image_180 <>", value, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180GreaterThan(String value) {
            addCriterion("image_180 >", value, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180GreaterThanOrEqualTo(String value) {
            addCriterion("image_180 >=", value, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180LessThan(String value) {
            addCriterion("image_180 <", value, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180LessThanOrEqualTo(String value) {
            addCriterion("image_180 <=", value, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180Like(String value) {
            addCriterion("image_180 like", value, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180NotLike(String value) {
            addCriterion("image_180 not like", value, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180In(List<String> values) {
            addCriterion("image_180 in", values, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180NotIn(List<String> values) {
            addCriterion("image_180 not in", values, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180Between(String value1, String value2) {
            addCriterion("image_180 between", value1, value2, "image180");
            return (Criteria) this;
        }

        public Criteria andImage180NotBetween(String value1, String value2) {
            addCriterion("image_180 not between", value1, value2, "image180");
            return (Criteria) this;
        }

        public Criteria andImage197263IsNull() {
            addCriterion("image_197_263 is null");
            return (Criteria) this;
        }

        public Criteria andImage197263IsNotNull() {
            addCriterion("image_197_263 is not null");
            return (Criteria) this;
        }

        public Criteria andImage197263EqualTo(String value) {
            addCriterion("image_197_263 =", value, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263NotEqualTo(String value) {
            addCriterion("image_197_263 <>", value, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263GreaterThan(String value) {
            addCriterion("image_197_263 >", value, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263GreaterThanOrEqualTo(String value) {
            addCriterion("image_197_263 >=", value, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263LessThan(String value) {
            addCriterion("image_197_263 <", value, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263LessThanOrEqualTo(String value) {
            addCriterion("image_197_263 <=", value, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263Like(String value) {
            addCriterion("image_197_263 like", value, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263NotLike(String value) {
            addCriterion("image_197_263 not like", value, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263In(List<String> values) {
            addCriterion("image_197_263 in", values, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263NotIn(List<String> values) {
            addCriterion("image_197_263 not in", values, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263Between(String value1, String value2) {
            addCriterion("image_197_263 between", value1, value2, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage197263NotBetween(String value1, String value2) {
            addCriterion("image_197_263 not between", value1, value2, "image197263");
            return (Criteria) this;
        }

        public Criteria andImage360IsNull() {
            addCriterion("image_360 is null");
            return (Criteria) this;
        }

        public Criteria andImage360IsNotNull() {
            addCriterion("image_360 is not null");
            return (Criteria) this;
        }

        public Criteria andImage360EqualTo(String value) {
            addCriterion("image_360 =", value, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360NotEqualTo(String value) {
            addCriterion("image_360 <>", value, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360GreaterThan(String value) {
            addCriterion("image_360 >", value, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360GreaterThanOrEqualTo(String value) {
            addCriterion("image_360 >=", value, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360LessThan(String value) {
            addCriterion("image_360 <", value, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360LessThanOrEqualTo(String value) {
            addCriterion("image_360 <=", value, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360Like(String value) {
            addCriterion("image_360 like", value, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360NotLike(String value) {
            addCriterion("image_360 not like", value, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360In(List<String> values) {
            addCriterion("image_360 in", values, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360NotIn(List<String> values) {
            addCriterion("image_360 not in", values, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360Between(String value1, String value2) {
            addCriterion("image_360 between", value1, value2, "image360");
            return (Criteria) this;
        }

        public Criteria andImage360NotBetween(String value1, String value2) {
            addCriterion("image_360 not between", value1, value2, "image360");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
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