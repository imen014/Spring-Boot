package com.example.tester.demo.tester;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormManagement {

	
	@GetMapping("/maform")
	public String form() {
		return "maform";
	}
}
