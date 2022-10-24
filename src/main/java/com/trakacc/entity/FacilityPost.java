package com.trakacc.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "facility_post")
public class FacilityPost {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "name")
	String name;
	@Column(name = "post_code")
	String postCode;
	@Column(name = "post_time")
	LocalTime postTime;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	User officer;
	@Column(name = "is_nwdtp")
	Boolean isNwdtp;
	@Column(name="nwdtp_Hours")
	Integer nwdtpHours;
	@Column(name = "commission")
	String commission;
	@Column(name = "clearance")
	String clearance;

	public FacilityPost() {

	}


	public FacilityPost(Long id, String name, String postCode, LocalTime postTime, User officer, Boolean isNwdtp,
			Integer nwdtpHours, String commission, String clearance) {
		super();
		this.id = id;
		this.name = name;
		this.postCode = postCode;
		this.postTime = postTime;
		this.officer = officer;
		this.isNwdtp = isNwdtp;
		this.nwdtpHours = nwdtpHours;
		this.commission = commission;
		this.clearance = clearance;
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

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public LocalTime getPostTime() {
		return postTime;
	}


	public void setPostTime(LocalTime postTime) {
		this.postTime = postTime;
	}


	public User getOfficer() {
		return officer;
	}

	public void setOfficer(User officer) {
		this.officer = officer;
	}

	public Boolean getIsNwdtp() {
		return isNwdtp;
	}

	public void setIsNwdtp(Boolean isNwdtp) {
		this.isNwdtp = isNwdtp;
	}

	public Integer getNwdtpHours() {
		return nwdtpHours;
	}

	public void setNwdtpHours(Integer nwdtpHours) {
		this.nwdtpHours = nwdtpHours;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getClearance() {
		return clearance;
	}

	public void setClearance(String clearance) {
		this.clearance = clearance;
	}

}
