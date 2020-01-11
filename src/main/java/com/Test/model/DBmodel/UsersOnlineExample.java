package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersOnlineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersOnlineExample() {
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

        public Criteria andOnlineIdIsNull() {
            addCriterion("online_id is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIdIsNotNull() {
            addCriterion("online_id is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineIdEqualTo(Integer value) {
            addCriterion("online_id =", value, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdNotEqualTo(Integer value) {
            addCriterion("online_id <>", value, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdGreaterThan(Integer value) {
            addCriterion("online_id >", value, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_id >=", value, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdLessThan(Integer value) {
            addCriterion("online_id <", value, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("online_id <=", value, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdIn(List<Integer> values) {
            addCriterion("online_id in", values, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdNotIn(List<Integer> values) {
            addCriterion("online_id not in", values, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdBetween(Integer value1, Integer value2) {
            addCriterion("online_id between", value1, value2, "onlineId");
            return (Criteria) this;
        }

        public Criteria andOnlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("online_id not between", value1, value2, "onlineId");
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

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andTimeLingtIsNull() {
            addCriterion("time_lingt is null");
            return (Criteria) this;
        }

        public Criteria andTimeLingtIsNotNull() {
            addCriterion("time_lingt is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLingtEqualTo(Integer value) {
            addCriterion("time_lingt =", value, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtNotEqualTo(Integer value) {
            addCriterion("time_lingt <>", value, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtGreaterThan(Integer value) {
            addCriterion("time_lingt >", value, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_lingt >=", value, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtLessThan(Integer value) {
            addCriterion("time_lingt <", value, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtLessThanOrEqualTo(Integer value) {
            addCriterion("time_lingt <=", value, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtIn(List<Integer> values) {
            addCriterion("time_lingt in", values, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtNotIn(List<Integer> values) {
            addCriterion("time_lingt not in", values, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtBetween(Integer value1, Integer value2) {
            addCriterion("time_lingt between", value1, value2, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andTimeLingtNotBetween(Integer value1, Integer value2) {
            addCriterion("time_lingt not between", value1, value2, "timeLingt");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginUrlIsNull() {
            addCriterion("login_url is null");
            return (Criteria) this;
        }

        public Criteria andLoginUrlIsNotNull() {
            addCriterion("login_url is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUrlEqualTo(String value) {
            addCriterion("login_url =", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlNotEqualTo(String value) {
            addCriterion("login_url <>", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlGreaterThan(String value) {
            addCriterion("login_url >", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlGreaterThanOrEqualTo(String value) {
            addCriterion("login_url >=", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlLessThan(String value) {
            addCriterion("login_url <", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlLessThanOrEqualTo(String value) {
            addCriterion("login_url <=", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlLike(String value) {
            addCriterion("login_url like", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlNotLike(String value) {
            addCriterion("login_url not like", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlIn(List<String> values) {
            addCriterion("login_url in", values, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlNotIn(List<String> values) {
            addCriterion("login_url not in", values, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlBetween(String value1, String value2) {
            addCriterion("login_url between", value1, value2, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlNotBetween(String value1, String value2) {
            addCriterion("login_url not between", value1, value2, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginFromIsNull() {
            addCriterion("login_from is null");
            return (Criteria) this;
        }

        public Criteria andLoginFromIsNotNull() {
            addCriterion("login_from is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFromEqualTo(Byte value) {
            addCriterion("login_from =", value, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromNotEqualTo(Byte value) {
            addCriterion("login_from <>", value, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromGreaterThan(Byte value) {
            addCriterion("login_from >", value, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromGreaterThanOrEqualTo(Byte value) {
            addCriterion("login_from >=", value, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromLessThan(Byte value) {
            addCriterion("login_from <", value, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromLessThanOrEqualTo(Byte value) {
            addCriterion("login_from <=", value, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromIn(List<Byte> values) {
            addCriterion("login_from in", values, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromNotIn(List<Byte> values) {
            addCriterion("login_from not in", values, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromBetween(Byte value1, Byte value2) {
            addCriterion("login_from between", value1, value2, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andLoginFromNotBetween(Byte value1, Byte value2) {
            addCriterion("login_from not between", value1, value2, "loginFrom");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
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