package com.br.testjava.dto;

import java.util.List;

import com.br.testjava.domain.Address;
import com.br.testjava.domain.User;

public class UserDto {

	private Long userId;
	private String name;
	private String email;
	private List<Address> address;
	
	public UserDto() {
		
	}
	
	public UserDto(User user) {
		this.userId = user.getUserId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.address = user.getAddress();		
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Address> getAddress() {
		return address;
	}
	
	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
