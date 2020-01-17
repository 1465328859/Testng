package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameThBettingRecord {
    private String deskUuid;

    private Short gameType;

    private Byte roomType;

    private Byte roomLevel;

    private BigDecimal winMoney;

    private BigDecimal startMoney;

    private BigDecimal endMoney;

    private BigDecimal dealMoney;

    private BigDecimal bankMoney;

    private String username;

    private BigDecimal effectMoney;

    private BigDecimal awardMoney;

    private Byte gameGroup;

    private BigDecimal taxMoney;

    private BigDecimal jackPot;

    private Date endTime;

    private Date createdAt;

    private Date updatedAt;

    public String getDeskUuid() {
        return deskUuid;
    }

    public void setDeskUuid(String deskUuid) {
        this.deskUuid = deskUuid == null ? null : deskUuid.trim();
    }

    public Short getGameType() {
        return gameType;
    }

    public void setGameType(Short gameType) {
        this.gameType = gameType;
    }

    public Byte getRoomType() {
        return roomType;
    }

    public void setRoomType(Byte roomType) {
        this.roomType = roomType;
    }

    public Byte getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(Byte roomLevel) {
        this.roomLevel = roomLevel;
    }

    public BigDecimal getWinMoney() {
        return winMoney;
    }

    public void setWinMoney(BigDecimal winMoney) {
        this.winMoney = winMoney;
    }

    public BigDecimal getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(BigDecimal startMoney) {
        this.startMoney = startMoney;
    }

    public BigDecimal getEndMoney() {
        return endMoney;
    }

    public void setEndMoney(BigDecimal endMoney) {
        this.endMoney = endMoney;
    }

    public BigDecimal getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(BigDecimal dealMoney) {
        this.dealMoney = dealMoney;
    }

    public BigDecimal getBankMoney() {
        return bankMoney;
    }

    public void setBankMoney(BigDecimal bankMoney) {
        this.bankMoney = bankMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public BigDecimal getEffectMoney() {
        return effectMoney;
    }

    public void setEffectMoney(BigDecimal effectMoney) {
        this.effectMoney = effectMoney;
    }

    public BigDecimal getAwardMoney() {
        return awardMoney;
    }

    public void setAwardMoney(BigDecimal awardMoney) {
        this.awardMoney = awardMoney;
    }

    public Byte getGameGroup() {
        return gameGroup;
    }

    public void setGameGroup(Byte gameGroup) {
        this.gameGroup = gameGroup;
    }

    public BigDecimal getTaxMoney() {
        return taxMoney;
    }

    public void setTaxMoney(BigDecimal taxMoney) {
        this.taxMoney = taxMoney;
    }

    public BigDecimal getJackPot() {
        return jackPot;
    }

    public void setJackPot(BigDecimal jackPot) {
        this.jackPot = jackPot;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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