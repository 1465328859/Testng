package com.Test.model.DBmodel;

import java.math.BigDecimal;

public class LotteryOdds {
    private Integer id;

    private Integer lotteryId;

    private String oddsName;

    private String oddsAlias;

    private BigDecimal topOdds;

    private BigDecimal lowOdds;

    private String spare;

    private Boolean isOrigin;

    private Integer wayClassId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getOddsName() {
        return oddsName;
    }

    public void setOddsName(String oddsName) {
        this.oddsName = oddsName == null ? null : oddsName.trim();
    }

    public String getOddsAlias() {
        return oddsAlias;
    }

    public void setOddsAlias(String oddsAlias) {
        this.oddsAlias = oddsAlias == null ? null : oddsAlias.trim();
    }

    public BigDecimal getTopOdds() {
        return topOdds;
    }

    public void setTopOdds(BigDecimal topOdds) {
        this.topOdds = topOdds;
    }

    public BigDecimal getLowOdds() {
        return lowOdds;
    }

    public void setLowOdds(BigDecimal lowOdds) {
        this.lowOdds = lowOdds;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare == null ? null : spare.trim();
    }

    public Boolean getIsOrigin() {
        return isOrigin;
    }

    public void setIsOrigin(Boolean isOrigin) {
        this.isOrigin = isOrigin;
    }

    public Integer getWayClassId() {
        return wayClassId;
    }

    public void setWayClassId(Integer wayClassId) {
        this.wayClassId = wayClassId;
    }
}