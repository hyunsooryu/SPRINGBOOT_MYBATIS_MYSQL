package com.example.practice.service;

import com.example.practice.domain.Member;

public interface MemberService {
	 public void register(Member meber);
	 public Member read(Integer userNo);
	 public boolean check(String email, String userPw);
}
