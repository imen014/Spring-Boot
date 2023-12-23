package com.example.test2.demo.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.test2.demo.entities.Employee2;
import com.example.test2.demo.entities.MyInterface;

@Controller
public class FormManager {
	
	@Autowired
	MyInterface interface1;
	
	
	@GetMapping("/form")
	public String myform() {
		return "form";
	}
	
	
	@PostMapping("/form")
	public String submit_form(@RequestParam String username,
			@RequestParam String phone,
			@RequestParam String email,
			@RequestParam String message,
			Model model) {
		
		model.addAttribute("username", username);
		model.addAttribute("phone", phone);
		model.addAttribute("email", email);
		model.addAttribute("message", message);
		
		
		return "confirmation";
	}
	
	
	@GetMapping("/form_employee")
	public String myform2() {
		return "form_employee";
	}
	
	
	@PostMapping("/form_employee")
	public String submit_form2(@ModelAttribute("Employee2") Employee2 employee1, Model model) {
		
		
		
		model.addAttribute("employee1", employee1);
	
		
		
		interface1.save(employee1);
		
		
		
		
		return "confirmation_employee";
	}

}
