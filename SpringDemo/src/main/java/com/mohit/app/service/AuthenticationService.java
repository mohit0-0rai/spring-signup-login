package com.mohit.app.service;

import java.util.Map;

import com.mohit.app.model.Employee;
import com.mohit.app.model.Login;

public interface AuthenticationService {
	
	public String register(Employee employee);
	
	public Map<String, Integer> emailIsUnique(String email);
	
	public Boolean validateUser(Login login);
}
