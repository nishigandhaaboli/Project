package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/index")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/userForm")
	public String userForm() {
		return "userForm";
	}
	
//	
//	@RequestMapping(name = "/register")
//	public String register() {
//		return "register";
//	}
//	
//	
//	@RequestMapping(name = "/login")
//	public String login() {
//		return "login";
//	}

}
