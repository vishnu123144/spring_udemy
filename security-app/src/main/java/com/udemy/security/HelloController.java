package com.udemy.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
	@GetMapping("/hello")
	public String getMessage() {
		return "Welcome to spring security project";
	}
	
	@GetMapping("/bye")
	public String getMessage1() {
		return "bye to spring";
	}
}
