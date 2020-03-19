package com.example.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.practice.domain.Member;
import com.example.practice.service.MemberService;

@Controller
public class LoginController {

	  @Autowired
	    private MemberService memberService;
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String check() {
		return "";
	}
	
	
	@RequestMapping(value = "/isQualifiedUser", method = RequestMethod.GET)
	 public String isQualifedUser(@RequestParam(name = "a") String email, @RequestParam(name = "b") String pw){
		if(memberService.check(email, pw)) {
			return "result_ok";
		}
	    return "result_no";
	 }
	

	

}
