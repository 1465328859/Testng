package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.List;

public class PaymentWayAllpaysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentWayAllpaysExample() {
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

        public Criteria andAllpayIdIsNull() {
            addCriterion("allpay_id is null");
            return (Criteria) this;
        }

        public Criteria andAllpayIdIsNotNull() {
            addCriterion("allpay_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllpayIdEqualTo(Byte value) {
            addCriterion("allpay_id =", value, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdNotEqualTo(Byte value) {
            addCriterion("allpay_id <>", value, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdGreaterThan(Byte value) {
            addCriterion("allpay_id >", value, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("allpay_id >=", value, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdLessThan(Byte value) {
            addCriterion("allpay_id <", value, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdLessThanOrEqualTo(Byte value) {
            addCriterion("allpay_id <=", value, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdIn(List<Byte> values) {
            addCriterion("allpay_id in", values, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdNotIn(List<Byte> values) {
            addCriterion("allpay_id not in", values, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdBetween(Byte value1, Byte value2) {
            addCriterion("allpay_id between", value1, value2, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayIdNotBetween(Byte value1, Byte value2) {
            addCriterion("allpay_id not between", value1, value2, "allpayId");
            return (Criteria) this;
        }

        public Criteria andAllpayNameIsNull() {
            addCriterion("allpay_name is null");
            return (Criteria) this;
        }

        public Criteria andAllpayNameIsNotNull() {
            addCriterion("allpay_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllpayNameEqualTo(String value) {
            addCriterion("allpay_name =", value, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameNotEqualTo(String value) {
            addCriterion("allpay_name <>", value, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameGreaterThan(String value) {
            addCriterion("allpay_name >", value, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameGreaterThanOrEqualTo(String value) {
            addCriterion("allpay_name >=", value, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameLessThan(String value) {
            addCriterion("allpay_name <", value, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameLessThanOrEqualTo(String value) {
            addCriterion("allpay_name <=", value, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameLike(String value) {
            addCriterion("allpay_name like", value, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameNotLike(String value) {
            addCriterion("allpay_name not like", value, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameIn(List<String> values) {
            addCriterion("allpay_name in", values, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameNotIn(List<String> values) {
            addCriterion("allpay_name not in", values, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameBetween(String value1, String value2) {
            addCriterion("allpay_name between", value1, value2, "allpayName");
            return (Criteria) this;
        }

        public Criteria andAllpayNameNotBetween(String value1, String value2) {
            addCriterion("allpay_name not between", value1, value2, "allpayName");
            return (Criteria) this;
        }

        public Criteria andMerchantIsNull() {
            addCriterion("merchant is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIsNotNull() {
            addCriterion("merchant is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantEqualTo(String value) {
            addCriterion("merchant =", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotEqualTo(String value) {
            addCriterion("merchant <>", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantGreaterThan(String value) {
            addCriterion("merchant >", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("merchant >=", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLessThan(String value) {
            addCriterion("merchant <", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLessThanOrEqualTo(String value) {
            addCriterion("merchant <=", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantLike(String value) {
            addCriterion("merchant like", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotLike(String value) {
            addCriterion("merchant not like", value, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantIn(List<String> values) {
            addCriterion("merchant in", values, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotIn(List<String> values) {
            addCriterion("merchant not in", values, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantBetween(String value1, String value2) {
            addCriterion("merchant between", value1, value2, "merchant");
            return (Criteria) this;
        }

        public Criteria andMerchantNotBetween(String value1, String value2) {
            addCriterion("merchant not between", value1, value2, "merchant");
            return (Criteria) this;
        }

        public Criteria andKey1IsNull() {
            addCriterion("key_1 is null");
            return (Criteria) this;
        }

        public Criteria andKey1IsNotNull() {
            addCriterion("key_1 is not null");
            return (Criteria) this;
        }

        public Criteria andKey1EqualTo(String value) {
            addCriterion("key_1 =", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotEqualTo(String value) {
            addCriterion("key_1 <>", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1GreaterThan(String value) {
            addCriterion("key_1 >", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1GreaterThanOrEqualTo(String value) {
            addCriterion("key_1 >=", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1LessThan(String value) {
            addCriterion("key_1 <", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1LessThanOrEqualTo(String value) {
            addCriterion("key_1 <=", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1Like(String value) {
            addCriterion("key_1 like", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotLike(String value) {
            addCriterion("key_1 not like", value, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1In(List<String> values) {
            addCriterion("key_1 in", values, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotIn(List<String> values) {
            addCriterion("key_1 not in", values, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1Between(String value1, String value2) {
            addCriterion("key_1 between", value1, value2, "key1");
            return (Criteria) this;
        }

        public Criteria andKey1NotBetween(String value1, String value2) {
            addCriterion("key_1 not between", value1, value2, "key1");
            return (Criteria) this;
        }

        public Criteria andKey2IsNull() {
            addCriterion("key_2 is null");
            return (Criteria) this;
        }

        public Criteria andKey2IsNotNull() {
            addCriterion("key_2 is not null");
            return (Criteria) this;
        }

        public Criteria andKey2EqualTo(String value) {
            addCriterion("key_2 =", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2NotEqualTo(String value) {
            addCriterion("key_2 <>", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2GreaterThan(String value) {
            addCriterion("key_2 >", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2GreaterThanOrEqualTo(String value) {
            addCriterion("key_2 >=", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2LessThan(String value) {
            addCriterion("key_2 <", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2LessThanOrEqualTo(String value) {
            addCriterion("key_2 <=", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2Like(String value) {
            addCriterion("key_2 like", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2NotLike(String value) {
            addCriterion("key_2 not like", value, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2In(List<String> values) {
            addCriterion("key_2 in", values, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2NotIn(List<String> values) {
            addCriterion("key_2 not in", values, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2Between(String value1, String value2) {
            addCriterion("key_2 between", value1, value2, "key2");
            return (Criteria) this;
        }

        public Criteria andKey2NotBetween(String value1, String value2) {
            addCriterion("key_2 not between", value1, value2, "key2");
            return (Criteria) this;
        }

        public Criteria andKey3IsNull() {
            addCriterion("key_3 is null");
            return (Criteria) this;
        }

        public Criteria andKey3IsNotNull() {
            addCriterion("key_3 is not null");
            return (Criteria) this;
        }

        public Criteria andKey3EqualTo(String value) {
            addCriterion("key_3 =", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3NotEqualTo(String value) {
            addCriterion("key_3 <>", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3GreaterThan(String value) {
            addCriterion("key_3 >", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3GreaterThanOrEqualTo(String value) {
            addCriterion("key_3 >=", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3LessThan(String value) {
            addCriterion("key_3 <", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3LessThanOrEqualTo(String value) {
            addCriterion("key_3 <=", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3Like(String value) {
            addCriterion("key_3 like", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3NotLike(String value) {
            addCriterion("key_3 not like", value, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3In(List<String> values) {
            addCriterion("key_3 in", values, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3NotIn(List<String> values) {
            addCriterion("key_3 not in", values, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3Between(String value1, String value2) {
            addCriterion("key_3 between", value1, value2, "key3");
            return (Criteria) this;
        }

        public Criteria andKey3NotBetween(String value1, String value2) {
            addCriterion("key_3 not between", value1, value2, "key3");
            return (Criteria) this;
        }

        public Criteria andThirdIdIsNull() {
            addCriterion("third_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdIdIsNotNull() {
            addCriterion("third_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdIdEqualTo(Integer value) {
            addCriterion("third_id =", value, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdNotEqualTo(Integer value) {
            addCriterion("third_id <>", value, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdGreaterThan(Integer value) {
            addCriterion("third_id >", value, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_id >=", value, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdLessThan(Integer value) {
            addCriterion("third_id <", value, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_id <=", value, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdIn(List<Integer> values) {
            addCriterion("third_id in", values, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdNotIn(List<Integer> values) {
            addCriterion("third_id not in", values, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdBetween(Integer value1, Integer value2) {
            addCriterion("third_id between", value1, value2, "thirdId");
            return (Criteria) this;
        }

        public Criteria andThirdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_id not between", value1, value2, "thirdId");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(Byte value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(Byte value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(Byte value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(Byte value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(Byte value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<Byte> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<Byte> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(Byte value1, Byte value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Byte value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Byte value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Byte value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Byte value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Byte value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Byte value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Byte> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Byte> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Byte value1, Byte value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Byte value1, Byte value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andIsCodeIsNull() {
            addCriterion("is_code is null");
            return (Criteria) this;
        }

        public Criteria andIsCodeIsNotNull() {
            addCriterion("is_code is not null");
            return (Criteria) this;
        }

        public Criteria andIsCodeEqualTo(Boolean value) {
            addCriterion("is_code =", value, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeNotEqualTo(Boolean value) {
            addCriterion("is_code <>", value, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeGreaterThan(Boolean value) {
            addCriterion("is_code >", value, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_code >=", value, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeLessThan(Boolean value) {
            addCriterion("is_code <", value, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_code <=", value, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeIn(List<Boolean> values) {
            addCriterion("is_code in", values, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeNotIn(List<Boolean> values) {
            addCriterion("is_code not in", values, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_code between", value1, value2, "isCode");
            return (Criteria) this;
        }

        public Criteria andIsCodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_code not between", value1, value2, "isCode");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andPayLabelIsNull() {
            addCriterion("pay_label is null");
            return (Criteria) this;
        }

        public Criteria andPayLabelIsNotNull() {
            addCriterion("pay_label is not null");
            return (Criteria) this;
        }

        public Criteria andPayLabelEqualTo(String value) {
            addCriterion("pay_label =", value, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelNotEqualTo(String value) {
            addCriterion("pay_label <>", value, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelGreaterThan(String value) {
            addCriterion("pay_label >", value, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_label >=", value, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelLessThan(String value) {
            addCriterion("pay_label <", value, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelLessThanOrEqualTo(String value) {
            addCriterion("pay_label <=", value, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelLike(String value) {
            addCriterion("pay_label like", value, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelNotLike(String value) {
            addCriterion("pay_label not like", value, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelIn(List<String> values) {
            addCriterion("pay_label in", values, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelNotIn(List<String> values) {
            addCriterion("pay_label not in", values, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelBetween(String value1, String value2) {
            addCriterion("pay_label between", value1, value2, "payLabel");
            return (Criteria) this;
        }

        public Criteria andPayLabelNotBetween(String value1, String value2) {
            addCriterion("pay_label not between", value1, value2, "payLabel");
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