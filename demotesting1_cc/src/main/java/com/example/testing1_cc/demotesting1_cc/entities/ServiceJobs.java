package com.example.testing1_cc.demotesting1_cc.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceJobs {
	
	@Autowired
	JobsRepository jobs_repository;
	
	public List<Jobs> find_all_jobs() {
		
		return (List<Jobs>) jobs_repository.findAll();
		
	}
	
	public Optional<Jobs> findJob(int id) {
		return jobs_repository.findById(id);
	}

}
