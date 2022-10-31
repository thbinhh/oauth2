package com.example.OAuth2Resourceserver.repository;

import com.example.OAuth2Resourceserver.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
