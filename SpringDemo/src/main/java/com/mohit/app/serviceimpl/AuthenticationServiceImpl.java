package com.mohit.app.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.app.dao.EmployeeDao;
import com.mohit.app.model.Employee;
import com.mohit.app.model.Login;
import com.mohit.app.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public String register(Employee employee) {
		try {
			int status = employeeDao.register(employee);
			if(status > 0)
				return "login";
			else
				throw new Exception("Unable to register");
		}
		catch(Exception e) {
			return "signup";
		}
	}

	@Override
	public Map<String, Integer> emailIsUnique(String email) {
		Map<String, Integer> response = new HashMap<String, Integer>();
		try {
			boolean status = employeeDao.findEmail(email);
			if(!status)
				response.put("code", 200);
			else
				response.put("code", 201);
		} catch(Exception e) {
			e.printStackTrace();
			response.put("code", 202);
		}
		return response;
	}

	@Override
	public Boolean validateUser(Login login) {
		return employeeDao.validateUser(login);
	}

}
