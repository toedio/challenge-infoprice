package com.br.testjava.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "user_address")
public class Address {
	
	private Long addressId;
	private Long userId;
	private String route;
	private String streetNumber;
	private String additionalInfo;
	private String neighborhood;
	private City city;
	private String postalCode;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	@Column(name="address_route")
	public String getRoute() {
		return route;
	}
	@Column(name="address_street_number")
	public String getStreetNumber() {
		return streetNumber;
	}
	@Column(name="address_additional_info")
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	@Column(name="address_neighborhood")
	public String getNeighborhood() {
		return neighborhood;
	}
	
	@ManyToOne()
	@JoinColumn(name="city_id", nullable=false)
	@Fetch(FetchMode.JOIN)
	public City getCity() {
		return city;
	}
	@Column(name="address_postal_code")
	public String getPostalCode() {
		return postalCode;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Column(name="user_id")
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
