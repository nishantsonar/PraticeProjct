package com.packages.pratice_project.entity;

import jakarta.persistence.*;

@Entity
public class Order_Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "PAID_AMOUNT")
    private double paidAmount;

    @JoinColumn(name = "SHOP_ID_FK", referencedColumnName = "SHOP_ID")
    @Column(name = "SHOP_ID")
    private Long shopId;

    @Column(name = "ORDER_CUSTOMER_ID")
    @JoinColumn(name = "CUSTOMER_ID_FK", referencedColumnName = "CUSTOMER_ID")
    private Long customerId;

    public Order_Table() {
    }

    public Order_Table(Long id, double paidAmount, Long shopId, Long customerId) {
        this.id = id;
        this.paidAmount = paidAmount;
        this.shopId = shopId;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
