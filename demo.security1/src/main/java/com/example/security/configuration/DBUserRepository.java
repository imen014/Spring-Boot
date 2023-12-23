package com.example.security.configuration;


import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
	
	public DBUser findByUsername(String username);

}
