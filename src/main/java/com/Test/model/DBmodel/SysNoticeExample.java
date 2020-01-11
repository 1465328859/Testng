package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.List;

public class SysNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysNoticeExample() {
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

        public Criteria andIdEqualTo(Byte value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Byte value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Byte value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Byte value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Byte value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Byte> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Byte> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Byte value1, Byte value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Byte value1, Byte value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andCreatedAtEqualTo(String value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(String value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(String value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(String value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(String value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(String value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLike(String value) {
            addCriterion("created_at like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotLike(String value) {
            addCriterion("created_at not like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<String> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<String> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(String value1, String value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(String value1, String value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andShowIsNull() {
            addCriterion("show is null");
            return (Criteria) this;
        }

        public Criteria andShowIsNotNull() {
            addCriterion("show is not null");
            return (Criteria) this;
        }

        public Criteria andShowEqualTo(Boolean value) {
            addCriterion("show =", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotEqualTo(Boolean value) {
            addCriterion("show <>", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowGreaterThan(Boolean value) {
            addCriterion("show >", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show >=", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowLessThan(Boolean value) {
            addCriterion("show <", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowLessThanOrEqualTo(Boolean value) {
            addCriterion("show <=", value, "show");
            return (Criteria) this;
        }

        public Criteria andShowIn(List<Boolean> values) {
            addCriterion("show in", values, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotIn(List<Boolean> values) {
            addCriterion("show not in", values, "show");
            return (Criteria) this;
        }

        public Criteria andShowBetween(Boolean value1, Boolean value2) {
            addCriterion("show between", value1, value2, "show");
            return (Criteria) this;
        }

        public Criteria andShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show not between", value1, value2, "show");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Byte value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Byte value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Byte value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Byte value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Byte value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Byte> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Byte> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Byte value1, Byte value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Byte value1, Byte value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSuggestWebIsNull() {
            addCriterion("suggest_web is null");
            return (Criteria) this;
        }

        public Criteria andSuggestWebIsNotNull() {
            addCriterion("suggest_web is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestWebEqualTo(Boolean value) {
            addCriterion("suggest_web =", value, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebNotEqualTo(Boolean value) {
            addCriterion("suggest_web <>", value, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebGreaterThan(Boolean value) {
            addCriterion("suggest_web >", value, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebGreaterThanOrEqualTo(Boolean value) {
            addCriterion("suggest_web >=", value, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebLessThan(Boolean value) {
            addCriterion("suggest_web <", value, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebLessThanOrEqualTo(Boolean value) {
            addCriterion("suggest_web <=", value, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebIn(List<Boolean> values) {
            addCriterion("suggest_web in", values, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebNotIn(List<Boolean> values) {
            addCriterion("suggest_web not in", values, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebBetween(Boolean value1, Boolean value2) {
            addCriterion("suggest_web between", value1, value2, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestWebNotBetween(Boolean value1, Boolean value2) {
            addCriterion("suggest_web not between", value1, value2, "suggestWeb");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileIsNull() {
            addCriterion("suggest_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileIsNotNull() {
            addCriterion("suggest_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileEqualTo(Boolean value) {
            addCriterion("suggest_mobile =", value, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileNotEqualTo(Boolean value) {
            addCriterion("suggest_mobile <>", value, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileGreaterThan(Boolean value) {
            addCriterion("suggest_mobile >", value, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileGreaterThanOrEqualTo(Boolean value) {
            addCriterion("suggest_mobile >=", value, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileLessThan(Boolean value) {
            addCriterion("suggest_mobile <", value, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileLessThanOrEqualTo(Boolean value) {
            addCriterion("suggest_mobile <=", value, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileIn(List<Boolean> values) {
            addCriterion("suggest_mobile in", values, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileNotIn(List<Boolean> values) {
            addCriterion("suggest_mobile not in", values, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileBetween(Boolean value1, Boolean value2) {
            addCriterion("suggest_mobile between", value1, value2, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andSuggestMobileNotBetween(Boolean value1, Boolean value2) {
            addCriterion("suggest_mobile not between", value1, value2, "suggestMobile");
            return (Criteria) this;
        }

        public Criteria andIsRollIsNull() {
            addCriterion("is_roll is null");
            return (Criteria) this;
        }

        public Criteria andIsRollIsNotNull() {
            addCriterion("is_roll is not null");
            return (Criteria) this;
        }

        public Criteria andIsRollEqualTo(Boolean value) {
            addCriterion("is_roll =", value, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollNotEqualTo(Boolean value) {
            addCriterion("is_roll <>", value, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollGreaterThan(Boolean value) {
            addCriterion("is_roll >", value, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_roll >=", value, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollLessThan(Boolean value) {
            addCriterion("is_roll <", value, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollLessThanOrEqualTo(Boolean value) {
            addCriterion("is_roll <=", value, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollIn(List<Boolean> values) {
            addCriterion("is_roll in", values, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollNotIn(List<Boolean> values) {
            addCriterion("is_roll not in", values, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollBetween(Boolean value1, Boolean value2) {
            addCriterion("is_roll between", value1, value2, "isRoll");
            return (Criteria) this;
        }

        public Criteria andIsRollNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_roll not between", value1, value2, "isRoll");
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