package com.example.testing1_cc.demotesting1_cc.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerJobs {
	
	@Autowired
	ServiceJobs service_jobs;
	
	
	@GetMapping("/actual_jobs")
	public String jobs(Model model) {
		
		List<Jobs> all_jobs = service_jobs.find_all_jobs();
		model.addAttribute("all_jobs",all_jobs);
		return "job_page";
		
	
	}

}
