package com.packages.pratice_project.repo;

import com.packages.pratice_project.entity.Shop_Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepo extends JpaRepository<Shop_Table, Long> {
}
