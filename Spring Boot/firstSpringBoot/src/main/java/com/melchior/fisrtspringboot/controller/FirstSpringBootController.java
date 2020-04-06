package com.melchior.fisrtspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpringBootController {
	
	@GetMapping("/")
	public String index() {
		return "index page";
	}
	
	@GetMapping("/showtext")
	public String showText() {
		return "Hello, Fisrt Spring Boot project";
	}
}
