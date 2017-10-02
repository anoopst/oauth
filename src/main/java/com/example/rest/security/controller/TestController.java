package com.example.rest.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@RequestMapping("/test")
	public String testController() {
		return "Hello World";				
	}
	
}
