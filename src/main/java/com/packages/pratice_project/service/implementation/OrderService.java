package com.packages.pratice_project.service.implementation;

import com.packages.pratice_project.entity.Order_Table;
import com.packages.pratice_project.repo.OrderRepo;
import com.packages.pratice_project.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderServiceInterface {

    @Autowired
    private OrderRepo orderRepo;

    public String placeOrder(Order_Table order_table) {
        if (order_table.equals(null)) {
            return "ORDER NOT PLACE.";
        } else {
            orderRepo.save(order_table);
            return "ORDER PLACED SUCCESSFULLY.";
        }
    }

    public String deleteOrder(Long id) {
        orderRepo.deleteById(id);
        return "ORDER DELETE SUCCESSFULLY.";
    }


    public List<Order_Table> getAllOrders() {
        return orderRepo.findAll();
    }

    public List<Order_Table> getOrdersByCustomerID(Long id) {
        return orderRepo.findByCustomerId(id);
    }

}
