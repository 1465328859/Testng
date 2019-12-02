package com.Test.model.DBmodel;

public class OrdersItemsWithBLOBs extends OrdersItems {
    private String code;

    private String prizeCode;

    private String rate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPrizeCode() {
        return prizeCode;
    }

    public void setPrizeCode(String prizeCode) {
        this.prizeCode = prizeCode == null ? null : prizeCode.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }
}