package com.lframe.live.pojo;

import java.util.Date;

public class Reward {
    private Integer id;

    private Date rewarddate;

    private String type;

    private Integer number;

    private Integer uid;

    private Integer anid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRewarddate() {
        return rewarddate;
    }

    public void setRewarddate(Date rewarddate) {
        this.rewarddate = rewarddate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAnid() {
        return anid;
    }

    public void setAnid(Integer anid) {
        this.anid = anid;
    }
}