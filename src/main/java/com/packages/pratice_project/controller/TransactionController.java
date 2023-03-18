package com.packages.pratice_project.controller;

import com.packages.pratice_project.entity.Transaction_Table;
import com.packages.pratice_project.service.TransactionserviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionserviceInterface transactionservice;

    @PostMapping("/add_transaction")
    public String addTransaction(Transaction_Table transaction_table) {
        return transactionservice.addOrder(transaction_table);
    }

    @GetMapping("/get_all_transaction")
    public List<Transaction_Table> getAllTransaction() {
        return transactionservice.getAllTransaction();
    }
}
