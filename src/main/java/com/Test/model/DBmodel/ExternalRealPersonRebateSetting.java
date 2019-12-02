package com.Test.model.DBmodel;

import java.util.Date;

public class ExternalRealPersonRebateSetting {
    private Integer id;

    private Integer gameId;

    private Integer betAmout;

    private Integer rebateLimit;

    private Float rebate;

    private String label;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getBetAmout() {
        return betAmout;
    }

    public void setBetAmout(Integer betAmout) {
        this.betAmout = betAmout;
    }

    public Integer getRebateLimit() {
        return rebateLimit;
    }

    public void setRebateLimit(Integer rebateLimit) {
        this.rebateLimit = rebateLimit;
    }

    public Float getRebate() {
        return rebate;
    }

    public void setRebate(Float rebate) {
        this.rebate = rebate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}