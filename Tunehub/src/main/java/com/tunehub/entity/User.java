package com.tunehub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	private String username;
	private String email;
	private String password;
	private long phoneno;
	private String gender;
	private String role;
	private String address;
	private boolean premium;
	
	public boolean getPremium() {
		return premium;
	}
	public void setPremium(boolean  b) {
		this.premium =  b;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", phoneno=" + phoneno + ", gender=" + gender + ", role=" + role + ", Adress=" + address +"premium "+ premium+ "]";
	}
	public User(int userid, String username, String email, String password, long phoneno, String gender, String role,
			String adress,boolean premium) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
		this.gender = gender;
		this.role = role;
		this.address = adress;
		this.premium=premium;
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String adress) {
		this.address = adress;
	}
	public void setIspremium(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
