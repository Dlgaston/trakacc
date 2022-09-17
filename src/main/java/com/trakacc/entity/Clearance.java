package com.trakacc.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Clearance {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "has_clearance")
	private Boolean hasClearance;
	@Column(name = "issue_date")
	private LocalDate issueDate;
	@Column(name = "expiration_date")
	private LocalDate expirationDate;

	public Clearance() {

	}

	public Clearance(Long id, String name, Boolean hasClearance, LocalDate issueDate, LocalDate expirationDate) {
		super();
		this.id = id;
		this.name = name;
		this.hasClearance = hasClearance;
		this.issueDate = issueDate;
		this.expirationDate = expirationDate;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getHasClearance() {
		return hasClearance;
	}

	public void setHasClearance(Boolean hasClearance) {
		this.hasClearance = hasClearance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

}
