package com.trakacc.entity;

import java.time.LocalDateTime;
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
@Table(name = "user")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "f_name")
	private String fName;
	@Column(name = "l_name")
	private String lName;
	@Column(name = "seniority")
	private LocalDateTime seniority;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<Commission> commissions;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<Clearance> clearances;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nwdtp_id", referencedColumnName = "id")
	private Nwdtp nwdtp;

	public User() {

	}

	
	public User(Long id, String email, String password, String fName, String lName, LocalDateTime seniority,
			List<Commission> commissions, List<Clearance> clearances, Nwdtp nwdtp) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.seniority = seniority;
		this.commissions = commissions;
		this.clearances = clearances;
		this.nwdtp = nwdtp;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public LocalDateTime getSeniority() {
		return seniority;
	}

	public void setSeniority(LocalDateTime seniority) {
		this.seniority = seniority;
	}

	public List<Commission> getCommissions() {
		return commissions;
	}

	public void setCommissions(List<Commission> commissions) {
		this.commissions = commissions;
	}

	public List<Clearance> getClearances() {
		return clearances;
	}

	public void setClearances(List<Clearance> clearances) {
		this.clearances = clearances;
	}


	public Nwdtp getNwdtp() {
		return nwdtp;
	}


	public void setNwdtp(Nwdtp nwdtp) {
		this.nwdtp = nwdtp;
	}

}
