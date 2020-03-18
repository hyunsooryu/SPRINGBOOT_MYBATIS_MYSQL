package com.example.starter.repository;


import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.starter.UserServiceImpl.StarterApplicationTests;
import com.example.starter.model.entity.User;

public class UserMyBatisRepositoryTest extends StarterApplicationTests{
	@Autowired
	private UserMyBatisRepository userMyBatisRepository;
	
	
	
	@Test
	public void all() {
		System.out.println(userMyBatisRepository.findAll());
	}
	@Test
	public void getByid() {
		//User user = userMyBatisRepository.findById(1L);
		User user = userMyBatisRepository.come(4L);
		System.out.println(user);
	}
	@Test
	public void insertTest() {
		User user = new User();
		user.setAccount("앤드류");
		user.setEmail("gustnapfhd@nate.com");
		user.setPhoneNumber("010-7499-8045");
		user.setCreatedAt(LocalDateTime.now());
		user.setCreatedBy("Admin");
		System.out.println(user);
		userMyBatisRepository.insertNewUser(user);
	}
	

}
