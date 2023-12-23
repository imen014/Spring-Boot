package com.example.test2.demo.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserDataRepository extends JpaRepository<Employee2, Integer>  {
	<S extends Employee2> S save(S entity);

}


