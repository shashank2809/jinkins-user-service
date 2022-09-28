package com.sony.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sony.model.User;

@Service
public class UserManager {
	private Map<String, User> users;
	
	public UserManager() {
	users=new HashMap<>();
	User user;
	
	user=new User("Shashank", "Maurya", "abc@gmail.com", "New Delhi");
	users.put(user.getId(), user);
	
	user=new User("Alex", "Cole", "pqr@gmail.com", "Chandigarh");
	users.put(user.getId(), user);
	
	user=new User("Rohit", "Malik", "xyz@gmail.com", "Hubli");
	users.put(user.getId(), user);

	
}
public Iterable<User>getAllUsers(){
	return this.users.values();
}

public User getUserById(String id) {
	return  this.users.get(id);
}
}
