package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LotteryClassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryClassifyExample() {
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

        public Criteria andLotteryClassifyIdIsNull() {
            addCriterion("lottery_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdIsNotNull() {
            addCriterion("lottery_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdEqualTo(Integer value) {
            addCriterion("lottery_classify_id =", value, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdNotEqualTo(Integer value) {
            addCriterion("lottery_classify_id <>", value, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdGreaterThan(Integer value) {
            addCriterion("lottery_classify_id >", value, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_classify_id >=", value, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdLessThan(Integer value) {
            addCriterion("lottery_classify_id <", value, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("lottery_classify_id <=", value, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdIn(List<Integer> values) {
            addCriterion("lottery_classify_id in", values, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdNotIn(List<Integer> values) {
            addCriterion("lottery_classify_id not in", values, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("lottery_classify_id between", value1, value2, "lotteryClassifyId");
            return (Criteria) this;
        }

        public Criteria andLotteryClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_classify_id not between", value1, value2, "lotteryClassifyId");
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

        public Criteria andKindIdEqualTo(String value) {
            addCriterion("kind_id =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(String value) {
            addCriterion("kind_id <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(String value) {
            addCriterion("kind_id >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("kind_id >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(String value) {
            addCriterion("kind_id <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(String value) {
            addCriterion("kind_id <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLike(String value) {
            addCriterion("kind_id like", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotLike(String value) {
            addCriterion("kind_id not like", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<String> values) {
            addCriterion("kind_id in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<String> values) {
            addCriterion("kind_id not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(String value1, String value2) {
            addCriterion("kind_id between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(String value1, String value2) {
            addCriterion("kind_id not between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNull() {
            addCriterion("kind_name is null");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNotNull() {
            addCriterion("kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andKindNameEqualTo(String value) {
            addCriterion("kind_name =", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotEqualTo(String value) {
            addCriterion("kind_name <>", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThan(String value) {
            addCriterion("kind_name >", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("kind_name >=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThan(String value) {
            addCriterion("kind_name <", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThanOrEqualTo(String value) {
            addCriterion("kind_name <=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLike(String value) {
            addCriterion("kind_name like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotLike(String value) {
            addCriterion("kind_name not like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameIn(List<String> values) {
            addCriterion("kind_name in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotIn(List<String> values) {
            addCriterion("kind_name not in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameBetween(String value1, String value2) {
            addCriterion("kind_name between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotBetween(String value1, String value2) {
            addCriterion("kind_name not between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKindRebateIsNull() {
            addCriterion("kind_rebate is null");
            return (Criteria) this;
        }

        public Criteria andKindRebateIsNotNull() {
            addCriterion("kind_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andKindRebateEqualTo(BigDecimal value) {
            addCriterion("kind_rebate =", value, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateNotEqualTo(BigDecimal value) {
            addCriterion("kind_rebate <>", value, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateGreaterThan(BigDecimal value) {
            addCriterion("kind_rebate >", value, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kind_rebate >=", value, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateLessThan(BigDecimal value) {
            addCriterion("kind_rebate <", value, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kind_rebate <=", value, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateIn(List<BigDecimal> values) {
            addCriterion("kind_rebate in", values, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateNotIn(List<BigDecimal> values) {
            addCriterion("kind_rebate not in", values, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kind_rebate between", value1, value2, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andKindRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kind_rebate not between", value1, value2, "kindRebate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconIsNull() {
            addCriterion("phone_icon is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIconIsNotNull() {
            addCriterion("phone_icon is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneIconEqualTo(String value) {
            addCriterion("phone_icon =", value, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconNotEqualTo(String value) {
            addCriterion("phone_icon <>", value, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconGreaterThan(String value) {
            addCriterion("phone_icon >", value, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconGreaterThanOrEqualTo(String value) {
            addCriterion("phone_icon >=", value, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconLessThan(String value) {
            addCriterion("phone_icon <", value, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconLessThanOrEqualTo(String value) {
            addCriterion("phone_icon <=", value, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconLike(String value) {
            addCriterion("phone_icon like", value, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconNotLike(String value) {
            addCriterion("phone_icon not like", value, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconIn(List<String> values) {
            addCriterion("phone_icon in", values, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconNotIn(List<String> values) {
            addCriterion("phone_icon not in", values, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconBetween(String value1, String value2) {
            addCriterion("phone_icon between", value1, value2, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andPhoneIconNotBetween(String value1, String value2) {
            addCriterion("phone_icon not between", value1, value2, "phoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconIsNull() {
            addCriterion("not_phone_icon is null");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconIsNotNull() {
            addCriterion("not_phone_icon is not null");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconEqualTo(String value) {
            addCriterion("not_phone_icon =", value, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconNotEqualTo(String value) {
            addCriterion("not_phone_icon <>", value, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconGreaterThan(String value) {
            addCriterion("not_phone_icon >", value, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconGreaterThanOrEqualTo(String value) {
            addCriterion("not_phone_icon >=", value, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconLessThan(String value) {
            addCriterion("not_phone_icon <", value, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconLessThanOrEqualTo(String value) {
            addCriterion("not_phone_icon <=", value, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconLike(String value) {
            addCriterion("not_phone_icon like", value, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconNotLike(String value) {
            addCriterion("not_phone_icon not like", value, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconIn(List<String> values) {
            addCriterion("not_phone_icon in", values, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconNotIn(List<String> values) {
            addCriterion("not_phone_icon not in", values, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconBetween(String value1, String value2) {
            addCriterion("not_phone_icon between", value1, value2, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andNotPhoneIconNotBetween(String value1, String value2) {
            addCriterion("not_phone_icon not between", value1, value2, "notPhoneIcon");
            return (Criteria) this;
        }

        public Criteria andSortingIsNull() {
            addCriterion("sorting is null");
            return (Criteria) this;
        }

        public Criteria andSortingIsNotNull() {
            addCriterion("sorting is not null");
            return (Criteria) this;
        }

        public Criteria andSortingEqualTo(Integer value) {
            addCriterion("sorting =", value, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingNotEqualTo(Integer value) {
            addCriterion("sorting <>", value, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingGreaterThan(Integer value) {
            addCriterion("sorting >", value, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingGreaterThanOrEqualTo(Integer value) {
            addCriterion("sorting >=", value, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingLessThan(Integer value) {
            addCriterion("sorting <", value, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingLessThanOrEqualTo(Integer value) {
            addCriterion("sorting <=", value, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingIn(List<Integer> values) {
            addCriterion("sorting in", values, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingNotIn(List<Integer> values) {
            addCriterion("sorting not in", values, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingBetween(Integer value1, Integer value2) {
            addCriterion("sorting between", value1, value2, "sorting");
            return (Criteria) this;
        }

        public Criteria andSortingNotBetween(Integer value1, Integer value2) {
            addCriterion("sorting not between", value1, value2, "sorting");
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