package com.Test.model.DBmodel;

public class PaymentWayAllpays {
    private Byte allpayId;

    private String allpayName;

    private String merchant;

    private String key1;

    private String key2;

    private String key3;

    private Integer thirdId;

    private Byte isOpen;

    private Byte seq;

    private Boolean isCode;

    private String label;

    private String payLabel;

    public Byte getAllpayId() {
        return allpayId;
    }

    public void setAllpayId(Byte allpayId) {
        this.allpayId = allpayId;
    }

    public String getAllpayName() {
        return allpayName;
    }

    public void setAllpayName(String allpayName) {
        this.allpayName = allpayName == null ? null : allpayName.trim();
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant == null ? null : merchant.trim();
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1 == null ? null : key1.trim();
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2 == null ? null : key2.trim();
    }

    public String getKey3() {
        return key3;
    }

    public void setKey3(String key3) {
        this.key3 = key3 == null ? null : key3.trim();
    }

    public Integer getThirdId() {
        return thirdId;
    }

    public void setThirdId(Integer thirdId) {
        this.thirdId = thirdId;
    }

    public Byte getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }

    public Byte getSeq() {
        return seq;
    }

    public void setSeq(Byte seq) {
        this.seq = seq;
    }

    public Boolean getIsCode() {
        return isCode;
    }

    public void setIsCode(Boolean isCode) {
        this.isCode = isCode;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getPayLabel() {
        return payLabel;
    }

    public void setPayLabel(String payLabel) {
        this.payLabel = payLabel == null ? null : payLabel.trim();
    }
}