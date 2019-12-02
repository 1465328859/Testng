package com.Test.model.DBmodel;

public class LotteryOpen {
    private Integer id;

    private Integer kindId;

    private String kindName;

    private String gamePlay;

    private String remark;

    private String issue;

    private Integer filter;

    private String gamePlayId;

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

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public String getGamePlay() {
        return gamePlay;
    }

    public void setGamePlay(String gamePlay) {
        this.gamePlay = gamePlay == null ? null : gamePlay.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public Integer getFilter() {
        return filter;
    }

    public void setFilter(Integer filter) {
        this.filter = filter;
    }

    public String getGamePlayId() {
        return gamePlayId;
    }

    public void setGamePlayId(String gamePlayId) {
        this.gamePlayId = gamePlayId == null ? null : gamePlayId.trim();
    }
}