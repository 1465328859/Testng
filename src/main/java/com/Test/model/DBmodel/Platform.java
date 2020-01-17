package com.Test.model.DBmodel;

public class Platform {
    private Integer platformId;

    private String name;

    private Byte stauts;

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getStauts() {
        return stauts;
    }

    public void setStauts(Byte stauts) {
        this.stauts = stauts;
    }
}