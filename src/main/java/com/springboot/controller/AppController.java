package com.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.springboot.dto.UserDTO;

@Controller
public class AppController {

	@GetMapping("/")
	public String index(){
		return "index";
	}

	@GetMapping("/login")
	public String returnViewLogin(){
		return "login";
	}
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> checkLogin(@RequestBody UserDTO userDTO){
		if(userDTO.getEmail().equals("tuan") && userDTO.getPassword().equals("123")){
			return ResponseEntity.ok(true);
		}
		else {
			return ResponseEntity.ok(false);
		}
	}

}
