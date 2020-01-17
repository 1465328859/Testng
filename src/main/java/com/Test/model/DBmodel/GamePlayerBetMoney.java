package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GamePlayerBetMoney {
    private Integer id;

    private Integer userId;

    private String username;

    private Integer withdrawId;

    private Date lastRechargeTime;

    private Integer lastRechargeId;

    private Byte platform;

    private BigDecimal lastTotalInMoney;

    private BigDecimal lastTotalBetMoney;

    private BigDecimal lastTotalOutMoney;

    private Date createdAt;

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

    public Integer getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(Integer withdrawId) {
        this.withdrawId = withdrawId;
    }

    public Date getLastRechargeTime() {
        return lastRechargeTime;
    }

    public void setLastRechargeTime(Date lastRechargeTime) {
        this.lastRechargeTime = lastRechargeTime;
    }

    public Integer getLastRechargeId() {
        return lastRechargeId;
    }

    public void setLastRechargeId(Integer lastRechargeId) {
        this.lastRechargeId = lastRechargeId;
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public BigDecimal getLastTotalInMoney() {
        return lastTotalInMoney;
    }

    public void setLastTotalInMoney(BigDecimal lastTotalInMoney) {
        this.lastTotalInMoney = lastTotalInMoney;
    }

    public BigDecimal getLastTotalBetMoney() {
        return lastTotalBetMoney;
    }

    public void setLastTotalBetMoney(BigDecimal lastTotalBetMoney) {
        this.lastTotalBetMoney = lastTotalBetMoney;
    }

    public BigDecimal getLastTotalOutMoney() {
        return lastTotalOutMoney;
    }

    public void setLastTotalOutMoney(BigDecimal lastTotalOutMoney) {
        this.lastTotalOutMoney = lastTotalOutMoney;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}