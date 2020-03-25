package com.jwat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
	public String index() {
		System.out.println("Index here");
		return "good";
	}
}
