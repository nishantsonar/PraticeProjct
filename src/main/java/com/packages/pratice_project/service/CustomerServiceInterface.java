package com.packages.pratice_project.service;

import com.packages.pratice_project.entity.Customer_Table;

import java.util.List;

public interface CustomerServiceInterface {
    public String addCustomer(Customer_Table customer_table);
    public Customer_Table getSingleCustomer(Long id);
    public List<Customer_Table> getAllCustomer();
    public String deleteCustomer(Long id);
    public String deleteAllCustomer();
    public Customer_Table updateCustomer(Customer_Table customer_table, Long id);
}
