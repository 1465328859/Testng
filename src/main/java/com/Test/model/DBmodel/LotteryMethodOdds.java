package com.Test.model.DBmodel;

public class LotteryMethodOdds {
    private Integer id;

    private Integer methodId;

    private Integer lotteryId;

    private Boolean open;

    private String oddsIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMethodId() {
        return methodId;
    }

    public void setMethodId(Integer methodId) {
        this.methodId = methodId;
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public String getOddsIds() {
        return oddsIds;
    }

    public void setOddsIds(String oddsIds) {
        this.oddsIds = oddsIds == null ? null : oddsIds.trim();
    }
}