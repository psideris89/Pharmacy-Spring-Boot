package com.psideris.pharmacy.entities;

import org.springframework.stereotype.Component;

@Component
public class Doctor extends People{

	private String id;
	private String specialty;
	private String workAddress;
	
	public Doctor() {
		super(null, null, null);
	}
	
	public Doctor(String firstName, String lastName, String email) {
		super(firstName, lastName, email);
	}
	
	public Doctor(String firstName, String lastName, String email, 
			String id, String specialty, String workAddress) {
		
		super(firstName, lastName, email);
		this.id = id;
		this.specialty = specialty;
		this.workAddress = workAddress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}	
}
