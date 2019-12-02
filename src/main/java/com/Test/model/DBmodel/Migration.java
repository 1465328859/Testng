package com.Test.model.DBmodel;

public class Migration {
    private Integer id;

    private String name;

    private Long time;

    private Byte isRollback;

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

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Byte getIsRollback() {
        return isRollback;
    }

    public void setIsRollback(Byte isRollback) {
        this.isRollback = isRollback;
    }
}