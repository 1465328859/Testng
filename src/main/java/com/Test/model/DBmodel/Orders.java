package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer orderId;

    private Integer traceId;

    private String orderNo;

    private Integer userId;

    private Integer topId;

    private Byte lotteryId;

    private String lotteryName;

    private Integer singleNum;

    private Integer multiple;

    private BigDecimal amount;

    private String upThreeGrade;

    private BigDecimal prize;

    private String issue;

    private String openCode;

    private BigDecimal curRebate;

    private Boolean modes;

    private Integer createTime;

    private Byte checkPrizeStatus;

    private Integer sendPrizeTime;

    private Byte cancelStatus;

    private Boolean isRejudge;

    private Short cancelAdminId;

    private Integer cancelTime;

    private String clientIp;

    private String serverIp;

    private Date editTime;

    private Date belongDate;

    private Byte grade;

    private String username;

    private Byte from;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTraceId() {
        return traceId;
    }

    public void setTraceId(Integer traceId) {
        this.traceId = traceId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    public Integer getSingleNum() {
        return singleNum;
    }

    public void setSingleNum(Integer singleNum) {
        this.singleNum = singleNum;
    }

    public Integer getMultiple() {
        return multiple;
    }

    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getUpThreeGrade() {
        return upThreeGrade;
    }

    public void setUpThreeGrade(String upThreeGrade) {
        this.upThreeGrade = upThreeGrade == null ? null : upThreeGrade.trim();
    }

    public BigDecimal getPrize() {
        return prize;
    }

    public void setPrize(BigDecimal prize) {
        this.prize = prize;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getOpenCode() {
        return openCode;
    }

    public void setOpenCode(String openCode) {
        this.openCode = openCode == null ? null : openCode.trim();
    }

    public BigDecimal getCurRebate() {
        return curRebate;
    }

    public void setCurRebate(BigDecimal curRebate) {
        this.curRebate = curRebate;
    }

    public Boolean getModes() {
        return modes;
    }

    public void setModes(Boolean modes) {
        this.modes = modes;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Byte getCheckPrizeStatus() {
        return checkPrizeStatus;
    }

    public void setCheckPrizeStatus(Byte checkPrizeStatus) {
        this.checkPrizeStatus = checkPrizeStatus;
    }

    public Integer getSendPrizeTime() {
        return sendPrizeTime;
    }

    public void setSendPrizeTime(Integer sendPrizeTime) {
        this.sendPrizeTime = sendPrizeTime;
    }

    public Byte getCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(Byte cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public Boolean getIsRejudge() {
        return isRejudge;
    }

    public void setIsRejudge(Boolean isRejudge) {
        this.isRejudge = isRejudge;
    }

    public Short getCancelAdminId() {
        return cancelAdminId;
    }

    public void setCancelAdminId(Short cancelAdminId) {
        this.cancelAdminId = cancelAdminId;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
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

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Date getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(Date belongDate) {
        this.belongDate = belongDate;
    }

    public Byte getGrade() {
        return grade;
    }

    public void setGrade(Byte grade) {
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Byte getFrom() {
        return from;
    }

    public void setFrom(Byte from) {
        this.from = from;
    }
}