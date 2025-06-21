package com.java.FirstWebAppUsingSpringMVC.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller1")
public class FirstController {
	@GetMapping("/welcome")
	public String displayMessage(Model model) {
		
		model.addAttribute("message", "Hello Welcome to Second Web App using Spring MVC");
	
		return "home";
	}
	@PostMapping("/welcome")
	public String displayMessage1(Model model) {
		
		model.addAttribute("message", "Hello Welcome to Second Web App using Spring MVC USING POST Method");
	
		return "home";
	}
	@GetMapping("/welcome1")
	public String alien(Map<String,Object> map) {
		map.put("message", "Hello Welcome to Second Web App using Spring MVC USING Map Interface");
		return "home";
	}
	
	@GetMapping("/baby")
	public void display(Map<String,Object> map) {
		System.out.println(map.getClass().getName());
		map.put("message", "Hello Welcome to Second Web App using Spring MVC without return statement");
		return ;
	}

}
