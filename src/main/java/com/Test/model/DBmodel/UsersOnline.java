package com.Test.model.DBmodel;

import java.util.Date;

public class UsersOnline {
    private Integer onlineId;

    private String username;

    private Date loginTime;

    private Integer timeLingt;

    private String loginIp;

    private String loginUrl;

    private Byte loginFrom;

    private String position;

    public Integer getOnlineId() {
        return onlineId;
    }

    public void setOnlineId(Integer onlineId) {
        this.onlineId = onlineId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getTimeLingt() {
        return timeLingt;
    }

    public void setTimeLingt(Integer timeLingt) {
        this.timeLingt = timeLingt;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl == null ? null : loginUrl.trim();
    }

    public Byte getLoginFrom() {
        return loginFrom;
    }

    public void setLoginFrom(Byte loginFrom) {
        this.loginFrom = loginFrom;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}