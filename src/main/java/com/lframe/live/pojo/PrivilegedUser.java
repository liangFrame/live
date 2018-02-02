package com.lframe.live.pojo;

import java.util.Date;

public class PrivilegedUser {
    private Integer id;

    private String privilegedusertype;

    private Integer uid;

    private Float price;

    private Date createdate;

    private Date expiredate;

    private Date renewal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrivilegedusertype() {
        return privilegedusertype;
    }

    public void setPrivilegedusertype(String privilegedusertype) {
        this.privilegedusertype = privilegedusertype == null ? null : privilegedusertype.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public Date getRenewal() {
        return renewal;
    }

    public void setRenewal(Date renewal) {
        this.renewal = renewal;
    }
}