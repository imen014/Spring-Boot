package com.example.project1.demo.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSp {
	
	
	@GetMapping("/test")
	public String test1(){
		return "hello world !";
	}
}
