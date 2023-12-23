package com.example.project1.demo.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sum {
	
	@GetMapping("/sum1")
	public int sum_fct() {
		int result = 1000+1;
		return result;
		
	}

}
