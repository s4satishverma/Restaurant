package com.mp.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mp.rest.model.User;
import com.mp.rest.service.UserService;

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/userreg")
	public void registerUser(User user) {
		System.out.println(user.getName());
		boolean registered = userService.userRegistraton(user);
		if(registered)
			System.out.println("User registrated");
		else
			System.out.println("User registration failed");	
	}
	
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user","");
		return mav;
	}
	
	
}
