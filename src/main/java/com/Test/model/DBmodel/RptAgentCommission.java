package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class RptAgentCommission {
    private Integer id;

    private String upThreeGrade;

    private Integer topId;

    private Integer userId;

    private String agent;

    private BigDecimal balance;

    private Boolean status;

    private Boolean rebateType;

    private Integer rebateTime;

    private Integer addTime;

    private Date belongDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUpThreeGrade() {
        return upThreeGrade;
    }

    public void setUpThreeGrade(String upThreeGrade) {
        this.upThreeGrade = upThreeGrade == null ? null : upThreeGrade.trim();
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getRebateType() {
        return rebateType;
    }

    public void setRebateType(Boolean rebateType) {
        this.rebateType = rebateType;
    }

    public Integer getRebateTime() {
        return rebateTime;
    }

    public void setRebateTime(Integer rebateTime) {
        this.rebateTime = rebateTime;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Date getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(Date belongDate) {
        this.belongDate = belongDate;
    }
}