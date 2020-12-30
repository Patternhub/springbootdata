package com.patternhub.springbootdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patternhub.springbootdata.entity.User;
import com.patternhub.springbootdata.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepo;
	
//	public User createUser(String name,String email,long phone) {
//		User u= new User();
//		u.setName(name);
//		u.setEmail(email);
//		u.setPhone(phone);
//		User user = userRepo.save(u);
//		
//		return user;
//	}
	
	
	public User createUser1(User user) {
		return userRepo.save(user);
	}
	
}
