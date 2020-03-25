package com.jwat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jwat.model.User;

@Mapper
public interface UserMapper {
	List<User> getListUser();
	boolean insertUser(User user);
	User getUserById(int id);
	int deleteUserById(int id);
	User updateUser(int id);
	User checkLogin(User user);
}
