package com.qfedu.entity;

public class Noteimag {
    private Integer iId;

    private Integer nId;

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