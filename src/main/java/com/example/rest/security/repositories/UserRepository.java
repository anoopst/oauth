package com.example.rest.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.security.entities.User;

/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
