package com.Test.model.DBmodel;

public class LotteryMethods {
    private Integer methodsId;

    private Integer methodsGroupId;

    private String minGroup;

    private String methodName;

    private String key;

    private String nameAb;

    private Integer minNum;

    private Integer maxNum;

    private Boolean open;

    private Integer maxMoney;

    private String digit;

    private Integer sort;

    public Integer getMethodsId() {
        return methodsId;
    }

    public void setMethodsId(Integer methodsId) {
        this.methodsId = methodsId;
    }

    public Integer getMethodsGroupId() {
        return methodsGroupId;
    }

    public void setMethodsGroupId(Integer methodsGroupId) {
        this.methodsGroupId = methodsGroupId;
    }

    public String getMinGroup() {
        return minGroup;
    }

    public void setMinGroup(String minGroup) {
        this.minGroup = minGroup == null ? null : minGroup.trim();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getNameAb() {
        return nameAb;
    }

    public void setNameAb(String nameAb) {
        this.nameAb = nameAb == null ? null : nameAb.trim();
    }

    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Integer getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(Integer maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit == null ? null : digit.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}