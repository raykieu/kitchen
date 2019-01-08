package com.qfedu.entity;

import java.util.Date;

public class Attendance {
    private Integer qId;

    private String qMark;

    private Integer qCount;

    private Integer qContinuesign;

    private Date qCreatetime;

    private Date qUpdatetime;

    private Double qMoney;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqMark() {
        return qMark;
    }

    public void setqMark(String qMark) {
        this.qMark = qMark == null ? null : qMark.trim();
    }

    public Integer getqCount() {
        return qCount;
    }

    public void setqCount(Integer qCount) {
        this.qCount = qCount;
    }

    public Integer getqContinuesign() {
        return qContinuesign;
    }

    public void setqContinuesign(Integer qContinuesign) {
        this.qContinuesign = qContinuesign;
    }

    public Date getqCreatetime() {
        return qCreatetime;
    }

    public void setqCreatetime(Date qCreatetime) {
        this.qCreatetime = qCreatetime;
    }

    public Date getqUpdatetime() {
        return qUpdatetime;
    }

    public void setqUpdatetime(Date qUpdatetime) {
        this.qUpdatetime = qUpdatetime;
    }

    public Double getqMoney() {
        return qMoney;
    }

    public void setqMoney(Double qMoney) {
        this.qMoney = qMoney;
    }
}