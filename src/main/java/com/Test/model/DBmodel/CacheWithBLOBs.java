package com.Test.model.DBmodel;

public class CacheWithBLOBs extends Cache {
    private String content;

    private String mark;

    private String usePlaces;

    private String cleanPlaces;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getUsePlaces() {
        return usePlaces;
    }

    public void setUsePlaces(String usePlaces) {
        this.usePlaces = usePlaces == null ? null : usePlaces.trim();
    }

    public String getCleanPlaces() {
        return cleanPlaces;
    }

    public void setCleanPlaces(String cleanPlaces) {
        this.cleanPlaces = cleanPlaces == null ? null : cleanPlaces.trim();
    }
}