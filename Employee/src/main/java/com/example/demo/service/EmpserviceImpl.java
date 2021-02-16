package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Empdao;
import com.example.demo.model.Employee;
@Service
public class EmpserviceImpl implements Empservice {
	
	
	@Autowired
	Empdao empdao;

	@Override
	public List<Employee> getdetails() {
		// TODO Auto-generated method stub
		return empdao.findAll();
	}

	

	@Override
	public Employee change(Employee employee) {
		// TODO Auto-generated method stub
		return empdao.save(employee);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		empdao.deleteById(id);
	}



	@Override
	public void post(Employee employee) {
		// TODO Auto-generated method stub
		 empdao.save(employee);
	}



	
}
