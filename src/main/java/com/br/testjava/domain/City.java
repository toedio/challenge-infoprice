package com.br.testjava.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {

	private Long cityId;
	private String cityName;
	private String state;
	private String country;
	
	@Id
	@Column(name="city_id")
	public Long getCityId() {
		return cityId;
	}
	@Column(name="city_name")
	public String getCityName() {
		return cityName;
	}
	@Column(name="city_state")
	public String getState() {
		return state;
	}
	@Column(name="city_country")
	public String getCountry() {
		return country;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
