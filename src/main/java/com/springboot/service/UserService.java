package com.springboot.service;

import java.util.List;

import com.springboot.dto.UserDTO;
import com.springboot.mapper.UserMapper;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserMapper userList;
    public UserService(UserMapper userList) {
		this.userList = userList;
	}

    public List<UserDTO> getAllUser(){
        return userList.selectAllUser();
    }
}
