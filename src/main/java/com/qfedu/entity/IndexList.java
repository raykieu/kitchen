package com.qfedu.entity;

public class IndexList {
    private Integer id;

    private String imgName;

    private String imgInfo;

    private String imgUrl;

    private String videoName;

    private String videoInfo;

    private String viedoUrl;

    private String cookName;

    private String cookInfo;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }

    public String getImgInfo() {
        return imgInfo;
    }

    public void setImgInfo(String imgInfo) {
        this.imgInfo = imgInfo == null ? null : imgInfo.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(String videoInfo) {
        this.videoInfo = videoInfo == null ? null : videoInfo.trim();
    }

    public String getViedoUrl() {
        return viedoUrl;
    }

    public void setViedoUrl(String viedoUrl) {
        this.viedoUrl = viedoUrl == null ? null : viedoUrl.trim();
    }

    public String getCookName() {
        return cookName;
    }

    public void setCookName(String cookName) {
        this.cookName = cookName == null ? null : cookName.trim();
    }

    public String getCookInfo() {
        return cookInfo;
    }

    public void setCookInfo(String cookInfo) {
        this.cookInfo = cookInfo == null ? null : cookInfo.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}