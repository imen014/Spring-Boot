package com.example.pack.demo.project1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppInfo {
	
	@Value("${spring.application.name}")
	private String appName;
	
	@GetMapping("/app_name")
	private String showInfo() {
		return "this app" + appName + "is created today !";
	}

}
