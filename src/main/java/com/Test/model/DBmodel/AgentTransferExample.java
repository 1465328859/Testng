package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgentTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentTransferExample() {
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

        public Criteria andOriginalParentIdIsNull() {
            addCriterion("original_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdIsNotNull() {
            addCriterion("original_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdEqualTo(Integer value) {
            addCriterion("original_parent_id =", value, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdNotEqualTo(Integer value) {
            addCriterion("original_parent_id <>", value, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdGreaterThan(Integer value) {
            addCriterion("original_parent_id >", value, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_parent_id >=", value, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdLessThan(Integer value) {
            addCriterion("original_parent_id <", value, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("original_parent_id <=", value, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdIn(List<Integer> values) {
            addCriterion("original_parent_id in", values, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdNotIn(List<Integer> values) {
            addCriterion("original_parent_id not in", values, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdBetween(Integer value1, Integer value2) {
            addCriterion("original_parent_id between", value1, value2, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("original_parent_id not between", value1, value2, "originalParentId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameIsNull() {
            addCriterion("original_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameIsNotNull() {
            addCriterion("original_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameEqualTo(String value) {
            addCriterion("original_parent_name =", value, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameNotEqualTo(String value) {
            addCriterion("original_parent_name <>", value, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameGreaterThan(String value) {
            addCriterion("original_parent_name >", value, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("original_parent_name >=", value, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameLessThan(String value) {
            addCriterion("original_parent_name <", value, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameLessThanOrEqualTo(String value) {
            addCriterion("original_parent_name <=", value, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameLike(String value) {
            addCriterion("original_parent_name like", value, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameNotLike(String value) {
            addCriterion("original_parent_name not like", value, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameIn(List<String> values) {
            addCriterion("original_parent_name in", values, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameNotIn(List<String> values) {
            addCriterion("original_parent_name not in", values, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameBetween(String value1, String value2) {
            addCriterion("original_parent_name between", value1, value2, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andOriginalParentNameNotBetween(String value1, String value2) {
            addCriterion("original_parent_name not between", value1, value2, "originalParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentIdIsNull() {
            addCriterion("now_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andNowParentIdIsNotNull() {
            addCriterion("now_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andNowParentIdEqualTo(Integer value) {
            addCriterion("now_parent_id =", value, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdNotEqualTo(Integer value) {
            addCriterion("now_parent_id <>", value, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdGreaterThan(Integer value) {
            addCriterion("now_parent_id >", value, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_parent_id >=", value, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdLessThan(Integer value) {
            addCriterion("now_parent_id <", value, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("now_parent_id <=", value, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdIn(List<Integer> values) {
            addCriterion("now_parent_id in", values, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdNotIn(List<Integer> values) {
            addCriterion("now_parent_id not in", values, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdBetween(Integer value1, Integer value2) {
            addCriterion("now_parent_id between", value1, value2, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("now_parent_id not between", value1, value2, "nowParentId");
            return (Criteria) this;
        }

        public Criteria andNowParentNameIsNull() {
            addCriterion("now_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andNowParentNameIsNotNull() {
            addCriterion("now_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andNowParentNameEqualTo(String value) {
            addCriterion("now_parent_name =", value, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameNotEqualTo(String value) {
            addCriterion("now_parent_name <>", value, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameGreaterThan(String value) {
            addCriterion("now_parent_name >", value, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("now_parent_name >=", value, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameLessThan(String value) {
            addCriterion("now_parent_name <", value, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameLessThanOrEqualTo(String value) {
            addCriterion("now_parent_name <=", value, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameLike(String value) {
            addCriterion("now_parent_name like", value, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameNotLike(String value) {
            addCriterion("now_parent_name not like", value, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameIn(List<String> values) {
            addCriterion("now_parent_name in", values, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameNotIn(List<String> values) {
            addCriterion("now_parent_name not in", values, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameBetween(String value1, String value2) {
            addCriterion("now_parent_name between", value1, value2, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andNowParentNameNotBetween(String value1, String value2) {
            addCriterion("now_parent_name not between", value1, value2, "nowParentName");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdIsNull() {
            addCriterion("original_top_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdIsNotNull() {
            addCriterion("original_top_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdEqualTo(Integer value) {
            addCriterion("original_top_id =", value, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdNotEqualTo(Integer value) {
            addCriterion("original_top_id <>", value, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdGreaterThan(Integer value) {
            addCriterion("original_top_id >", value, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_top_id >=", value, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdLessThan(Integer value) {
            addCriterion("original_top_id <", value, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdLessThanOrEqualTo(Integer value) {
            addCriterion("original_top_id <=", value, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdIn(List<Integer> values) {
            addCriterion("original_top_id in", values, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdNotIn(List<Integer> values) {
            addCriterion("original_top_id not in", values, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdBetween(Integer value1, Integer value2) {
            addCriterion("original_top_id between", value1, value2, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("original_top_id not between", value1, value2, "originalTopId");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameIsNull() {
            addCriterion("original_top_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameIsNotNull() {
            addCriterion("original_top_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameEqualTo(String value) {
            addCriterion("original_top_name =", value, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameNotEqualTo(String value) {
            addCriterion("original_top_name <>", value, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameGreaterThan(String value) {
            addCriterion("original_top_name >", value, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameGreaterThanOrEqualTo(String value) {
            addCriterion("original_top_name >=", value, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameLessThan(String value) {
            addCriterion("original_top_name <", value, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameLessThanOrEqualTo(String value) {
            addCriterion("original_top_name <=", value, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameLike(String value) {
            addCriterion("original_top_name like", value, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameNotLike(String value) {
            addCriterion("original_top_name not like", value, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameIn(List<String> values) {
            addCriterion("original_top_name in", values, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameNotIn(List<String> values) {
            addCriterion("original_top_name not in", values, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameBetween(String value1, String value2) {
            addCriterion("original_top_name between", value1, value2, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andOriginalTopNameNotBetween(String value1, String value2) {
            addCriterion("original_top_name not between", value1, value2, "originalTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopIdIsNull() {
            addCriterion("now_top_id is null");
            return (Criteria) this;
        }

        public Criteria andNowTopIdIsNotNull() {
            addCriterion("now_top_id is not null");
            return (Criteria) this;
        }

        public Criteria andNowTopIdEqualTo(Integer value) {
            addCriterion("now_top_id =", value, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdNotEqualTo(Integer value) {
            addCriterion("now_top_id <>", value, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdGreaterThan(Integer value) {
            addCriterion("now_top_id >", value, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_top_id >=", value, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdLessThan(Integer value) {
            addCriterion("now_top_id <", value, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdLessThanOrEqualTo(Integer value) {
            addCriterion("now_top_id <=", value, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdIn(List<Integer> values) {
            addCriterion("now_top_id in", values, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdNotIn(List<Integer> values) {
            addCriterion("now_top_id not in", values, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdBetween(Integer value1, Integer value2) {
            addCriterion("now_top_id between", value1, value2, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("now_top_id not between", value1, value2, "nowTopId");
            return (Criteria) this;
        }

        public Criteria andNowTopNameIsNull() {
            addCriterion("now_top_name is null");
            return (Criteria) this;
        }

        public Criteria andNowTopNameIsNotNull() {
            addCriterion("now_top_name is not null");
            return (Criteria) this;
        }

        public Criteria andNowTopNameEqualTo(String value) {
            addCriterion("now_top_name =", value, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameNotEqualTo(String value) {
            addCriterion("now_top_name <>", value, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameGreaterThan(String value) {
            addCriterion("now_top_name >", value, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameGreaterThanOrEqualTo(String value) {
            addCriterion("now_top_name >=", value, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameLessThan(String value) {
            addCriterion("now_top_name <", value, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameLessThanOrEqualTo(String value) {
            addCriterion("now_top_name <=", value, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameLike(String value) {
            addCriterion("now_top_name like", value, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameNotLike(String value) {
            addCriterion("now_top_name not like", value, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameIn(List<String> values) {
            addCriterion("now_top_name in", values, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameNotIn(List<String> values) {
            addCriterion("now_top_name not in", values, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameBetween(String value1, String value2) {
            addCriterion("now_top_name between", value1, value2, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andNowTopNameNotBetween(String value1, String value2) {
            addCriterion("now_top_name not between", value1, value2, "nowTopName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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