package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class AgentCommission {
    private Integer id;

    private Integer userId;

    private String agent;

    private String agentThreeGrade;

    private Integer topId;

    private BigDecimal balance;

    private Integer consumerId;

    private String consumer;

    private Integer higherAgent;

    private String upThreeGrade;

    private String issue;

    private Boolean status;

    private BigDecimal actualAmount;

    private Integer addTime;

    private Date belongDate;

    private Integer orderId;

    private String rebate;

    private String betTime;

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

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public String getAgentThreeGrade() {
        return agentThreeGrade;
    }

    public void setAgentThreeGrade(String agentThreeGrade) {
        this.agentThreeGrade = agentThreeGrade == null ? null : agentThreeGrade.trim();
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer == null ? null : consumer.trim();
    }

    public Integer getHigherAgent() {
        return higherAgent;
    }

    public void setHigherAgent(Integer higherAgent) {
        this.higherAgent = higherAgent;
    }

    public String getUpThreeGrade() {
        return upThreeGrade;
    }

    public void setUpThreeGrade(String upThreeGrade) {
        this.upThreeGrade = upThreeGrade == null ? null : upThreeGrade.trim();
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getRebate() {
        return rebate;
    }

    public void setRebate(String rebate) {
        this.rebate = rebate == null ? null : rebate.trim();
    }

    public String getBetTime() {
        return betTime;
    }

    public void setBetTime(String betTime) {
        this.betTime = betTime == null ? null : betTime.trim();
    }
}