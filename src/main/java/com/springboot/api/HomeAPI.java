package com.springboot.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeAPI {

	@GetMapping("/api/test")
	public ResponseEntity<String> testSpringBoot(){
		return ResponseEntity.ok("Test success");
	}
}
