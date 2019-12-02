package com.Test.model.DBmodel;

import java.math.BigDecimal;

public class Lottery {
    private Integer lotteryId;

    private String lotteryName;

    private String remark;

    private String desc;

    private String numDay;

    private Integer closeTime;

    private Integer judgeExpiredTime;

    private Byte sort;

    private Byte hallRecommend;

    private Boolean isEnabled;

    private Boolean lotteryType;

    private Integer initialClassId;

    private String logo;

    private BigDecimal kill;

    private String acrossDayTime;

    private Integer lotteryClassifyId;

    private Integer isSelfOpen;

    private Integer killOff;

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getNumDay() {
        return numDay;
    }

    public void setNumDay(String numDay) {
        this.numDay = numDay == null ? null : numDay.trim();
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getJudgeExpiredTime() {
        return judgeExpiredTime;
    }

    public void setJudgeExpiredTime(Integer judgeExpiredTime) {
        this.judgeExpiredTime = judgeExpiredTime;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Byte getHallRecommend() {
        return hallRecommend;
    }

    public void setHallRecommend(Byte hallRecommend) {
        this.hallRecommend = hallRecommend;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(Boolean lotteryType) {
        this.lotteryType = lotteryType;
    }

    public Integer getInitialClassId() {
        return initialClassId;
    }

    public void setInitialClassId(Integer initialClassId) {
        this.initialClassId = initialClassId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public BigDecimal getKill() {
        return kill;
    }

    public void setKill(BigDecimal kill) {
        this.kill = kill;
    }

    public String getAcrossDayTime() {
        return acrossDayTime;
    }

    public void setAcrossDayTime(String acrossDayTime) {
        this.acrossDayTime = acrossDayTime == null ? null : acrossDayTime.trim();
    }

    public Integer getLotteryClassifyId() {
        return lotteryClassifyId;
    }

    public void setLotteryClassifyId(Integer lotteryClassifyId) {
        this.lotteryClassifyId = lotteryClassifyId;
    }

    public Integer getIsSelfOpen() {
        return isSelfOpen;
    }

    public void setIsSelfOpen(Integer isSelfOpen) {
        this.isSelfOpen = isSelfOpen;
    }

    public Integer getKillOff() {
        return killOff;
    }

    public void setKillOff(Integer killOff) {
        this.killOff = killOff;
    }
}