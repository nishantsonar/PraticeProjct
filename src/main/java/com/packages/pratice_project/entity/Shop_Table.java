package com.packages.pratice_project.entity;

import jakarta.persistence.*;

@Entity
public class Shop_Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHOP_ID")
    private Long id;

    @Column(name = "SHOP_NAME")
    private String shop_Name;

    @Column(name = "SHOP_ADDRESS")
    private String shop_Address;

    @Column(name = "SHOP_CONTACT_NO")
    private String shop_Contact_No;

    public Shop_Table() {
    }

    public Shop_Table(Long id, String shop_Name, String shop_Address, String shop_Contact_No) {
        this.id = id;
        this.shop_Name = shop_Name;
        this.shop_Address = shop_Address;
        this.shop_Contact_No = shop_Contact_No;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShop_Name() {
        return shop_Name;
    }

    public void setShop_Name(String shop_Name) {
        this.shop_Name = shop_Name;
    }

    public String getShop_Address() {
        return shop_Address;
    }

    public void setShop_Address(String shop_Address) {
        this.shop_Address = shop_Address;
    }

    public String getShop_Contact_No() {
        return shop_Contact_No;
    }

    public void setShop_Contact_No(String shop_Contact_No) {
        this.shop_Contact_No = shop_Contact_No;
    }
}
