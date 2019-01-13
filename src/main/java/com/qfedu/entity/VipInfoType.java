package com.qfedu.entity;

public class VipInfoType {
    private Integer id;

    private String typename;

    private String typeinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTypeinfo() {
        return typeinfo;
    }

    public void setTypeinfo(String typeinfo) {
        this.typeinfo = typeinfo == null ? null : typeinfo.trim();
    }
}