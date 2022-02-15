package com.example;

import com.example.dao.OrderRepository;
import com.example.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/order")
public class DemoApplication {

	@Autowired
	private OrderRepository repository;

	@PostMapping
	public Order saveOrder(@RequestBody Order order) {
		return repository.save(order);
	}

	@GetMapping
	public List<Order> getOrders() {
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
