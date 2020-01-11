package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExternalEgameOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExternalEgameOrderExample() {
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

        public Criteria andSlottypeIsNull() {
            addCriterion("slottype is null");
            return (Criteria) this;
        }

        public Criteria andSlottypeIsNotNull() {
            addCriterion("slottype is not null");
            return (Criteria) this;
        }

        public Criteria andSlottypeEqualTo(Float value) {
            addCriterion("slottype =", value, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeNotEqualTo(Float value) {
            addCriterion("slottype <>", value, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeGreaterThan(Float value) {
            addCriterion("slottype >", value, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeGreaterThanOrEqualTo(Float value) {
            addCriterion("slottype >=", value, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeLessThan(Float value) {
            addCriterion("slottype <", value, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeLessThanOrEqualTo(Float value) {
            addCriterion("slottype <=", value, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeIn(List<Float> values) {
            addCriterion("slottype in", values, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeNotIn(List<Float> values) {
            addCriterion("slottype not in", values, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeBetween(Float value1, Float value2) {
            addCriterion("slottype between", value1, value2, "slottype");
            return (Criteria) this;
        }

        public Criteria andSlottypeNotBetween(Float value1, Float value2) {
            addCriterion("slottype not between", value1, value2, "slottype");
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

        public Criteria andGameTypeIsNull() {
            addCriterion("game_type is null");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNotNull() {
            addCriterion("game_type is not null");
            return (Criteria) this;
        }

        public Criteria andGameTypeEqualTo(String value) {
            addCriterion("game_type =", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotEqualTo(String value) {
            addCriterion("game_type <>", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThan(String value) {
            addCriterion("game_type >", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("game_type >=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThan(String value) {
            addCriterion("game_type <", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThanOrEqualTo(String value) {
            addCriterion("game_type <=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLike(String value) {
            addCriterion("game_type like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotLike(String value) {
            addCriterion("game_type not like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeIn(List<String> values) {
            addCriterion("game_type in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotIn(List<String> values) {
            addCriterion("game_type not in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeBetween(String value1, String value2) {
            addCriterion("game_type between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotBetween(String value1, String value2) {
            addCriterion("game_type not between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(Float value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(Float value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(Float value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(Float value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(Float value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(Float value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<Float> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<Float> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(Float value1, Float value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(Float value1, Float value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andCusAccountIsNull() {
            addCriterion("cus_account is null");
            return (Criteria) this;
        }

        public Criteria andCusAccountIsNotNull() {
            addCriterion("cus_account is not null");
            return (Criteria) this;
        }

        public Criteria andCusAccountEqualTo(Float value) {
            addCriterion("cus_account =", value, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountNotEqualTo(Float value) {
            addCriterion("cus_account <>", value, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountGreaterThan(Float value) {
            addCriterion("cus_account >", value, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountGreaterThanOrEqualTo(Float value) {
            addCriterion("cus_account >=", value, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountLessThan(Float value) {
            addCriterion("cus_account <", value, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountLessThanOrEqualTo(Float value) {
            addCriterion("cus_account <=", value, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountIn(List<Float> values) {
            addCriterion("cus_account in", values, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountNotIn(List<Float> values) {
            addCriterion("cus_account not in", values, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountBetween(Float value1, Float value2) {
            addCriterion("cus_account between", value1, value2, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andCusAccountNotBetween(Float value1, Float value2) {
            addCriterion("cus_account not between", value1, value2, "cusAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountIsNull() {
            addCriterion("valid_account is null");
            return (Criteria) this;
        }

        public Criteria andValidAccountIsNotNull() {
            addCriterion("valid_account is not null");
            return (Criteria) this;
        }

        public Criteria andValidAccountEqualTo(Integer value) {
            addCriterion("valid_account =", value, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountNotEqualTo(Integer value) {
            addCriterion("valid_account <>", value, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountGreaterThan(Integer value) {
            addCriterion("valid_account >", value, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_account >=", value, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountLessThan(Integer value) {
            addCriterion("valid_account <", value, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountLessThanOrEqualTo(Integer value) {
            addCriterion("valid_account <=", value, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountIn(List<Integer> values) {
            addCriterion("valid_account in", values, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountNotIn(List<Integer> values) {
            addCriterion("valid_account not in", values, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountBetween(Integer value1, Integer value2) {
            addCriterion("valid_account between", value1, value2, "validAccount");
            return (Criteria) this;
        }

        public Criteria andValidAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_account not between", value1, value2, "validAccount");
            return (Criteria) this;
        }

        public Criteria andAccountBaseIsNull() {
            addCriterion("account_base is null");
            return (Criteria) this;
        }

        public Criteria andAccountBaseIsNotNull() {
            addCriterion("account_base is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBaseEqualTo(Float value) {
            addCriterion("account_base =", value, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseNotEqualTo(Float value) {
            addCriterion("account_base <>", value, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseGreaterThan(Float value) {
            addCriterion("account_base >", value, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseGreaterThanOrEqualTo(Float value) {
            addCriterion("account_base >=", value, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseLessThan(Float value) {
            addCriterion("account_base <", value, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseLessThanOrEqualTo(Float value) {
            addCriterion("account_base <=", value, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseIn(List<Float> values) {
            addCriterion("account_base in", values, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseNotIn(List<Float> values) {
            addCriterion("account_base not in", values, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseBetween(Float value1, Float value2) {
            addCriterion("account_base between", value1, value2, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBaseNotBetween(Float value1, Float value2) {
            addCriterion("account_base not between", value1, value2, "accountBase");
            return (Criteria) this;
        }

        public Criteria andAccountBonusIsNull() {
            addCriterion("account_bonus is null");
            return (Criteria) this;
        }

        public Criteria andAccountBonusIsNotNull() {
            addCriterion("account_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBonusEqualTo(Float value) {
            addCriterion("account_bonus =", value, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusNotEqualTo(Float value) {
            addCriterion("account_bonus <>", value, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusGreaterThan(Float value) {
            addCriterion("account_bonus >", value, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusGreaterThanOrEqualTo(Float value) {
            addCriterion("account_bonus >=", value, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusLessThan(Float value) {
            addCriterion("account_bonus <", value, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusLessThanOrEqualTo(Float value) {
            addCriterion("account_bonus <=", value, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusIn(List<Float> values) {
            addCriterion("account_bonus in", values, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusNotIn(List<Float> values) {
            addCriterion("account_bonus not in", values, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusBetween(Float value1, Float value2) {
            addCriterion("account_bonus between", value1, value2, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andAccountBonusNotBetween(Float value1, Float value2) {
            addCriterion("account_bonus not between", value1, value2, "accountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseIsNull() {
            addCriterion("cus_account_base is null");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseIsNotNull() {
            addCriterion("cus_account_base is not null");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseEqualTo(Float value) {
            addCriterion("cus_account_base =", value, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseNotEqualTo(Float value) {
            addCriterion("cus_account_base <>", value, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseGreaterThan(Float value) {
            addCriterion("cus_account_base >", value, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseGreaterThanOrEqualTo(Float value) {
            addCriterion("cus_account_base >=", value, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseLessThan(Float value) {
            addCriterion("cus_account_base <", value, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseLessThanOrEqualTo(Float value) {
            addCriterion("cus_account_base <=", value, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseIn(List<Float> values) {
            addCriterion("cus_account_base in", values, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseNotIn(List<Float> values) {
            addCriterion("cus_account_base not in", values, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseBetween(Float value1, Float value2) {
            addCriterion("cus_account_base between", value1, value2, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBaseNotBetween(Float value1, Float value2) {
            addCriterion("cus_account_base not between", value1, value2, "cusAccountBase");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusIsNull() {
            addCriterion("cus_account_bonus is null");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusIsNotNull() {
            addCriterion("cus_account_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusEqualTo(Float value) {
            addCriterion("cus_account_bonus =", value, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusNotEqualTo(Float value) {
            addCriterion("cus_account_bonus <>", value, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusGreaterThan(Float value) {
            addCriterion("cus_account_bonus >", value, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusGreaterThanOrEqualTo(Float value) {
            addCriterion("cus_account_bonus >=", value, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusLessThan(Float value) {
            addCriterion("cus_account_bonus <", value, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusLessThanOrEqualTo(Float value) {
            addCriterion("cus_account_bonus <=", value, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusIn(List<Float> values) {
            addCriterion("cus_account_bonus in", values, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusNotIn(List<Float> values) {
            addCriterion("cus_account_bonus not in", values, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusBetween(Float value1, Float value2) {
            addCriterion("cus_account_bonus between", value1, value2, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andCusAccountBonusNotBetween(Float value1, Float value2) {
            addCriterion("cus_account_bonus not between", value1, value2, "cusAccountBonus");
            return (Criteria) this;
        }

        public Criteria andBetIpIsNull() {
            addCriterion("bet_ip is null");
            return (Criteria) this;
        }

        public Criteria andBetIpIsNotNull() {
            addCriterion("bet_ip is not null");
            return (Criteria) this;
        }

        public Criteria andBetIpEqualTo(String value) {
            addCriterion("bet_ip =", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpNotEqualTo(String value) {
            addCriterion("bet_ip <>", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpGreaterThan(String value) {
            addCriterion("bet_ip >", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpGreaterThanOrEqualTo(String value) {
            addCriterion("bet_ip >=", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpLessThan(String value) {
            addCriterion("bet_ip <", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpLessThanOrEqualTo(String value) {
            addCriterion("bet_ip <=", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpLike(String value) {
            addCriterion("bet_ip like", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpNotLike(String value) {
            addCriterion("bet_ip not like", value, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpIn(List<String> values) {
            addCriterion("bet_ip in", values, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpNotIn(List<String> values) {
            addCriterion("bet_ip not in", values, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpBetween(String value1, String value2) {
            addCriterion("bet_ip between", value1, value2, "betIp");
            return (Criteria) this;
        }

        public Criteria andBetIpNotBetween(String value1, String value2) {
            addCriterion("bet_ip not between", value1, value2, "betIp");
            return (Criteria) this;
        }

        public Criteria andSrcAmountIsNull() {
            addCriterion("src_amount is null");
            return (Criteria) this;
        }

        public Criteria andSrcAmountIsNotNull() {
            addCriterion("src_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSrcAmountEqualTo(String value) {
            addCriterion("src_amount =", value, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountNotEqualTo(String value) {
            addCriterion("src_amount <>", value, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountGreaterThan(String value) {
            addCriterion("src_amount >", value, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountGreaterThanOrEqualTo(String value) {
            addCriterion("src_amount >=", value, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountLessThan(String value) {
            addCriterion("src_amount <", value, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountLessThanOrEqualTo(String value) {
            addCriterion("src_amount <=", value, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountLike(String value) {
            addCriterion("src_amount like", value, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountNotLike(String value) {
            addCriterion("src_amount not like", value, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountIn(List<String> values) {
            addCriterion("src_amount in", values, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountNotIn(List<String> values) {
            addCriterion("src_amount not in", values, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountBetween(String value1, String value2) {
            addCriterion("src_amount between", value1, value2, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andSrcAmountNotBetween(String value1, String value2) {
            addCriterion("src_amount not between", value1, value2, "srcAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountIsNull() {
            addCriterion("dst_amount is null");
            return (Criteria) this;
        }

        public Criteria andDstAmountIsNotNull() {
            addCriterion("dst_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDstAmountEqualTo(String value) {
            addCriterion("dst_amount =", value, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountNotEqualTo(String value) {
            addCriterion("dst_amount <>", value, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountGreaterThan(String value) {
            addCriterion("dst_amount >", value, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountGreaterThanOrEqualTo(String value) {
            addCriterion("dst_amount >=", value, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountLessThan(String value) {
            addCriterion("dst_amount <", value, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountLessThanOrEqualTo(String value) {
            addCriterion("dst_amount <=", value, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountLike(String value) {
            addCriterion("dst_amount like", value, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountNotLike(String value) {
            addCriterion("dst_amount not like", value, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountIn(List<String> values) {
            addCriterion("dst_amount in", values, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountNotIn(List<String> values) {
            addCriterion("dst_amount not in", values, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountBetween(String value1, String value2) {
            addCriterion("dst_amount between", value1, value2, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andDstAmountNotBetween(String value1, String value2) {
            addCriterion("dst_amount not between", value1, value2, "dstAmount");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNull() {
            addCriterion("platform_type is null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNotNull() {
            addCriterion("platform_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeEqualTo(String value) {
            addCriterion("platform_type =", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotEqualTo(String value) {
            addCriterion("platform_type <>", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThan(String value) {
            addCriterion("platform_type >", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThanOrEqualTo(String value) {
            addCriterion("platform_type >=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThan(String value) {
            addCriterion("platform_type <", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThanOrEqualTo(String value) {
            addCriterion("platform_type <=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLike(String value) {
            addCriterion("platform_type like", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotLike(String value) {
            addCriterion("platform_type not like", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIn(List<String> values) {
            addCriterion("platform_type in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotIn(List<String> values) {
            addCriterion("platform_type not in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeBetween(String value1, String value2) {
            addCriterion("platform_type between", value1, value2, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotBetween(String value1, String value2) {
            addCriterion("platform_type not between", value1, value2, "platformType");
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

        public Criteria andDevicetypeEqualTo(Integer value) {
            addCriterion("devicetype =", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotEqualTo(Integer value) {
            addCriterion("devicetype <>", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThan(Integer value) {
            addCriterion("devicetype >", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("devicetype >=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThan(Integer value) {
            addCriterion("devicetype <", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThanOrEqualTo(Integer value) {
            addCriterion("devicetype <=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIn(List<Integer> values) {
            addCriterion("devicetype in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotIn(List<Integer> values) {
            addCriterion("devicetype not in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeBetween(Integer value1, Integer value2) {
            addCriterion("devicetype between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("devicetype not between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andExttxidIsNull() {
            addCriterion("exttxid is null");
            return (Criteria) this;
        }

        public Criteria andExttxidIsNotNull() {
            addCriterion("exttxid is not null");
            return (Criteria) this;
        }

        public Criteria andExttxidEqualTo(String value) {
            addCriterion("exttxid =", value, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidNotEqualTo(String value) {
            addCriterion("exttxid <>", value, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidGreaterThan(String value) {
            addCriterion("exttxid >", value, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidGreaterThanOrEqualTo(String value) {
            addCriterion("exttxid >=", value, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidLessThan(String value) {
            addCriterion("exttxid <", value, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidLessThanOrEqualTo(String value) {
            addCriterion("exttxid <=", value, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidLike(String value) {
            addCriterion("exttxid like", value, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidNotLike(String value) {
            addCriterion("exttxid not like", value, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidIn(List<String> values) {
            addCriterion("exttxid in", values, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidNotIn(List<String> values) {
            addCriterion("exttxid not in", values, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidBetween(String value1, String value2) {
            addCriterion("exttxid between", value1, value2, "exttxid");
            return (Criteria) this;
        }

        public Criteria andExttxidNotBetween(String value1, String value2) {
            addCriterion("exttxid not between", value1, value2, "exttxid");
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