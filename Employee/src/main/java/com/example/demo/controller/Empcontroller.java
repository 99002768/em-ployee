package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.Empservice;

@RestController
@RequestMapping("employee")
public class Empcontroller {

	@Autowired
	Empservice empservice;
	

	@GetMapping("/getdetails")
	public List<Employee> details() {
		return empservice.getdetails();
	}
	
	@PostMapping("/postdetails")
	public String post(@RequestBody Employee employee) {
	System.out.println("rsaa");
		empservice.post(employee);
		return "posted successfully";
	}
	
	@PutMapping("/modifydetails")
	public Employee modify(@RequestBody Employee employee) {
		return empservice.change(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")Integer id) {
		empservice.delete(id);
		return "Successfully deleted";
				
	}
	
	
}
