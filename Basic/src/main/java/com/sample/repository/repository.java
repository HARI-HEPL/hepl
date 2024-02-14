package com.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.model.user;

import java.util.List;

public interface repository extends MongoRepository<user, Integer> {

	public List<user> findByUsername(String username);

	public String deleteByUsername(String username);

<<<<<<< HEAD
	public List<user> getByusername(String username);
<<<<<<< HEAD
	public List<user> getByphno(long phno);
	
=======

	public List<user> findByEmail(String email);

=======
	public List<user> findBypassword(String password);
>>>>>>> 6702d667d16d88e7b2f3c5184108265fbb21ef79
>>>>>>> d6b090da04893984edf1ed7cb422ac3f8e11a50c
}
