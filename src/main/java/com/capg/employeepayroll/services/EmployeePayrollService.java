package com.capg.employeepayroll.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.employeepayroll.dto.EmployeePayrollDTO;
import com.capg.employeepayroll.dto.EmployeePayrollData;
import com.capg.employeepayroll.exceptions.EmployeePayrollException;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
	
	private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
	
	public List<EmployeePayrollData> getEmployeePayrollData(){
		return employeePayrollList;
	}
	
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return employeePayrollList.stream().filter(empData->empData.getEmployeeId() == empId).findFirst().orElseThrow(()->new EmployeePayrollException("Employee Not Found"));
	}
	
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(employeePayrollList.size()+1, empPayrollDTO);
		employeePayrollList.add(empData);
		return empData;
	}
	
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = this.getEmployeePayrollDataById(empId);
		empData.setName(empPayrollDTO.name);
		empData.setSalary(empPayrollDTO.salary);
		employeePayrollList.set(empId-1, empData);
		return empData;
	}
	
	public void deleteEmployeePayrollData(int empId) {
		employeePayrollList.remove(empId-1);
	}
	
}
