package com.example.test2.demo.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.config.classInt")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
