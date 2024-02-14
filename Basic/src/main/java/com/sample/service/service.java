package com.sample.service;



import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.user;
import com.sample.repository.repository;

@Service
public class service {
	@Autowired
    repository repo;
//get
public List <user> listall(){
	return repo.findAll();

}
//post
public List<user> saveall(List<user> u){
	
       
   
	return repo.saveAll(u);

}
//delete
public String deleteByid(int id) {
	 repo.deleteById(id);
	return "deleted Sucessfully";
}
//getbyusername
public List<user> byusername(String username){
	return repo.findByUsername(username);
	
}
//deletebyusername
public String deletebyname(String username) {
	repo.deleteByUsername(username);
	return "Deleted Sucessfully";
}


//put
 public user update(int userid,user u ){
	 user olduser = repo.findById(userid).get();
	 
     if (Objects.nonNull(u.getUsername())) {
         olduser.setUsername(u.getUsername());
     }

     if (Objects.nonNull(u.getAddress())) {
         olduser.setAddress(u.getAddress());
     }

     if (Objects.nonNull(u.getPassword())) {
         olduser.setPassword(u.getPassword());
     }
     
     if (Objects.nonNull(u.getDate())) {
         olduser.setDate(u.getDate());
     }

     return repo.save(olduser);
	
     //bypass

 }

public List<user> getByphno(long phno) {
	// TODO Auto-generated method stub
	return repo.getByphno(phno);
}
 
 //get


 public List<user> findByPass (String no){
	 return repo.findBypassword(no);
 }
 
 
}
