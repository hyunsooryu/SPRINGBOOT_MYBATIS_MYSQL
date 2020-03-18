package com.example.starter.service.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.starter.model.entity.User;
import com.example.starter.repository.UserMyBatisRepository;
import com.example.starter.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired UserMyBatisRepository userMyBatisRepository;
	
	@Override
	public void create(User user) {
		userMyBatisRepository.insertNewUser(user);
	}
	
	@Override
	public void read() {
		
	}
	
}
