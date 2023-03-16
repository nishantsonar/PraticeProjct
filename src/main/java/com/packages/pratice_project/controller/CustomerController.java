package com.packages.pratice_project.controller;

import com.packages.pratice_project.entity.Customer_Table;
import com.packages.pratice_project.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceInterface customerService;

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer_Table customer_table) {
        return customerService.addCustomer(customer_table);
    }

    @GetMapping("/get_all_customer")
    public List<Customer_Table> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public Customer_Table getSingleCustomer(@PathVariable Long id) {
        return customerService.getSingleCustomer(id);
    }

    @PutMapping("/update_customer/{id}")
    public Customer_Table updateCustomer(@PathVariable Long id , @RequestBody Customer_Table customer_table) {
        return customerService.updateCustomer(customer_table,id);
    }

    @DeleteMapping("/delete_all_customer")
    public String deleteAllCustomer() {
        return customerService.deleteAllCustomer();
    }

    @DeleteMapping("/delete_customer/{id}")
    public String deleteSingleCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }

}
