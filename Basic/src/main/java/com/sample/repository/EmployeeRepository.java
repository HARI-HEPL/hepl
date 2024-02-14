package com.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // Custom queries, if needed
}
