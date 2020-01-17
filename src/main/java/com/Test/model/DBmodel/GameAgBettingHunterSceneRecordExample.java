package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameAgBettingHunterSceneRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameAgBettingHunterSceneRecordExample() {
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

        public Criteria andBillnoIsNull() {
            addCriterion("billno is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("billno is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("billno =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("billno <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("billno >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("billno >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("billno <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("billno <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("billno like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("billno not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("billno in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("billno not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("billno between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("billno not between", value1, value2, "billno");
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

        public Criteria andRoomidIsNull() {
            addCriterion("roomid is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomid is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomid =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomid <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomid >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomid >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomid <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomid <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomid in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomid not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomid between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomid not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andBetxIsNull() {
            addCriterion("betx is null");
            return (Criteria) this;
        }

        public Criteria andBetxIsNotNull() {
            addCriterion("betx is not null");
            return (Criteria) this;
        }

        public Criteria andBetxEqualTo(Integer value) {
            addCriterion("betx =", value, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxNotEqualTo(Integer value) {
            addCriterion("betx <>", value, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxGreaterThan(Integer value) {
            addCriterion("betx >", value, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxGreaterThanOrEqualTo(Integer value) {
            addCriterion("betx >=", value, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxLessThan(Integer value) {
            addCriterion("betx <", value, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxLessThanOrEqualTo(Integer value) {
            addCriterion("betx <=", value, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxIn(List<Integer> values) {
            addCriterion("betx in", values, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxNotIn(List<Integer> values) {
            addCriterion("betx not in", values, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxBetween(Integer value1, Integer value2) {
            addCriterion("betx between", value1, value2, "betx");
            return (Criteria) this;
        }

        public Criteria andBetxNotBetween(Integer value1, Integer value2) {
            addCriterion("betx not between", value1, value2, "betx");
            return (Criteria) this;
        }

        public Criteria andSceneidIsNull() {
            addCriterion("sceneid is null");
            return (Criteria) this;
        }

        public Criteria andSceneidIsNotNull() {
            addCriterion("sceneid is not null");
            return (Criteria) this;
        }

        public Criteria andSceneidEqualTo(String value) {
            addCriterion("sceneid =", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotEqualTo(String value) {
            addCriterion("sceneid <>", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThan(String value) {
            addCriterion("sceneid >", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThanOrEqualTo(String value) {
            addCriterion("sceneid >=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThan(String value) {
            addCriterion("sceneid <", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThanOrEqualTo(String value) {
            addCriterion("sceneid <=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLike(String value) {
            addCriterion("sceneid like", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotLike(String value) {
            addCriterion("sceneid not like", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidIn(List<String> values) {
            addCriterion("sceneid in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotIn(List<String> values) {
            addCriterion("sceneid not in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidBetween(String value1, String value2) {
            addCriterion("sceneid between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotBetween(String value1, String value2) {
            addCriterion("sceneid not between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeIsNull() {
            addCriterion("billtime is null");
            return (Criteria) this;
        }

        public Criteria andBilltimeIsNotNull() {
            addCriterion("billtime is not null");
            return (Criteria) this;
        }

        public Criteria andBilltimeEqualTo(Date value) {
            addCriterion("billtime =", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotEqualTo(Date value) {
            addCriterion("billtime <>", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeGreaterThan(Date value) {
            addCriterion("billtime >", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("billtime >=", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeLessThan(Date value) {
            addCriterion("billtime <", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeLessThanOrEqualTo(Date value) {
            addCriterion("billtime <=", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeIn(List<Date> values) {
            addCriterion("billtime in", values, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotIn(List<Date> values) {
            addCriterion("billtime not in", values, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeBetween(Date value1, Date value2) {
            addCriterion("billtime between", value1, value2, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotBetween(Date value1, Date value2) {
            addCriterion("billtime not between", value1, value2, "billtime");
            return (Criteria) this;
        }

        public Criteria andGametypeIsNull() {
            addCriterion("gametype is null");
            return (Criteria) this;
        }

        public Criteria andGametypeIsNotNull() {
            addCriterion("gametype is not null");
            return (Criteria) this;
        }

        public Criteria andGametypeEqualTo(String value) {
            addCriterion("gametype =", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotEqualTo(String value) {
            addCriterion("gametype <>", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeGreaterThan(String value) {
            addCriterion("gametype >", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeGreaterThanOrEqualTo(String value) {
            addCriterion("gametype >=", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLessThan(String value) {
            addCriterion("gametype <", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLessThanOrEqualTo(String value) {
            addCriterion("gametype <=", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLike(String value) {
            addCriterion("gametype like", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotLike(String value) {
            addCriterion("gametype not like", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeIn(List<String> values) {
            addCriterion("gametype in", values, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotIn(List<String> values) {
            addCriterion("gametype not in", values, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeBetween(String value1, String value2) {
            addCriterion("gametype between", value1, value2, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotBetween(String value1, String value2) {
            addCriterion("gametype not between", value1, value2, "gametype");
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

        public Criteria andTotalbulletcostIsNull() {
            addCriterion("totalbulletcost is null");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostIsNotNull() {
            addCriterion("totalbulletcost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostEqualTo(BigDecimal value) {
            addCriterion("totalbulletcost =", value, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostNotEqualTo(BigDecimal value) {
            addCriterion("totalbulletcost <>", value, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostGreaterThan(BigDecimal value) {
            addCriterion("totalbulletcost >", value, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalbulletcost >=", value, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostLessThan(BigDecimal value) {
            addCriterion("totalbulletcost <", value, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalbulletcost <=", value, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostIn(List<BigDecimal> values) {
            addCriterion("totalbulletcost in", values, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostNotIn(List<BigDecimal> values) {
            addCriterion("totalbulletcost not in", values, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalbulletcost between", value1, value2, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalbulletcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalbulletcost not between", value1, value2, "totalbulletcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostIsNull() {
            addCriterion("totalfishcost is null");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostIsNotNull() {
            addCriterion("totalfishcost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostEqualTo(BigDecimal value) {
            addCriterion("totalfishcost =", value, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostNotEqualTo(BigDecimal value) {
            addCriterion("totalfishcost <>", value, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostGreaterThan(BigDecimal value) {
            addCriterion("totalfishcost >", value, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfishcost >=", value, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostLessThan(BigDecimal value) {
            addCriterion("totalfishcost <", value, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfishcost <=", value, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostIn(List<BigDecimal> values) {
            addCriterion("totalfishcost in", values, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostNotIn(List<BigDecimal> values) {
            addCriterion("totalfishcost not in", values, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfishcost between", value1, value2, "totalfishcost");
            return (Criteria) this;
        }

        public Criteria andTotalfishcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfishcost not between", value1, value2, "totalfishcost");
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

        public Criteria andTotaljpcontributeIsNull() {
            addCriterion("totaljpcontribute is null");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeIsNotNull() {
            addCriterion("totaljpcontribute is not null");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeEqualTo(BigDecimal value) {
            addCriterion("totaljpcontribute =", value, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeNotEqualTo(BigDecimal value) {
            addCriterion("totaljpcontribute <>", value, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeGreaterThan(BigDecimal value) {
            addCriterion("totaljpcontribute >", value, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totaljpcontribute >=", value, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeLessThan(BigDecimal value) {
            addCriterion("totaljpcontribute <", value, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totaljpcontribute <=", value, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeIn(List<BigDecimal> values) {
            addCriterion("totaljpcontribute in", values, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeNotIn(List<BigDecimal> values) {
            addCriterion("totaljpcontribute not in", values, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totaljpcontribute between", value1, value2, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljpcontributeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totaljpcontribute not between", value1, value2, "totaljpcontribute");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotIsNull() {
            addCriterion("totaljackpot is null");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotIsNotNull() {
            addCriterion("totaljackpot is not null");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotEqualTo(BigDecimal value) {
            addCriterion("totaljackpot =", value, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotNotEqualTo(BigDecimal value) {
            addCriterion("totaljackpot <>", value, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotGreaterThan(BigDecimal value) {
            addCriterion("totaljackpot >", value, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totaljackpot >=", value, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotLessThan(BigDecimal value) {
            addCriterion("totaljackpot <", value, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totaljackpot <=", value, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotIn(List<BigDecimal> values) {
            addCriterion("totaljackpot in", values, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotNotIn(List<BigDecimal> values) {
            addCriterion("totaljackpot not in", values, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totaljackpot between", value1, value2, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotaljackpotNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totaljackpot not between", value1, value2, "totaljackpot");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeIsNull() {
            addCriterion("totalfirstprize is null");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeIsNotNull() {
            addCriterion("totalfirstprize is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeEqualTo(BigDecimal value) {
            addCriterion("totalfirstprize =", value, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeNotEqualTo(BigDecimal value) {
            addCriterion("totalfirstprize <>", value, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeGreaterThan(BigDecimal value) {
            addCriterion("totalfirstprize >", value, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfirstprize >=", value, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeLessThan(BigDecimal value) {
            addCriterion("totalfirstprize <", value, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfirstprize <=", value, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeIn(List<BigDecimal> values) {
            addCriterion("totalfirstprize in", values, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeNotIn(List<BigDecimal> values) {
            addCriterion("totalfirstprize not in", values, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfirstprize between", value1, value2, "totalfirstprize");
            return (Criteria) this;
        }

        public Criteria andTotalfirstprizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfirstprize not between", value1, value2, "totalfirstprize");
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

        public Criteria andDevicetypeIsNull() {
            addCriterion("devicetype is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNotNull() {
            addCriterion("devicetype is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeEqualTo(Byte value) {
            addCriterion("devicetype =", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotEqualTo(Byte value) {
            addCriterion("devicetype <>", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThan(Byte value) {
            addCriterion("devicetype >", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("devicetype >=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThan(Byte value) {
            addCriterion("devicetype <", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThanOrEqualTo(Byte value) {
            addCriterion("devicetype <=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIn(List<Byte> values) {
            addCriterion("devicetype in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotIn(List<Byte> values) {
            addCriterion("devicetype not in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeBetween(Byte value1, Byte value2) {
            addCriterion("devicetype between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("devicetype not between", value1, value2, "devicetype");
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

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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