package com.Test.model.DBmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatGroupExample() {
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

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupDescIsNull() {
            addCriterion("group_desc is null");
            return (Criteria) this;
        }

        public Criteria andGroupDescIsNotNull() {
            addCriterion("group_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDescEqualTo(String value) {
            addCriterion("group_desc =", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotEqualTo(String value) {
            addCriterion("group_desc <>", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescGreaterThan(String value) {
            addCriterion("group_desc >", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescGreaterThanOrEqualTo(String value) {
            addCriterion("group_desc >=", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLessThan(String value) {
            addCriterion("group_desc <", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLessThanOrEqualTo(String value) {
            addCriterion("group_desc <=", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLike(String value) {
            addCriterion("group_desc like", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotLike(String value) {
            addCriterion("group_desc not like", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescIn(List<String> values) {
            addCriterion("group_desc in", values, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotIn(List<String> values) {
            addCriterion("group_desc not in", values, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescBetween(String value1, String value2) {
            addCriterion("group_desc between", value1, value2, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotBetween(String value1, String value2) {
            addCriterion("group_desc not between", value1, value2, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andSpeakCdIsNull() {
            addCriterion("speak_cd is null");
            return (Criteria) this;
        }

        public Criteria andSpeakCdIsNotNull() {
            addCriterion("speak_cd is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakCdEqualTo(Byte value) {
            addCriterion("speak_cd =", value, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdNotEqualTo(Byte value) {
            addCriterion("speak_cd <>", value, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdGreaterThan(Byte value) {
            addCriterion("speak_cd >", value, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdGreaterThanOrEqualTo(Byte value) {
            addCriterion("speak_cd >=", value, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdLessThan(Byte value) {
            addCriterion("speak_cd <", value, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdLessThanOrEqualTo(Byte value) {
            addCriterion("speak_cd <=", value, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdIn(List<Byte> values) {
            addCriterion("speak_cd in", values, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdNotIn(List<Byte> values) {
            addCriterion("speak_cd not in", values, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdBetween(Byte value1, Byte value2) {
            addCriterion("speak_cd between", value1, value2, "speakCd");
            return (Criteria) this;
        }

        public Criteria andSpeakCdNotBetween(Byte value1, Byte value2) {
            addCriterion("speak_cd not between", value1, value2, "speakCd");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedIsNull() {
            addCriterion("is_restricted is null");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedIsNotNull() {
            addCriterion("is_restricted is not null");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedEqualTo(Byte value) {
            addCriterion("is_restricted =", value, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedNotEqualTo(Byte value) {
            addCriterion("is_restricted <>", value, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedGreaterThan(Byte value) {
            addCriterion("is_restricted >", value, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_restricted >=", value, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedLessThan(Byte value) {
            addCriterion("is_restricted <", value, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedLessThanOrEqualTo(Byte value) {
            addCriterion("is_restricted <=", value, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedIn(List<Byte> values) {
            addCriterion("is_restricted in", values, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedNotIn(List<Byte> values) {
            addCriterion("is_restricted not in", values, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedBetween(Byte value1, Byte value2) {
            addCriterion("is_restricted between", value1, value2, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsRestrictedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_restricted not between", value1, value2, "isRestricted");
            return (Criteria) this;
        }

        public Criteria andIsOfficialIsNull() {
            addCriterion("is_official is null");
            return (Criteria) this;
        }

        public Criteria andIsOfficialIsNotNull() {
            addCriterion("is_official is not null");
            return (Criteria) this;
        }

        public Criteria andIsOfficialEqualTo(Boolean value) {
            addCriterion("is_official =", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialNotEqualTo(Boolean value) {
            addCriterion("is_official <>", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialGreaterThan(Boolean value) {
            addCriterion("is_official >", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_official >=", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialLessThan(Boolean value) {
            addCriterion("is_official <", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialLessThanOrEqualTo(Boolean value) {
            addCriterion("is_official <=", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialIn(List<Boolean> values) {
            addCriterion("is_official in", values, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialNotIn(List<Boolean> values) {
            addCriterion("is_official not in", values, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialBetween(Boolean value1, Boolean value2) {
            addCriterion("is_official between", value1, value2, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_official not between", value1, value2, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andPersonnumberIsNull() {
            addCriterion("personnumber is null");
            return (Criteria) this;
        }

        public Criteria andPersonnumberIsNotNull() {
            addCriterion("personnumber is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnumberEqualTo(Integer value) {
            addCriterion("personnumber =", value, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberNotEqualTo(Integer value) {
            addCriterion("personnumber <>", value, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberGreaterThan(Integer value) {
            addCriterion("personnumber >", value, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnumber >=", value, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberLessThan(Integer value) {
            addCriterion("personnumber <", value, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberLessThanOrEqualTo(Integer value) {
            addCriterion("personnumber <=", value, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberIn(List<Integer> values) {
            addCriterion("personnumber in", values, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberNotIn(List<Integer> values) {
            addCriterion("personnumber not in", values, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberBetween(Integer value1, Integer value2) {
            addCriterion("personnumber between", value1, value2, "personnumber");
            return (Criteria) this;
        }

        public Criteria andPersonnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("personnumber not between", value1, value2, "personnumber");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitIsNull() {
            addCriterion("send_msg_limit is null");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitIsNotNull() {
            addCriterion("send_msg_limit is not null");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitEqualTo(Integer value) {
            addCriterion("send_msg_limit =", value, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitNotEqualTo(Integer value) {
            addCriterion("send_msg_limit <>", value, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitGreaterThan(Integer value) {
            addCriterion("send_msg_limit >", value, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_msg_limit >=", value, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitLessThan(Integer value) {
            addCriterion("send_msg_limit <", value, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitLessThanOrEqualTo(Integer value) {
            addCriterion("send_msg_limit <=", value, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitIn(List<Integer> values) {
            addCriterion("send_msg_limit in", values, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitNotIn(List<Integer> values) {
            addCriterion("send_msg_limit not in", values, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitBetween(Integer value1, Integer value2) {
            addCriterion("send_msg_limit between", value1, value2, "sendMsgLimit");
            return (Criteria) this;
        }

        public Criteria andSendMsgLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("send_msg_limit not between", value1, value2, "sendMsgLimit");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIsNull() {
            addCriterion("group_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIsNotNull() {
            addCriterion("group_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEqualTo(Date value) {
            addCriterion("group_time =", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotEqualTo(Date value) {
            addCriterion("group_time <>", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeGreaterThan(Date value) {
            addCriterion("group_time >", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("group_time >=", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeLessThan(Date value) {
            addCriterion("group_time <", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeLessThanOrEqualTo(Date value) {
            addCriterion("group_time <=", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIn(List<Date> values) {
            addCriterion("group_time in", values, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotIn(List<Date> values) {
            addCriterion("group_time not in", values, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeBetween(Date value1, Date value2) {
            addCriterion("group_time between", value1, value2, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotBetween(Date value1, Date value2) {
            addCriterion("group_time not between", value1, value2, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupImgIsNull() {
            addCriterion("group_img is null");
            return (Criteria) this;
        }

        public Criteria andGroupImgIsNotNull() {
            addCriterion("group_img is not null");
            return (Criteria) this;
        }

        public Criteria andGroupImgEqualTo(String value) {
            addCriterion("group_img =", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgNotEqualTo(String value) {
            addCriterion("group_img <>", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgGreaterThan(String value) {
            addCriterion("group_img >", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgGreaterThanOrEqualTo(String value) {
            addCriterion("group_img >=", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgLessThan(String value) {
            addCriterion("group_img <", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgLessThanOrEqualTo(String value) {
            addCriterion("group_img <=", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgLike(String value) {
            addCriterion("group_img like", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgNotLike(String value) {
            addCriterion("group_img not like", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgIn(List<String> values) {
            addCriterion("group_img in", values, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgNotIn(List<String> values) {
            addCriterion("group_img not in", values, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgBetween(String value1, String value2) {
            addCriterion("group_img between", value1, value2, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgNotBetween(String value1, String value2) {
            addCriterion("group_img not between", value1, value2, "groupImg");
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