package com.sample.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class user {

	@Id
	private int id;
	private String username;
	private String password;
	private Address address;
	private LocalDate date;
<<<<<<< HEAD
	private String email;

	public String getEmail() {
		return email;
=======
	private long contactnumber;
	
	public long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(int contactnumber) {
		this.contactnumber = contactnumber;
	}

	/*public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public user(int id, String username, String password, Address address, LocalDate date) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.address = address;
		this.date = date;
>>>>>>> 6702d667d16d88e7b2f3c5184108265fbb21ef79
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * public user() { super(); // TODO Auto-generated constructor stub }
	 * 
	 * public user(int id, String username, String password, Address address,
	 * LocalDate date) { super(); this.id = id; this.username = username;
	 * this.password = password; this.address = address; this.date = date; }
	 * 
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", date=" + date + "]";
	}

}
