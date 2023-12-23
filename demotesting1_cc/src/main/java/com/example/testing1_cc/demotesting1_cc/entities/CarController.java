package com.example.testing1_cc.demotesting1_cc.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
	
	@Autowired
	ServiceCar service_car;
	
	
	@GetMapping("/get_cars")
	public String get_all_cars(Model model) {
		List<Car> cars = service_car.getCars();
		model.addAttribute("cars",cars);
		return "cars_list";
		
		
	}
	
	
	@GetMapping("/create_car")
	public String create_car() {
		return "create_car";
	}
	
	@PostMapping("/create_car")
	public String save_new_carIntoBd(Car car, @RequestParam String marque, @RequestParam String owner, Model model) {
		car.setMarque(marque);
		car.setOwner(owner);
		Car my_car = service_car.createCar(car);
		model.addAttribute("my_car",my_car);
		return "car_created";
		
		
	}
	
	
	@GetMapping("/get_car_by_id")
	public String getCarById(Integer id, Model model) {
		Optional<Car> car_found = service_car.getCarById(id=4);
		model.addAttribute("car_found",car_found.orElse(null));
		model.addAttribute("id",id);
		return "car_found";
		
	}
	
	
	@GetMapping("/update_car")
	public String update_car() {
		return "form_update_car";
	}
	
	@PostMapping("/update_car")
	public ResponseEntity<String> update_car_data(@RequestParam String marque,
			@RequestParam String owner,
			Model model,
			@RequestParam Integer id) {
		if(service_car.update_car(id, marque, owner)) {
			return ResponseEntity.ok("car updated succefully !");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("car not found");
		}
		
		
		
	}
	
	@GetMapping("/delete_car")
	public String delete_car() {
		return "form_delete_car";
	}
	
	@PostMapping("/delete_car")
	public String delete_car_by_id(Integer id, Model model) {
		boolean car_deleted = service_car.deleteById(id);
		model.addAttribute("id", id);
		return "car_deleted";
		
	}

}
