package com.trakacc.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "nwdpt")
public class Nwdtp {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "has_nwdtp")
	private Boolean hasNwdtp;
	@Column(name = "nwdtp_hours")
	private Integer nwdtpHours;
	@Column(name = "ojt")
	private LocalDate ojt;
	@Column(name = "x_ray_hours")
	private Integer xRayHours;
	@JsonIgnore
	@OneToOne(mappedBy ="nwdtp")
	private User user;
	
	public Nwdtp() {
		super();
	}

	public Nwdtp(Long id, Boolean hasNwdtp, Integer nwdtpHours, LocalDate ojt, Integer xRayHours, User user) {
		super();
		this.id = id;
		this.hasNwdtp = hasNwdtp;
		this.nwdtpHours = nwdtpHours;
		this.ojt = ojt;
		this.xRayHours = xRayHours;
		this.user = user;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getHasNwdtp() {
		return hasNwdtp;
	}

	public void setHasNwdtp(Boolean hasNwdtp) {
		this.hasNwdtp = hasNwdtp;
	}

	public Integer getNwdtpHours() {
		return nwdtpHours;
	}

	public void setNwdtpHours(Integer nwdtpHours) {
		this.nwdtpHours = nwdtpHours;
	}

	public LocalDate getOjt() {
		return ojt;
	}

	public void setOjt(LocalDate ojt) {
		this.ojt = ojt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getxRayHours() {
		return xRayHours;
	}

	public void setxRayHours(Integer xRayHours) {
		this.xRayHours = xRayHours;
	}

}
