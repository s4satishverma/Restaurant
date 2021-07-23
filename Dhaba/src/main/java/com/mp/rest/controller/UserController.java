package com.mp.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mp.rest.model.User;
import com.mp.rest.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	
	@PostMapping("/userreg")
	public void registerUser(User user) {
		System.out.println(user.getName());
		boolean registered = userServ.userRegistraton(user);
		if(registered)
			System.out.println("User registrated");
		else
			System.out.println("User registration failed");	
	}
	
	@GetMapping(path="/getValues")
	public String getValues() {
	  System.out.println("yes, I am fine");
	  return "yeah values";
	}
	
	@GetMapping(path="/getUserByEmail", produces=MediaType.APPLICATION_JSON_VALUE)
	public User getUser(@RequestParam("email") String email) {
		User user = userServ.getUser(email);
		System.out.print(user.getPass());
	    return user;
	}
	
	@GetMapping(path="/getUsers")
	public String getUsers() {
	  System.out.println("yes, I am fine");
	  return "yeah values";
	}
	
	
	
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user","");
		return mav;
	}
	
	
}
