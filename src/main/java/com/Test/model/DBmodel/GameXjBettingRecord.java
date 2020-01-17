package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameXjBettingRecord {
    private String betId;

    private String memberCode;

    private String currencyCode;

    private String ipAddress;

    private String createTime;

    private String settleTime;

    private Integer wagerStatus;

    private BigDecimal stake;

    private BigDecimal returnAmount;

    private Integer channel;

    private Integer oddsType;

    private BigDecimal odds;

    private String bets;

    private String prefix;

    private String betType;

    private Date createdAt;

    private Date updatedAt;

    public String getBetId() {
        return betId;
    }

    public void setBetId(String betId) {
        this.betId = betId == null ? null : betId.trim();
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode == null ? null : memberCode.trim();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime == null ? null : settleTime.trim();
    }

    public Integer getWagerStatus() {
        return wagerStatus;
    }

    public void setWagerStatus(Integer wagerStatus) {
        this.wagerStatus = wagerStatus;
    }

    public BigDecimal getStake() {
        return stake;
    }

    public void setStake(BigDecimal stake) {
        this.stake = stake;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getOddsType() {
        return oddsType;
    }

    public void setOddsType(Integer oddsType) {
        this.oddsType = oddsType;
    }

    public BigDecimal getOdds() {
        return odds;
    }

    public void setOdds(BigDecimal odds) {
        this.odds = odds;
    }

    public String getBets() {
        return bets;
    }

    public void setBets(String bets) {
        this.bets = bets == null ? null : bets.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public String getBetType() {
        return betType;
    }

    public void setBetType(String betType) {
        this.betType = betType == null ? null : betType.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}