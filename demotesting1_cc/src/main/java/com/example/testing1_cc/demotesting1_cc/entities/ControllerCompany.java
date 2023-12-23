package com.example.testing1_cc.demotesting1_cc.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerCompany {
	
	@Autowired
	ServiceCompany service_company;
	

	
	
	@GetMapping("/get_all_companies")
	public String get_all_companies(Model model) {
		List<Company> my_companies = service_company.getCompanies();
		model.addAttribute("my_companies",my_companies);
		
		return "companies";
		
	}
	
	
	@GetMapping("/add_new_company")
	public String save_new_company(String nom, String location, Company company, Model model) {
		company.setNom("comapny test 2 ");
		company.setLocation("location test 2 ");
		Company savedCompany = service_company.setCompany(company);
		model.addAttribute("savedCompany",savedCompany);
		return "savedCompany";
			
	}
	
	
	@GetMapping("/create_company")
	public String create_company() {
		return "form_creation_company";
	}
	
	
	
	@PostMapping("/create_company")
	public String save_new_companyInBd(@RequestParam String nom, @RequestParam String location,Company company, Model model) {
		
		company.setNom(nom);
		company.setLocation(location);
		Company savedCompany = service_company.setCompany(company);
		model.addAttribute("savedCompany",savedCompany);
		return "savedCompany";
		
	}

}
