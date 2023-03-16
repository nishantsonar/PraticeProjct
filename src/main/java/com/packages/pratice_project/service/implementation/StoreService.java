package com.packages.pratice_project.service.implementation;

import com.packages.pratice_project.entity.Shop_Table;
import com.packages.pratice_project.repo.ShopRepo;
import com.packages.pratice_project.service.StoreServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreService implements StoreServiceInterface {

    @Autowired
    private ShopRepo shopRepo;


    public String addShop(Shop_Table shop_table) {
        if (shop_table.equals(null)) {
            return "STORE IS EMPTY.";
        } else {
            shopRepo.save(shop_table);
            return "STORE ADDED SUCCESSFULLY.";
        }
    }

    public Shop_Table getSingleShop(Long id) {
        return shopRepo.findById(id).get();
    }

    public List<Shop_Table> getAllShop() {
        return shopRepo.findAll();
    }

    public String deleteShop(Long id) {
        shopRepo.deleteById(id);
        return "STORE DETAILS DELETE SUCCESSFULLY.";
    }

    public String deleteAllShop() {
        shopRepo.deleteAll();
        return "ALL STORE DETAILS DELETED.";
    }

    public Shop_Table updateShop(Shop_Table shop_table,Long id) {
        Shop_Table c=shopRepo.findById(id).get();
       c.setShop_Name(shop_table.getShop_Name());
       c.setShop_Address(shop_table.getShop_Address());
       c.setShop_Contact_No(shop_table.getShop_Contact_No());
        return shopRepo.save(c);
    }
}
