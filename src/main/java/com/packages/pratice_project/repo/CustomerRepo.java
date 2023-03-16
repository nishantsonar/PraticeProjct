package com.packages.pratice_project.repo;

import com.packages.pratice_project.entity.Customer_Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer_Table,Long> {
}
