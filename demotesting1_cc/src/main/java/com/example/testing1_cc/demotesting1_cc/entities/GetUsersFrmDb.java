package com.example.testing1_cc.demotesting1_cc.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUsersFrmDb {
	
	
	@Autowired
	UserRepository user_repository;
	
	
	public List<User> getUsers() {
		
		return (List<User>) user_repository.findAll();
		
	}
	
	public Optional<User> getUser(int id) {
		return user_repository.findById(id);
	}

}
