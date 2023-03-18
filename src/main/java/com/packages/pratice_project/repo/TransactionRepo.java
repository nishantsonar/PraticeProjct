package com.packages.pratice_project.repo;

import com.packages.pratice_project.entity.Transaction_Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction_Table, Long> {
}
