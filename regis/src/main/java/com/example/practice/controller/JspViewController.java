package com.example.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspViewController {
	@RequestMapping(value = "/")
	public String root() {
		return "form";
	}

	@RequestMapping(value = "/join")
	public String join() {
		return "join";
	}
}
