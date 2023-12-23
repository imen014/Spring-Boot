package com.test.pack.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Testeur {
	
	@GetMapping("/test")
	public String tester_app(Model model) {
		
		 String message = "Ceci est un exemple de message.";
	     int nombre = 42;
	     String salutation = "bonjour monde !";

	     model.addAttribute("message", message);
	     model.addAttribute("nombre", nombre);
	     model.addAttribute("salutation", salutation);
		
		return "hello";
		
		
	}

}
