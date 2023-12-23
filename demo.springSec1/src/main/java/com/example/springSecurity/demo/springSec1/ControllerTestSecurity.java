package com.example.springSecurity.demo.springSec1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTestSecurity {
	
	
	@GetMapping("/user")
	public String user_message() {
		return "user_message";
	}
	
	
	
	@GetMapping("/admin")
	public String admin_message() {
		return "admin_message";
	}

}
