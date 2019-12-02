package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class RptUserBet {
    private Integer id;

    private Integer userId;

    private String username;

    private Integer topId;

    private String upThreeGrade;

    private Integer number;

    private Integer tzzs;

    private Integer zjzs;

    private BigDecimal betAmount;

    private BigDecimal rebateAmount;

    private BigDecimal prizeAmount;

    private BigDecimal onlineAmount;

    private BigDecimal manualIn;

    private BigDecimal offlineAmount;

    private BigDecimal agentRebate;

    private BigDecimal memberTake;

    private Integer memberTakeCount;

    private BigDecimal manualOut;

    private Integer manualOutCount;

    private BigDecimal depositsNorptAmount;

    private BigDecimal withdrawalNorptAmount;

    private BigDecimal registerOffer;

    private BigDecimal lotteryOffer;

    private BigDecimal chargeRebate;

    private Integer createTime;

    private Integer companyDepositsNum;

    private Integer onlineDepositsNum;

    private Integer manualDepositsNum;

    private Integer memberWithdrawalCount;

    private BigDecimal memberWithdrawalMoney;

    private Integer vaildUser;

    private Integer backwaterUser;

    private String lotteryAmount;

    private Date belongDate;

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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getTzzs() {
        return tzzs;
    }

    public void setTzzs(Integer tzzs) {
        this.tzzs = tzzs;
    }

    public Integer getZjzs() {
        return zjzs;
    }

    public void setZjzs(Integer zjzs) {
        this.zjzs = zjzs;
    }

    public BigDecimal getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(BigDecimal betAmount) {
        this.betAmount = betAmount;
    }

    public BigDecimal getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(BigDecimal rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    public BigDecimal getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(BigDecimal prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public BigDecimal getOnlineAmount() {
        return onlineAmount;
    }

    public void setOnlineAmount(BigDecimal onlineAmount) {
        this.onlineAmount = onlineAmount;
    }

    public BigDecimal getManualIn() {
        return manualIn;
    }

    public void setManualIn(BigDecimal manualIn) {
        this.manualIn = manualIn;
    }

    public BigDecimal getOfflineAmount() {
        return offlineAmount;
    }

    public void setOfflineAmount(BigDecimal offlineAmount) {
        this.offlineAmount = offlineAmount;
    }

    public BigDecimal getAgentRebate() {
        return agentRebate;
    }

    public void setAgentRebate(BigDecimal agentRebate) {
        this.agentRebate = agentRebate;
    }

    public BigDecimal getMemberTake() {
        return memberTake;
    }

    public void setMemberTake(BigDecimal memberTake) {
        this.memberTake = memberTake;
    }

    public Integer getMemberTakeCount() {
        return memberTakeCount;
    }

    public void setMemberTakeCount(Integer memberTakeCount) {
        this.memberTakeCount = memberTakeCount;
    }

    public BigDecimal getManualOut() {
        return manualOut;
    }

    public void setManualOut(BigDecimal manualOut) {
        this.manualOut = manualOut;
    }

    public Integer getManualOutCount() {
        return manualOutCount;
    }

    public void setManualOutCount(Integer manualOutCount) {
        this.manualOutCount = manualOutCount;
    }

    public BigDecimal getDepositsNorptAmount() {
        return depositsNorptAmount;
    }

    public void setDepositsNorptAmount(BigDecimal depositsNorptAmount) {
        this.depositsNorptAmount = depositsNorptAmount;
    }

    public BigDecimal getWithdrawalNorptAmount() {
        return withdrawalNorptAmount;
    }

    public void setWithdrawalNorptAmount(BigDecimal withdrawalNorptAmount) {
        this.withdrawalNorptAmount = withdrawalNorptAmount;
    }

    public BigDecimal getRegisterOffer() {
        return registerOffer;
    }

    public void setRegisterOffer(BigDecimal registerOffer) {
        this.registerOffer = registerOffer;
    }

    public BigDecimal getLotteryOffer() {
        return lotteryOffer;
    }

    public void setLotteryOffer(BigDecimal lotteryOffer) {
        this.lotteryOffer = lotteryOffer;
    }

    public BigDecimal getChargeRebate() {
        return chargeRebate;
    }

    public void setChargeRebate(BigDecimal chargeRebate) {
        this.chargeRebate = chargeRebate;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getCompanyDepositsNum() {
        return companyDepositsNum;
    }

    public void setCompanyDepositsNum(Integer companyDepositsNum) {
        this.companyDepositsNum = companyDepositsNum;
    }

    public Integer getOnlineDepositsNum() {
        return onlineDepositsNum;
    }

    public void setOnlineDepositsNum(Integer onlineDepositsNum) {
        this.onlineDepositsNum = onlineDepositsNum;
    }

    public Integer getManualDepositsNum() {
        return manualDepositsNum;
    }

    public void setManualDepositsNum(Integer manualDepositsNum) {
        this.manualDepositsNum = manualDepositsNum;
    }

    public Integer getMemberWithdrawalCount() {
        return memberWithdrawalCount;
    }

    public void setMemberWithdrawalCount(Integer memberWithdrawalCount) {
        this.memberWithdrawalCount = memberWithdrawalCount;
    }

    public BigDecimal getMemberWithdrawalMoney() {
        return memberWithdrawalMoney;
    }

    public void setMemberWithdrawalMoney(BigDecimal memberWithdrawalMoney) {
        this.memberWithdrawalMoney = memberWithdrawalMoney;
    }

    public Integer getVaildUser() {
        return vaildUser;
    }

    public void setVaildUser(Integer vaildUser) {
        this.vaildUser = vaildUser;
    }

    public Integer getBackwaterUser() {
        return backwaterUser;
    }

    public void setBackwaterUser(Integer backwaterUser) {
        this.backwaterUser = backwaterUser;
    }

    public String getLotteryAmount() {
        return lotteryAmount;
    }

    public void setLotteryAmount(String lotteryAmount) {
        this.lotteryAmount = lotteryAmount == null ? null : lotteryAmount.trim();
    }

    public Date getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(Date belongDate) {
        this.belongDate = belongDate;
    }
}