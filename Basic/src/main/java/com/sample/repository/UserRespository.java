package com.sample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.Entity.User;



public interface UserRespository extends MongoRepository<User , Long>{

	

	
	

}