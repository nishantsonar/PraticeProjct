package com.packages.pratice_project.service;

import com.packages.pratice_project.entity.Transaction_Table;

import java.util.List;

public interface TransactionserviceInterface {
    public String addOrder(Transaction_Table transaction_table);
    public List<Transaction_Table> getAllTransaction();
}
