package com.jpa_data_exercices1.demo.data_jpa_exercices1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GForm {
	
	@GetMapping("/form")
	public String form() {
		return "form1";
	}
	
	
	@PostMapping("/form")
	public String submit(@RequestParam String username,
			@RequestParam String email,
			@RequestParam String phone,
			@RequestParam String message,
			Model model) {
		
		model.addAttribute("username", username);	
		model.addAttribute("email", email);
		model.addAttribute("phone", phone);
		model.addAttribute("message", message);
		
		return "confirmation";
	}

}
