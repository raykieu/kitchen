package com.qfedu.entity;

public class Noteimag {
    private Integer iId;

    private Integer nId;

    private String iImgurl;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getiImgurl() {
        return iImgurl;
    }

    public void setiImgurl(String iImgurl) {
        this.iImgurl = iImgurl == null ? null : iImgurl.trim();
    }
}