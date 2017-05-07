package com.psideris.pharmacy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psideris.pharmacy.entities.Doctor;
import com.psideris.pharmacy.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String login() {
		return "This is the login page";
	}
	
	@RequestMapping(value = "/user/dummy")
	public String getDummyUser(Model model) {
		
		model.addAttribute("dummyUser", userService.getDumpUser());
		
		return "user";
	}
	
	@RequestMapping(value = "/doctor/dummy", method = RequestMethod.GET)
	public String getDummyDoctor(Model model, @RequestParam("dummyDoctor") Doctor doctor) {

		System.out.println(doctor.getEmail());

		model.addAttribute("dummyDoctor", doctor);
		return "user";
	}
}
