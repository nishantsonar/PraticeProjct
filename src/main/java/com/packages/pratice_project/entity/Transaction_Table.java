package com.packages.pratice_project.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transaction_Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRASACTION_ID")
    private Long id;

    @Column(name = "ORDER_DATE")
    private Date date=new Date();

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "STATUS")
    private String status; //paid or unpaid

    @Column(name = "ORDER_ID")
    @JoinColumn(name = "ORDER_ID_FK", referencedColumnName = "ORDER_ID")
    private Long orderId;

    public Transaction_Table() {
    }

    public Transaction_Table(Long id, Date date, double amount, String status, Long orderId) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
