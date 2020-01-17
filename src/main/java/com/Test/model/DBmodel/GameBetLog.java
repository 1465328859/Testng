package com.Test.model.DBmodel;

import java.util.Date;

public class GameBetLog {
    private Integer id;

    private Byte platform;

    private Byte betStatus;

    private Byte dataStatus;

    private Byte retry;

    private String start;

    private String end;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public Byte getBetStatus() {
        return betStatus;
    }

    public void setBetStatus(Byte betStatus) {
        this.betStatus = betStatus;
    }

    public Byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Byte getRetry() {
        return retry;
    }

    public void setRetry(Byte retry) {
        this.retry = retry;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}