package com.Test.model.DBmodel;

public class GameBettingAgHunterKey {
    private Byte platform;

    private String betOrderNo;

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public String getBetOrderNo() {
        return betOrderNo;
    }

    public void setBetOrderNo(String betOrderNo) {
        this.betOrderNo = betOrderNo == null ? null : betOrderNo.trim();
    }
}