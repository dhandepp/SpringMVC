package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {

	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@ResponseBody
	@GetMapping("/users")
	public String useres() {
		return "abc";
	}
}
