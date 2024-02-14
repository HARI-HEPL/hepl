package com.sample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.user;
import com.sample.repository.repository;
import com.sample.service.service;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/user")
public class Controller {

	@Autowired
	private repository repo;
	@Autowired
	private service serv;

	@GetMapping("/users")
	public List<user> getuser() {
		return serv.listall();
	}

	@GetMapping("/users/{username}")
	public List<user> getuserByname(@PathVariable String username) {

<<<<<<< HEAD
		return serv.byusername(username);
	}
=======
@PutMapping("/users/putuser/{id}")
public Optional<user> putuser (@PathVariable int id,
		                   @RequestBody user u){
	serv.update(id, u);
	return repo.findById(id);
}
@GetMapping("/users/bypass/{password}")
public List<user> bypass (@PathVariable String password){
	return serv.findByPass(password);
}
>>>>>>> 6702d667d16d88e7b2f3c5184108265fbb21ef79

	@PostMapping("/users/adduser")
	public String saveuser(@RequestBody List<user> u) {

		serv.saveall(u);
		return "Added Successfully";

	}

	@DeleteMapping("/users/deleteid/{id}")
	public String deleteByid(@PathVariable int id) {
		return serv.deleteByid(id);
	}

	@DeleteMapping("/users/deleteusername/{username}")
	public String deleteByuser(@PathVariable String username) {
		return serv.deletebyname(username);
	}

	@PutMapping("/users/putuser/{id}")
	public Optional<user> putuser(@PathVariable int id, @RequestBody user u) {
		serv.update(id, u);
		return repo.findById(id);
	}

	@GetMapping("/findByEmail/{email}")
	public List<user> findByEmail(@PathVariable String email) {
		return repo.findByEmail(email);
	}

}
