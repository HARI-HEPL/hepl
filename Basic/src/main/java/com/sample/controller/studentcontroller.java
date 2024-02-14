package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.student;
import com.sample.service.studentservice;

@RequestMapping("/api/student")

@RestController
public class studentcontroller {
	
	@Autowired
	 studentservice stud;

	  
	   @PostMapping("/adduser")
	    public String savestudent(@RequestBody List <student> s){
		   return stud.addstudent(s);
	      
	    }
	   @GetMapping
	    public List<student> getStudent() {
	        return stud.getAllStudent();
	    }
	
}
