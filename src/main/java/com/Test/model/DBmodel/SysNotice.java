package com.Test.model.DBmodel;

public class SysNotice {
    private Byte id;

    private String platform;

    private String title;

    private String createdAt;

    private String creater;

    private Boolean show;

    private Byte sort;

    private Boolean suggestWeb;

    private Boolean suggestMobile;

    private Boolean isRoll;

    private String text;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt == null ? null : createdAt.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Boolean getSuggestWeb() {
        return suggestWeb;
    }

    public void setSuggestWeb(Boolean suggestWeb) {
        this.suggestWeb = suggestWeb;
    }

    public Boolean getSuggestMobile() {
        return suggestMobile;
    }

    public void setSuggestMobile(Boolean suggestMobile) {
        this.suggestMobile = suggestMobile;
    }

    public Boolean getIsRoll() {
        return isRoll;
    }

    public void setIsRoll(Boolean isRoll) {
        this.isRoll = isRoll;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}