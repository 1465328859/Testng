package com.Test.model.DBmodel;

public class GameKyGames {
    private Integer id;

    private Integer kindId;

    private String gameName;

    private String image128;

    private String image180;

    private String image197263;

    private String image360;

    private Integer state;

    private Byte isHot;

    private Byte isNew;

    private Byte sortNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public String getImage128() {
        return image128;
    }

    public void setImage128(String image128) {
        this.image128 = image128 == null ? null : image128.trim();
    }

    public String getImage180() {
        return image180;
    }

    public void setImage180(String image180) {
        this.image180 = image180 == null ? null : image180.trim();
    }

    public String getImage197263() {
        return image197263;
    }

    public void setImage197263(String image197263) {
        this.image197263 = image197263 == null ? null : image197263.trim();
    }

    public String getImage360() {
        return image360;
    }

    public void setImage360(String image360) {
        this.image360 = image360 == null ? null : image360.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    public Byte getSortNo() {
        return sortNo;
    }

    public void setSortNo(Byte sortNo) {
        this.sortNo = sortNo;
    }
}