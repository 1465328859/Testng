package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameBettingRecord extends GameBettingRecordKey {
    private Date betTime;

    private Date settlementTime;

    private Integer userId;

    private String username;

    private String topId;

    private Byte isSwitch;

    private String agentName;

    private String upThreeTree;

    private String gameCnName;

    private BigDecimal betAmount;

    private BigDecimal validBetAmount;

    private BigDecimal profit;

    private Byte settlementStatus;

    private Date belongDate;

    private BigDecimal rebate;

    private BigDecimal rebateAmount;

    private BigDecimal topRebate;

    private BigDecimal topRebateAmount;

    private BigDecimal primaryRebate;

    private BigDecimal primaryRebateAmount;

    private Long secondaryRebate;

    private BigDecimal secondaryRebateAmount;

    private BigDecimal tertiaryRebate;

    private BigDecimal tertiaryRebateAmount;

    private Byte from;

    public Date getBetTime() {
        return betTime;
    }

    public void setBetTime(Date betTime) {
        this.betTime = betTime;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
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

    public String getTopId() {
        return topId;
    }

    public void setTopId(String topId) {
        this.topId = topId == null ? null : topId.trim();
    }

    public Byte getIsSwitch() {
        return isSwitch;
    }

    public void setIsSwitch(Byte isSwitch) {
        this.isSwitch = isSwitch;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getUpThreeTree() {
        return upThreeTree;
    }

    public void setUpThreeTree(String upThreeTree) {
        this.upThreeTree = upThreeTree == null ? null : upThreeTree.trim();
    }

    public String getGameCnName() {
        return gameCnName;
    }

    public void setGameCnName(String gameCnName) {
        this.gameCnName = gameCnName == null ? null : gameCnName.trim();
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

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public Byte getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Byte settlementStatus) {
        this.settlementStatus = settlementStatus;
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

    public BigDecimal getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(BigDecimal rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    public BigDecimal getTopRebate() {
        return topRebate;
    }

    public void setTopRebate(BigDecimal topRebate) {
        this.topRebate = topRebate;
    }

    public BigDecimal getTopRebateAmount() {
        return topRebateAmount;
    }

    public void setTopRebateAmount(BigDecimal topRebateAmount) {
        this.topRebateAmount = topRebateAmount;
    }

    public BigDecimal getPrimaryRebate() {
        return primaryRebate;
    }

    public void setPrimaryRebate(BigDecimal primaryRebate) {
        this.primaryRebate = primaryRebate;
    }

    public BigDecimal getPrimaryRebateAmount() {
        return primaryRebateAmount;
    }

    public void setPrimaryRebateAmount(BigDecimal primaryRebateAmount) {
        this.primaryRebateAmount = primaryRebateAmount;
    }

    public Long getSecondaryRebate() {
        return secondaryRebate;
    }

    public void setSecondaryRebate(Long secondaryRebate) {
        this.secondaryRebate = secondaryRebate;
    }

    public BigDecimal getSecondaryRebateAmount() {
        return secondaryRebateAmount;
    }

    public void setSecondaryRebateAmount(BigDecimal secondaryRebateAmount) {
        this.secondaryRebateAmount = secondaryRebateAmount;
    }

    public BigDecimal getTertiaryRebate() {
        return tertiaryRebate;
    }

    public void setTertiaryRebate(BigDecimal tertiaryRebate) {
        this.tertiaryRebate = tertiaryRebate;
    }

    public BigDecimal getTertiaryRebateAmount() {
        return tertiaryRebateAmount;
    }

    public void setTertiaryRebateAmount(BigDecimal tertiaryRebateAmount) {
        this.tertiaryRebateAmount = tertiaryRebateAmount;
    }

    public Byte getFrom() {
        return from;
    }

    public void setFrom(Byte from) {
        this.from = from;
    }
}