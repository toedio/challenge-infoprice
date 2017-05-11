package com.br.testjava.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.br.testjava.dto.UserDto;


@Entity
@Table(name="user")
public class User {
	
	private Long userId;
	private String name;
	private String email;
	private List<Address> address;
	
	public User() {
		
	}
	
	public User(UserDto user) {
		this.userId = user.getUserId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.address = user.getAddress();
	}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getUserId() {
		return userId;
	}
	
	@Column(name="user_name")
	public String getName() {
		return name;
	}
	
	@Column(name="user_email")
	public String getEmail() {
		return email;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	@Fetch(FetchMode.JOIN)
	public List<Address> getAddress() {
		return address;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAddress(List<Address> address) {
		this.address = address;
	}

}
