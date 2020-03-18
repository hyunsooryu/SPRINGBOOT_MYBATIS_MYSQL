package com.example.starter.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.starter.UserServiceImpl.StarterApplicationTests;

public class UserMyBatisRepositoryUsingXmlTest extends StarterApplicationTests{
	@Autowired 
	private UserMyBatisRepositoryUsingXml userMyBatisRepositoryUsingXml;
	
	@Test
	public void read() {
		 System.out.println(userMyBatisRepositoryUsingXml.findById(3L));
	}
	

}
