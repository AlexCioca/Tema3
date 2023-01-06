package com.shop.tema3.repository;

import com.shop.tema3.model.ProductEntity;
import com.shop.tema3.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
