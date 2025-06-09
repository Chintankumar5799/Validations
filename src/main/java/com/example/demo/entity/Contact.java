package com.example.demo.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Contact {
	@NotBlank(message="Name is not blank")
	@Size(min=3,message="name must be 3 character long")
	private String name;
	
	@Pattern(regexp="($|[0-9]{10})",message="It contains 10 digit only")
	@NotBlank(message="Mobile number is not blank")
	private String mobileNum;
	
	@Email(message="Please provide correct email address")
	private String email;
	private String subject;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
