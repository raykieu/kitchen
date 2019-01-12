package com.qfedu.entity;

public class TGoodtype {
    private Long id;

    private Integer typid;

    private String typinfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTypid() {
        return typid;
    }

    public void setTypid(Integer typid) {
        this.typid = typid;
    }

    public String getTypinfo() {
        return typinfo;
    }

    public void setTypinfo(String typinfo) {
        this.typinfo = typinfo == null ? null : typinfo.trim();
    }
}