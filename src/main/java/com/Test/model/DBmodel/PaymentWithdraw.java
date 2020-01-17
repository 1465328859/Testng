package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentWithdraw {
    private Integer id;

    private Integer userId;

    private String username;

    private Integer topId;

    private String upThreeGrade;

    private BigDecimal takeAmount;

    private Byte gameBetStatus;

    private BigDecimal gameTotalInMoney;

    private BigDecimal gameTotalOutMoney;

    private BigDecimal gameTotalBetMoney;

    private Integer lastRechargeId;

    private Date lastRechargeTime;

    private Boolean status;

    private Boolean isFirst;

    private Byte isTake;

    private String takeTime;

    private String takeIp;

    private String actionAdmin;

    private String checkAdmin;

    private Boolean accountType;

    private Integer checkTime;

    private BigDecimal afterAmount;

    private BigDecimal beforeAmount;

    private String remark;

    private Boolean isRead;

    private String ordernotes;

    private Boolean type;

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

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public String getUpThreeGrade() {
        return upThreeGrade;
    }

    public void setUpThreeGrade(String upThreeGrade) {
        this.upThreeGrade = upThreeGrade == null ? null : upThreeGrade.trim();
    }

    public BigDecimal getTakeAmount() {
        return takeAmount;
    }

    public void setTakeAmount(BigDecimal takeAmount) {
        this.takeAmount = takeAmount;
    }

    public Byte getGameBetStatus() {
        return gameBetStatus;
    }

    public void setGameBetStatus(Byte gameBetStatus) {
        this.gameBetStatus = gameBetStatus;
    }

    public BigDecimal getGameTotalInMoney() {
        return gameTotalInMoney;
    }

    public void setGameTotalInMoney(BigDecimal gameTotalInMoney) {
        this.gameTotalInMoney = gameTotalInMoney;
    }

    public BigDecimal getGameTotalOutMoney() {
        return gameTotalOutMoney;
    }

    public void setGameTotalOutMoney(BigDecimal gameTotalOutMoney) {
        this.gameTotalOutMoney = gameTotalOutMoney;
    }

    public BigDecimal getGameTotalBetMoney() {
        return gameTotalBetMoney;
    }

    public void setGameTotalBetMoney(BigDecimal gameTotalBetMoney) {
        this.gameTotalBetMoney = gameTotalBetMoney;
    }

    public Integer getLastRechargeId() {
        return lastRechargeId;
    }

    public void setLastRechargeId(Integer lastRechargeId) {
        this.lastRechargeId = lastRechargeId;
    }

    public Date getLastRechargeTime() {
        return lastRechargeTime;
    }

    public void setLastRechargeTime(Date lastRechargeTime) {
        this.lastRechargeTime = lastRechargeTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }

    public Byte getIsTake() {
        return isTake;
    }

    public void setIsTake(Byte isTake) {
        this.isTake = isTake;
    }

    public String getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(String takeTime) {
        this.takeTime = takeTime == null ? null : takeTime.trim();
    }

    public String getTakeIp() {
        return takeIp;
    }

    public void setTakeIp(String takeIp) {
        this.takeIp = takeIp == null ? null : takeIp.trim();
    }

    public String getActionAdmin() {
        return actionAdmin;
    }

    public void setActionAdmin(String actionAdmin) {
        this.actionAdmin = actionAdmin == null ? null : actionAdmin.trim();
    }

    public String getCheckAdmin() {
        return checkAdmin;
    }

    public void setCheckAdmin(String checkAdmin) {
        this.checkAdmin = checkAdmin == null ? null : checkAdmin.trim();
    }

    public Boolean getAccountType() {
        return accountType;
    }

    public void setAccountType(Boolean accountType) {
        this.accountType = accountType;
    }

    public Integer getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Integer checkTime) {
        this.checkTime = checkTime;
    }

    public BigDecimal getAfterAmount() {
        return afterAmount;
    }

    public void setAfterAmount(BigDecimal afterAmount) {
        this.afterAmount = afterAmount;
    }

    public BigDecimal getBeforeAmount() {
        return beforeAmount;
    }

    public void setBeforeAmount(BigDecimal beforeAmount) {
        this.beforeAmount = beforeAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public String getOrdernotes() {
        return ordernotes;
    }

    public void setOrdernotes(String ordernotes) {
        this.ordernotes = ordernotes == null ? null : ordernotes.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }
}