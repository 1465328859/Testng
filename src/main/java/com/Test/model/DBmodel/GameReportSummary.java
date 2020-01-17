package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameReportSummary {
    private Integer id;

    private Byte type;

    private Byte platform;

    private Date belongDate;

    private BigDecimal betAmount;

    private BigDecimal profit;

    private BigDecimal totalRebateAmount;

    private BigDecimal totalTopRebateAmount;

    private BigDecimal totalPrimaryRebateAmount;

    private BigDecimal totalSecondaryRebateAmount;

    private BigDecimal totalTertiaryRebateAmount;

    private Date createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public Date getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(Date belongDate) {
        this.belongDate = belongDate;
    }

    public BigDecimal getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(BigDecimal betAmount) {
        this.betAmount = betAmount;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getTotalRebateAmount() {
        return totalRebateAmount;
    }

    public void setTotalRebateAmount(BigDecimal totalRebateAmount) {
        this.totalRebateAmount = totalRebateAmount;
    }

    public BigDecimal getTotalTopRebateAmount() {
        return totalTopRebateAmount;
    }

    public void setTotalTopRebateAmount(BigDecimal totalTopRebateAmount) {
        this.totalTopRebateAmount = totalTopRebateAmount;
    }

    public BigDecimal getTotalPrimaryRebateAmount() {
        return totalPrimaryRebateAmount;
    }

    public void setTotalPrimaryRebateAmount(BigDecimal totalPrimaryRebateAmount) {
        this.totalPrimaryRebateAmount = totalPrimaryRebateAmount;
    }

    public BigDecimal getTotalSecondaryRebateAmount() {
        return totalSecondaryRebateAmount;
    }

    public void setTotalSecondaryRebateAmount(BigDecimal totalSecondaryRebateAmount) {
        this.totalSecondaryRebateAmount = totalSecondaryRebateAmount;
    }

    public BigDecimal getTotalTertiaryRebateAmount() {
        return totalTertiaryRebateAmount;
    }

    public void setTotalTertiaryRebateAmount(BigDecimal totalTertiaryRebateAmount) {
        this.totalTertiaryRebateAmount = totalTertiaryRebateAmount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}