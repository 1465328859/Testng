package com.Test.model.DBmodel;

import java.math.BigDecimal;

public class OrdersReSettlement {
    private Integer id;

    private String username;

    private Integer lotteryId;

    private String lotteryName;

    private String issue;

    private String beforeCode;

    private String afterCode;

    private Integer orderId;

    private BigDecimal userBeforeBalance;

    private BigDecimal loss;

    private BigDecimal userAfterBalance;

    private BigDecimal orderBeforePrize;

    private BigDecimal orderAfterPrize;

    private BigDecimal money;

    private Integer time;

    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getBeforeCode() {
        return beforeCode;
    }

    public void setBeforeCode(String beforeCode) {
        this.beforeCode = beforeCode == null ? null : beforeCode.trim();
    }

    public String getAfterCode() {
        return afterCode;
    }

    public void setAfterCode(String afterCode) {
        this.afterCode = afterCode == null ? null : afterCode.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getUserBeforeBalance() {
        return userBeforeBalance;
    }

    public void setUserBeforeBalance(BigDecimal userBeforeBalance) {
        this.userBeforeBalance = userBeforeBalance;
    }

    public BigDecimal getLoss() {
        return loss;
    }

    public void setLoss(BigDecimal loss) {
        this.loss = loss;
    }

    public BigDecimal getUserAfterBalance() {
        return userAfterBalance;
    }

    public void setUserAfterBalance(BigDecimal userAfterBalance) {
        this.userAfterBalance = userAfterBalance;
    }

    public BigDecimal getOrderBeforePrize() {
        return orderBeforePrize;
    }

    public void setOrderBeforePrize(BigDecimal orderBeforePrize) {
        this.orderBeforePrize = orderBeforePrize;
    }

    public BigDecimal getOrderAfterPrize() {
        return orderAfterPrize;
    }

    public void setOrderAfterPrize(BigDecimal orderAfterPrize) {
        this.orderAfterPrize = orderAfterPrize;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}