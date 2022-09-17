package com.trakacc.entity;

import java.time.LocalDateTime;
import java.util.List;

public class FacilityPost {
	Integer id;
	String name;
	String postCode;
	LocalDateTime postDateTime;
	User officer;
	Boolean nwdtp;
	Integer nwdtpHours;
	String commission;
	String clearance;

	public FacilityPost() {

	}

	 
	public FacilityPost(Integer id, String name, String postCode, LocalDateTime postDateTime, User officer, Boolean nwdtp,
			int nwdtpHours, String commission, String clearance) {
		super();
		this.id = id;
		this.name = name;
		this.postCode = postCode;
		this.postDateTime = postDateTime;
		this.officer = officer;
		this.nwdtp = nwdtp;
		this.nwdtpHours = nwdtpHours;
		this.commission = commission;
		this.clearance = clearance;
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

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public LocalDateTime getPostDateTime() {
		return postDateTime;
	}

	public void setPostDateTime(LocalDateTime postDateTime) {
		this.postDateTime = postDateTime;
	}


	public User getOfficer() {
		return officer;
	}


	public void setOfficer(User officer) {
		this.officer = officer;
	}


	public Boolean getNwdtp() {
		return nwdtp;
	}

	public void setNwdtp(Boolean nwdtp) {
		this.nwdtp = nwdtp;
	}

	public int getNwdtpHours() {
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
