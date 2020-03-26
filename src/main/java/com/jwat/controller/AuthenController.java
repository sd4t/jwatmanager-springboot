package com.jwat.controller;

import com.jwat.dto.ResponseDataLogin;
import com.jwat.model.TokenUser;
import com.jwat.model.User;
import com.jwat.service.TokenUserService;
import com.jwat.service.UserService;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenUserService tkUserService;

    // @PostMapping("/login")
    // public ResponseEntity<Integer> login(@RequestBody User user){
    // Integer userId = -1;
    // userId = userService.checkLogin(user);

    // if(userId == -1){
    // return new ResponseEntity<Integer>(userId, HttpStatus.NOT_FOUND);
    // }

    // TokenUser tokenUser = new TokenUser();
    // tokenUser.setUser_id(userId);

    // System.out.println("userid: "+ user.getId());

    // String token = RandomStringUtils.random(64, true, true);
    // tokenUser.setToken(token);
    // System.out.println(token);

    // tkUserService.createToken(tokenUser);

    // return new ResponseEntity<Integer>(userId, HttpStatus.OK);
    // }

    @PostMapping("/login")
    public ResponseEntity<ResponseDataLogin> login(@RequestBody User user) throws Exception {
        ResponseDataLogin data = new ResponseDataLogin();

        int userId;
        userId = userService.checkLogin(user);

        if (userId == -1) {
            data.setUser_id(userId);
            data.setToken("null");
            data.setErrorMessage("Email or Password incorrect!");
            return new ResponseEntity<ResponseDataLogin>(data, HttpStatus.NOT_FOUND);
        }

        TokenUser tokenUser = new TokenUser();
        tokenUser.setUser_id(userId);

        System.out.println("userid: " + userId);

        String token = RandomStringUtils.random(64, true, true);
        tokenUser.setToken(token);
        System.out.println(token);

        tkUserService.createToken(tokenUser);

        data.setError(false);
        data.setToken(token);
        data.setUser_id(userId);
        data.setErrorMessage("null");
        return new ResponseEntity<ResponseDataLogin>(data, HttpStatus.OK);
    }
}