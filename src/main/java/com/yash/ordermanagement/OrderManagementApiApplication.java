package com.yash.ordermanagement;

import com.yash.ordermanagement.model.Order;
import com.yash.ordermanagement.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(OrderRepository orderRepository) {
		return args -> {
			orderRepository.save(new Order("Laptop", "Shipped"));
			orderRepository.save(new Order("Phone", "Processing"));
			orderRepository.save(new Order("Tablet", "Pending"));
		};
	}

}
