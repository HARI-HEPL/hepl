package com.sample.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.student;
import com.sample.repository.studentrepo;



@Service
public class studentservice {
	
	@Autowired
    public studentrepo studentrepo;
	
	//postmapping
	
	public String addstudent (List<student> student) {
      studentrepo.saveAll(student);
      return "added successfully";
}
	//getmapping
	
	public List<student> getAllStudent(){
		return studentrepo.findAll() ;
		
	}
}
