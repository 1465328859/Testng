package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameReportUser {
    private Date belongDate;

    private Byte platform;

    private Integer userId;

    private Integer topId;

    private Byte type;

    private String username;

    private BigDecimal todayBetMoney;

    private BigDecimal todayProfit;

    private BigDecimal todayRebateAmount;

    private BigDecimal todayTopRebateAmount;

    private BigDecimal todayPrimaryRebateAmount;

    private Integer primaryUserId;

    private BigDecimal todaySecondaryRebateAmount;

    private Integer secondaryUserId;

    private BigDecimal todayTertiaryRebateAmount;

    private Integer tertiaryUserId;

    private Integer orderNum;

    private Integer winNum;

    private Date updateAt;

    public Date getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(Date belongDate) {
        this.belongDate = belongDate;
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public BigDecimal getTodayBetMoney() {
        return todayBetMoney;
    }

    public void setTodayBetMoney(BigDecimal todayBetMoney) {
        this.todayBetMoney = todayBetMoney;
    }

    public BigDecimal getTodayProfit() {
        return todayProfit;
    }

    public void setTodayProfit(BigDecimal todayProfit) {
        this.todayProfit = todayProfit;
    }

    public BigDecimal getTodayRebateAmount() {
        return todayRebateAmount;
    }

    public void setTodayRebateAmount(BigDecimal todayRebateAmount) {
        this.todayRebateAmount = todayRebateAmount;
    }

    public BigDecimal getTodayTopRebateAmount() {
        return todayTopRebateAmount;
    }

    public void setTodayTopRebateAmount(BigDecimal todayTopRebateAmount) {
        this.todayTopRebateAmount = todayTopRebateAmount;
    }

    public BigDecimal getTodayPrimaryRebateAmount() {
        return todayPrimaryRebateAmount;
    }

    public void setTodayPrimaryRebateAmount(BigDecimal todayPrimaryRebateAmount) {
        this.todayPrimaryRebateAmount = todayPrimaryRebateAmount;
    }

    public Integer getPrimaryUserId() {
        return primaryUserId;
    }

    public void setPrimaryUserId(Integer primaryUserId) {
        this.primaryUserId = primaryUserId;
    }

    public BigDecimal getTodaySecondaryRebateAmount() {
        return todaySecondaryRebateAmount;
    }

    public void setTodaySecondaryRebateAmount(BigDecimal todaySecondaryRebateAmount) {
        this.todaySecondaryRebateAmount = todaySecondaryRebateAmount;
    }

    public Integer getSecondaryUserId() {
        return secondaryUserId;
    }

    public void setSecondaryUserId(Integer secondaryUserId) {
        this.secondaryUserId = secondaryUserId;
    }

    public BigDecimal getTodayTertiaryRebateAmount() {
        return todayTertiaryRebateAmount;
    }

    public void setTodayTertiaryRebateAmount(BigDecimal todayTertiaryRebateAmount) {
        this.todayTertiaryRebateAmount = todayTertiaryRebateAmount;
    }

    public Integer getTertiaryUserId() {
        return tertiaryUserId;
    }

    public void setTertiaryUserId(Integer tertiaryUserId) {
        this.tertiaryUserId = tertiaryUserId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getWinNum() {
        return winNum;
    }

    public void setWinNum(Integer winNum) {
        this.winNum = winNum;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}