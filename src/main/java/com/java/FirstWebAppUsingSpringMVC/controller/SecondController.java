package com.java.FirstWebAppUsingSpringMVC.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
@RequestMapping("/controller2")
public class SecondController {
	@GetMapping("/welcome")
	public String displayMessage(Model model) {
		
		model.addAttribute("message", "Hello Welcome to Second Web App using Spring MVC SecondController");
	
		return "home";
	}
}
