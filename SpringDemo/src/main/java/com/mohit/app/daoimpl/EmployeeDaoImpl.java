package com.mohit.app.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mohit.app.dao.EmployeeDao;
import com.mohit.app.model.Employee;
import com.mohit.app.model.Login;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int register(Employee employee) {
		try {
			String sql = "insert into employee (username, phone, email, password, is_active, creation_date) values (?, ?, ?, ?, ?, now());";
			return jdbcTemplate.update(sql, employee.getUsername(), employee.getPhone(), employee.getEmail(), employee.getPassword(), true);
		}
		catch(Exception e) {
			return 0;
		}
	}

	@Override
	public Boolean findEmail(String email) {
		try {
			String sql = "select count(*) from employee where email=?";
			int count = jdbcTemplate.queryForObject(sql, Integer.class, email);
			if(count > 0)
				return true;
			else
				return false;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean validateUser(Login login) {
		String sql = "select count(*) from employee where email=? and password=?";
		try {
			if(jdbcTemplate.queryForObject(sql, Integer.class, login.getEmail(), login.getPassword()) > 0)
				return true;
			return false;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
