package com.jwat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwat.mapper.UserMapper;
import com.jwat.model.User;
import com.jwat.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> list(){
		System.out.println("Users here");
		List<User> user = userService.getListUser();
		return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	}
	
}
