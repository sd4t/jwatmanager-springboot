package com.jwat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public String list(){
		System.out.println("Users here");
		return "ok";
	}

	@GetMapping("/")
	public String index() {
		System.out.println("Index here");
		return "good";
	}
}
