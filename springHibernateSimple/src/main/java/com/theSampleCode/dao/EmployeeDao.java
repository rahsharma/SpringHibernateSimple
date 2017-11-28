package com.theSampleCode.dao;

import java.util.List;

import com.theSampleCode.model.Employee;

public interface EmployeeDao {
	public void save(Employee e);

	public List<Employee> list();
}
