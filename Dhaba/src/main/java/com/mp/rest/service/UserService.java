package com.mp.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.rest.model.User;
import com.mp.rest.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public boolean userRegistraton(User user)
	{
		boolean userRegistratedFlag = userRepo.userRegistraton(user);
		return userRegistratedFlag;
	}
	
	
}
