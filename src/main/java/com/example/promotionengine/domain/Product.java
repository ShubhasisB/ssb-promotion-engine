package com.example.promotionengine.domain;

public class Product {
    private String id;
    private Double unitPrice;
    private Integer quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product(String id, Double unitPrice, Integer quantity) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
}
