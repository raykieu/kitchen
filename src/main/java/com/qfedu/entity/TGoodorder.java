package com.qfedu.entity;

public class TGoodorder {
    private Long id;

    private String ordernumber;

    private Integer orderquantity;

    private Integer orderstatus;

    private Long goodnumber;

    private Long uid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public Integer getOrderquantity() {
        return orderquantity;
    }

    public void setOrderquantity(Integer orderquantity) {
        this.orderquantity = orderquantity;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Long getGoodnumber() {
        return goodnumber;
    }

    public void setGoodnumber(Long goodnumber) {
        this.goodnumber = goodnumber;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }
}