package com.Test.model.DBmodel;

public class LotteryMethodGroup {
    private Integer id;

    private Integer lotteryClassifyId;

    private String name;

    private Boolean classType;

    private Integer dftClassid;

    private Boolean source;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLotteryClassifyId() {
        return lotteryClassifyId;
    }

    public void setLotteryClassifyId(Integer lotteryClassifyId) {
        this.lotteryClassifyId = lotteryClassifyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getClassType() {
        return classType;
    }

    public void setClassType(Boolean classType) {
        this.classType = classType;
    }

    public Integer getDftClassid() {
        return dftClassid;
    }

    public void setDftClassid(Integer dftClassid) {
        this.dftClassid = dftClassid;
    }

    public Boolean getSource() {
        return source;
    }

    public void setSource(Boolean source) {
        this.source = source;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}