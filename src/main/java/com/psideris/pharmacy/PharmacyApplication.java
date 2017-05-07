package com.psideris.pharmacy;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.psideris.pharmacy.utils.Starter;

@SpringBootApplication
public class PharmacyApplication extends SpringBootServletInitializer{

	@Autowired
	public Starter starter;
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PharmacyApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(PharmacyApplication.class, args);
	}
	
	public PharmacyApplication() {
		System.out.println("Constructor of App");
	}
	
	@PostConstruct
	public void init() {
		starter.init();
	}
}
