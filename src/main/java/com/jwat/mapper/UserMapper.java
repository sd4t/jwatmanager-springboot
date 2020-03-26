package com.jwat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jwat.model.User;

@Mapper
public interface UserMapper {
	List<User> getListUser();
	boolean insertUser(User user);
	User getUserById(int id);
	Boolean deleteUserById(int id);
	Boolean updateUser(User user);
	User checkLogin(User user);
	int getUserIdByEmail(String email);
	Boolean checkEmailAvailable(String email);
}
