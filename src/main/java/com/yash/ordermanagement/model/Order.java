package com.yash.ordermanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Setter;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name is required")
    @Setter
    private String product;

    @NotBlank(message = "Status is required")
    @Setter
    private String status;

    public Order() {
        // Required by JPA
    }

    public Order(String product, String status) {
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
