package com.crud.service.impl;

import java.util.List;

import com.crud.dao.EmployeeDao;
import com.crud.model.Employee;
import com.crud.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employeeDao.deleteEmployeeById(employeeId);
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	@Override
	public void updateEmployeeMailById(String email, int employeeId) {
		employeeDao.updateEmployeeMailById(email, employeeId);
	}
}
