package com.Test.model.DBmodel;

public class AgentHost {
    private Integer hostId;

    private Integer userId;

    private String offlineRebate;

    private String proxyDomain;

    private String gameSwitch;

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOfflineRebate() {
        return offlineRebate;
    }

    public void setOfflineRebate(String offlineRebate) {
        this.offlineRebate = offlineRebate == null ? null : offlineRebate.trim();
    }

    public String getProxyDomain() {
        return proxyDomain;
    }

    public void setProxyDomain(String proxyDomain) {
        this.proxyDomain = proxyDomain == null ? null : proxyDomain.trim();
    }

    public String getGameSwitch() {
        return gameSwitch;
    }

    public void setGameSwitch(String gameSwitch) {
        this.gameSwitch = gameSwitch == null ? null : gameSwitch.trim();
    }
}