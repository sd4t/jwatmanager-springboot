package com.jwat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/index")
	public String index() {
		System.out.println("Index here");
		return "Return home page if you've logined, login page if not";
	}
}
