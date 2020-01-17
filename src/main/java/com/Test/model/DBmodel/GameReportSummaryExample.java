package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GameReportSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameReportSummaryExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Byte value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Byte value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Byte value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Byte value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Byte value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Byte value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Byte> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Byte> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Byte value1, Byte value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Byte value1, Byte value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andBelongDateIsNull() {
            addCriterion("belong_date is null");
            return (Criteria) this;
        }

        public Criteria andBelongDateIsNotNull() {
            addCriterion("belong_date is not null");
            return (Criteria) this;
        }

        public Criteria andBelongDateEqualTo(Date value) {
            addCriterionForJDBCDate("belong_date =", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("belong_date <>", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateGreaterThan(Date value) {
            addCriterionForJDBCDate("belong_date >", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("belong_date >=", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateLessThan(Date value) {
            addCriterionForJDBCDate("belong_date <", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("belong_date <=", value, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateIn(List<Date> values) {
            addCriterionForJDBCDate("belong_date in", values, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("belong_date not in", values, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("belong_date between", value1, value2, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBelongDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("belong_date not between", value1, value2, "belongDate");
            return (Criteria) this;
        }

        public Criteria andBetAmountIsNull() {
            addCriterion("bet_amount is null");
            return (Criteria) this;
        }

        public Criteria andBetAmountIsNotNull() {
            addCriterion("bet_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBetAmountEqualTo(BigDecimal value) {
            addCriterion("bet_amount =", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotEqualTo(BigDecimal value) {
            addCriterion("bet_amount <>", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountGreaterThan(BigDecimal value) {
            addCriterion("bet_amount >", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bet_amount >=", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountLessThan(BigDecimal value) {
            addCriterion("bet_amount <", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bet_amount <=", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountIn(List<BigDecimal> values) {
            addCriterion("bet_amount in", values, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotIn(List<BigDecimal> values) {
            addCriterion("bet_amount not in", values, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet_amount between", value1, value2, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet_amount not between", value1, value2, "betAmount");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(BigDecimal value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(BigDecimal value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(BigDecimal value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(BigDecimal value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<BigDecimal> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<BigDecimal> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountIsNull() {
            addCriterion("total_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountIsNotNull() {
            addCriterion("total_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountEqualTo(BigDecimal value) {
            addCriterion("total_rebate_amount =", value, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_rebate_amount <>", value, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("total_rebate_amount >", value, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_rebate_amount >=", value, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountLessThan(BigDecimal value) {
            addCriterion("total_rebate_amount <", value, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_rebate_amount <=", value, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountIn(List<BigDecimal> values) {
            addCriterion("total_rebate_amount in", values, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_rebate_amount not in", values, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_rebate_amount between", value1, value2, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_rebate_amount not between", value1, value2, "totalRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountIsNull() {
            addCriterion("total_top_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountIsNotNull() {
            addCriterion("total_top_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountEqualTo(BigDecimal value) {
            addCriterion("total_top_rebate_amount =", value, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_top_rebate_amount <>", value, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("total_top_rebate_amount >", value, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_top_rebate_amount >=", value, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountLessThan(BigDecimal value) {
            addCriterion("total_top_rebate_amount <", value, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_top_rebate_amount <=", value, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountIn(List<BigDecimal> values) {
            addCriterion("total_top_rebate_amount in", values, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_top_rebate_amount not in", values, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_top_rebate_amount between", value1, value2, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTopRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_top_rebate_amount not between", value1, value2, "totalTopRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountIsNull() {
            addCriterion("total_primary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountIsNotNull() {
            addCriterion("total_primary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("total_primary_rebate_amount =", value, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_primary_rebate_amount <>", value, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("total_primary_rebate_amount >", value, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_primary_rebate_amount >=", value, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("total_primary_rebate_amount <", value, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_primary_rebate_amount <=", value, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("total_primary_rebate_amount in", values, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_primary_rebate_amount not in", values, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_primary_rebate_amount between", value1, value2, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPrimaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_primary_rebate_amount not between", value1, value2, "totalPrimaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountIsNull() {
            addCriterion("total_secondary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountIsNotNull() {
            addCriterion("total_secondary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("total_secondary_rebate_amount =", value, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_secondary_rebate_amount <>", value, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("total_secondary_rebate_amount >", value, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_secondary_rebate_amount >=", value, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("total_secondary_rebate_amount <", value, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_secondary_rebate_amount <=", value, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("total_secondary_rebate_amount in", values, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_secondary_rebate_amount not in", values, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_secondary_rebate_amount between", value1, value2, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalSecondaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_secondary_rebate_amount not between", value1, value2, "totalSecondaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountIsNull() {
            addCriterion("total_tertiary_rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountIsNotNull() {
            addCriterion("total_tertiary_rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountEqualTo(BigDecimal value) {
            addCriterion("total_tertiary_rebate_amount =", value, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_tertiary_rebate_amount <>", value, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("total_tertiary_rebate_amount >", value, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_tertiary_rebate_amount >=", value, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountLessThan(BigDecimal value) {
            addCriterion("total_tertiary_rebate_amount <", value, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_tertiary_rebate_amount <=", value, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountIn(List<BigDecimal> values) {
            addCriterion("total_tertiary_rebate_amount in", values, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_tertiary_rebate_amount not in", values, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_tertiary_rebate_amount between", value1, value2, "totalTertiaryRebateAmount");
            return (Criteria) this;
        }

        public Criteria andTotalTertiaryRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_tertiary_rebate_amount not between", value1, value2, "totalTertiaryRebateAmount");
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

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
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