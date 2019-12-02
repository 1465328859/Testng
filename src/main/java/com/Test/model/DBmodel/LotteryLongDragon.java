package com.Test.model.DBmodel;

public class LotteryLongDragon {
    private Integer id;

    private Integer lotteryId;

    private String name;

    private Integer num;

    private String issue;

    private String prizeRes;

    private Integer methodId;

    private Integer closeTime;

    private String digit;

    private Byte position;

    private String lotteryName;

    private Object oddsInfo;

    private Integer endBetTime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public Integer getMethodId() {
        return methodId;
    }

    public void setMethodId(Integer methodId) {
        this.methodId = methodId;
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit == null ? null : digit.trim();
    }

    public Byte getPosition() {
        return position;
    }

    public void setPosition(Byte position) {
        this.position = position;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    public Object getOddsInfo() {
        return oddsInfo;
    }

    public void setOddsInfo(Object oddsInfo) {
        this.oddsInfo = oddsInfo;
    }

    public Integer getEndBetTime() {
        return endBetTime;
    }

    public void setEndBetTime(Integer endBetTime) {
        this.endBetTime = endBetTime;
    }
}