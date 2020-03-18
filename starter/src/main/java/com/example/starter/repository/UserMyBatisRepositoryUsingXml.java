package com.example.starter.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.starter.model.entity.User;

@Repository
@Mapper
public interface UserMyBatisRepositoryUsingXml {
	User findById(long id);
}
