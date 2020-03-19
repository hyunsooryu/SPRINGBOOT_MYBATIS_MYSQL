package com.example.practice.mapper;

import com.example.practice.domain.Member;

public interface MemberMapper {
	
	
	 public void create(Member board);

	 public Member read(Integer userNo);
	 
	 public Integer check(String email, String userPw);

	    /*
	    public void update(Board board) throws Exception;
	    public void delete(Integer boardNo) throws Exception;
	    public List<Board> list() throws Exception;
	     */
}
