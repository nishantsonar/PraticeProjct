package com.packages.pratice_project.controller;

import com.packages.pratice_project.entity.Transaction_Table;
import com.packages.pratice_project.service.TransactionserviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private TransactionserviceInterface transactionservice;

    @PostMapping("/add_transaction")
    public String addTransaction( Transaction_Table transaction_table){
        return transactionservice.addOrder(transaction_table);
    }
}
