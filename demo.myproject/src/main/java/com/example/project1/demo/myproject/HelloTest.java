package com.example.project1.demo.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTest {
	
	@GetMapping("/hello1")
	public String myFct() {
		return "hello every body ! ";
	}

}
