package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameGjRebate {
    private Integer id;

    private String merchantCode;

    private String condition;

    private BigDecimal betAmount;

    private BigDecimal upperLimitAmount;

    private BigDecimal rebate;

    private BigDecimal primaryRebate;

    private BigDecimal secondaryRebate;

    private BigDecimal tertiaryRebate;

    private Date createdTime;

    private Date updatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    public BigDecimal getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(BigDecimal betAmount) {
        this.betAmount = betAmount;
    }

    public BigDecimal getUpperLimitAmount() {
        return upperLimitAmount;
    }

    public void setUpperLimitAmount(BigDecimal upperLimitAmount) {
        this.upperLimitAmount = upperLimitAmount;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public BigDecimal getPrimaryRebate() {
        return primaryRebate;
    }

    public void setPrimaryRebate(BigDecimal primaryRebate) {
        this.primaryRebate = primaryRebate;
    }

    public BigDecimal getSecondaryRebate() {
        return secondaryRebate;
    }

    public void setSecondaryRebate(BigDecimal secondaryRebate) {
        this.secondaryRebate = secondaryRebate;
    }

    public BigDecimal getTertiaryRebate() {
        return tertiaryRebate;
    }

    public void setTertiaryRebate(BigDecimal tertiaryRebate) {
        this.tertiaryRebate = tertiaryRebate;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}