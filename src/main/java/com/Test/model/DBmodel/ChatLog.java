package com.Test.model.DBmodel;

import java.util.Date;

public class ChatLog {
    private Integer logid;

    private Integer toid;

    private Integer putid;

    private Byte type;

    private String centent;

    private Date time;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Integer getToid() {
        return toid;
    }

    public void setToid(Integer toid) {
        this.toid = toid;
    }

    public Integer getPutid() {
        return putid;
    }

    public void setPutid(Integer putid) {
        this.putid = putid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getCentent() {
        return centent;
    }

    public void setCentent(String centent) {
        this.centent = centent == null ? null : centent.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}