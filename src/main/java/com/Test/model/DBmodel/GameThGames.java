package com.Test.model.DBmodel;

public class GameThGames {
    private Integer id;

    private String gameType;

    private Integer gameId;

    private String gameCnName;

    private String gameCnCode;

    private String gameEnName;

    private String image;

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

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameCnName() {
        return gameCnName;
    }

    public void setGameCnName(String gameCnName) {
        this.gameCnName = gameCnName == null ? null : gameCnName.trim();
    }

    public String getGameCnCode() {
        return gameCnCode;
    }

    public void setGameCnCode(String gameCnCode) {
        this.gameCnCode = gameCnCode == null ? null : gameCnCode.trim();
    }

    public String getGameEnName() {
        return gameEnName;
    }

    public void setGameEnName(String gameEnName) {
        this.gameEnName = gameEnName == null ? null : gameEnName.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
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