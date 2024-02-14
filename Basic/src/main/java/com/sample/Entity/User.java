package com.sample.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="collection1")
public class User {
	
	
	@Id
	private Long id;

	private String firstName;
	
    private String middlename;
	
	private String lastName;
	
	private String email;
	
	private Long phno;
	
	private String address;
	
    
	
	public User(Long id, String firstName, String middlename, String lastName, String email, Long phno,
			String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middlename = middlename;
		this.lastName = lastName;
		this.email = email;
		this.phno = phno;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", middlename=" + middlename + ", lastName=" + lastName
				+ ", email=" + email + ", phno=" + phno + ", address=" + address + "]";
	}
	
	

}
