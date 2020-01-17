package com.Test.model.DBmodel;

public class GameJdbGames {
    private Integer id;

    private Integer gType;

    private Integer mType;

    private String gameCnName;

    private String gameEnName;

    private String imageCn;

    private String imageEn;

    private Byte state;

    private Byte isNew;

    private Byte isHot;

    private Byte sortNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getgType() {
        return gType;
    }

    public void setgType(Integer gType) {
        this.gType = gType;
    }

    public Integer getmType() {
        return mType;
    }

    public void setmType(Integer mType) {
        this.mType = mType;
    }

    public String getGameCnName() {
        return gameCnName;
    }

    public void setGameCnName(String gameCnName) {
        this.gameCnName = gameCnName == null ? null : gameCnName.trim();
    }

    public String getGameEnName() {
        return gameEnName;
    }

    public void setGameEnName(String gameEnName) {
        this.gameEnName = gameEnName == null ? null : gameEnName.trim();
    }

    public String getImageCn() {
        return imageCn;
    }

    public void setImageCn(String imageCn) {
        this.imageCn = imageCn == null ? null : imageCn.trim();
    }

    public String getImageEn() {
        return imageEn;
    }

    public void setImageEn(String imageEn) {
        this.imageEn = imageEn == null ? null : imageEn.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Byte getSortNo() {
        return sortNo;
    }

    public void setSortNo(Byte sortNo) {
        this.sortNo = sortNo;
    }
}