package com.trakacc.entity;

public class Address {
	String street_name;
	String city;
	String state;
	int zipCode;
	
	public Address() {
		
	}
	
	public Address(String street_name, String city, String state, int zipCode) {
		super();
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
