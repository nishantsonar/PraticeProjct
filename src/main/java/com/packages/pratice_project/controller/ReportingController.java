package com.packages.pratice_project.controller;

import com.packages.pratice_project.entity.Customer_Table;
import com.packages.pratice_project.entity.Order_Table;
import com.packages.pratice_project.entity.Shop_Table;
import com.packages.pratice_project.entity.Transaction_Table;
import com.packages.pratice_project.service.ReportingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportingController {
    @Autowired
    private ReportingServiceInterface reportingServiceInterface;

    @GetMapping("/reporting/get_all_customer")
    public List<Customer_Table> getAllCustomer() {
        return reportingServiceInterface.getAllCustomer();
    }

    @GetMapping("/reporting/get_all_shop")
    public List<Shop_Table> getAllShop() {
        return reportingServiceInterface.getAllShop();
    }

    @GetMapping("/reporting/get_all_order")
    public List<Order_Table> getAllOrder() {
        return reportingServiceInterface.getAllOrder();
    }

    @GetMapping("/reporting/get_all_transaction")
    public List<Transaction_Table> getAllTransaction() {
        return reportingServiceInterface.getAllTransaction();
    }
}
