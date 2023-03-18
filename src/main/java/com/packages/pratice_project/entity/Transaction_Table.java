package com.packages.pratice_project.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Transaction_Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRASACTION_ID")
    private Long id;

    @Column(name = "ORDER_DATE")
    private LocalDate date = LocalDate.now();

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "STATUS")
    private String status; //paid or unpaid

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")//, referencedColumnName = "ORDER_ID")
//    @Column(name = "ORDER_ID")
    private Order_Table orderId;

    public Transaction_Table() {
    }

    public Transaction_Table(Long id, LocalDate date, double amount, String status, Order_Table orderId) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.status = status;
        this.orderId = orderId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order_Table getOrderId() {
        return orderId;
    }

    public void setOrderId(Order_Table orderId) {
        this.orderId = orderId;
    }
}
