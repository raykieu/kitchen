package com.qfedu.entity;

public class VipInfoShow {
    private Integer id;

    private Integer typeid;

    private Integer uid;

    private String title;

    private String titleinfo;

    private String imgurl;

    private String imgname;

    private String imginfo;

    private String videourl;

    private String videoname;

    private String videoinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitleinfo() {
        return titleinfo;
    }

    public void setTitleinfo(String titleinfo) {
        this.titleinfo = titleinfo == null ? null : titleinfo.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname == null ? null : imgname.trim();
    }

    public String getImginfo() {
        return imginfo;
    }

    public void setImginfo(String imginfo) {
        this.imginfo = imginfo == null ? null : imginfo.trim();
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public String getVideoinfo() {
        return videoinfo;
    }

    public void setVideoinfo(String videoinfo) {
        this.videoinfo = videoinfo == null ? null : videoinfo.trim();
    }
}