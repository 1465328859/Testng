package com.Test.model.DBmodel;

public class AdminUser {
    private Integer uid;

    private String nickname;

    private String password;

    private String manageAuth;

    private String loginCode;

    private Integer loginTime;

    private Integer googleAuth;

    private String ip;

    private String name;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getManageAuth() {
        return manageAuth;
    }

    public void setManageAuth(String manageAuth) {
        this.manageAuth = manageAuth == null ? null : manageAuth.trim();
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode == null ? null : loginCode.trim();
    }

    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getGoogleAuth() {
        return googleAuth;
    }

    public void setGoogleAuth(Integer googleAuth) {
        this.googleAuth = googleAuth;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}