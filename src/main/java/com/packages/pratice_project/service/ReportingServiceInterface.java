package com.packages.pratice_project.service;

import com.packages.pratice_project.entity.Customer_Table;
import com.packages.pratice_project.entity.Order_Table;
import com.packages.pratice_project.entity.Shop_Table;
import com.packages.pratice_project.entity.Transaction_Table;

import java.util.List;

public interface ReportingServiceInterface {

    public List<Customer_Table> getAllCustomer();

    public List<Shop_Table> getAllShop();

    public List<Order_Table> getAllOrder();

    public List<Transaction_Table> getAllTransaction();


}
