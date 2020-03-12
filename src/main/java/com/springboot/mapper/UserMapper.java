package com.springboot.mapper;

import java.util.List;

import com.springboot.dto.*;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public List<UserDTO> selectAllUser();
}
