package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class RptLottery {
    private Integer id;

    private Integer lotteryId;

    private Integer single;

    private BigDecimal rental;

    private BigDecimal colorrental;

    private Integer people;

    private Integer number;

    private Date createTime;

    private String betUsers;

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

    public Integer getSingle() {
        return single;
    }

    public void setSingle(Integer single) {
        this.single = single;
    }

    public BigDecimal getRental() {
        return rental;
    }

    public void setRental(BigDecimal rental) {
        this.rental = rental;
    }

    public BigDecimal getColorrental() {
        return colorrental;
    }

    public void setColorrental(BigDecimal colorrental) {
        this.colorrental = colorrental;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBetUsers() {
        return betUsers;
    }

    public void setBetUsers(String betUsers) {
        this.betUsers = betUsers == null ? null : betUsers.trim();
    }
}