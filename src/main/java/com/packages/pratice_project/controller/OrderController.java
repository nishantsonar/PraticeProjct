package com.packages.pratice_project.controller;

import com.packages.pratice_project.entity.Order_Table;
import com.packages.pratice_project.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderServiceInterface orderService;

    @PostMapping("/addOrder")
    public String addOrder(Order_Table order_table) {
        return orderService.placeOrder(order_table);
    }

    @GetMapping("/getOrderByCustomerID/{id}")
    public List<Order_Table> getOrderByCustomerID(@PathVariable Long id) {
        return orderService.getOrdersByCustomerID(id);
    }

    @GetMapping("/getAllOrder")
    public List<Order_Table> getAllOrders() {
        return orderService.getAllOrders();
    }

}
