package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameBbinUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameBbinUsersExample() {
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

        public Criteria andBbinUsernameIsNull() {
            addCriterion("bbin_username is null");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameIsNotNull() {
            addCriterion("bbin_username is not null");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameEqualTo(String value) {
            addCriterion("bbin_username =", value, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameNotEqualTo(String value) {
            addCriterion("bbin_username <>", value, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameGreaterThan(String value) {
            addCriterion("bbin_username >", value, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("bbin_username >=", value, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameLessThan(String value) {
            addCriterion("bbin_username <", value, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameLessThanOrEqualTo(String value) {
            addCriterion("bbin_username <=", value, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameLike(String value) {
            addCriterion("bbin_username like", value, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameNotLike(String value) {
            addCriterion("bbin_username not like", value, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameIn(List<String> values) {
            addCriterion("bbin_username in", values, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameNotIn(List<String> values) {
            addCriterion("bbin_username not in", values, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameBetween(String value1, String value2) {
            addCriterion("bbin_username between", value1, value2, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinUsernameNotBetween(String value1, String value2) {
            addCriterion("bbin_username not between", value1, value2, "bbinUsername");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordIsNull() {
            addCriterion("bbin_password is null");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordIsNotNull() {
            addCriterion("bbin_password is not null");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordEqualTo(String value) {
            addCriterion("bbin_password =", value, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordNotEqualTo(String value) {
            addCriterion("bbin_password <>", value, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordGreaterThan(String value) {
            addCriterion("bbin_password >", value, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("bbin_password >=", value, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordLessThan(String value) {
            addCriterion("bbin_password <", value, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordLessThanOrEqualTo(String value) {
            addCriterion("bbin_password <=", value, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordLike(String value) {
            addCriterion("bbin_password like", value, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordNotLike(String value) {
            addCriterion("bbin_password not like", value, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordIn(List<String> values) {
            addCriterion("bbin_password in", values, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordNotIn(List<String> values) {
            addCriterion("bbin_password not in", values, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordBetween(String value1, String value2) {
            addCriterion("bbin_password between", value1, value2, "bbinPassword");
            return (Criteria) this;
        }

        public Criteria andBbinPasswordNotBetween(String value1, String value2) {
            addCriterion("bbin_password not between", value1, value2, "bbinPassword");
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

        public Criteria andRegisteredTimeIsNull() {
            addCriterion("registered_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeIsNotNull() {
            addCriterion("registered_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeEqualTo(Date value) {
            addCriterion("registered_time =", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeNotEqualTo(Date value) {
            addCriterion("registered_time <>", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeGreaterThan(Date value) {
            addCriterion("registered_time >", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registered_time >=", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeLessThan(Date value) {
            addCriterion("registered_time <", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeLessThanOrEqualTo(Date value) {
            addCriterion("registered_time <=", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeIn(List<Date> values) {
            addCriterion("registered_time in", values, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeNotIn(List<Date> values) {
            addCriterion("registered_time not in", values, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeBetween(Date value1, Date value2) {
            addCriterion("registered_time between", value1, value2, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeNotBetween(Date value1, Date value2) {
            addCriterion("registered_time not between", value1, value2, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
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