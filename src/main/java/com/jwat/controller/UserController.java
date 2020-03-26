package com.jwat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwat.model.User;
import com.jwat.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public ResponseEntity<List<User>> listAllUser() {
		System.out.println("Get list user!");
		List<User> user = userService.getListUser();
		return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<Boolean> createUser(@RequestBody User user) throws Exception {
		System.out.println("Insert user!");
		
		Boolean check = false;
		String email = user.getEmail();
		Boolean count = userService.checkEmailAvailable(email);
		System.out.println(count);
		if(count == false){
			check = userService.insertUser(user);
		}
		else{
			return new ResponseEntity<Boolean>(check, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Boolean>(check, HttpStatus.OK);
	}

	@PutMapping("/users/{id}")
	public ResponseEntity<Boolean> updateUser(@RequestBody User user, @PathVariable("id") int id) throws Exception {
		User user1 = userService.getUserById(id);

		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());

		System.out.println("Update user!");
		System.out.println("userId " + id);
		System.out.println("user " + user);
		System.out.println("user1 " + user1);

		Boolean check = userService.updateUser(user1);
		return new ResponseEntity<Boolean>(check, HttpStatus.OK);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("id") int id) {
		Boolean check = true;
		System.out.println("Delete user!");
		System.out.println("userId " + id);
		try {

			check = userService.deleteUserById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Boolean>(check, HttpStatus.OK);
	}
}
