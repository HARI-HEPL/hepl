package com.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.model.user;

import java.util.List;



public interface repository extends MongoRepository<user,Integer> {

	public List<user> findByUsername(String username);
	public String deleteByUsername(String username);
	public List<user> getByusername(String username);
	public List<user> getByphno(long phno);
	
}
