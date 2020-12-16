package com.capg.employeepayroll.services;

import java.util.ArrayList;
import java.util.List;

import com.capg.employeepayroll.dto.EmployeePayrollDTO;
import com.capg.employeepayroll.dto.EmployeePayrollData;

public class EmployeePayrollService implements IEmployeePayrollService{
	
	public List<EmployeePayrollData> getEmployeePayrollData(){
		List<EmployeePayrollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("XYZC", 30000)));
		return empDataList;
	}
	
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, new EmployeePayrollDTO("XYZC", 30000));
		return empData;
	}
	
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, empPayrollDTO);
		return empData;
	}
	
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, empPayrollDTO);
		return empData;
	}
	
	public void deleteEmployeePayrollData(int empId) {
		
	}
	
}
