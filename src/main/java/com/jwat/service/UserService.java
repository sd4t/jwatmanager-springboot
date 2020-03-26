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

	public int getUserIdByEmail(String email) throws Exception {
		return userMapper.getUserIdByEmail(email);
	}

	public Boolean checkEmailAvailable(String email) throws Exception {
		return userMapper.checkEmailAvailable(email);
	}

	@Transactional
	public boolean insertUser(User user) throws Exception {
		// String password = user.getPassword();
		// BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		// password = encoder.encode(password);
		// System.out.println(password);
		// System.out.println(user);

		// user.setPassword(password);

		return userMapper.insertUser(user);
	}

	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

	@Transactional
	public Boolean deleteUserById(int id) throws Exception {
		return userMapper.deleteUserById(id);
	}

	@Transactional
	public Boolean updateUser(User user) throws Exception {
		return userMapper.updateUser(user);
	}

	public int checkLogin(User user) {
		User usr = userMapper.checkLogin(user);
		if (usr != null) {
			System.out.println("Service login check user_id="+usr.getId());
			return usr.getId();
		}
		return -1;
	}
}
