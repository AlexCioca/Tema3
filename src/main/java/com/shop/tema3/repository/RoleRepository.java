package com.shop.tema3.repository;

import com.shop.tema3.model.ERole;
import com.shop.tema3.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
    Optional<RoleEntity> findByName(ERole name);
}
