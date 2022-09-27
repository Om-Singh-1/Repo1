package com.oops.example;

public class Employer {
	
	String name;
	int salary;
	int empId;
	
	protected int getEmpId() {
		return empId;
	}
	
	protected void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
