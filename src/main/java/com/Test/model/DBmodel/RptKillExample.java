package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RptKillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RptKillExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCzidIsNull() {
            addCriterion("czid is null");
            return (Criteria) this;
        }

        public Criteria andCzidIsNotNull() {
            addCriterion("czid is not null");
            return (Criteria) this;
        }

        public Criteria andCzidEqualTo(Integer value) {
            addCriterion("czid =", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotEqualTo(Integer value) {
            addCriterion("czid <>", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidGreaterThan(Integer value) {
            addCriterion("czid >", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("czid >=", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidLessThan(Integer value) {
            addCriterion("czid <", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidLessThanOrEqualTo(Integer value) {
            addCriterion("czid <=", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidIn(List<Integer> values) {
            addCriterion("czid in", values, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotIn(List<Integer> values) {
            addCriterion("czid not in", values, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidBetween(Integer value1, Integer value2) {
            addCriterion("czid between", value1, value2, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotBetween(Integer value1, Integer value2) {
            addCriterion("czid not between", value1, value2, "czid");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRentalIsNull() {
            addCriterion("rental is null");
            return (Criteria) this;
        }

        public Criteria andRentalIsNotNull() {
            addCriterion("rental is not null");
            return (Criteria) this;
        }

        public Criteria andRentalEqualTo(BigDecimal value) {
            addCriterion("rental =", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotEqualTo(BigDecimal value) {
            addCriterion("rental <>", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalGreaterThan(BigDecimal value) {
            addCriterion("rental >", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rental >=", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLessThan(BigDecimal value) {
            addCriterion("rental <", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rental <=", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalIn(List<BigDecimal> values) {
            addCriterion("rental in", values, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotIn(List<BigDecimal> values) {
            addCriterion("rental not in", values, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rental between", value1, value2, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rental not between", value1, value2, "rental");
            return (Criteria) this;
        }

        public Criteria andColorrentalIsNull() {
            addCriterion("colorrental is null");
            return (Criteria) this;
        }

        public Criteria andColorrentalIsNotNull() {
            addCriterion("colorrental is not null");
            return (Criteria) this;
        }

        public Criteria andColorrentalEqualTo(BigDecimal value) {
            addCriterion("colorrental =", value, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalNotEqualTo(BigDecimal value) {
            addCriterion("colorrental <>", value, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalGreaterThan(BigDecimal value) {
            addCriterion("colorrental >", value, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("colorrental >=", value, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalLessThan(BigDecimal value) {
            addCriterion("colorrental <", value, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("colorrental <=", value, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalIn(List<BigDecimal> values) {
            addCriterion("colorrental in", values, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalNotIn(List<BigDecimal> values) {
            addCriterion("colorrental not in", values, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("colorrental between", value1, value2, "colorrental");
            return (Criteria) this;
        }

        public Criteria andColorrentalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("colorrental not between", value1, value2, "colorrental");
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