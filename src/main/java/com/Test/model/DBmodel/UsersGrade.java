package com.Test.model.DBmodel;

import java.math.BigDecimal;

public class UsersGrade {
    private Integer id;

    private Integer grade;

    private String name;

    private BigDecimal rebate;

    private BigDecimal upCharge;

    private BigDecimal upBet;

    private BigDecimal awardOnce;

    private BigDecimal awardMonth;

    private BigDecimal minBet;

    private Short open;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public BigDecimal getUpCharge() {
        return upCharge;
    }

    public void setUpCharge(BigDecimal upCharge) {
        this.upCharge = upCharge;
    }

    public BigDecimal getUpBet() {
        return upBet;
    }

    public void setUpBet(BigDecimal upBet) {
        this.upBet = upBet;
    }

    public BigDecimal getAwardOnce() {
        return awardOnce;
    }

    public void setAwardOnce(BigDecimal awardOnce) {
        this.awardOnce = awardOnce;
    }

    public BigDecimal getAwardMonth() {
        return awardMonth;
    }

    public void setAwardMonth(BigDecimal awardMonth) {
        this.awardMonth = awardMonth;
    }

    public BigDecimal getMinBet() {
        return minBet;
    }

    public void setMinBet(BigDecimal minBet) {
        this.minBet = minBet;
    }

    public Short getOpen() {
        return open;
    }

    public void setOpen(Short open) {
        this.open = open;
    }
}