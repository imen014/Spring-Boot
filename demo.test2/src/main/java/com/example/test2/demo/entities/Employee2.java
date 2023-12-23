package com.example.test2.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;

@Entity
@Table(name="employee2")
@Data
@Transactional
public class Employee2 {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="firstname_emp")
	private String firstName;
	@Column(name="lastName_emp")
	private String lastName;
	@Column(name="department_emp")
	private String department;
	@Column(name="salary_emp")
	private String salary;
	@Column(name="phone_emp")
	private String phone;
	@Column(name="job_emp")
	private String job;
	
public Employee2(String firstName, String lastName, String department, String salary2, String phone, String job) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salary = salary2;
		this.phone = phone;
		this.job = job;
	}


public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}

    
    public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
	

}

