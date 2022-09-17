package com.trakacc.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Commission {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "has_commission")
	private Boolean hasCommission;
	@Column(name = "issue_date")
	private LocalDate issueDate;
	@Column(name = "expiration_date")
	private LocalDate expirationDate;

	public Commission() {

	}

	public Commission(Long id, String name, Boolean hasCommission, LocalDate issueDate, LocalDate expirationDate) {
		super();
		this.id = id;
		this.name = name;
		this.hasCommission = hasCommission;
		this.issueDate = issueDate;
		this.expirationDate = expirationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getHasCommission() {
		return hasCommission;
	}

	public void setHasCommission(Boolean hasCommission) {
		this.hasCommission = hasCommission;
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
