package com.java.FirstWebAppUsingSpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.FirstWebAppUsingSpringMVC.controller.FirstController;

@SpringBootApplication
public class FirstWebAppUsingSpringMvcApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container = 	SpringApplication.run(FirstWebAppUsingSpringMvcApplication.class, args);

	}

}
