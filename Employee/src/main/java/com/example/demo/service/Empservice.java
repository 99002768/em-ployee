package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface Empservice {

	public List<Employee> getdetails();

	public void post(Employee employee);

	

	public Employee change(Employee employee);

	public void delete(Integer id);
	
}
