package com.example.testes.test.demo.testes.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.testes.test.demo.testes.test1.User_find;

@Controller
public class MyController {
	
	@Autowired
	User_find user_find;
	
	@GetMapping("/get_all_users")
	@ResponseBody
	public List<User> getAllusers(){
		return user_find.getUsers();
	}
	
	
	@GetMapping("/get_user_by_id")
	@ResponseBody
	public Optional<User> getUserById(int id) {
		return user_find.get_element_by_id(id);
	}
	

}
