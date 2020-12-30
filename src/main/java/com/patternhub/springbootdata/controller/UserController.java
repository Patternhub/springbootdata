package com.patternhub.springbootdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.patternhub.springbootdata.entity.User;
import com.patternhub.springbootdata.service.UserService;

@RestController
@RequestMapping(value="/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
//	@RequestMapping(value="/create/{name}/{email}/{phone}",method = RequestMethod.POST)
//
//	
//	public User createuser(@PathVariable("name") String name, @PathVariable("email") String email,@PathVariable("phone") long phone) {
//		
//		User user =userService.createUser(name, email, phone);		
//		return user;
//	}
//	
	

	//@RequestMapping(value="/create",method = RequestMethod.POST)
	
	@PostMapping(value="/create")
	
	public User createuser1(@RequestBody User user) {
		
		User user1= userService.createUser1(user);		
		return user1;
	}


}
