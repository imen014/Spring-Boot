package com.example.test.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ManageForms {
	
	
	@GetMapping("/getForm")
	public String getForm() {
		
		return "form";
		
	}
	
	@PostMapping("/getForm")
	public String setForm(@RequestParam String user_name, 
			@RequestParam String user_mail,
			@RequestParam String user_message,
			Model model) {
		model.addAttribute("user_name", user_name);	
		model.addAttribute("user_mail", user_mail);	
		model.addAttribute("user_message", user_message);	
		
		return "confirmation";
		
	}

}
