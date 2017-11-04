package com.example.mongodemo.repository;

import com.example.mongodemo.domain.Passport;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PassportRepository extends MongoRepository<Passport, String> {

}
