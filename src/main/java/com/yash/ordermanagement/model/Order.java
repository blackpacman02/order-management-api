package com.yash.ordermanagement.model;

public class Order {
    private Long id;
    private String product;
    private String status;

    public Order(Long id, String product, String status) {
        this.id = id;
        this.product = product;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public String getStatus() {
        return status;
    }
}
