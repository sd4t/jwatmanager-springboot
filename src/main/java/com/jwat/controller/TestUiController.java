package com.jwat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestUiController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/user-list")
    public String userList(){
        return "userList";
    }
}