package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LotteryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryExample() {
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

        public Criteria andLotteryNameIsNull() {
            addCriterion("lottery_name is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIsNotNull() {
            addCriterion("lottery_name is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameEqualTo(String value) {
            addCriterion("lottery_name =", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotEqualTo(String value) {
            addCriterion("lottery_name <>", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThan(String value) {
            addCriterion("lottery_name >", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_name >=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThan(String value) {
            addCriterion("lottery_name <", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThanOrEqualTo(String value) {
            addCriterion("lottery_name <=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLike(String value) {
            addCriterion("lottery_name like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotLike(String value) {
            addCriterion("lottery_name not like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIn(List<String> values) {
            addCriterion("lottery_name in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotIn(List<String> values) {
            addCriterion("lottery_name not in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameBetween(String value1, String value2) {
            addCriterion("lottery_name between", value1, value2, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotBetween(String value1, String value2) {
            addCriterion("lottery_name not between", value1, value2, "lotteryName");
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

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andNumDayIsNull() {
            addCriterion("num_day is null");
            return (Criteria) this;
        }

        public Criteria andNumDayIsNotNull() {
            addCriterion("num_day is not null");
            return (Criteria) this;
        }

        public Criteria andNumDayEqualTo(String value) {
            addCriterion("num_day =", value, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayNotEqualTo(String value) {
            addCriterion("num_day <>", value, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayGreaterThan(String value) {
            addCriterion("num_day >", value, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayGreaterThanOrEqualTo(String value) {
            addCriterion("num_day >=", value, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayLessThan(String value) {
            addCriterion("num_day <", value, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayLessThanOrEqualTo(String value) {
            addCriterion("num_day <=", value, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayLike(String value) {
            addCriterion("num_day like", value, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayNotLike(String value) {
            addCriterion("num_day not like", value, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayIn(List<String> values) {
            addCriterion("num_day in", values, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayNotIn(List<String> values) {
            addCriterion("num_day not in", values, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayBetween(String value1, String value2) {
            addCriterion("num_day between", value1, value2, "numDay");
            return (Criteria) this;
        }

        public Criteria andNumDayNotBetween(String value1, String value2) {
            addCriterion("num_day not between", value1, value2, "numDay");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Integer value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Integer value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Integer value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Integer value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Integer> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Integer> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Integer value1, Integer value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeIsNull() {
            addCriterion("judge_expired_time is null");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeIsNotNull() {
            addCriterion("judge_expired_time is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeEqualTo(Integer value) {
            addCriterion("judge_expired_time =", value, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeNotEqualTo(Integer value) {
            addCriterion("judge_expired_time <>", value, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeGreaterThan(Integer value) {
            addCriterion("judge_expired_time >", value, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_expired_time >=", value, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeLessThan(Integer value) {
            addCriterion("judge_expired_time <", value, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeLessThanOrEqualTo(Integer value) {
            addCriterion("judge_expired_time <=", value, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeIn(List<Integer> values) {
            addCriterion("judge_expired_time in", values, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeNotIn(List<Integer> values) {
            addCriterion("judge_expired_time not in", values, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeBetween(Integer value1, Integer value2) {
            addCriterion("judge_expired_time between", value1, value2, "judgeExpiredTime");
            return (Criteria) this;
        }

        public Criteria andJudgeExpiredTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("judge_expired_time not between", value1, value2, "judgeExpiredTime");
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

        public Criteria andSortEqualTo(Byte value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Byte value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Byte value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Byte value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Byte value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Byte> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Byte> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Byte value1, Byte value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Byte value1, Byte value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andHallRecommendIsNull() {
            addCriterion("hall_recommend is null");
            return (Criteria) this;
        }

        public Criteria andHallRecommendIsNotNull() {
            addCriterion("hall_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andHallRecommendEqualTo(Byte value) {
            addCriterion("hall_recommend =", value, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendNotEqualTo(Byte value) {
            addCriterion("hall_recommend <>", value, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendGreaterThan(Byte value) {
            addCriterion("hall_recommend >", value, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("hall_recommend >=", value, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendLessThan(Byte value) {
            addCriterion("hall_recommend <", value, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendLessThanOrEqualTo(Byte value) {
            addCriterion("hall_recommend <=", value, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendIn(List<Byte> values) {
            addCriterion("hall_recommend in", values, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendNotIn(List<Byte> values) {
            addCriterion("hall_recommend not in", values, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendBetween(Byte value1, Byte value2) {
            addCriterion("hall_recommend between", value1, value2, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andHallRecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("hall_recommend not between", value1, value2, "hallRecommend");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(int value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Boolean value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Boolean value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Boolean value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Boolean> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Boolean> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIsNull() {
            addCriterion("lottery_type is null");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIsNotNull() {
            addCriterion("lottery_type is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeEqualTo(Boolean value) {
            addCriterion("lottery_type =", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNotEqualTo(Boolean value) {
            addCriterion("lottery_type <>", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeGreaterThan(Boolean value) {
            addCriterion("lottery_type >", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lottery_type >=", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeLessThan(Boolean value) {
            addCriterion("lottery_type <", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("lottery_type <=", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIn(List<Boolean> values) {
            addCriterion("lottery_type in", values, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNotIn(List<Boolean> values) {
            addCriterion("lottery_type not in", values, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("lottery_type between", value1, value2, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lottery_type not between", value1, value2, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdIsNull() {
            addCriterion("initial_class_id is null");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdIsNotNull() {
            addCriterion("initial_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdEqualTo(Integer value) {
            addCriterion("initial_class_id =", value, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdNotEqualTo(Integer value) {
            addCriterion("initial_class_id <>", value, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdGreaterThan(Integer value) {
            addCriterion("initial_class_id >", value, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("initial_class_id >=", value, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdLessThan(Integer value) {
            addCriterion("initial_class_id <", value, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("initial_class_id <=", value, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdIn(List<Integer> values) {
            addCriterion("initial_class_id in", values, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdNotIn(List<Integer> values) {
            addCriterion("initial_class_id not in", values, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdBetween(Integer value1, Integer value2) {
            addCriterion("initial_class_id between", value1, value2, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andInitialClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("initial_class_id not between", value1, value2, "initialClassId");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andKillIsNull() {
            addCriterion("kill is null");
            return (Criteria) this;
        }

        public Criteria andKillIsNotNull() {
            addCriterion("kill is not null");
            return (Criteria) this;
        }

        public Criteria andKillEqualTo(BigDecimal value) {
            addCriterion("kill =", value, "kill");
            return (Criteria) this;
        }

        public Criteria andKillNotEqualTo(BigDecimal value) {
            addCriterion("kill <>", value, "kill");
            return (Criteria) this;
        }

        public Criteria andKillGreaterThan(BigDecimal value) {
            addCriterion("kill >", value, "kill");
            return (Criteria) this;
        }

        public Criteria andKillGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kill >=", value, "kill");
            return (Criteria) this;
        }

        public Criteria andKillLessThan(BigDecimal value) {
            addCriterion("kill <", value, "kill");
            return (Criteria) this;
        }

        public Criteria andKillLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kill <=", value, "kill");
            return (Criteria) this;
        }

        public Criteria andKillIn(List<BigDecimal> values) {
            addCriterion("kill in", values, "kill");
            return (Criteria) this;
        }

        public Criteria andKillNotIn(List<BigDecimal> values) {
            addCriterion("kill not in", values, "kill");
            return (Criteria) this;
        }

        public Criteria andKillBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kill between", value1, value2, "kill");
            return (Criteria) this;
        }

        public Criteria andKillNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kill not between", value1, value2, "kill");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeIsNull() {
            addCriterion("across_day_time is null");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeIsNotNull() {
            addCriterion("across_day_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeEqualTo(String value) {
            addCriterion("across_day_time =", value, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeNotEqualTo(String value) {
            addCriterion("across_day_time <>", value, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeGreaterThan(String value) {
            addCriterion("across_day_time >", value, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("across_day_time >=", value, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeLessThan(String value) {
            addCriterion("across_day_time <", value, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeLessThanOrEqualTo(String value) {
            addCriterion("across_day_time <=", value, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeLike(String value) {
            addCriterion("across_day_time like", value, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeNotLike(String value) {
            addCriterion("across_day_time not like", value, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeIn(List<String> values) {
            addCriterion("across_day_time in", values, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeNotIn(List<String> values) {
            addCriterion("across_day_time not in", values, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeBetween(String value1, String value2) {
            addCriterion("across_day_time between", value1, value2, "acrossDayTime");
            return (Criteria) this;
        }

        public Criteria andAcrossDayTimeNotBetween(String value1, String value2) {
            addCriterion("across_day_time not between", value1, value2, "acrossDayTime");
            return (Criteria) this;
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

        public Criteria andIsSelfOpenIsNull() {
            addCriterion("is_self_open is null");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenIsNotNull() {
            addCriterion("is_self_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenEqualTo(Integer value) {
            addCriterion("is_self_open =", value, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenNotEqualTo(Integer value) {
            addCriterion("is_self_open <>", value, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenGreaterThan(Integer value) {
            addCriterion("is_self_open >", value, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_self_open >=", value, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenLessThan(Integer value) {
            addCriterion("is_self_open <", value, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenLessThanOrEqualTo(Integer value) {
            addCriterion("is_self_open <=", value, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenIn(List<Integer> values) {
            addCriterion("is_self_open in", values, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenNotIn(List<Integer> values) {
            addCriterion("is_self_open not in", values, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenBetween(Integer value1, Integer value2) {
            addCriterion("is_self_open between", value1, value2, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andIsSelfOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("is_self_open not between", value1, value2, "isSelfOpen");
            return (Criteria) this;
        }

        public Criteria andKillOffIsNull() {
            addCriterion("kill_off is null");
            return (Criteria) this;
        }

        public Criteria andKillOffIsNotNull() {
            addCriterion("kill_off is not null");
            return (Criteria) this;
        }

        public Criteria andKillOffEqualTo(Integer value) {
            addCriterion("kill_off =", value, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffNotEqualTo(Integer value) {
            addCriterion("kill_off <>", value, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffGreaterThan(Integer value) {
            addCriterion("kill_off >", value, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffGreaterThanOrEqualTo(Integer value) {
            addCriterion("kill_off >=", value, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffLessThan(Integer value) {
            addCriterion("kill_off <", value, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffLessThanOrEqualTo(Integer value) {
            addCriterion("kill_off <=", value, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffIn(List<Integer> values) {
            addCriterion("kill_off in", values, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffNotIn(List<Integer> values) {
            addCriterion("kill_off not in", values, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffBetween(Integer value1, Integer value2) {
            addCriterion("kill_off between", value1, value2, "killOff");
            return (Criteria) this;
        }

        public Criteria andKillOffNotBetween(Integer value1, Integer value2) {
            addCriterion("kill_off not between", value1, value2, "killOff");
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