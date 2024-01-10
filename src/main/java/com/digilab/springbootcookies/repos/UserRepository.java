package com.digilab.springbootcookies.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.digilab.springbootcookies.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);

    Boolean existsByUsername(String username);
}