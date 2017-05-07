package com.psideris.pharmacy.entities;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String email, String useName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = useName;
		this.password = password;
	}
	
	public User(String userName, String password) {
		this(userName, userName, userName + "@dummy.com", userName, password);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

}
