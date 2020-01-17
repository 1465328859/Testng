package com.Test.model.DBmodel;

public class GamePtGames {
    private Integer id;

    private String gameEnName;

    private String gameCnName;

    private String gameCategory;

    private String reels;

    private String lines;

    private String flashGameCode;

    private String html5GameCode;

    private String rtp;

    private Byte state;

    private Byte supportDownload;

    private Byte supportPcFlash;

    private Byte supportDemo;

    private Byte supportMobileHtml5;

    private Byte supportMobileApp;

    private Byte isHot;

    private Byte isNew;

    private String images;

    private String html5Images;

    private Integer sortby;

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

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory == null ? null : gameCategory.trim();
    }

    public String getReels() {
        return reels;
    }

    public void setReels(String reels) {
        this.reels = reels == null ? null : reels.trim();
    }

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines == null ? null : lines.trim();
    }

    public String getFlashGameCode() {
        return flashGameCode;
    }

    public void setFlashGameCode(String flashGameCode) {
        this.flashGameCode = flashGameCode == null ? null : flashGameCode.trim();
    }

    public String getHtml5GameCode() {
        return html5GameCode;
    }

    public void setHtml5GameCode(String html5GameCode) {
        this.html5GameCode = html5GameCode == null ? null : html5GameCode.trim();
    }

    public String getRtp() {
        return rtp;
    }

    public void setRtp(String rtp) {
        this.rtp = rtp == null ? null : rtp.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getSupportDownload() {
        return supportDownload;
    }

    public void setSupportDownload(Byte supportDownload) {
        this.supportDownload = supportDownload;
    }

    public Byte getSupportPcFlash() {
        return supportPcFlash;
    }

    public void setSupportPcFlash(Byte supportPcFlash) {
        this.supportPcFlash = supportPcFlash;
    }

    public Byte getSupportDemo() {
        return supportDemo;
    }

    public void setSupportDemo(Byte supportDemo) {
        this.supportDemo = supportDemo;
    }

    public Byte getSupportMobileHtml5() {
        return supportMobileHtml5;
    }

    public void setSupportMobileHtml5(Byte supportMobileHtml5) {
        this.supportMobileHtml5 = supportMobileHtml5;
    }

    public Byte getSupportMobileApp() {
        return supportMobileApp;
    }

    public void setSupportMobileApp(Byte supportMobileApp) {
        this.supportMobileApp = supportMobileApp;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getHtml5Images() {
        return html5Images;
    }

    public void setHtml5Images(String html5Images) {
        this.html5Images = html5Images == null ? null : html5Images.trim();
    }

    public Integer getSortby() {
        return sortby;
    }

    public void setSortby(Integer sortby) {
        this.sortby = sortby;
    }
}