package com.qfedu.entity;

public class TGood {
    private Long id;

    private String goodname;

    private String goodpicture;

    private String goodprice;

    private String gooddescription;

    private Integer goodtype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public String getGoodpicture() {
        return goodpicture;
    }

    public void setGoodpicture(String goodpicture) {
        this.goodpicture = goodpicture == null ? null : goodpicture.trim();
    }

    public String getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(String goodprice) {
        this.goodprice = goodprice == null ? null : goodprice.trim();
    }

    public String getGooddescription() {
        return gooddescription;
    }

    public void setGooddescription(String gooddescription) {
        this.gooddescription = gooddescription == null ? null : gooddescription.trim();
    }

    public Integer getGoodtype() {
        return goodtype;
    }

    public void setGoodtype(Integer goodtype) {
        this.goodtype = goodtype;
    }
}