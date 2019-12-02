package com.Test.model.DBmodel;

import java.util.Date;

public class ChatGroup {
    private Integer id;

    private String groupName;

    private String groupDesc;

    private Byte speakCd;

    private Byte isRestricted;

    private Boolean isOfficial;

    private Integer personnumber;

    private Integer sendMsgLimit;

    private Byte sort;

    private Byte status;

    private Date groupTime;

    private String groupImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    public Byte getSpeakCd() {
        return speakCd;
    }

    public void setSpeakCd(Byte speakCd) {
        this.speakCd = speakCd;
    }

    public Byte getIsRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(Byte isRestricted) {
        this.isRestricted = isRestricted;
    }

    public Boolean getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Integer getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(Integer personnumber) {
        this.personnumber = personnumber;
    }

    public Integer getSendMsgLimit() {
        return sendMsgLimit;
    }

    public void setSendMsgLimit(Integer sendMsgLimit) {
        this.sendMsgLimit = sendMsgLimit;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getGroupTime() {
        return groupTime;
    }

    public void setGroupTime(Date groupTime) {
        this.groupTime = groupTime;
    }

    public String getGroupImg() {
        return groupImg;
    }

    public void setGroupImg(String groupImg) {
        this.groupImg = groupImg == null ? null : groupImg.trim();
    }
}