package com.psideris.pharmacy.services;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.psideris.pharmacy.entities.User;

@Component
public class UserService {

	private Log LOG = LogFactory.getLog(UserService.class);
	
	@Autowired
	private List<User> users;
	
	public void addNewUser(User user) {
		users.add(user);
	}
	
	public List<User> getUsersList() {
		return users;
	}
	
	public User getUserByEmail(String email) {
		Optional<User> user = users.stream().filter(e -> e.getEmail().equals(email))
						.findFirst();
		return user.isPresent() ? (User) user.get() : null;
	}
	
	public User getUserByName(String firstName, String lastName) {
		Optional<User> user = users.stream()
						.filter(e -> e.getFirstName().equalsIgnoreCase(firstName) && e.getLastName().equalsIgnoreCase(lastName))
						.findFirst();
		return user.isPresent() ? (User) user.get() : null;
	}
	
	public void deleteUserByEmail(String email) {
		for(User user: users) {
			if(user.getEmail().equalsIgnoreCase(email)) {
				LOG.debug("Deleting the User with email: " + user.getEmail());
				users.remove(user);
			}
		}
	}
	
	@ModelAttribute("dummyUser")
	public User getDumpUser() {
		return new User("Panagiotis", "Sideris", "psideris@bmj.com", "psid", "12345");
	}
}
