package com.stackMyBiz.registeration.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="registeration")
public class RegisterDao {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
	 
	 @Column(nullable=false)
     private String userName;
	 
	 @Column(nullable=false)
	 @JsonIgnore
	 private String password;
	 
	 @Column(nullable=false)
     private String name;
	
	 @Column(nullable=false)
	 private String mobile;
	 
	 @Column(nullable=false)
	 private Date dob;
	 
	 @Column(nullable=false)
	 private String mailId;
	 
	 @Column(nullable=true)
	 private String address;
	 
	 

	 
	public RegisterDao() {
		super();
	}

	
	public RegisterDao(Long id, String userName, String password, String name, String mobile, Date dob, String mailId,
			String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.dob = dob;
		this.mailId = mailId;
		this.address = address;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

	public String getMailId() {
		return mailId;
	}


	public void setMailId(String mailId) {
		this.mailId = mailId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "RegisterDao [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", mobile=" + mobile + ", dob=" + dob + ", mailId=" + mailId + ", address=" + address + "]";
	}




}
