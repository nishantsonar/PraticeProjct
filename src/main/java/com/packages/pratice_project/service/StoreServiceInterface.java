package com.packages.pratice_project.service;

import com.packages.pratice_project.entity.Shop_Table;

import java.util.List;

public interface StoreServiceInterface {
    public String addShop(Shop_Table shop_table);

    public Shop_Table getSingleShop(Long id);

    public List<Shop_Table> getAllShop();

    public String deleteShop(Long id);

    public String deleteAllShop();

    public Shop_Table updateShop(Shop_Table shop_table, Long id);
}
