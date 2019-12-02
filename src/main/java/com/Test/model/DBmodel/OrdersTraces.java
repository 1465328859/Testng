package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersTraces {
    private Integer traceId;

    private Integer userId;

    private Integer topId;

    private Byte lotteryId;

    private String startIssue;

    private Integer singleNum;

    private BigDecimal totalAmount;

    private BigDecimal drawMoney;

    private Integer drawNum;

    private Byte isLocked;

    private Short traceTimes;

    private BigDecimal prize;

    private Short winTimes;

    private Short finishTimes;

    private Short cancelTimes;

    private Boolean stopOnWin;

    private Integer createTime;

    private Boolean isRejudge;

    private Boolean status;

    private String clientIp;

    private String serverIp;

    private Byte from;

    private Date ts;

    private String username;

    private String upThreeGrade;

    private Byte grade;

    public Integer getTraceId() {
        return traceId;
    }

    public void setTraceId(Integer traceId) {
        this.traceId = traceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public Byte getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Byte lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getStartIssue() {
        return startIssue;
    }

    public void setStartIssue(String startIssue) {
        this.startIssue = startIssue == null ? null : startIssue.trim();
    }

    public Integer getSingleNum() {
        return singleNum;
    }

    public void setSingleNum(Integer singleNum) {
        this.singleNum = singleNum;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDrawMoney() {
        return drawMoney;
    }

    public void setDrawMoney(BigDecimal drawMoney) {
        this.drawMoney = drawMoney;
    }

    public Integer getDrawNum() {
        return drawNum;
    }

    public void setDrawNum(Integer drawNum) {
        this.drawNum = drawNum;
    }

    public Byte getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Byte isLocked) {
        this.isLocked = isLocked;
    }

    public Short getTraceTimes() {
        return traceTimes;
    }

    public void setTraceTimes(Short traceTimes) {
        this.traceTimes = traceTimes;
    }

    public BigDecimal getPrize() {
        return prize;
    }

    public void setPrize(BigDecimal prize) {
        this.prize = prize;
    }

    public Short getWinTimes() {
        return winTimes;
    }

    public void setWinTimes(Short winTimes) {
        this.winTimes = winTimes;
    }

    public Short getFinishTimes() {
        return finishTimes;
    }

    public void setFinishTimes(Short finishTimes) {
        this.finishTimes = finishTimes;
    }

    public Short getCancelTimes() {
        return cancelTimes;
    }

    public void setCancelTimes(Short cancelTimes) {
        this.cancelTimes = cancelTimes;
    }

    public Boolean getStopOnWin() {
        return stopOnWin;
    }

    public void setStopOnWin(Boolean stopOnWin) {
        this.stopOnWin = stopOnWin;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsRejudge() {
        return isRejudge;
    }

    public void setIsRejudge(Boolean isRejudge) {
        this.isRejudge = isRejudge;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public Byte getFrom() {
        return from;
    }

    public void setFrom(Byte from) {
        this.from = from;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUpThreeGrade() {
        return upThreeGrade;
    }

    public void setUpThreeGrade(String upThreeGrade) {
        this.upThreeGrade = upThreeGrade == null ? null : upThreeGrade.trim();
    }

    public Byte getGrade() {
        return grade;
    }

    public void setGrade(Byte grade) {
        this.grade = grade;
    }
}