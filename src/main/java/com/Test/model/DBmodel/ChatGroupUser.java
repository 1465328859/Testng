package com.Test.model.DBmodel;

public class ChatGroupUser {
    private Integer groupId;

    private Integer userId;

    private Byte type;

    private Byte ontalking;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getOntalking() {
        return ontalking;
    }

    public void setOntalking(Byte ontalking) {
        this.ontalking = ontalking;
    }
}