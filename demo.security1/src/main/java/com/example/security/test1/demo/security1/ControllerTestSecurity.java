package com.example.security.test1.demo.security1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTestSecurity {
	
	@GetMapping("/user")
	public String message_user() {
		return "message_user";
	}
	
	
	@GetMapping("/admin")
	public String message_admin() {
		return "message_admin";
	}


}
