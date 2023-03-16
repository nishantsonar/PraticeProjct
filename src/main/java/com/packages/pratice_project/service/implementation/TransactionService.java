package com.packages.pratice_project.service.implementation;

import com.packages.pratice_project.entity.Transaction_Table;
import com.packages.pratice_project.repo.TransactionRepo;
import com.packages.pratice_project.service.TransactionserviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService implements TransactionserviceInterface {

    @Autowired
    private TransactionRepo transactionRepo;

    public String addOrder(Transaction_Table transaction_table) {
        if (transaction_table.equals(null)) {
            return "ERROR";
        } else {
            transactionRepo.save(transaction_table);
            return "TRANSACTION SUCCESSFUL.";
        }
    }

    public List<Transaction_Table> getAllTransaction() {
        return transactionRepo.findAll();
    }

}
