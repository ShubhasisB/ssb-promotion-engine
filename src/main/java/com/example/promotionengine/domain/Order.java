package com.example.promotionengine.domain;

import java.util.List;

public class Order {

    private Integer orderId;

    private List<Product> products;

    public Order(Integer orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
