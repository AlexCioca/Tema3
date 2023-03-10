package com.shop.tema3.repository;

import com.shop.tema3.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByName(String name);

    Boolean existsByName(String name);

    Boolean existsByEmail(String email);
}
