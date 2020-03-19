package com.example.practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages = "com.example.practice.mapper")
@SpringBootApplication
public class RegisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisApplication.class, args);
	}

}
