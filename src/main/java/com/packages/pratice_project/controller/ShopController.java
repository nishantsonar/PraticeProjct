package com.packages.pratice_project.controller;

import com.packages.pratice_project.entity.Shop_Table;
import com.packages.pratice_project.service.StoreServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    private StoreServiceInterface storeService;

    @PostMapping("/add_store")
    public String addStore( @RequestBody Shop_Table shop_table){
        return storeService.addShop(shop_table);
    }
    @GetMapping("/get_all_store")
    public List<Shop_Table> getAllStore() {
        return storeService.getAllShop();
    }

    @GetMapping("/store_details/{id}")
    public Shop_Table getSingleStore(@PathVariable Long id) {
        return storeService.getSingleShop(id);
    }

    @PutMapping("/update_store/{id}")
    public Shop_Table updateStore(@PathVariable Long id , @RequestBody Shop_Table customer_table) {
        return storeService.updateShop(customer_table,id);
    }

    @DeleteMapping("/delete_all_store")
    public String deleteAllStore() {
        return storeService.deleteAllShop();
    }

    @DeleteMapping("/delete_store/{id}")
    public String deleteSingleStore(@PathVariable Long id) {
        return storeService.deleteShop(id);
    }


}
