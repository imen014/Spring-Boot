package com.example.testing1_cc.demotesting1_cc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.testing1_cc.demotesting1_cc.entities.GetUsersFrmDb;
import com.example.testing1_cc.demotesting1_cc.entities.User;

@Controller
public class MyController1 {
	
	@Autowired
	GetUsersFrmDb get_users_from_Db;
	
	
	@GetMapping("/form")
	public String form(Model model) {
		List<User> users = get_users_from_Db.getUsers();
		model.addAttribute("users", users);
		
		return "users";
	}

}
