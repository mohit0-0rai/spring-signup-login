package com.mohit.app.model;

public class Employee {
	private int id;
	private String username;
	private String email;
	private String phone;
	private String password;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + username + ", email=" + email + ", phoneNo=" + phone + ", password="
				+ password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
