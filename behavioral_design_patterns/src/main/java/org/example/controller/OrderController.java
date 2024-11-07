package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        System.out.println("Received request to place order for customer: {}" + order.getCustomerName());
        return orderService.placeOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        System.out.println("Fetching all orders.");
        return orderService.getAllOrders();
    }
}
