package com.qfedu.entity;

public class Sport {
    private Integer sId;

    private String sInfo;

    private Sportimg iImgurl;

    private String goushi;

    public String getGoushi() {
        return goushi;
    }

    public void setGoushi(String goushi) {
        this.goushi = goushi;
    }

    public Sportimg getiImgurl() {
        return iImgurl;
    }

    public void setiImgurl(Sportimg iImgurl) {
        this.iImgurl = iImgurl;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsInfo() {
        return sInfo;
    }

    public void setsInfo(String sInfo) {
        this.sInfo = sInfo == null ? null : sInfo.trim();
    }
}