package com.example.testes.test.demo.testes.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GForm {
	
	@GetMapping("/form")
	public String getForm() {
		return "maform";
	}
	
	
	
	@PostMapping("/form")
	public String submit() {
		return "confirmation";
	}


}
