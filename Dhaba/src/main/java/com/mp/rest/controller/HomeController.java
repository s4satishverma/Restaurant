package com.mp.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	
	@RequestMapping("hello")
	public String sayHello()
	{
		return "hello";
	}
	
	@RequestMapping("home")
	public String sayHi()
	{
		return "home.jsp";
	}
	
	@RequestMapping("dhaba")
	public String dhaba()
	{
		return "dhaba";
	}
	
	
}
