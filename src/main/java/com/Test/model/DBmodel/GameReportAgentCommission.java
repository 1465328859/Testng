package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameReportAgentCommission {
    private Integer id;

    private String betOrderNo;

    private Byte platform;

    private Byte type;

    private Integer userId;

    private String username;

    private Integer topId;

    private Byte incomeType;

    private BigDecimal incomeAmount;

    private Integer betUserId;

    private String betUsername;

    private BigDecimal betAmount;

    private Date belongDate;

    private BigDecimal rebate;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBetOrderNo() {
        return betOrderNo;
    }

    public void setBetOrderNo(String betOrderNo) {
        this.betOrderNo = betOrderNo == null ? null : betOrderNo.trim();
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public Byte getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(Byte incomeType) {
        this.incomeType = incomeType;
    }

    public BigDecimal getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(BigDecimal incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public Integer getBetUserId() {
        return betUserId;
    }

    public void setBetUserId(Integer betUserId) {
        this.betUserId = betUserId;
    }

    public String getBetUsername() {
        return betUsername;
    }

    public void setBetUsername(String betUsername) {
        this.betUsername = betUsername == null ? null : betUsername.trim();
    }

    public BigDecimal getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(BigDecimal betAmount) {
        this.betAmount = betAmount;
    }

    public Date getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(Date belongDate) {
        this.belongDate = belongDate;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}