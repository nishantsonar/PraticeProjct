package com.packages.pratice_project.service.implementation;

import com.packages.pratice_project.entity.Order_Table;
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
    @Autowired
    private OrderService orderService;

    public String addOrder(Transaction_Table transaction_table) {
        Long a = transaction_table.getOrderId().getId();
        Order_Table order_table = orderService.getSingleOrder(a);
        transaction_table.setOrderId(order_table);
        transactionRepo.save(transaction_table);
        return "TRANSACTION SUCCESSFUL.";
    }

    public List<Transaction_Table> getAllTransaction() {
        return transactionRepo.findAll();
    }

}
