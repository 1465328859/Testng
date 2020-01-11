package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LotteryIssuesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryIssuesExample() {
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

        public Criteria andLotteryIssuesIdIsNull() {
            addCriterion("lottery_issues_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdIsNotNull() {
            addCriterion("lottery_issues_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdEqualTo(Integer value) {
            addCriterion("lottery_issues_id =", value, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdNotEqualTo(Integer value) {
            addCriterion("lottery_issues_id <>", value, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdGreaterThan(Integer value) {
            addCriterion("lottery_issues_id >", value, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_issues_id >=", value, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdLessThan(Integer value) {
            addCriterion("lottery_issues_id <", value, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdLessThanOrEqualTo(Integer value) {
            addCriterion("lottery_issues_id <=", value, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdIn(List<Integer> values) {
            addCriterion("lottery_issues_id in", values, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdNotIn(List<Integer> values) {
            addCriterion("lottery_issues_id not in", values, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdBetween(Integer value1, Integer value2) {
            addCriterion("lottery_issues_id between", value1, value2, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andLotteryIssuesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_issues_id not between", value1, value2, "lotteryIssuesId");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeIsNull() {
            addCriterion("end_bet_time is null");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeIsNotNull() {
            addCriterion("end_bet_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeEqualTo(Integer value) {
            addCriterion("end_bet_time =", value, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeNotEqualTo(Integer value) {
            addCriterion("end_bet_time <>", value, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeGreaterThan(Integer value) {
            addCriterion("end_bet_time >", value, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_bet_time >=", value, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeLessThan(Integer value) {
            addCriterion("end_bet_time <", value, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_bet_time <=", value, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeIn(List<Integer> values) {
            addCriterion("end_bet_time in", values, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeNotIn(List<Integer> values) {
            addCriterion("end_bet_time not in", values, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_bet_time between", value1, value2, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andEndBetTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_bet_time not between", value1, value2, "endBetTime");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNull() {
            addCriterion("lottery_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("lottery_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(Integer value) {
            addCriterion("lottery_id =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(Integer value) {
            addCriterion("lottery_id <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(Integer value) {
            addCriterion("lottery_id >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_id >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(Integer value) {
            addCriterion("lottery_id <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(Integer value) {
            addCriterion("lottery_id <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<Integer> values) {
            addCriterion("lottery_id in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<Integer> values) {
            addCriterion("lottery_id not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(Integer value1, Integer value2) {
            addCriterion("lottery_id between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_id not between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andPrizeResIsNull() {
            addCriterion("prize_res is null");
            return (Criteria) this;
        }

        public Criteria andPrizeResIsNotNull() {
            addCriterion("prize_res is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeResEqualTo(String value) {
            addCriterion("prize_res =", value, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResNotEqualTo(String value) {
            addCriterion("prize_res <>", value, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResGreaterThan(String value) {
            addCriterion("prize_res >", value, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResGreaterThanOrEqualTo(String value) {
            addCriterion("prize_res >=", value, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResLessThan(String value) {
            addCriterion("prize_res <", value, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResLessThanOrEqualTo(String value) {
            addCriterion("prize_res <=", value, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResLike(String value) {
            addCriterion("prize_res like", value, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResNotLike(String value) {
            addCriterion("prize_res not like", value, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResIn(List<String> values) {
            addCriterion("prize_res in", values, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResNotIn(List<String> values) {
            addCriterion("prize_res not in", values, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResBetween(String value1, String value2) {
            addCriterion("prize_res between", value1, value2, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andPrizeResNotBetween(String value1, String value2) {
            addCriterion("prize_res not between", value1, value2, "prizeRes");
            return (Criteria) this;
        }

        public Criteria andIsBetIsNull() {
            addCriterion("is_bet is null");
            return (Criteria) this;
        }

        public Criteria andIsBetIsNotNull() {
            addCriterion("is_bet is not null");
            return (Criteria) this;
        }

        public Criteria andIsBetEqualTo(Boolean value) {
            addCriterion("is_bet =", value, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetNotEqualTo(Boolean value) {
            addCriterion("is_bet <>", value, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetGreaterThan(Boolean value) {
            addCriterion("is_bet >", value, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_bet >=", value, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetLessThan(Boolean value) {
            addCriterion("is_bet <", value, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetLessThanOrEqualTo(Boolean value) {
            addCriterion("is_bet <=", value, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetIn(List<Boolean> values) {
            addCriterion("is_bet in", values, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetNotIn(List<Boolean> values) {
            addCriterion("is_bet not in", values, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetBetween(Boolean value1, Boolean value2) {
            addCriterion("is_bet between", value1, value2, "isBet");
            return (Criteria) this;
        }

        public Criteria andIsBetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_bet not between", value1, value2, "isBet");
            return (Criteria) this;
        }

        public Criteria andPrePrizeIsNull() {
            addCriterion("pre_prize is null");
            return (Criteria) this;
        }

        public Criteria andPrePrizeIsNotNull() {
            addCriterion("pre_prize is not null");
            return (Criteria) this;
        }

        public Criteria andPrePrizeEqualTo(Boolean value) {
            addCriterion("pre_prize =", value, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeNotEqualTo(Boolean value) {
            addCriterion("pre_prize <>", value, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeGreaterThan(Boolean value) {
            addCriterion("pre_prize >", value, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pre_prize >=", value, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeLessThan(Boolean value) {
            addCriterion("pre_prize <", value, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeLessThanOrEqualTo(Boolean value) {
            addCriterion("pre_prize <=", value, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeIn(List<Boolean> values) {
            addCriterion("pre_prize in", values, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeNotIn(List<Boolean> values) {
            addCriterion("pre_prize not in", values, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeBetween(Boolean value1, Boolean value2) {
            addCriterion("pre_prize between", value1, value2, "prePrize");
            return (Criteria) this;
        }

        public Criteria andPrePrizeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pre_prize not between", value1, value2, "prePrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeIsNull() {
            addCriterion("status_check_prize is null");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeIsNotNull() {
            addCriterion("status_check_prize is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeEqualTo(Boolean value) {
            addCriterion("status_check_prize =", value, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeNotEqualTo(Boolean value) {
            addCriterion("status_check_prize <>", value, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeGreaterThan(Boolean value) {
            addCriterion("status_check_prize >", value, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status_check_prize >=", value, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeLessThan(Boolean value) {
            addCriterion("status_check_prize <", value, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeLessThanOrEqualTo(Boolean value) {
            addCriterion("status_check_prize <=", value, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeIn(List<Boolean> values) {
            addCriterion("status_check_prize in", values, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeNotIn(List<Boolean> values) {
            addCriterion("status_check_prize not in", values, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeBetween(Boolean value1, Boolean value2) {
            addCriterion("status_check_prize between", value1, value2, "statusCheckPrize");
            return (Criteria) this;
        }

        public Criteria andStatusCheckPrizeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status_check_prize not between", value1, value2, "statusCheckPrize");
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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