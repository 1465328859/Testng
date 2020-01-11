package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.List;

public class LotteryMethodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryMethodsExample() {
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

        public Criteria andMethodsIdIsNull() {
            addCriterion("methods_id is null");
            return (Criteria) this;
        }

        public Criteria andMethodsIdIsNotNull() {
            addCriterion("methods_id is not null");
            return (Criteria) this;
        }

        public Criteria andMethodsIdEqualTo(Integer value) {
            addCriterion("methods_id =", value, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdNotEqualTo(Integer value) {
            addCriterion("methods_id <>", value, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdGreaterThan(Integer value) {
            addCriterion("methods_id >", value, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("methods_id >=", value, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdLessThan(Integer value) {
            addCriterion("methods_id <", value, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("methods_id <=", value, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdIn(List<Integer> values) {
            addCriterion("methods_id in", values, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdNotIn(List<Integer> values) {
            addCriterion("methods_id not in", values, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdBetween(Integer value1, Integer value2) {
            addCriterion("methods_id between", value1, value2, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("methods_id not between", value1, value2, "methodsId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdIsNull() {
            addCriterion("methods_group_id is null");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdIsNotNull() {
            addCriterion("methods_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdEqualTo(Integer value) {
            addCriterion("methods_group_id =", value, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdNotEqualTo(Integer value) {
            addCriterion("methods_group_id <>", value, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdGreaterThan(Integer value) {
            addCriterion("methods_group_id >", value, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("methods_group_id >=", value, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdLessThan(Integer value) {
            addCriterion("methods_group_id <", value, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("methods_group_id <=", value, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdIn(List<Integer> values) {
            addCriterion("methods_group_id in", values, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdNotIn(List<Integer> values) {
            addCriterion("methods_group_id not in", values, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("methods_group_id between", value1, value2, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMethodsGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("methods_group_id not between", value1, value2, "methodsGroupId");
            return (Criteria) this;
        }

        public Criteria andMinGroupIsNull() {
            addCriterion("min_group is null");
            return (Criteria) this;
        }

        public Criteria andMinGroupIsNotNull() {
            addCriterion("min_group is not null");
            return (Criteria) this;
        }

        public Criteria andMinGroupEqualTo(String value) {
            addCriterion("min_group =", value, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupNotEqualTo(String value) {
            addCriterion("min_group <>", value, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupGreaterThan(String value) {
            addCriterion("min_group >", value, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupGreaterThanOrEqualTo(String value) {
            addCriterion("min_group >=", value, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupLessThan(String value) {
            addCriterion("min_group <", value, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupLessThanOrEqualTo(String value) {
            addCriterion("min_group <=", value, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupLike(String value) {
            addCriterion("min_group like", value, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupNotLike(String value) {
            addCriterion("min_group not like", value, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupIn(List<String> values) {
            addCriterion("min_group in", values, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupNotIn(List<String> values) {
            addCriterion("min_group not in", values, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupBetween(String value1, String value2) {
            addCriterion("min_group between", value1, value2, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMinGroupNotBetween(String value1, String value2) {
            addCriterion("min_group not between", value1, value2, "minGroup");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("method_name is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("method_name is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("method_name =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("method_name <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("method_name >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("method_name >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("method_name <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("method_name <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("method_name like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("method_name not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("method_name in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("method_name not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("method_name between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("method_name not between", value1, value2, "methodName");
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

        public Criteria andNameAbIsNull() {
            addCriterion("name_ab is null");
            return (Criteria) this;
        }

        public Criteria andNameAbIsNotNull() {
            addCriterion("name_ab is not null");
            return (Criteria) this;
        }

        public Criteria andNameAbEqualTo(String value) {
            addCriterion("name_ab =", value, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbNotEqualTo(String value) {
            addCriterion("name_ab <>", value, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbGreaterThan(String value) {
            addCriterion("name_ab >", value, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbGreaterThanOrEqualTo(String value) {
            addCriterion("name_ab >=", value, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbLessThan(String value) {
            addCriterion("name_ab <", value, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbLessThanOrEqualTo(String value) {
            addCriterion("name_ab <=", value, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbLike(String value) {
            addCriterion("name_ab like", value, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbNotLike(String value) {
            addCriterion("name_ab not like", value, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbIn(List<String> values) {
            addCriterion("name_ab in", values, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbNotIn(List<String> values) {
            addCriterion("name_ab not in", values, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbBetween(String value1, String value2) {
            addCriterion("name_ab between", value1, value2, "nameAb");
            return (Criteria) this;
        }

        public Criteria andNameAbNotBetween(String value1, String value2) {
            addCriterion("name_ab not between", value1, value2, "nameAb");
            return (Criteria) this;
        }

        public Criteria andMinNumIsNull() {
            addCriterion("min_num is null");
            return (Criteria) this;
        }

        public Criteria andMinNumIsNotNull() {
            addCriterion("min_num is not null");
            return (Criteria) this;
        }

        public Criteria andMinNumEqualTo(Integer value) {
            addCriterion("min_num =", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotEqualTo(Integer value) {
            addCriterion("min_num <>", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumGreaterThan(Integer value) {
            addCriterion("min_num >", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_num >=", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumLessThan(Integer value) {
            addCriterion("min_num <", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumLessThanOrEqualTo(Integer value) {
            addCriterion("min_num <=", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumIn(List<Integer> values) {
            addCriterion("min_num in", values, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotIn(List<Integer> values) {
            addCriterion("min_num not in", values, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumBetween(Integer value1, Integer value2) {
            addCriterion("min_num between", value1, value2, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotBetween(Integer value1, Integer value2) {
            addCriterion("min_num not between", value1, value2, "minNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNull() {
            addCriterion("max_num is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNotNull() {
            addCriterion("max_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumEqualTo(Integer value) {
            addCriterion("max_num =", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotEqualTo(Integer value) {
            addCriterion("max_num <>", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThan(Integer value) {
            addCriterion("max_num >", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_num >=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThan(Integer value) {
            addCriterion("max_num <", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThanOrEqualTo(Integer value) {
            addCriterion("max_num <=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumIn(List<Integer> values) {
            addCriterion("max_num in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotIn(List<Integer> values) {
            addCriterion("max_num not in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumBetween(Integer value1, Integer value2) {
            addCriterion("max_num between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("max_num not between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(Boolean value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(Boolean value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(Boolean value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(Boolean value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(Boolean value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<Boolean> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<Boolean> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(Boolean value1, Boolean value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyIsNull() {
            addCriterion("max_money is null");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyIsNotNull() {
            addCriterion("max_money is not null");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyEqualTo(Integer value) {
            addCriterion("max_money =", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyNotEqualTo(Integer value) {
            addCriterion("max_money <>", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyGreaterThan(Integer value) {
            addCriterion("max_money >", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_money >=", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyLessThan(Integer value) {
            addCriterion("max_money <", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("max_money <=", value, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyIn(List<Integer> values) {
            addCriterion("max_money in", values, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyNotIn(List<Integer> values) {
            addCriterion("max_money not in", values, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyBetween(Integer value1, Integer value2) {
            addCriterion("max_money between", value1, value2, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andMaxMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("max_money not between", value1, value2, "maxMoney");
            return (Criteria) this;
        }

        public Criteria andDigitIsNull() {
            addCriterion("digit is null");
            return (Criteria) this;
        }

        public Criteria andDigitIsNotNull() {
            addCriterion("digit is not null");
            return (Criteria) this;
        }

        public Criteria andDigitEqualTo(String value) {
            addCriterion("digit =", value, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitNotEqualTo(String value) {
            addCriterion("digit <>", value, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitGreaterThan(String value) {
            addCriterion("digit >", value, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitGreaterThanOrEqualTo(String value) {
            addCriterion("digit >=", value, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitLessThan(String value) {
            addCriterion("digit <", value, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitLessThanOrEqualTo(String value) {
            addCriterion("digit <=", value, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitLike(String value) {
            addCriterion("digit like", value, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitNotLike(String value) {
            addCriterion("digit not like", value, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitIn(List<String> values) {
            addCriterion("digit in", values, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitNotIn(List<String> values) {
            addCriterion("digit not in", values, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitBetween(String value1, String value2) {
            addCriterion("digit between", value1, value2, "digit");
            return (Criteria) this;
        }

        public Criteria andDigitNotBetween(String value1, String value2) {
            addCriterion("digit not between", value1, value2, "digit");
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

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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