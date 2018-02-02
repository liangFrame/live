package com.lframe.live.pojo;

public class Privileged {
    private Integer id;

    private String privilegedtype;

    private Integer privilegedid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrivilegedtype() {
        return privilegedtype;
    }

    public void setPrivilegedtype(String privilegedtype) {
        this.privilegedtype = privilegedtype == null ? null : privilegedtype.trim();
    }

    public Integer getPrivilegedid() {
        return privilegedid;
    }

    public void setPrivilegedid(Integer privilegedid) {
        this.privilegedid = privilegedid;
    }
}