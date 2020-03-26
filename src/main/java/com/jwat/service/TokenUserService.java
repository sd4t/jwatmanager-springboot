package com.jwat.service;

import com.jwat.mapper.TokenUserMapper;
import com.jwat.model.TokenUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenUserService {
	@Autowired
	private TokenUserMapper tkUserMapper;

	public TokenUserService(TokenUserMapper tkUserMapper) {
		this.tkUserMapper = tkUserMapper;
	}

	public Boolean createToken(TokenUser tokenUser) {
		return tkUserMapper.createToken(tokenUser);
    }
}