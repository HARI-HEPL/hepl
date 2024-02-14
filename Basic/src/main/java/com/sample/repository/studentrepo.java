package com.sample.repository;
import com.sample.model.student;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentrepo extends MongoRepository<student,Integer> {

}
