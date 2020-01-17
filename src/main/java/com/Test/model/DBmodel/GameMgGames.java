package com.Test.model.DBmodel;

public class GameMgGames {
    private Integer id;

    private String gameEnName;

    private String gameCnName;

    private Integer flashId;

    private Integer flashAppId;

    private Integer h5Id;

    private Integer h5AppId;

    private Integer downloadId;

    private Integer downloadAppId;

    private String gameCategory;

    private String gameSubCategory;

    private String gameGrandsonCategory;

    private String rtp;

    private String flash;

    private String html5;

    private String download;

    private String imagePath;

    private Byte state;

    private Byte isHot;

    private Byte isNew;

    private Integer sortNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGameEnName() {
        return gameEnName;
    }

    public void setGameEnName(String gameEnName) {
        this.gameEnName = gameEnName == null ? null : gameEnName.trim();
    }

    public String getGameCnName() {
        return gameCnName;
    }

    public void setGameCnName(String gameCnName) {
        this.gameCnName = gameCnName == null ? null : gameCnName.trim();
    }

    public Integer getFlashId() {
        return flashId;
    }

    public void setFlashId(Integer flashId) {
        this.flashId = flashId;
    }

    public Integer getFlashAppId() {
        return flashAppId;
    }

    public void setFlashAppId(Integer flashAppId) {
        this.flashAppId = flashAppId;
    }

    public Integer getH5Id() {
        return h5Id;
    }

    public void setH5Id(Integer h5Id) {
        this.h5Id = h5Id;
    }

    public Integer getH5AppId() {
        return h5AppId;
    }

    public void setH5AppId(Integer h5AppId) {
        this.h5AppId = h5AppId;
    }

    public Integer getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(Integer downloadId) {
        this.downloadId = downloadId;
    }

    public Integer getDownloadAppId() {
        return downloadAppId;
    }

    public void setDownloadAppId(Integer downloadAppId) {
        this.downloadAppId = downloadAppId;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory == null ? null : gameCategory.trim();
    }

    public String getGameSubCategory() {
        return gameSubCategory;
    }

    public void setGameSubCategory(String gameSubCategory) {
        this.gameSubCategory = gameSubCategory == null ? null : gameSubCategory.trim();
    }

    public String getGameGrandsonCategory() {
        return gameGrandsonCategory;
    }

    public void setGameGrandsonCategory(String gameGrandsonCategory) {
        this.gameGrandsonCategory = gameGrandsonCategory == null ? null : gameGrandsonCategory.trim();
    }

    public String getRtp() {
        return rtp;
    }

    public void setRtp(String rtp) {
        this.rtp = rtp == null ? null : rtp.trim();
    }

    public String getFlash() {
        return flash;
    }

    public void setFlash(String flash) {
        this.flash = flash == null ? null : flash.trim();
    }

    public String getHtml5() {
        return html5;
    }

    public void setHtml5(String html5) {
        this.html5 = html5 == null ? null : html5.trim();
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download == null ? null : download.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
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

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }
}