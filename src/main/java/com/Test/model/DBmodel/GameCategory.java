package com.Test.model.DBmodel;

public class GameCategory {
    private Integer id;

    private Integer type;

    private String categoryName;

    private Byte platform;

    private String alias;

    private Integer pid;

    private String pAlias;

    private String gameType;

    private String image;

    private String bigImage;

    private Byte isSupportTransfer;

    private Byte position;

    private Byte status;

    private Byte sortNo;

    private Byte identification;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getpAlias() {
        return pAlias;
    }

    public void setpAlias(String pAlias) {
        this.pAlias = pAlias == null ? null : pAlias.trim();
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage == null ? null : bigImage.trim();
    }

    public Byte getIsSupportTransfer() {
        return isSupportTransfer;
    }

    public void setIsSupportTransfer(Byte isSupportTransfer) {
        this.isSupportTransfer = isSupportTransfer;
    }

    public Byte getPosition() {
        return position;
    }

    public void setPosition(Byte position) {
        this.position = position;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getSortNo() {
        return sortNo;
    }

    public void setSortNo(Byte sortNo) {
        this.sortNo = sortNo;
    }

    public Byte getIdentification() {
        return identification;
    }

    public void setIdentification(Byte identification) {
        this.identification = identification;
    }
}