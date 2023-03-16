package com.packages.pratice_project.service;

import com.packages.pratice_project.entity.Order_Table;

import java.util.List;

public interface OrderServiceInterface {

    public String placeOrder(Order_Table order_table);
    public String deleteOrder(Long id);
    public List<Order_Table> getAllOrders();
    public List<Order_Table> getOrdersByCustomerID(Long id);
}
