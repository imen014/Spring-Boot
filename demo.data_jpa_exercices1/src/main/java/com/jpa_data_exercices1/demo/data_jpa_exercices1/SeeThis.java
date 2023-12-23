package com.jpa_data_exercices1.demo.data_jpa_exercices1;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class SeeThis {
	
	
	@Autowired
	ServiceClass serviceClass;
	
	 @GetMapping
	    public Iterable<User> getAllUsers() {
		 Iterable<User> users =  serviceClass.get_elements();
		 System.out.println("retrived from db");
	        return users;

	    }

}
