package com.Test.model.DBmodel;

import java.util.Date;

public class AgentTransfer {
    private Integer id;

    private Integer userId;

    private String username;

    private Integer originalParentId;

    private String originalParentName;

    private Integer nowParentId;

    private String nowParentName;

    private String operator;

    private Date createTime;

    private Integer originalTopId;

    private String originalTopName;

    private Integer nowTopId;

    private String nowTopName;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getOriginalParentId() {
        return originalParentId;
    }

    public void setOriginalParentId(Integer originalParentId) {
        this.originalParentId = originalParentId;
    }

    public String getOriginalParentName() {
        return originalParentName;
    }

    public void setOriginalParentName(String originalParentName) {
        this.originalParentName = originalParentName == null ? null : originalParentName.trim();
    }

    public Integer getNowParentId() {
        return nowParentId;
    }

    public void setNowParentId(Integer nowParentId) {
        this.nowParentId = nowParentId;
    }

    public String getNowParentName() {
        return nowParentName;
    }

    public void setNowParentName(String nowParentName) {
        this.nowParentName = nowParentName == null ? null : nowParentName.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOriginalTopId() {
        return originalTopId;
    }

    public void setOriginalTopId(Integer originalTopId) {
        this.originalTopId = originalTopId;
    }

    public String getOriginalTopName() {
        return originalTopName;
    }

    public void setOriginalTopName(String originalTopName) {
        this.originalTopName = originalTopName == null ? null : originalTopName.trim();
    }

    public Integer getNowTopId() {
        return nowTopId;
    }

    public void setNowTopId(Integer nowTopId) {
        this.nowTopId = nowTopId;
    }

    public String getNowTopName() {
        return nowTopName;
    }

    public void setNowTopName(String nowTopName) {
        this.nowTopName = nowTopName == null ? null : nowTopName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}