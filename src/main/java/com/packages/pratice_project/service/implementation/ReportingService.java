package com.packages.pratice_project.service.implementation;

import com.packages.pratice_project.entity.Customer_Table;
import com.packages.pratice_project.entity.Order_Table;
import com.packages.pratice_project.entity.Shop_Table;
import com.packages.pratice_project.entity.Transaction_Table;
import com.packages.pratice_project.repo.CustomerRepo;
import com.packages.pratice_project.repo.OrderRepo;
import com.packages.pratice_project.repo.ShopRepo;
import com.packages.pratice_project.repo.TransactionRepo;
import com.packages.pratice_project.service.ReportingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportingService implements ReportingServiceInterface {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ShopRepo shopRepo;
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private TransactionRepo transactionRepo;

    public List<Customer_Table> getAllCustomer() {
        return customerRepo.findAll();
    }

    public List<Shop_Table> getAllShop() {
        return shopRepo.findAll();
    }

    public List<Order_Table> getAllOrder() {
        return orderRepo.findAll();
    }

    public List<Transaction_Table> getAllTransaction() {
        return transactionRepo.findAll();
    }


}
