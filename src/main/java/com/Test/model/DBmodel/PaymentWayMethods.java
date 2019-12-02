package com.Test.model.DBmodel;

import java.math.BigDecimal;

public class PaymentWayMethods {
    private Integer methodId;

    private String name;

    private Integer seq;

    private Boolean status;

    private String logo;

    private Boolean type;

    private BigDecimal typeValue;

    public Integer getMethodId() {
        return methodId;
    }

    public void setMethodId(Integer methodId) {
        this.methodId = methodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public BigDecimal getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(BigDecimal typeValue) {
        this.typeValue = typeValue;
    }
}