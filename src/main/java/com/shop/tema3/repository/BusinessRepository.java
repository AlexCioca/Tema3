package com.shop.tema3.repository;

import com.shop.tema3.model.BusinessEntity;
import com.shop.tema3.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<BusinessEntity,Long> {
}
