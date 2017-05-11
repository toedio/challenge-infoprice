package com.br.testjava.dto;

import com.br.testjava.domain.City;

public class CityDto {
	
	private Long cityId;
	private String cityName;
	private String state;
	private String country;
	
	public CityDto() {
		
	}
	
	public CityDto(City city) {
		this.cityId = city.getCityId();
		this.cityName = city.getCityName();
		this.state= city.getState();
		this.country = city.getCountry();
	}
	
	public Long getCityId() {
		return cityId;
	}
	
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

}
