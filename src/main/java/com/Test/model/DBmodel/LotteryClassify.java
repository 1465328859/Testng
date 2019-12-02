package com.Test.model.DBmodel;

import java.math.BigDecimal;

public class LotteryClassify {
    private Integer lotteryClassifyId;

    private String kindId;

    private String kindName;

    private String key;

    private BigDecimal kindRebate;

    private Boolean status;

    private String icon;

    private String phoneIcon;

    private String notPhoneIcon;

    private Integer sorting;

    private String introduce;

    public Integer getLotteryClassifyId() {
        return lotteryClassifyId;
    }

    public void setLotteryClassifyId(Integer lotteryClassifyId) {
        this.lotteryClassifyId = lotteryClassifyId;
    }

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId == null ? null : kindId.trim();
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public BigDecimal getKindRebate() {
        return kindRebate;
    }

    public void setKindRebate(BigDecimal kindRebate) {
        this.kindRebate = kindRebate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getPhoneIcon() {
        return phoneIcon;
    }

    public void setPhoneIcon(String phoneIcon) {
        this.phoneIcon = phoneIcon == null ? null : phoneIcon.trim();
    }

    public String getNotPhoneIcon() {
        return notPhoneIcon;
    }

    public void setNotPhoneIcon(String notPhoneIcon) {
        this.notPhoneIcon = notPhoneIcon == null ? null : notPhoneIcon.trim();
    }

    public Integer getSorting() {
        return sorting;
    }

    public void setSorting(Integer sorting) {
        this.sorting = sorting;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}