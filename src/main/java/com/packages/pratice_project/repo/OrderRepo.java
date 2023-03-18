package com.packages.pratice_project.repo;

import com.packages.pratice_project.entity.Order_Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order_Table, Long> {
    List<Order_Table> findByCustomerId(Long id);
}
