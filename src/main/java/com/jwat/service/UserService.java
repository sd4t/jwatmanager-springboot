package com.jwat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwat.mapper.UserMapper;
import com.jwat.model.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public List<User> getListUser() {
		return userMapper.getListUser();
	}

	@Transactional
	public boolean insertUser(User user) throws Exception {
		return userMapper.insertUser(user);
	}

	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

	@Transactional
	public int deleteUserById(int id) throws Exception {
		return userMapper.deleteUserById(id);
	}

	public boolean checkLogin(User user) {
		User usr = userMapper.checkLogin(user);
		if (usr != null) {
			System.out.println(usr.getId());
			return true;
		}
		return false;
	}
}
