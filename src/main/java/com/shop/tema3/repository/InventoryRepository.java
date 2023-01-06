package com.shop.tema3.repository;

import com.shop.tema3.model.InventoryEntity;
import com.shop.tema3.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryEntity,Long> {
}
