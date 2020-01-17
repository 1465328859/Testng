package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameBbinBettingVideoRecord {
    private String wagersId;

    private String username;

    private Date wagersDate;

    private String serialId;

    private String roundNo;

    private String gameType;

    private String wagerDetail;

    private String gameCode;

    private String result;

    private Byte resultType;

    private String card;

    private BigDecimal betAmount;

    private BigDecimal payoff;

    private String currency;

    private Double exchangerate;

    private BigDecimal commissionable;

    private String origin;

    private Date createdAt;

    private Date updatedAt;

    public String getWagersId() {
        return wagersId;
    }

    public void setWagersId(String wagersId) {
        this.wagersId = wagersId == null ? null : wagersId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getWagersDate() {
        return wagersDate;
    }

    public void setWagersDate(Date wagersDate) {
        this.wagersDate = wagersDate;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getRoundNo() {
        return roundNo;
    }

    public void setRoundNo(String roundNo) {
        this.roundNo = roundNo == null ? null : roundNo.trim();
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    public String getWagerDetail() {
        return wagerDetail;
    }

    public void setWagerDetail(String wagerDetail) {
        this.wagerDetail = wagerDetail == null ? null : wagerDetail.trim();
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode == null ? null : gameCode.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Byte getResultType() {
        return resultType;
    }

    public void setResultType(Byte resultType) {
        this.resultType = resultType;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public BigDecimal getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(BigDecimal betAmount) {
        this.betAmount = betAmount;
    }

    public BigDecimal getPayoff() {
        return payoff;
    }

    public void setPayoff(BigDecimal payoff) {
        this.payoff = payoff;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Double getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }

    public BigDecimal getCommissionable() {
        return commissionable;
    }

    public void setCommissionable(BigDecimal commissionable) {
        this.commissionable = commissionable;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
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