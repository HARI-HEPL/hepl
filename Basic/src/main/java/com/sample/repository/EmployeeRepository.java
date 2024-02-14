package com.sample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    
	
	List<Employee> findByEmployeeName(String employeeName);
}
