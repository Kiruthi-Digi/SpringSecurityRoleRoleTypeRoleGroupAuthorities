package com.digilab.springbootcookies.repos;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.digilab.springbootcookies.models.RefreshToken;
import com.digilab.springbootcookies.models.User;



@Repository
public interface RefreshTokenRepository extends MongoRepository<RefreshToken, String> {

    Optional<RefreshToken> findByToken(String token);

    int deleteByUser(User user);

}