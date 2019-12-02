package com.Test.model.DBmodel;

public class Cache {
    private Integer id;

    private String name;

    private String cacheType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCacheType() {
        return cacheType;
    }

    public void setCacheType(String cacheType) {
        this.cacheType = cacheType == null ? null : cacheType.trim();
    }
}