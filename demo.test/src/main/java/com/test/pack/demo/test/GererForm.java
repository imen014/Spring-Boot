package com.test.pack.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GererForm {
	
	@GetMapping("/showForm")
	public String afficher_formulaire(Model model) {
		
		model.addAttribute("user", new User());
		return "form1";
	}
	
	@PostMapping("/submitForm")
	public String submit_form(@ModelAttribute("user") User user, Model model) {
        System.out.println("User: " + user.getNom() + ", Email: " + user.getEmail());
        model.addAttribute("user", user);

        return "confirmation";


	}

}
