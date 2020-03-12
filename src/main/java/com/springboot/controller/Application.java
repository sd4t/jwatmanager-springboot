package com.springboot.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.springboot.mapper")
@ComponentScan("com.springboot.service")
@SpringBootApplication

public class Application {

	public static void main (String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
