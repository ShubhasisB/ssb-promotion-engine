package com.example.promotionengine.domain;

import java.util.HashMap;

public class Promotion {
    private Integer promoId ;
    private Double promoPrice;
    private String promoType;
    private HashMap<String, Integer> productInfo;

    public Promotion(Integer promoId, Double promoPrice, String promoType, HashMap<String, Integer> productInfo) {
        this.promoId = promoId;
        this.promoPrice = promoPrice;
        this.promoType = promoType;
        this.productInfo = productInfo;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String getPromoType() {
        return promoType;
    }

    public void setPromoType(String promoType) {
        this.promoType = promoType;
    }

    public HashMap<String, Integer> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(HashMap<String, Integer> productInfo) {
        this.productInfo = productInfo;
    }
}
