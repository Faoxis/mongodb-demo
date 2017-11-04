package com.example.mongodemo.repository;

import com.example.mongodemo.domain.Application;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicationRepository extends MongoRepository<Application, String> {

}
