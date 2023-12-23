package com.example.testing1_cc.demotesting1_cc.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends CrudRepository<Jobs,Integer> {

}
