package com.example.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.domain.Member;
import com.example.practice.mapper.MemberMapper;


@Service
public class MemberServiceImpl implements MemberService {

	
	@Autowired
	private MemberMapper memberMapper;
	
	
	@Override
	public void register(Member meber) {
		// TODO Auto-generated method stub
		memberMapper.create(meber);
		
	}

	@Override
	public Member read(Integer userNo) {
		// TODO Auto-generated method stub
		return memberMapper.read(userNo);
	}
	
	@Override
	public boolean check(String email, String userPw) {
		return memberMapper.check(email, userPw) == 1;
	} 

}
