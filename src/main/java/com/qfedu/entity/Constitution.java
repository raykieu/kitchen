package com.qfedu.entity;

public class Constitution {
    private Integer cId;

    private Integer cSex;

    private String cTitle;

    private String cInfo;

    private Integer cResult;

    private String cResultInfo;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcSex() {
        return cSex;
    }

    public void setcSex(Integer cSex) {
        this.cSex = cSex;
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle == null ? null : cTitle.trim();
    }

    public String getcInfo() {
        return cInfo;
    }

    public void setcInfo(String cInfo) {
        this.cInfo = cInfo == null ? null : cInfo.trim();
    }

    public Integer getcResult() {
        return cResult;
    }

    public void setcResult(Integer cResult) {
        this.cResult = cResult;
    }

    public String getcResultInfo() {
        return cResultInfo;
    }

    public void setcResultInfo(String cResultInfo) {
        this.cResultInfo = cResultInfo == null ? null : cResultInfo.trim();
    }
}