package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GameAgBettingHunterSceneRecord {
    private String billno;

    private String productid;

    private String username;

    private Integer roomid;

    private Integer betx;

    private String sceneid;

    private Date starttime;

    private Date endtime;

    private Date billtime;

    private String gametype;

    private String currency;

    private BigDecimal totalbulletcost;

    private BigDecimal totalfishcost;

    private BigDecimal profit;

    private BigDecimal totaljpcontribute;

    private BigDecimal totaljackpot;

    private BigDecimal totalfirstprize;

    private String remark;

    private Byte devicetype;

    private Date createdAt;

    private Date updatedAt;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getBetx() {
        return betx;
    }

    public void setBetx(Integer betx) {
        this.betx = betx;
    }

    public String getSceneid() {
        return sceneid;
    }

    public void setSceneid(String sceneid) {
        this.sceneid = sceneid == null ? null : sceneid.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getBilltime() {
        return billtime;
    }

    public void setBilltime(Date billtime) {
        this.billtime = billtime;
    }

    public String getGametype() {
        return gametype;
    }

    public void setGametype(String gametype) {
        this.gametype = gametype == null ? null : gametype.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getTotalbulletcost() {
        return totalbulletcost;
    }

    public void setTotalbulletcost(BigDecimal totalbulletcost) {
        this.totalbulletcost = totalbulletcost;
    }

    public BigDecimal getTotalfishcost() {
        return totalfishcost;
    }

    public void setTotalfishcost(BigDecimal totalfishcost) {
        this.totalfishcost = totalfishcost;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getTotaljpcontribute() {
        return totaljpcontribute;
    }

    public void setTotaljpcontribute(BigDecimal totaljpcontribute) {
        this.totaljpcontribute = totaljpcontribute;
    }

    public BigDecimal getTotaljackpot() {
        return totaljackpot;
    }

    public void setTotaljackpot(BigDecimal totaljackpot) {
        this.totaljackpot = totaljackpot;
    }

    public BigDecimal getTotalfirstprize() {
        return totalfirstprize;
    }

    public void setTotalfirstprize(BigDecimal totalfirstprize) {
        this.totalfirstprize = totalfirstprize;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(Byte devicetype) {
        this.devicetype = devicetype;
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