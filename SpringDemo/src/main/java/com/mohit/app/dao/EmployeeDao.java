package com.mohit.app.dao;

import com.mohit.app.model.Employee;
import com.mohit.app.model.Login;

public interface EmployeeDao {
	public int register(Employee employee);
	
	public Boolean findEmail(String email);
	
	public Boolean validateUser(Login login);
}
