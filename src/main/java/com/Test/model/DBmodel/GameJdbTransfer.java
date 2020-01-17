package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameJdbTransfer {
    private Integer id;

    private Integer userId;

    private String username;

    private String agentUser;

    private String uid;

    private String orderNo;

    private String type;

    private Byte state;

    private BigDecimal amount;

    private Byte allCashOutFlag;

    private String remark;

    private BigDecimal userBalance;

    private BigDecimal userCashBalance;

    private BigDecimal agentCashBalance;

    private Integer pid;

    private Date payDate;

    private Date submitTime;

    private Date confirmTime;

    private Date settlementTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAgentUser() {
        return agentUser;
    }

    public void setAgentUser(String agentUser) {
        this.agentUser = agentUser == null ? null : agentUser.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Byte getAllCashOutFlag() {
        return allCashOutFlag;
    }

    public void setAllCashOutFlag(Byte allCashOutFlag) {
        this.allCashOutFlag = allCashOutFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    public BigDecimal getUserCashBalance() {
        return userCashBalance;
    }

    public void setUserCashBalance(BigDecimal userCashBalance) {
        this.userCashBalance = userCashBalance;
    }

    public BigDecimal getAgentCashBalance() {
        return agentCashBalance;
    }

    public void setAgentCashBalance(BigDecimal agentCashBalance) {
        this.agentCashBalance = agentCashBalance;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }
}