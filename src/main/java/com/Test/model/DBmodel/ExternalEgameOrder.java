package com.Test.model.DBmodel;

import java.util.Date;

public class ExternalEgameOrder {
    private Integer id;

    private Integer type;

    private String billno;

    private String gameName;

    private String productid;

    private String username;

    private Date billtime;

    private Date reckontime;

    private Float slottype;

    private String currency;

    private String gameType;

    private Float account;

    private Float cusAccount;

    private Integer validAccount;

    private Float accountBase;

    private Float accountBonus;

    private Float cusAccountBase;

    private Float cusAccountBonus;

    private String betIp;

    private String srcAmount;

    private String dstAmount;

    private Integer flag;

    private String platformType;

    private Integer devicetype;

    private String exttxid;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
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

    public Date getBilltime() {
        return billtime;
    }

    public void setBilltime(Date billtime) {
        this.billtime = billtime;
    }

    public Date getReckontime() {
        return reckontime;
    }

    public void setReckontime(Date reckontime) {
        this.reckontime = reckontime;
    }

    public Float getSlottype() {
        return slottype;
    }

    public void setSlottype(Float slottype) {
        this.slottype = slottype;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    public Float getAccount() {
        return account;
    }

    public void setAccount(Float account) {
        this.account = account;
    }

    public Float getCusAccount() {
        return cusAccount;
    }

    public void setCusAccount(Float cusAccount) {
        this.cusAccount = cusAccount;
    }

    public Integer getValidAccount() {
        return validAccount;
    }

    public void setValidAccount(Integer validAccount) {
        this.validAccount = validAccount;
    }

    public Float getAccountBase() {
        return accountBase;
    }

    public void setAccountBase(Float accountBase) {
        this.accountBase = accountBase;
    }

    public Float getAccountBonus() {
        return accountBonus;
    }

    public void setAccountBonus(Float accountBonus) {
        this.accountBonus = accountBonus;
    }

    public Float getCusAccountBase() {
        return cusAccountBase;
    }

    public void setCusAccountBase(Float cusAccountBase) {
        this.cusAccountBase = cusAccountBase;
    }

    public Float getCusAccountBonus() {
        return cusAccountBonus;
    }

    public void setCusAccountBonus(Float cusAccountBonus) {
        this.cusAccountBonus = cusAccountBonus;
    }

    public String getBetIp() {
        return betIp;
    }

    public void setBetIp(String betIp) {
        this.betIp = betIp == null ? null : betIp.trim();
    }

    public String getSrcAmount() {
        return srcAmount;
    }

    public void setSrcAmount(String srcAmount) {
        this.srcAmount = srcAmount == null ? null : srcAmount.trim();
    }

    public String getDstAmount() {
        return dstAmount;
    }

    public void setDstAmount(String dstAmount) {
        this.dstAmount = dstAmount == null ? null : dstAmount.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    public Integer getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(Integer devicetype) {
        this.devicetype = devicetype;
    }

    public String getExttxid() {
        return exttxid;
    }

    public void setExttxid(String exttxid) {
        this.exttxid = exttxid == null ? null : exttxid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}