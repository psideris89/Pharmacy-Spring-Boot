package com.psideris.pharmacy.entities;

import org.springframework.stereotype.Component;

@Component
public class Patient {

	private String natInsCode;
	private String name;
	private String lastName;
	private String email;
	
	public String getNatInsCode() {
		return natInsCode;
	}
	public void setNatInsCode(String natInsCode) {
		this.natInsCode = natInsCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
