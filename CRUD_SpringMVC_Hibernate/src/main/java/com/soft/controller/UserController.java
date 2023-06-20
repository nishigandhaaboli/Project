package com.soft.controller;

import java.util.List;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soft.entity.User;
import com.soft.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value ="/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {
		
		int saveUserId = userService.saveUserService(user);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("SavedUserId", saveUserId);
		
		System.out.println(saveUserId);
		
		String displayURL = "/getAllUsers";
		
		return "redirect:"+displayURL;
		
	}
	
	@RequestMapping(value="/getAllUsers", method = RequestMethod.GET)
	public ModelAndView getAllUsers() {
		
		List<User> list = userService.getAlluserService();
		
		System.out.println(list);
		
		ModelAndView mav  = new ModelAndView();
		
		mav.addObject("UserList", list);
		
		mav.setViewName("display");
		
		return mav;
		
	}

	@RequestMapping(value = "/deleteById" ,method = RequestMethod.GET)
	public String deleteById(@RequestParam int Id) {
		
		userService.deleteByIdService(Id);
		
		ModelAndView mav = new ModelAndView();
		
		String displayURL = "/getAllUsers";
		
		return "redirect:"+displayURL;
	}
	
	@RequestMapping(value ="/updateById")
	public ModelAndView getExistingUser(@RequestParam int Id) {
		
		ModelAndView mav = new ModelAndView();
		
		User existingUser = userService.getuserByIdService(Id);
		
		System.out.println(existingUser);
		
		mav.addObject("ExistingUser", existingUser);
		
		mav.setViewName("/updateUser");
		
		return mav;
	}
	
	@RequestMapping(value = "/updateExistingUser" ,method = RequestMethod.POST)
	public String UpdateExistUserService(@ModelAttribute User user) {
				
		userService.UpdateExistUserService(user);
		
		String displayURL = "/getAllUsers";
		
		return "redirect:"+displayURL;
	}

}
