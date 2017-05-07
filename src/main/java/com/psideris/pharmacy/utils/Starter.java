package com.psideris.pharmacy.utils;

import org.springframework.stereotype.Component;

@Component
public class Starter {

	public Starter() {
		System.out.println("Constructor of Starter");
	}
	
	public void init() {
		System.out.println("Calling init method");
	}
}
