package com.qfedu.entity;

public class Note {
    private Integer nId;

    private String nInfo;

    private Integer nNice;

    private Integer uId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getnInfo() {
        return nInfo;
    }

    public void setnInfo(String nInfo) {
        this.nInfo = nInfo == null ? null : nInfo.trim();
    }

    public Integer getnNice() {
        return nNice;
    }

    public void setnNice(Integer nNice) {
        this.nNice = nNice;
    }
}