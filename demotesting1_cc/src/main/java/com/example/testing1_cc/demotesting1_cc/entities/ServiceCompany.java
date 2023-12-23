package com.example.testing1_cc.demotesting1_cc.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCompany {
	
	
	@Autowired
	CompanyRepository company_repository;
	
	
	public List<Company> getCompanies(){
		return (List<Company>) company_repository.findAll();
	}
	
	public Company setCompany(Company company) {
		return company_repository.save(company);
		
	}

}
