package com.example.pack.demo.project1;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sommateur {

	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("message", "Bonjour, Monde !");
		return "hello";
	}
}
