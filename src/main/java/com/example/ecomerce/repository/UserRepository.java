package com.example.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecomerce.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
