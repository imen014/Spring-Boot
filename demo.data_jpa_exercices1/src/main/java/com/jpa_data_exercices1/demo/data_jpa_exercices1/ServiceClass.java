package com.jpa_data_exercices1.demo.data_jpa_exercices1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceClass {
	
	@Autowired
	UserRepository user_repository;
	
	public 	Iterable<User> get_elements() {
		
		return user_repository.findAll();
		
	}
	
	public Optional<User> get_element_by_id(int id) {
		return user_repository.findById(id);
	}
	

}
