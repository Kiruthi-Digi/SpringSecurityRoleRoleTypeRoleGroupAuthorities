package com.digilab.springbootcookies.repos;

import com.digilab.springbootcookies.models.Role;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    // Role findByRole(String role);
    Optional<Role> findByRole(String role);
}