package com.Test.model.DBmodel;

import java.math.BigDecimal;
import java.util.Date;

public class GamePtBettingRecord {
    private Long gameCode;

    private Integer gameId;

    private String playername;

    private Integer windowCode;

    private String gameCategory;

    private String gameCnName;

    private String gameName;

    private String code;

    private Long sessionId;

    private BigDecimal bet;

    private BigDecimal win;

    private BigDecimal progressiveBet;

    private BigDecimal progressiveWin;

    private BigDecimal balance;

    private BigDecimal currentBet;

    private Date gameDate;

    private String exitGame;

    private String liveNetwork;

    private String rnum;

    private Date createdAt;

    private Date updatedAt;

    public Long getGameCode() {
        return gameCode;
    }

    public void setGameCode(Long gameCode) {
        this.gameCode = gameCode;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername == null ? null : playername.trim();
    }

    public Integer getWindowCode() {
        return windowCode;
    }

    public void setWindowCode(Integer windowCode) {
        this.windowCode = windowCode;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory == null ? null : gameCategory.trim();
    }

    public String getGameCnName() {
        return gameCnName;
    }

    public void setGameCnName(String gameCnName) {
        this.gameCnName = gameCnName == null ? null : gameCnName.trim();
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public BigDecimal getBet() {
        return bet;
    }

    public void setBet(BigDecimal bet) {
        this.bet = bet;
    }

    public BigDecimal getWin() {
        return win;
    }

    public void setWin(BigDecimal win) {
        this.win = win;
    }

    public BigDecimal getProgressiveBet() {
        return progressiveBet;
    }

    public void setProgressiveBet(BigDecimal progressiveBet) {
        this.progressiveBet = progressiveBet;
    }

    public BigDecimal getProgressiveWin() {
        return progressiveWin;
    }

    public void setProgressiveWin(BigDecimal progressiveWin) {
        this.progressiveWin = progressiveWin;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(BigDecimal currentBet) {
        this.currentBet = currentBet;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    public String getExitGame() {
        return exitGame;
    }

    public void setExitGame(String exitGame) {
        this.exitGame = exitGame == null ? null : exitGame.trim();
    }

    public String getLiveNetwork() {
        return liveNetwork;
    }

    public void setLiveNetwork(String liveNetwork) {
        this.liveNetwork = liveNetwork == null ? null : liveNetwork.trim();
    }

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum == null ? null : rnum.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}