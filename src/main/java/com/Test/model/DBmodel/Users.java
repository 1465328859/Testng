package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class Users {
    private Integer userId;

    private String username;

    private String pwd;

    private String safePwd;

    private String salt;

    private BigDecimal balance;

    private BigDecimal totalBetMoney;

    private BigDecimal totalDepositMoney;

    private BigDecimal totalWithdrawMoney;

    private BigDecimal betMoney;

    private Integer parentId;

    private Integer topId;

    private Byte grade;

    private String upThreeGrade;

    private Byte status;

    private Byte regFrom;

    private String regIp;

    private Integer lastLogin;

    private String lastIp;

    private Integer loginCount;

    private Date editTime;

    private Integer ctime;

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getSafePwd() {
        return safePwd;
    }

    public void setSafePwd(String safePwd) {
        this.safePwd = safePwd == null ? null : safePwd.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getTotalBetMoney() {
        return totalBetMoney;
    }

    public void setTotalBetMoney(BigDecimal totalBetMoney) {
        this.totalBetMoney = totalBetMoney;
    }

    public BigDecimal getTotalDepositMoney() {
        return totalDepositMoney;
    }

    public void setTotalDepositMoney(BigDecimal totalDepositMoney) {
        this.totalDepositMoney = totalDepositMoney;
    }

    public BigDecimal getTotalWithdrawMoney() {
        return totalWithdrawMoney;
    }

    public void setTotalWithdrawMoney(BigDecimal totalWithdrawMoney) {
        this.totalWithdrawMoney = totalWithdrawMoney;
    }

    public BigDecimal getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(BigDecimal betMoney) {
        this.betMoney = betMoney;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public Byte getGrade() {
        return grade;
    }

    public void setGrade(Byte grade) {
        this.grade = grade;
    }

    public String getUpThreeGrade() {
        return upThreeGrade;
    }

    public void setUpThreeGrade(String upThreeGrade) {
        this.upThreeGrade = upThreeGrade == null ? null : upThreeGrade.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getRegFrom() {
        return regFrom;
    }

    public void setRegFrom(Byte regFrom) {
        this.regFrom = regFrom;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public Integer getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
}