package com.Test.model.DBmodel;

import java.util.Date;

public class LotteryIssues extends LotteryIssuesKey {
    private Integer lotteryId;

    private String issue;

    private String prizeRes;

    private Boolean isBet;

    private Boolean prePrize;

    private Boolean statusCheckPrize;

    private Date belongDate;

    private Integer addTime;

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getPrizeRes() {
        return prizeRes;
    }

    public void setPrizeRes(String prizeRes) {
        this.prizeRes = prizeRes == null ? null : prizeRes.trim();
    }

    public Boolean getIsBet() {
        return isBet;
    }

    public void setIsBet(Boolean isBet) {
        this.isBet = isBet;
    }

    public Boolean getPrePrize() {
        return prePrize;
    }

    public void setPrePrize(Boolean prePrize) {
        this.prePrize = prePrize;
    }

    public Boolean getStatusCheckPrize() {
        return statusCheckPrize;
    }

    public void setStatusCheckPrize(Boolean statusCheckPrize) {
        this.statusCheckPrize = statusCheckPrize;
    }

    public Date getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(Date belongDate) {
        this.belongDate = belongDate;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}