package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PaymentWithdrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentWithdrawExample() {
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

        public Criteria andTopIdIsNull() {
            addCriterion("top_id is null");
            return (Criteria) this;
        }

        public Criteria andTopIdIsNotNull() {
            addCriterion("top_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopIdEqualTo(Integer value) {
            addCriterion("top_id =", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotEqualTo(Integer value) {
            addCriterion("top_id <>", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdGreaterThan(Integer value) {
            addCriterion("top_id >", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_id >=", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLessThan(Integer value) {
            addCriterion("top_id <", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLessThanOrEqualTo(Integer value) {
            addCriterion("top_id <=", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdIn(List<Integer> values) {
            addCriterion("top_id in", values, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotIn(List<Integer> values) {
            addCriterion("top_id not in", values, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdBetween(Integer value1, Integer value2) {
            addCriterion("top_id between", value1, value2, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("top_id not between", value1, value2, "topId");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeIsNull() {
            addCriterion("up_three_grade is null");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeIsNotNull() {
            addCriterion("up_three_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeEqualTo(String value) {
            addCriterion("up_three_grade =", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeNotEqualTo(String value) {
            addCriterion("up_three_grade <>", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeGreaterThan(String value) {
            addCriterion("up_three_grade >", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeGreaterThanOrEqualTo(String value) {
            addCriterion("up_three_grade >=", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeLessThan(String value) {
            addCriterion("up_three_grade <", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeLessThanOrEqualTo(String value) {
            addCriterion("up_three_grade <=", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeLike(String value) {
            addCriterion("up_three_grade like", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeNotLike(String value) {
            addCriterion("up_three_grade not like", value, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeIn(List<String> values) {
            addCriterion("up_three_grade in", values, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeNotIn(List<String> values) {
            addCriterion("up_three_grade not in", values, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeBetween(String value1, String value2) {
            addCriterion("up_three_grade between", value1, value2, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andUpThreeGradeNotBetween(String value1, String value2) {
            addCriterion("up_three_grade not between", value1, value2, "upThreeGrade");
            return (Criteria) this;
        }

        public Criteria andTakeAmountIsNull() {
            addCriterion("take_amount is null");
            return (Criteria) this;
        }

        public Criteria andTakeAmountIsNotNull() {
            addCriterion("take_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTakeAmountEqualTo(BigDecimal value) {
            addCriterion("take_amount =", value, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountNotEqualTo(BigDecimal value) {
            addCriterion("take_amount <>", value, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountGreaterThan(BigDecimal value) {
            addCriterion("take_amount >", value, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("take_amount >=", value, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountLessThan(BigDecimal value) {
            addCriterion("take_amount <", value, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("take_amount <=", value, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountIn(List<BigDecimal> values) {
            addCriterion("take_amount in", values, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountNotIn(List<BigDecimal> values) {
            addCriterion("take_amount not in", values, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("take_amount between", value1, value2, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andTakeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("take_amount not between", value1, value2, "takeAmount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsTakeIsNull() {
            addCriterion("is_take is null");
            return (Criteria) this;
        }

        public Criteria andIsTakeIsNotNull() {
            addCriterion("is_take is not null");
            return (Criteria) this;
        }

        public Criteria andIsTakeEqualTo(Byte value) {
            addCriterion("is_take =", value, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeNotEqualTo(Byte value) {
            addCriterion("is_take <>", value, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeGreaterThan(Byte value) {
            addCriterion("is_take >", value, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_take >=", value, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeLessThan(Byte value) {
            addCriterion("is_take <", value, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeLessThanOrEqualTo(Byte value) {
            addCriterion("is_take <=", value, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeIn(List<Byte> values) {
            addCriterion("is_take in", values, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeNotIn(List<Byte> values) {
            addCriterion("is_take not in", values, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeBetween(Byte value1, Byte value2) {
            addCriterion("is_take between", value1, value2, "isTake");
            return (Criteria) this;
        }

        public Criteria andIsTakeNotBetween(Byte value1, Byte value2) {
            addCriterion("is_take not between", value1, value2, "isTake");
            return (Criteria) this;
        }

        public Criteria andTakeTimeIsNull() {
            addCriterion("take_time is null");
            return (Criteria) this;
        }

        public Criteria andTakeTimeIsNotNull() {
            addCriterion("take_time is not null");
            return (Criteria) this;
        }

        public Criteria andTakeTimeEqualTo(String value) {
            addCriterion("take_time =", value, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeNotEqualTo(String value) {
            addCriterion("take_time <>", value, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeGreaterThan(String value) {
            addCriterion("take_time >", value, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("take_time >=", value, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeLessThan(String value) {
            addCriterion("take_time <", value, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeLessThanOrEqualTo(String value) {
            addCriterion("take_time <=", value, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeLike(String value) {
            addCriterion("take_time like", value, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeNotLike(String value) {
            addCriterion("take_time not like", value, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeIn(List<String> values) {
            addCriterion("take_time in", values, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeNotIn(List<String> values) {
            addCriterion("take_time not in", values, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeBetween(String value1, String value2) {
            addCriterion("take_time between", value1, value2, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeTimeNotBetween(String value1, String value2) {
            addCriterion("take_time not between", value1, value2, "takeTime");
            return (Criteria) this;
        }

        public Criteria andTakeIpIsNull() {
            addCriterion("take_ip is null");
            return (Criteria) this;
        }

        public Criteria andTakeIpIsNotNull() {
            addCriterion("take_ip is not null");
            return (Criteria) this;
        }

        public Criteria andTakeIpEqualTo(String value) {
            addCriterion("take_ip =", value, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpNotEqualTo(String value) {
            addCriterion("take_ip <>", value, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpGreaterThan(String value) {
            addCriterion("take_ip >", value, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpGreaterThanOrEqualTo(String value) {
            addCriterion("take_ip >=", value, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpLessThan(String value) {
            addCriterion("take_ip <", value, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpLessThanOrEqualTo(String value) {
            addCriterion("take_ip <=", value, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpLike(String value) {
            addCriterion("take_ip like", value, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpNotLike(String value) {
            addCriterion("take_ip not like", value, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpIn(List<String> values) {
            addCriterion("take_ip in", values, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpNotIn(List<String> values) {
            addCriterion("take_ip not in", values, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpBetween(String value1, String value2) {
            addCriterion("take_ip between", value1, value2, "takeIp");
            return (Criteria) this;
        }

        public Criteria andTakeIpNotBetween(String value1, String value2) {
            addCriterion("take_ip not between", value1, value2, "takeIp");
            return (Criteria) this;
        }

        public Criteria andActionAdminIsNull() {
            addCriterion("action_admin is null");
            return (Criteria) this;
        }

        public Criteria andActionAdminIsNotNull() {
            addCriterion("action_admin is not null");
            return (Criteria) this;
        }

        public Criteria andActionAdminEqualTo(String value) {
            addCriterion("action_admin =", value, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminNotEqualTo(String value) {
            addCriterion("action_admin <>", value, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminGreaterThan(String value) {
            addCriterion("action_admin >", value, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminGreaterThanOrEqualTo(String value) {
            addCriterion("action_admin >=", value, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminLessThan(String value) {
            addCriterion("action_admin <", value, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminLessThanOrEqualTo(String value) {
            addCriterion("action_admin <=", value, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminLike(String value) {
            addCriterion("action_admin like", value, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminNotLike(String value) {
            addCriterion("action_admin not like", value, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminIn(List<String> values) {
            addCriterion("action_admin in", values, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminNotIn(List<String> values) {
            addCriterion("action_admin not in", values, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminBetween(String value1, String value2) {
            addCriterion("action_admin between", value1, value2, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andActionAdminNotBetween(String value1, String value2) {
            addCriterion("action_admin not between", value1, value2, "actionAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminIsNull() {
            addCriterion("check_admin is null");
            return (Criteria) this;
        }

        public Criteria andCheckAdminIsNotNull() {
            addCriterion("check_admin is not null");
            return (Criteria) this;
        }

        public Criteria andCheckAdminEqualTo(String value) {
            addCriterion("check_admin =", value, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminNotEqualTo(String value) {
            addCriterion("check_admin <>", value, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminGreaterThan(String value) {
            addCriterion("check_admin >", value, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminGreaterThanOrEqualTo(String value) {
            addCriterion("check_admin >=", value, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminLessThan(String value) {
            addCriterion("check_admin <", value, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminLessThanOrEqualTo(String value) {
            addCriterion("check_admin <=", value, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminLike(String value) {
            addCriterion("check_admin like", value, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminNotLike(String value) {
            addCriterion("check_admin not like", value, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminIn(List<String> values) {
            addCriterion("check_admin in", values, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminNotIn(List<String> values) {
            addCriterion("check_admin not in", values, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminBetween(String value1, String value2) {
            addCriterion("check_admin between", value1, value2, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andCheckAdminNotBetween(String value1, String value2) {
            addCriterion("check_admin not between", value1, value2, "checkAdmin");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Boolean value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Boolean value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Boolean value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Boolean value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Boolean> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Boolean> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Integer value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Integer value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Integer value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Integer value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Integer value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Integer> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Integer> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Integer value1, Integer value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andAfterAmountIsNull() {
            addCriterion("after_amount is null");
            return (Criteria) this;
        }

        public Criteria andAfterAmountIsNotNull() {
            addCriterion("after_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAfterAmountEqualTo(BigDecimal value) {
            addCriterion("after_amount =", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountNotEqualTo(BigDecimal value) {
            addCriterion("after_amount <>", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountGreaterThan(BigDecimal value) {
            addCriterion("after_amount >", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("after_amount >=", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountLessThan(BigDecimal value) {
            addCriterion("after_amount <", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("after_amount <=", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountIn(List<BigDecimal> values) {
            addCriterion("after_amount in", values, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountNotIn(List<BigDecimal> values) {
            addCriterion("after_amount not in", values, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_amount between", value1, value2, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_amount not between", value1, value2, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountIsNull() {
            addCriterion("before_amount is null");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountIsNotNull() {
            addCriterion("before_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountEqualTo(BigDecimal value) {
            addCriterion("before_amount =", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountNotEqualTo(BigDecimal value) {
            addCriterion("before_amount <>", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountGreaterThan(BigDecimal value) {
            addCriterion("before_amount >", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_amount >=", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountLessThan(BigDecimal value) {
            addCriterion("before_amount <", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_amount <=", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountIn(List<BigDecimal> values) {
            addCriterion("before_amount in", values, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountNotIn(List<BigDecimal> values) {
            addCriterion("before_amount not in", values, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_amount between", value1, value2, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_amount not between", value1, value2, "beforeAmount");
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

        public Criteria andIsReadIsNull() {
            addCriterion("is_read is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("is_read is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(Boolean value) {
            addCriterion("is_read =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(Boolean value) {
            addCriterion("is_read <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(Boolean value) {
            addCriterion("is_read >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_read >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(Boolean value) {
            addCriterion("is_read <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(Boolean value) {
            addCriterion("is_read <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<Boolean> values) {
            addCriterion("is_read in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<Boolean> values) {
            addCriterion("is_read not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(Boolean value1, Boolean value2) {
            addCriterion("is_read between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_read not between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andOrdernotesIsNull() {
            addCriterion("ordernotes is null");
            return (Criteria) this;
        }

        public Criteria andOrdernotesIsNotNull() {
            addCriterion("ordernotes is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernotesEqualTo(String value) {
            addCriterion("ordernotes =", value, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesNotEqualTo(String value) {
            addCriterion("ordernotes <>", value, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesGreaterThan(String value) {
            addCriterion("ordernotes >", value, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesGreaterThanOrEqualTo(String value) {
            addCriterion("ordernotes >=", value, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesLessThan(String value) {
            addCriterion("ordernotes <", value, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesLessThanOrEqualTo(String value) {
            addCriterion("ordernotes <=", value, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesLike(String value) {
            addCriterion("ordernotes like", value, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesNotLike(String value) {
            addCriterion("ordernotes not like", value, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesIn(List<String> values) {
            addCriterion("ordernotes in", values, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesNotIn(List<String> values) {
            addCriterion("ordernotes not in", values, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesBetween(String value1, String value2) {
            addCriterion("ordernotes between", value1, value2, "ordernotes");
            return (Criteria) this;
        }

        public Criteria andOrdernotesNotBetween(String value1, String value2) {
            addCriterion("ordernotes not between", value1, value2, "ordernotes");
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

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
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