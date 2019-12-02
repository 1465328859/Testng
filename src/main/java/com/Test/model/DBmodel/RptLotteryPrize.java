package com.Test.model.DBmodel;

import java.util.Date;

public class RptLotteryPrize {
    private Integer id;

    private Integer lotteryId;

    private Float totalAmount;

    private Float totalPrize;

    private Integer belongDate;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Float getTotalPrize() {
        return totalPrize;
    }

    public void setTotalPrize(Float totalPrize) {
        this.totalPrize = totalPrize;
    }

    public Integer getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(Integer belongDate) {
        this.belongDate = belongDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}