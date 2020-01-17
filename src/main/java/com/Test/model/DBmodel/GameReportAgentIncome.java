package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameReportAgentIncome {
    private Integer id;

    private Byte type;

    private Byte platform;

    private Date belongDate;

    private Integer userId;

    private String username;

    private Byte incomeType;

    private BigDecimal incomeAmount;

    private String remark;

    private Boolean rebateStatus;

    private Boolean rebateType;

    private Date rebateTime;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getRebateStatus() {
        return rebateStatus;
    }

    public void setRebateStatus(Boolean rebateStatus) {
        this.rebateStatus = rebateStatus;
    }

    public Boolean getRebateType() {
        return rebateType;
    }

    public void setRebateType(Boolean rebateType) {
        this.rebateType = rebateType;
    }

    public Date getRebateTime() {
        return rebateTime;
    }

    public void setRebateTime(Date rebateTime) {
        this.rebateTime = rebateTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}