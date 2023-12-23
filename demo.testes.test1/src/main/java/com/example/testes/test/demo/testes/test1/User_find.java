package com.example.testes.test.demo.testes.test1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testes.test.demo.testes.entities.User;
import com.interfaces.UserRepository;

@Service
public class User_find {
	
	@Autowired
	UserRepository user_repository;
	
	public List<User> getUsers() {
		return   (List<User>) user_repository.findAll();
		
	}
	
	public Optional<User> get_element_by_id(int id) {
		return user_repository.findById(id);
	}

}
