package com.jwat.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jwat.model.TokenUser;

@Mapper
public interface TokenUserMapper {
	Boolean createToken(TokenUser tokenUser);
}
