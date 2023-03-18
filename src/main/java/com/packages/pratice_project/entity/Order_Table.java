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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHOP_ID")//, referencedColumnName = "SHOP_ID")
//    @Column(name = "SHOP_ID")
    private Shop_Table shopId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_CUSTOMER_ID")//, referencedColumnName = "CUSTOMER_ID")
    private Customer_Table customerId;

    public Order_Table() {
    }

    public Order_Table(Long id, double paidAmount, Shop_Table shopId, Customer_Table customerId) {
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

    public Shop_Table getShopId() {
        return shopId;
    }

    public void setShopId(Shop_Table shopId) {
        this.shopId = shopId;
    }

    public Customer_Table getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer_Table customerId) {
        this.customerId = customerId;
    }
}
