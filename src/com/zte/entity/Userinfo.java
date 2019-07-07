package com.zte.entity;

import java.util.Date;

public class Userinfo {
	private Integer uid;
	private String phone;
	private String password;
	private String tname;
	private String id;
	private String gender;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String string) {
		this.password = string;
	}
	public String getName() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String string) {
		this.gender = string;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	private Date regtime;
	private Float amount;
	//int Integer byte Byte float Float lont Long char Character blooean Blooean
}
