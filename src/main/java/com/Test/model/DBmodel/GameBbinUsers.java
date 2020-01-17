package com.Test.model.DBmodel;

import java.util.Date;

public class GameBbinUsers {
    private Integer id;

    private Integer userId;

    private String username;

    private String bbinUsername;

    private String bbinPassword;

    private Byte state;

    private Date registeredTime;

    private Date updatedTime;

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

    public String getBbinUsername() {
        return bbinUsername;
    }

    public void setBbinUsername(String bbinUsername) {
        this.bbinUsername = bbinUsername == null ? null : bbinUsername.trim();
    }

    public String getBbinPassword() {
        return bbinPassword;
    }

    public void setBbinPassword(String bbinPassword) {
        this.bbinPassword = bbinPassword == null ? null : bbinPassword.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(Date registeredTime) {
        this.registeredTime = registeredTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}