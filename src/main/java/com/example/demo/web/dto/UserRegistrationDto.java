package com.example.demo.web.dto;

public class UserRegistrationDto {
	private String address;
	private String dob;
	private String email;
	private String fullname;
	private String password;
	private String phone;
	private int role;
	private String username;
	
//	UserRegistrationDto(){
//		
//	}
	public UserRegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegistrationDto(String address, String dob, String email, String fullname, String password, String phone,
			int role, String username) {
		super();
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.fullname = fullname;
		this.password = password;
		this.phone = phone;
		this.role = role;
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
