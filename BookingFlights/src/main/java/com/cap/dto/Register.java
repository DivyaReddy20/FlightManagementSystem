package com.cap.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registertable")
public class Register {
@Id
@GeneratedValue
@Column(length=20)
private int userid;
@Column(length=20)
private String username;
@Column(length=20)
private String password;
@Column(length=20)
private String confirmpassword;
@Column(unique=true)
private String mailid;
@Column(length=20)
private String phnnumber;

public Register(int userid, String username, String password, String confirmpassword, String mailid,
		String phnnumber) {
	super();
	this.userid = userid;
	this.username = username;
	this.password = password;
	this.confirmpassword = confirmpassword;
	this.mailid = mailid;
	this.phnnumber = phnnumber;
	
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getPhnnumber() {
	return phnnumber;
}
public void setPhnnumber(String phnnumber) {
	this.phnnumber = phnnumber;
}

public Register() {
	
}
}
