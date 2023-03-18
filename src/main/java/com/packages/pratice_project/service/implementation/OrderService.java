package com.packages.pratice_project.service.implementation;

import com.packages.pratice_project.entity.Customer_Table;
import com.packages.pratice_project.entity.Order_Table;
import com.packages.pratice_project.entity.Shop_Table;
import com.packages.pratice_project.repo.CustomerRepo;
import com.packages.pratice_project.repo.OrderRepo;
import com.packages.pratice_project.repo.ShopRepo;
import com.packages.pratice_project.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderServiceInterface {

    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private ShopRepo shopRepo;

    public String placeOrder(Order_Table order_table) {
        Long customerId = order_table.getCustomerId().getId();
        Customer_Table customer_table = null;
        Long shopId = order_table.getShopId().getId();
        Shop_Table shop_table = null;

        if (customerId != null && shopId != null) {
            customer_table = customerRepo.findById(customerId).get();
            shop_table = shopRepo.findById(shopId).get();
        } else
            return "ORDER NOT PLACE";
        if (order_table.getCustomerId().equals(customer_table) && order_table.getShopId().equals(shop_table)) {
            orderRepo.save(order_table);
            return "ORDER PLACED SUCCESSFULLY.";
        } else return "ORDER NOT PLACE.";
        /*
         * ampcus tech pvt ltd
         * uk us shift
         * uk shift
         * us project
         * 10 11
         * payroll
         * 6yr project
         * onside opportunity(if performance good )
         * bond(5yr)
         * showcash application
         */
    }


    public String deleteOrder(Long id) {
        orderRepo.deleteById(id);
        return "ORDER DELETE SUCCESSFULLY.";
    }


    public List<Order_Table> getAllOrders() {
        List<Order_Table> a = orderRepo.findAll();
//        List<Customer_Table> c = customerRepo.findAll();
//        List<Shop_Table> s = shopRepo.findAll();
//        for (int i = 0; i < a.size(); i++) {
//            if (a.get(i).getCustomerId().getId() == c.get(i).getId() && a.get(i).getShopId().getId() == s.get(i).getId()) {
//                a.get(i).setCustomerId(c.get(i));
//                a.get(i).setShopId(s.get(i));
//            }
//        }
        return a;
    }

    public List<Order_Table> getOrdersByCustomerID(Long id) {
        return orderRepo.findByCustomerId(id);
    }

    public Order_Table getSingleOrder(Long id) {
        return orderRepo.findById(id).get();
    }

}
