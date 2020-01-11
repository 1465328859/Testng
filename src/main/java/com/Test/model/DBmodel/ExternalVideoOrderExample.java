package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExternalVideoOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExternalVideoOrderExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productid like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productid not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andTranIdIsNull() {
            addCriterion("tran_id is null");
            return (Criteria) this;
        }

        public Criteria andTranIdIsNotNull() {
            addCriterion("tran_id is not null");
            return (Criteria) this;
        }

        public Criteria andTranIdEqualTo(String value) {
            addCriterion("tran_id =", value, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdNotEqualTo(String value) {
            addCriterion("tran_id <>", value, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdGreaterThan(String value) {
            addCriterion("tran_id >", value, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdGreaterThanOrEqualTo(String value) {
            addCriterion("tran_id >=", value, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdLessThan(String value) {
            addCriterion("tran_id <", value, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdLessThanOrEqualTo(String value) {
            addCriterion("tran_id <=", value, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdLike(String value) {
            addCriterion("tran_id like", value, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdNotLike(String value) {
            addCriterion("tran_id not like", value, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdIn(List<String> values) {
            addCriterion("tran_id in", values, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdNotIn(List<String> values) {
            addCriterion("tran_id not in", values, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdBetween(String value1, String value2) {
            addCriterion("tran_id between", value1, value2, "tranId");
            return (Criteria) this;
        }

        public Criteria andTranIdNotBetween(String value1, String value2) {
            addCriterion("tran_id not between", value1, value2, "tranId");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("login_id like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("login_id not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
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

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
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

        public Criteria andTablecodeIsNull() {
            addCriterion("tablecode is null");
            return (Criteria) this;
        }

        public Criteria andTablecodeIsNotNull() {
            addCriterion("tablecode is not null");
            return (Criteria) this;
        }

        public Criteria andTablecodeEqualTo(String value) {
            addCriterion("tablecode =", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeNotEqualTo(String value) {
            addCriterion("tablecode <>", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeGreaterThan(String value) {
            addCriterion("tablecode >", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeGreaterThanOrEqualTo(String value) {
            addCriterion("tablecode >=", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeLessThan(String value) {
            addCriterion("tablecode <", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeLessThanOrEqualTo(String value) {
            addCriterion("tablecode <=", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeLike(String value) {
            addCriterion("tablecode like", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeNotLike(String value) {
            addCriterion("tablecode not like", value, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeIn(List<String> values) {
            addCriterion("tablecode in", values, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeNotIn(List<String> values) {
            addCriterion("tablecode not in", values, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeBetween(String value1, String value2) {
            addCriterion("tablecode between", value1, value2, "tablecode");
            return (Criteria) this;
        }

        public Criteria andTablecodeNotBetween(String value1, String value2) {
            addCriterion("tablecode not between", value1, value2, "tablecode");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeIsNull() {
            addCriterion("flatfrom_type is null");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeIsNotNull() {
            addCriterion("flatfrom_type is not null");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeEqualTo(String value) {
            addCriterion("flatfrom_type =", value, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeNotEqualTo(String value) {
            addCriterion("flatfrom_type <>", value, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeGreaterThan(String value) {
            addCriterion("flatfrom_type >", value, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("flatfrom_type >=", value, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeLessThan(String value) {
            addCriterion("flatfrom_type <", value, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeLessThanOrEqualTo(String value) {
            addCriterion("flatfrom_type <=", value, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeLike(String value) {
            addCriterion("flatfrom_type like", value, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeNotLike(String value) {
            addCriterion("flatfrom_type not like", value, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeIn(List<String> values) {
            addCriterion("flatfrom_type in", values, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeNotIn(List<String> values) {
            addCriterion("flatfrom_type not in", values, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeBetween(String value1, String value2) {
            addCriterion("flatfrom_type between", value1, value2, "flatfromType");
            return (Criteria) this;
        }

        public Criteria andFlatfromTypeNotBetween(String value1, String value2) {
            addCriterion("flatfrom_type not between", value1, value2, "flatfromType");
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

        public Criteria andBeforCreditIsNull() {
            addCriterion("befor_credit is null");
            return (Criteria) this;
        }

        public Criteria andBeforCreditIsNotNull() {
            addCriterion("befor_credit is not null");
            return (Criteria) this;
        }

        public Criteria andBeforCreditEqualTo(Float value) {
            addCriterion("befor_credit =", value, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditNotEqualTo(Float value) {
            addCriterion("befor_credit <>", value, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditGreaterThan(Float value) {
            addCriterion("befor_credit >", value, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("befor_credit >=", value, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditLessThan(Float value) {
            addCriterion("befor_credit <", value, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditLessThanOrEqualTo(Float value) {
            addCriterion("befor_credit <=", value, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditIn(List<Float> values) {
            addCriterion("befor_credit in", values, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditNotIn(List<Float> values) {
            addCriterion("befor_credit not in", values, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditBetween(Float value1, Float value2) {
            addCriterion("befor_credit between", value1, value2, "beforCredit");
            return (Criteria) this;
        }

        public Criteria andBeforCreditNotBetween(Float value1, Float value2) {
            addCriterion("befor_credit not between", value1, value2, "beforCredit");
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalIsNull() {
            addCriterion("order_status_original is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalIsNotNull() {
            addCriterion("order_status_original is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalEqualTo(Integer value) {
            addCriterion("order_status_original =", value, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalNotEqualTo(Integer value) {
            addCriterion("order_status_original <>", value, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalGreaterThan(Integer value) {
            addCriterion("order_status_original >", value, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status_original >=", value, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalLessThan(Integer value) {
            addCriterion("order_status_original <", value, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalLessThanOrEqualTo(Integer value) {
            addCriterion("order_status_original <=", value, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalIn(List<Integer> values) {
            addCriterion("order_status_original in", values, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalNotIn(List<Integer> values) {
            addCriterion("order_status_original not in", values, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalBetween(Integer value1, Integer value2) {
            addCriterion("order_status_original between", value1, value2, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOriginalNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status_original not between", value1, value2, "orderStatusOriginal");
            return (Criteria) this;
        }

        public Criteria andBAmountIsNull() {
            addCriterion("b_amount is null");
            return (Criteria) this;
        }

        public Criteria andBAmountIsNotNull() {
            addCriterion("b_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBAmountEqualTo(Float value) {
            addCriterion("b_amount =", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountNotEqualTo(Float value) {
            addCriterion("b_amount <>", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountGreaterThan(Float value) {
            addCriterion("b_amount >", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("b_amount >=", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountLessThan(Float value) {
            addCriterion("b_amount <", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountLessThanOrEqualTo(Float value) {
            addCriterion("b_amount <=", value, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountIn(List<Float> values) {
            addCriterion("b_amount in", values, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountNotIn(List<Float> values) {
            addCriterion("b_amount not in", values, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountBetween(Float value1, Float value2) {
            addCriterion("b_amount between", value1, value2, "bAmount");
            return (Criteria) this;
        }

        public Criteria andBAmountNotBetween(Float value1, Float value2) {
            addCriterion("b_amount not between", value1, value2, "bAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountIsNull() {
            addCriterion("a_amount is null");
            return (Criteria) this;
        }

        public Criteria andAAmountIsNotNull() {
            addCriterion("a_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAAmountEqualTo(Float value) {
            addCriterion("a_amount =", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotEqualTo(Float value) {
            addCriterion("a_amount <>", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountGreaterThan(Float value) {
            addCriterion("a_amount >", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("a_amount >=", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountLessThan(Float value) {
            addCriterion("a_amount <", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountLessThanOrEqualTo(Float value) {
            addCriterion("a_amount <=", value, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountIn(List<Float> values) {
            addCriterion("a_amount in", values, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotIn(List<Float> values) {
            addCriterion("a_amount not in", values, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountBetween(Float value1, Float value2) {
            addCriterion("a_amount between", value1, value2, "aAmount");
            return (Criteria) this;
        }

        public Criteria andAAmountNotBetween(Float value1, Float value2) {
            addCriterion("a_amount not between", value1, value2, "aAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNull() {
            addCriterion("order_from is null");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNotNull() {
            addCriterion("order_from is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFromEqualTo(Integer value) {
            addCriterion("order_from =", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotEqualTo(Integer value) {
            addCriterion("order_from <>", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThan(Integer value) {
            addCriterion("order_from >", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_from >=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThan(Integer value) {
            addCriterion("order_from <", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThanOrEqualTo(Integer value) {
            addCriterion("order_from <=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromIn(List<Integer> values) {
            addCriterion("order_from in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotIn(List<Integer> values) {
            addCriterion("order_from not in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromBetween(Integer value1, Integer value2) {
            addCriterion("order_from between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotBetween(Integer value1, Integer value2) {
            addCriterion("order_from not between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Integer value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Integer value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Integer value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Integer value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Integer value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Integer> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Integer> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Integer value1, Integer value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andReckontimeIsNull() {
            addCriterion("reckontime is null");
            return (Criteria) this;
        }

        public Criteria andReckontimeIsNotNull() {
            addCriterion("reckontime is not null");
            return (Criteria) this;
        }

        public Criteria andReckontimeEqualTo(Date value) {
            addCriterion("reckontime =", value, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeNotEqualTo(Date value) {
            addCriterion("reckontime <>", value, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeGreaterThan(Date value) {
            addCriterion("reckontime >", value, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reckontime >=", value, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeLessThan(Date value) {
            addCriterion("reckontime <", value, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeLessThanOrEqualTo(Date value) {
            addCriterion("reckontime <=", value, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeIn(List<Date> values) {
            addCriterion("reckontime in", values, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeNotIn(List<Date> values) {
            addCriterion("reckontime not in", values, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeBetween(Date value1, Date value2) {
            addCriterion("reckontime between", value1, value2, "reckontime");
            return (Criteria) this;
        }

        public Criteria andReckontimeNotBetween(Date value1, Date value2) {
            addCriterion("reckontime not between", value1, value2, "reckontime");
            return (Criteria) this;
        }

        public Criteria andFromIpIsNull() {
            addCriterion("from_ip is null");
            return (Criteria) this;
        }

        public Criteria andFromIpIsNotNull() {
            addCriterion("from_ip is not null");
            return (Criteria) this;
        }

        public Criteria andFromIpEqualTo(String value) {
            addCriterion("from_ip =", value, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpNotEqualTo(String value) {
            addCriterion("from_ip <>", value, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpGreaterThan(String value) {
            addCriterion("from_ip >", value, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpGreaterThanOrEqualTo(String value) {
            addCriterion("from_ip >=", value, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpLessThan(String value) {
            addCriterion("from_ip <", value, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpLessThanOrEqualTo(String value) {
            addCriterion("from_ip <=", value, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpLike(String value) {
            addCriterion("from_ip like", value, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpNotLike(String value) {
            addCriterion("from_ip not like", value, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpIn(List<String> values) {
            addCriterion("from_ip in", values, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpNotIn(List<String> values) {
            addCriterion("from_ip not in", values, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpBetween(String value1, String value2) {
            addCriterion("from_ip between", value1, value2, "fromIp");
            return (Criteria) this;
        }

        public Criteria andFromIpNotBetween(String value1, String value2) {
            addCriterion("from_ip not between", value1, value2, "fromIp");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNull() {
            addCriterion("issue_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNotNull() {
            addCriterion("issue_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueIdEqualTo(String value) {
            addCriterion("issue_id =", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotEqualTo(String value) {
            addCriterion("issue_id <>", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThan(String value) {
            addCriterion("issue_id >", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThanOrEqualTo(String value) {
            addCriterion("issue_id >=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThan(String value) {
            addCriterion("issue_id <", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThanOrEqualTo(String value) {
            addCriterion("issue_id <=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLike(String value) {
            addCriterion("issue_id like", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotLike(String value) {
            addCriterion("issue_id not like", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdIn(List<String> values) {
            addCriterion("issue_id in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotIn(List<String> values) {
            addCriterion("issue_id not in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdBetween(String value1, String value2) {
            addCriterion("issue_id between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotBetween(String value1, String value2) {
            addCriterion("issue_id not between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andPlayIdIsNull() {
            addCriterion("play_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayIdIsNotNull() {
            addCriterion("play_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayIdEqualTo(String value) {
            addCriterion("play_id =", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotEqualTo(String value) {
            addCriterion("play_id <>", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdGreaterThan(String value) {
            addCriterion("play_id >", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdGreaterThanOrEqualTo(String value) {
            addCriterion("play_id >=", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdLessThan(String value) {
            addCriterion("play_id <", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdLessThanOrEqualTo(String value) {
            addCriterion("play_id <=", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdLike(String value) {
            addCriterion("play_id like", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotLike(String value) {
            addCriterion("play_id not like", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdIn(List<String> values) {
            addCriterion("play_id in", values, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotIn(List<String> values) {
            addCriterion("play_id not in", values, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdBetween(String value1, String value2) {
            addCriterion("play_id between", value1, value2, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotBetween(String value1, String value2) {
            addCriterion("play_id not between", value1, value2, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayNameIsNull() {
            addCriterion("play_name is null");
            return (Criteria) this;
        }

        public Criteria andPlayNameIsNotNull() {
            addCriterion("play_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlayNameEqualTo(String value) {
            addCriterion("play_name =", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotEqualTo(String value) {
            addCriterion("play_name <>", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameGreaterThan(String value) {
            addCriterion("play_name >", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameGreaterThanOrEqualTo(String value) {
            addCriterion("play_name >=", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLessThan(String value) {
            addCriterion("play_name <", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLessThanOrEqualTo(String value) {
            addCriterion("play_name <=", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameLike(String value) {
            addCriterion("play_name like", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotLike(String value) {
            addCriterion("play_name not like", value, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameIn(List<String> values) {
            addCriterion("play_name in", values, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotIn(List<String> values) {
            addCriterion("play_name not in", values, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameBetween(String value1, String value2) {
            addCriterion("play_name between", value1, value2, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameNotBetween(String value1, String value2) {
            addCriterion("play_name not between", value1, value2, "playName");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnIsNull() {
            addCriterion("play_name_en is null");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnIsNotNull() {
            addCriterion("play_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnEqualTo(String value) {
            addCriterion("play_name_en =", value, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnNotEqualTo(String value) {
            addCriterion("play_name_en <>", value, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnGreaterThan(String value) {
            addCriterion("play_name_en >", value, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("play_name_en >=", value, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnLessThan(String value) {
            addCriterion("play_name_en <", value, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnLessThanOrEqualTo(String value) {
            addCriterion("play_name_en <=", value, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnLike(String value) {
            addCriterion("play_name_en like", value, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnNotLike(String value) {
            addCriterion("play_name_en not like", value, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnIn(List<String> values) {
            addCriterion("play_name_en in", values, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnNotIn(List<String> values) {
            addCriterion("play_name_en not in", values, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnBetween(String value1, String value2) {
            addCriterion("play_name_en between", value1, value2, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andPlayNameEnNotBetween(String value1, String value2) {
            addCriterion("play_name_en not between", value1, value2, "playNameEn");
            return (Criteria) this;
        }

        public Criteria andValidBetIsNull() {
            addCriterion("valid_bet is null");
            return (Criteria) this;
        }

        public Criteria andValidBetIsNotNull() {
            addCriterion("valid_bet is not null");
            return (Criteria) this;
        }

        public Criteria andValidBetEqualTo(Float value) {
            addCriterion("valid_bet =", value, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetNotEqualTo(Float value) {
            addCriterion("valid_bet <>", value, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetGreaterThan(Float value) {
            addCriterion("valid_bet >", value, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetGreaterThanOrEqualTo(Float value) {
            addCriterion("valid_bet >=", value, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetLessThan(Float value) {
            addCriterion("valid_bet <", value, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetLessThanOrEqualTo(Float value) {
            addCriterion("valid_bet <=", value, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetIn(List<Float> values) {
            addCriterion("valid_bet in", values, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetNotIn(List<Float> values) {
            addCriterion("valid_bet not in", values, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetBetween(Float value1, Float value2) {
            addCriterion("valid_bet between", value1, value2, "validBet");
            return (Criteria) this;
        }

        public Criteria andValidBetNotBetween(Float value1, Float value2) {
            addCriterion("valid_bet not between", value1, value2, "validBet");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Float value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Float value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Float value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Float value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Float value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Float value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Float> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Float> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Float value1, Float value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Float value1, Float value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andNoCommIsNull() {
            addCriterion("no_comm is null");
            return (Criteria) this;
        }

        public Criteria andNoCommIsNotNull() {
            addCriterion("no_comm is not null");
            return (Criteria) this;
        }

        public Criteria andNoCommEqualTo(Integer value) {
            addCriterion("no_comm =", value, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommNotEqualTo(Integer value) {
            addCriterion("no_comm <>", value, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommGreaterThan(Integer value) {
            addCriterion("no_comm >", value, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_comm >=", value, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommLessThan(Integer value) {
            addCriterion("no_comm <", value, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommLessThanOrEqualTo(Integer value) {
            addCriterion("no_comm <=", value, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommIn(List<Integer> values) {
            addCriterion("no_comm in", values, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommNotIn(List<Integer> values) {
            addCriterion("no_comm not in", values, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommBetween(Integer value1, Integer value2) {
            addCriterion("no_comm between", value1, value2, "noComm");
            return (Criteria) this;
        }

        public Criteria andNoCommNotBetween(Integer value1, Integer value2) {
            addCriterion("no_comm not between", value1, value2, "noComm");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
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