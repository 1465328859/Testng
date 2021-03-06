package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.List;

public class AgentHostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentHostExample() {
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

        public Criteria andHostIdIsNull() {
            addCriterion("host_id is null");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNotNull() {
            addCriterion("host_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostIdEqualTo(Integer value) {
            addCriterion("host_id =", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotEqualTo(Integer value) {
            addCriterion("host_id <>", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThan(Integer value) {
            addCriterion("host_id >", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_id >=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThan(Integer value) {
            addCriterion("host_id <", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThanOrEqualTo(Integer value) {
            addCriterion("host_id <=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdIn(List<Integer> values) {
            addCriterion("host_id in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotIn(List<Integer> values) {
            addCriterion("host_id not in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdBetween(Integer value1, Integer value2) {
            addCriterion("host_id between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("host_id not between", value1, value2, "hostId");
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

        public Criteria andOfflineRebateIsNull() {
            addCriterion("offline_rebate is null");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateIsNotNull() {
            addCriterion("offline_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateEqualTo(String value) {
            addCriterion("offline_rebate =", value, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateNotEqualTo(String value) {
            addCriterion("offline_rebate <>", value, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateGreaterThan(String value) {
            addCriterion("offline_rebate >", value, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateGreaterThanOrEqualTo(String value) {
            addCriterion("offline_rebate >=", value, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateLessThan(String value) {
            addCriterion("offline_rebate <", value, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateLessThanOrEqualTo(String value) {
            addCriterion("offline_rebate <=", value, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateLike(String value) {
            addCriterion("offline_rebate like", value, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateNotLike(String value) {
            addCriterion("offline_rebate not like", value, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateIn(List<String> values) {
            addCriterion("offline_rebate in", values, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateNotIn(List<String> values) {
            addCriterion("offline_rebate not in", values, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateBetween(String value1, String value2) {
            addCriterion("offline_rebate between", value1, value2, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andOfflineRebateNotBetween(String value1, String value2) {
            addCriterion("offline_rebate not between", value1, value2, "offlineRebate");
            return (Criteria) this;
        }

        public Criteria andProxyDomainIsNull() {
            addCriterion("proxy_domain is null");
            return (Criteria) this;
        }

        public Criteria andProxyDomainIsNotNull() {
            addCriterion("proxy_domain is not null");
            return (Criteria) this;
        }

        public Criteria andProxyDomainEqualTo(String value) {
            addCriterion("proxy_domain =", value, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainNotEqualTo(String value) {
            addCriterion("proxy_domain <>", value, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainGreaterThan(String value) {
            addCriterion("proxy_domain >", value, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainGreaterThanOrEqualTo(String value) {
            addCriterion("proxy_domain >=", value, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainLessThan(String value) {
            addCriterion("proxy_domain <", value, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainLessThanOrEqualTo(String value) {
            addCriterion("proxy_domain <=", value, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainLike(String value) {
            addCriterion("proxy_domain like", value, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainNotLike(String value) {
            addCriterion("proxy_domain not like", value, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainIn(List<String> values) {
            addCriterion("proxy_domain in", values, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainNotIn(List<String> values) {
            addCriterion("proxy_domain not in", values, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainBetween(String value1, String value2) {
            addCriterion("proxy_domain between", value1, value2, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andProxyDomainNotBetween(String value1, String value2) {
            addCriterion("proxy_domain not between", value1, value2, "proxyDomain");
            return (Criteria) this;
        }

        public Criteria andGameSwitchIsNull() {
            addCriterion("game_switch is null");
            return (Criteria) this;
        }

        public Criteria andGameSwitchIsNotNull() {
            addCriterion("game_switch is not null");
            return (Criteria) this;
        }

        public Criteria andGameSwitchEqualTo(String value) {
            addCriterion("game_switch =", value, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchNotEqualTo(String value) {
            addCriterion("game_switch <>", value, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchGreaterThan(String value) {
            addCriterion("game_switch >", value, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("game_switch >=", value, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchLessThan(String value) {
            addCriterion("game_switch <", value, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchLessThanOrEqualTo(String value) {
            addCriterion("game_switch <=", value, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchLike(String value) {
            addCriterion("game_switch like", value, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchNotLike(String value) {
            addCriterion("game_switch not like", value, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchIn(List<String> values) {
            addCriterion("game_switch in", values, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchNotIn(List<String> values) {
            addCriterion("game_switch not in", values, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchBetween(String value1, String value2) {
            addCriterion("game_switch between", value1, value2, "gameSwitch");
            return (Criteria) this;
        }

        public Criteria andGameSwitchNotBetween(String value1, String value2) {
            addCriterion("game_switch not between", value1, value2, "gameSwitch");
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