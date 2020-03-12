package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import com.springboot.dto.UserDTO;
import com.springboot.service.UserService;

@Controller
public class AppController {
	@Autowired
	UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String returnViewLogin() {
		return "login";
	}

	@GetMapping("/all-users")
	@ResponseBody
	public List<UserDTO> getAllUser() {
		return userService.getAllUser();
	}

	@PostMapping("/login")
	public ResponseEntity<Boolean> checkLogin(@RequestBody UserDTO userDTO) {
		if (userDTO.getEmail().equals("tuan") && userDTO.getPassword().equals("123")) {
			return ResponseEntity.ok(true);
		} else {
			return ResponseEntity.ok(false);
		}
	}

	
}
