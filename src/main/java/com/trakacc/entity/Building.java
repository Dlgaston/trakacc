package com.trakacc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "building")
public class Building {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "name")
	String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	Address address;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "building_id")
	List<FacilityPost> posts;

	public Building() {

	}

	public Building(Long id, String name, Address address, List<FacilityPost> posts) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.posts = posts;
	}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
