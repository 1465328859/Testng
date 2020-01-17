package com.Test.model.DBmodel;

import java.util.Date;

public class GameBbinTransfer {
    private Integer id;

    private Integer userId;

    private String username;

    private String bbinUsername;

    private String uppername;

    private String orderNo;

    private String type;

    private Byte state;

    private Integer remit;

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

    public String getBbinUsername() {
        return bbinUsername;
    }

    public void setBbinUsername(String bbinUsername) {
        this.bbinUsername = bbinUsername == null ? null : bbinUsername.trim();
    }

    public String getUppername() {
        return uppername;
    }

    public void setUppername(String uppername) {
        this.uppername = uppername == null ? null : uppername.trim();
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

    public Integer getRemit() {
        return remit;
    }

    public void setRemit(Integer remit) {
        this.remit = remit;
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