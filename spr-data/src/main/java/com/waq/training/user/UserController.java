package com.waq.training.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@RequestMapping("/users")
	List<UserP> getUsers(){
		
		return service.getAllUsers();

	}
	
	
	//For getting single user by id
	@RequestMapping("/users/{abc}")
	Optional<UserP> getUser(@PathVariable("abc") String id) {
		return service.getUser(id);
	}
	
	
	//For adding a topic by : post
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody UserP user) {
		service.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	void updateUser(@RequestBody UserP user, @PathVariable String id) {
		System.out.println(user);
		service.updateUser(user, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	void updateUser(@PathVariable String id) {
		service.deleteUser(id);
	}
	
}
