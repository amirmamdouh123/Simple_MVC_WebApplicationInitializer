package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("get")
	public String getMe() {
		System.out.println("I'm here");
		return "intro";
	}
	
}
