package com.example.testing1_cc.demotesting1_cc.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCar {
	
	
	@Autowired
	CarRepository car_repository;
	
	
	public List<Car> getCars(){
		return (List<Car>) car_repository.findAll();
	}
	
	
	public Optional<Car> getCarById(int id) {
		return car_repository.findById(id);
	}
	
	public Car createCar(Car car) {
		return car_repository.save(car);
	}
	
	
	public boolean update_car(Integer id, String marque, String owner) {
		if(car_repository.existsById(id)) {
			Car existing_car = car_repository.findById(id).orElse(null);
			if(existing_car != null) {
				existing_car.setMarque(marque);
				existing_car.setOwner(owner);
				car_repository.save(existing_car);
				return true;
				
			}
		}
		
		return false;
	}

	
	public boolean deleteById(Integer id) {
			Car existing_car = car_repository.findById(id).orElse(null);
			if(existing_car != null) {
				car_repository.deleteById(id);
				return true;
		
	}
return false;

}
}