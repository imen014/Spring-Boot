package com.example.forms.demo.myforms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.forms.demo.myforms.entities.MyUserEntity;
import com.repo.interfaces.UserDataRepository;

import jakarta.transaction.Transactional;

@Controller
public class Forms {
	
	@Autowired
	private UserDataRepository userRepose;
	
	@GetMapping("/getForm")
	public String getForm() {
		return "myform";
	}
	
	@PostMapping("/getForm")
	@Transactional
	public String submitForm(@RequestParam String username,
			@RequestParam String password,
			@RequestParam String email,
			Model model) {
		
		
		
		MyUserEntity user1 = new MyUserEntity();
		
		user1.setUsername(username);
		user1.setEmail(email);
		user1.setPassword(password);
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("email",email);
		
		 userRepose.save(user1);
		
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("email : " + email);
		
		model.addAttribute("user1", user1);
		
		return "confirmation";
		
	}

}
