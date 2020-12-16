package com.capg.employeepayroll.services;

import java.util.List;

import com.capg.employeepayroll.dto.EmployeePayrollDTO;
import com.capg.employeepayroll.dto.EmployeePayrollData;

public interface IEmployeePayrollService {
	
	List<EmployeePayrollData> getEmployeePayrollData();
	
	EmployeePayrollData getEmployeePayrollDataById(int empId);
	
	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
	
	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);
	
	void deleteEmployeePayrollData(int empId);
}
