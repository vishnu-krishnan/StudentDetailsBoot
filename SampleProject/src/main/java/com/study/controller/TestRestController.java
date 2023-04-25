package com.study.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRestController {
	
	@GetMapping("/greetings")
	public String helloMethod() {
		return Greetings();	
	}

	public String Greetings() {
		return "Hello world";
	}

}
