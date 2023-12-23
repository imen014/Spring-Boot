package com.finance.budgetisantion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BudgetisantionController {
	
	@GetMapping("/getAcceuilPage")
	public String pages_works() {
		return "page1";
	}

}
