package com.Test.model.DBmodel;

public class AgentHost {
    private Integer hostId;

    private Integer userId;

    private String offlineRebate;

    private String proxyDomain;

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
}