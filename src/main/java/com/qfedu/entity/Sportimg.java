package com.qfedu.entity;

public class Sportimg {
    private Integer iId;

    private Integer sId;

    private String iImgurl;

    private tuser user;

    private Note note;

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public tuser getUser() {
        return user;
    }

    public void setUser(tuser user) {
        this.user = user;
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getiImgurl() {
        return iImgurl;
    }

    public void setiImgurl(String iImgurl) {
        this.iImgurl = iImgurl == null ? null : iImgurl.trim();
    }
}