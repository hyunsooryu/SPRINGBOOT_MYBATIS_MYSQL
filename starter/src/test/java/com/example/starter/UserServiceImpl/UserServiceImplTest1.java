package com.example.starter.UserServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.starter.service.serviceImpl.UserServiceImpl;

public class UserServiceImplTest1 extends StarterApplicationTests{
	@Autowired 
	private UserServiceImpl userServiceImpl;
	
	@Test
	void TestInsert() {
		//userServiceImpl.create("강아지", "canada@gmail.com", "010-4343-2321");
	}
}
