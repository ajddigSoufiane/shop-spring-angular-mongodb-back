package com.hidden.shop.dao;

import com.hidden.shop.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface UserRepository extends MongoRepository<User, Long> {
    Optional<User> findByUsername(String username);
    User findByName(String name);
}
