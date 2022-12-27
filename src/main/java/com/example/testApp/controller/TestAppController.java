package com.example.testApp.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestAppController {

	@GetMapping(value = {"/login"})
	public ModelAndView loginPage() {
		
		ModelAndView modelAndView = new ModelAndView("loginPage");
		return modelAndView;
	}
	
	
	@GetMapping(value = {"/home"})
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}
	
	@GetMapping("/")
	public ModelAndView root() {
        return new ModelAndView("redirect:/home");
	}
	
	@GetMapping("/access-denied")
	public ModelAndView accessDenied() {
		ModelAndView modelAndView = new ModelAndView("access-denied");
		return modelAndView;
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpServletRequest request) throws ServletException {
		
		request.logout();
		return new ModelAndView("redirect:/login");
	}
}
