package com.yash.ordermanagement.service;

import com.yash.ordermanagement.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public List<Order> getAllOrders() {
        return List.of(
                new Order(1L, "Laptop", "Shipped"),
                new Order(2L, "Phone", "Processing")
        );
    }
}
