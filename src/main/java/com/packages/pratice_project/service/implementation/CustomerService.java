package com.packages.pratice_project.service.implementation;

import com.packages.pratice_project.entity.Customer_Table;
import com.packages.pratice_project.repo.CustomerRepo;
import com.packages.pratice_project.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class CustomerService implements CustomerServiceInterface {

    @Autowired
    private CustomerRepo customerRepo;

    public String addCustomer(Customer_Table customer_table) {
        if (customer_table.equals(null)) {
            return "CUSTOMER IS EMPTY.";
        } else {
            customerRepo.save(customer_table);
            return "CUSTOMER ADDED SUCCESSFULLY.";
        }
    }

    public Customer_Table getSingleCustomer(Long id) {
        return customerRepo.findById(id).get();
    }

    public List<Customer_Table> getAllCustomer() {
        return customerRepo.findAll();
    }

    public String deleteCustomer(Long id) {
        customerRepo.deleteById(id);
        return "CUSTOMER DETAILS DELETE SUCCESSFULLY.";
    }

    public String deleteAllCustomer() {
        customerRepo.deleteAll();
        return "ALL CUSTOMER DETAILS DELETED.";
    }

    public Customer_Table updateCustomer(Customer_Table customer_table,Long id) {
        Customer_Table c=customerRepo.findById(id).get();
        c.setFirstName(customer_table.getFirstName());
        c.setLastName(customer_table.getLastName());
        c.setEmailId(customer_table.getEmailId());
        c.setMobileNo(customer_table.getMobileNo());
        c.setCustomerAddress(customer_table.getCustomerAddress());
        c.setIsActive(customer_table.getIsActive());
        return customerRepo.save(c);
    }
}
