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

import com.sample.Entity.User;
import com.sample.service.UserService;


@RestController
@RequestMapping("/new")
public class UserController {

	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody User u) {
		return userservice.addUser(u);
	}
	
	/*@GetMapping("/getallusers")
	public List<User> fetchUser(){
		return userservice.getAllUsers();
	}*/
	
	@GetMapping("/getusers/{id}")
	public Optional<User> fetchById(@PathVariable Long id) {
		return userservice.getUserById(id);
	}
	
	@DeleteMapping("/deleteusers/deleteid/{id}")
	public String removeById(@PathVariable Long id){
		return userservice.removeById(id);
	}
	
	@PutMapping("/putusers/updateuser/{id}")
	public User putUser(@PathVariable Long id,@RequestBody User user) {
		return userservice.updateByUserId(id, user);
	}
	
	

}
