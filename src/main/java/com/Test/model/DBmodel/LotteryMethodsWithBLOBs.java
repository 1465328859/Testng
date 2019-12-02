package com.Test.model.DBmodel;

public class LotteryMethodsWithBLOBs extends LotteryMethods {
    private String oddsIds;

    private String allCode;

    public String getOddsIds() {
        return oddsIds;
    }

    public void setOddsIds(String oddsIds) {
        this.oddsIds = oddsIds == null ? null : oddsIds.trim();
    }

    public String getAllCode() {
        return allCode;
    }

    public void setAllCode(String allCode) {
        this.allCode = allCode == null ? null : allCode.trim();
    }
}