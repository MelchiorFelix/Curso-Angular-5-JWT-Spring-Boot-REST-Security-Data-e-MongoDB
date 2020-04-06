package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpringBootController {
	
	@GetMapping("/showtext")
	public String showText() {
		return "Hello, Fisrt Spring Boot project";
	}
}
