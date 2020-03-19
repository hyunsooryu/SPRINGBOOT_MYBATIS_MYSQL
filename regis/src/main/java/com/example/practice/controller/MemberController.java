package com.example.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.domain.Member;
import com.example.practice.service.MemberService;

@RestController
@RequestMapping("/api")
public class MemberController {
	  @Autowired
	    private MemberService memberService;
	  
	   @RequestMapping(value = "/createMember", method = RequestMethod.POST)
	   public void create(@RequestBody Member member) {
		   memberService.register(member);
	   }
	  
	  
	  
	    @RequestMapping(value = "/readMember", method = RequestMethod.GET)
	    public String read(@PathVariable String id){
	    	System.out.println(id);
	    	int real_id = Integer.parseInt(id);
	        return memberService.read(real_id).toString();
	    }
	    
	    
	    
	    
}
