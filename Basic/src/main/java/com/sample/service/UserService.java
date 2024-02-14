package com.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.Entity.User;
import com.sample.repository.UserRespository;



@Service
public class UserService {
	@Autowired
	private UserRespository userrepository;

	// CReating user(post)
	public String addUser(User u) {
		userrepository.save(u);
		return "saved";

	}

	// Fetching data(get)
	//public List<User> getAllUsers() {
	//	return userrepository.findAll();

	//}

	// get BY Id
	public Optional<User> getUserById(Long id) {
		return userrepository.findById(id);

	}

	// delete BY Id
	public String removeById(Long id) {
		userrepository.deleteById(id);
		 return "deleted successfully";

	}

	// Update (put)
	public User updateByUserId(Long id, User user) {
		User existingUser = userrepository.findById(id).get();
		existingUser.setFirstName(user.getFirstName());
		existingUser.setMiddlename(user.getMiddlename());
		existingUser.setLastName(user.getLastName());
		existingUser.setAddress(user.getAddress());
		existingUser.setEmail(user.getEmail());
		existingUser.setPhno(user.getPhno());
		return userrepository.save(existingUser);

	}
}
