package com.qfedu.entity;

public class Constitution {
    private Integer cId;

    private Integer cSex;

    private String cInfo;

    private Integer cResult;

    private String cResultInfo;

    public Integer getcUid() {
        return cUid;
    }

    public void setcUid(Integer cUid) {
        this.cUid = cUid;
    }

    private Integer cFlag;

    private Integer cUid;
    public Integer getcFlag() {
        return cFlag;
    }

    public void setcFlag(Integer cFlag) {
        this.cFlag = cFlag;
    }

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