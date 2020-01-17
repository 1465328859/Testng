package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameGjTransfer {
    private Integer id;

    private Integer userId;

    private String username;

    private String mid;

    private Integer gjUserId;

    private String gjOrderNo;

    private String orderNo;

    private String type;

    private Byte state;

    private BigDecimal amount;

    private Byte isMobile;

    private Date submitTime;

    private Date confirmTime;

    private Date settlementTime;

    private String remark;

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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public Integer getGjUserId() {
        return gjUserId;
    }

    public void setGjUserId(Integer gjUserId) {
        this.gjUserId = gjUserId;
    }

    public String getGjOrderNo() {
        return gjOrderNo;
    }

    public void setGjOrderNo(String gjOrderNo) {
        this.gjOrderNo = gjOrderNo == null ? null : gjOrderNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Byte getIsMobile() {
        return isMobile;
    }

    public void setIsMobile(Byte isMobile) {
        this.isMobile = isMobile;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}