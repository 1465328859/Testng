package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class RptKill {
    private Integer id;

    private Integer czid;

    private Date createTime;

    private BigDecimal rental;

    private BigDecimal colorrental;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCzid() {
        return czid;
    }

    public void setCzid(Integer czid) {
        this.czid = czid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getRental() {
        return rental;
    }

    public void setRental(BigDecimal rental) {
        this.rental = rental;
    }

    public BigDecimal getColorrental() {
        return colorrental;
    }

    public void setColorrental(BigDecimal colorrental) {
        this.colorrental = colorrental;
    }
}