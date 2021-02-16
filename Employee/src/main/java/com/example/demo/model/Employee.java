package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employee")
public class Employee {
	
   @Id
   Integer empId;
   String empName;
   String empCity;
   String empState;
   String empMobile;
   
   
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer empId, String empName, String empCity, String empState, String empMobile) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empCity = empCity;
	this.empState = empState;
	this.empMobile = empMobile;
}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpCity() {
	return empCity;
}
public void setEmpCity(String empCity) {
	this.empCity = empCity;
}
public String getEmpState() {
	return empState;
}
public void setEmpState(String empState) {
	this.empState = empState;
}
public String getEmpMobile() {
	return empMobile;
}
public void setEmpMobile(String empMobile) {
	this.empMobile = empMobile;
}
   
	
}
