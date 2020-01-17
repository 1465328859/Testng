package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameAgBettingAginVideoRecord {
    private String billno;

    private String playname;

    private String gameCode;

    private BigDecimal netAmount;

    private Date betTime;

    private String gameType;

    private BigDecimal betAmount;

    private BigDecimal validBetAmount;

    private Byte flag;

    private String playType;

    private String currency;

    private String tablecode;

    private Date recalcuTime;

    private BigDecimal beforeCredit;

    private String betIp;

    private String platfromType;

    private String remark;

    private Byte devicetype;

    private Date createdAt;

    private Date updatedAt;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getPlayname() {
        return playname;
    }

    public void setPlayname(String playname) {
        this.playname = playname == null ? null : playname.trim();
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode == null ? null : gameCode.trim();
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public Date getBetTime() {
        return betTime;
    }

    public void setBetTime(Date betTime) {
        this.betTime = betTime;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    public BigDecimal getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(BigDecimal betAmount) {
        this.betAmount = betAmount;
    }

    public BigDecimal getValidBetAmount() {
        return validBetAmount;
    }

    public void setValidBetAmount(BigDecimal validBetAmount) {
        this.validBetAmount = validBetAmount;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType == null ? null : playType.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getTablecode() {
        return tablecode;
    }

    public void setTablecode(String tablecode) {
        this.tablecode = tablecode == null ? null : tablecode.trim();
    }

    public Date getRecalcuTime() {
        return recalcuTime;
    }

    public void setRecalcuTime(Date recalcuTime) {
        this.recalcuTime = recalcuTime;
    }

    public BigDecimal getBeforeCredit() {
        return beforeCredit;
    }

    public void setBeforeCredit(BigDecimal beforeCredit) {
        this.beforeCredit = beforeCredit;
    }

    public String getBetIp() {
        return betIp;
    }

    public void setBetIp(String betIp) {
        this.betIp = betIp == null ? null : betIp.trim();
    }

    public String getPlatfromType() {
        return platfromType;
    }

    public void setPlatfromType(String platfromType) {
        this.platfromType = platfromType == null ? null : platfromType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(Byte devicetype) {
        this.devicetype = devicetype;
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