package com.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.testes.test.demo.testes.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
