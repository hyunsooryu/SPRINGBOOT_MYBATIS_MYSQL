package com.example.starter.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.starter.model.entity.User;
import java.time.LocalDateTime;
@Mapper
public interface UserMyBatisRepository {
	@Select("select * from user")
	public List< User > findAll();
	
	@Select("select * FROM user WHERE id = #{id}")
	public User findById(long id);
	
	@Select("select * FROM user WHERE id = #{id}")
	public User come(long id);
	
	@Insert("INSERT INTO study.user(account, email, phone_number, created_at, created_by)" + 
			"VALUES(#{account},#{email},#{phoneNumber}, #{createdAt}, + 'Admin')")
	public void insertNewUser(User user);
}
