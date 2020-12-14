package com.capg.employeepayroll.dto;

public class EmployeePayrollDTO {
	public String name;
	public long salary;
	
	public EmployeePayrollDTO(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" Salary: "+salary;
	}
}
