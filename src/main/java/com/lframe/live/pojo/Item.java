package com.lframe.live.pojo;

public class Item {
    private Integer id;

    private Integer cid;

    private String name;

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}