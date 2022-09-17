package com.trakacc.entity;

import java.util.List;

public class Building {
	Integer id;
	String name;
	Address address;
	List<FacilityPost> posts;

	public Building() {

	}

	public Building(Integer id, String name, Address address, List<FacilityPost> posts) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.posts = posts;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<FacilityPost> getPosts() {
		return posts;
	}

	public void setPosts(List<FacilityPost> posts) {
		this.posts = posts;
	}

}
