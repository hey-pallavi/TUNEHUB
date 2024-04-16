package com.tunehub.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class usersentity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	String username;
	String emailid; 
	String password;
	String gender;
	String role;        
    String address;
	public usersentity() {
		super();
		
	}
	public usersentity(int id, String username, String emailid, String password, String gender, String role,
			String address) {
		super();
		this.id = id;
		this.username = username;
		this.emailid = emailid;
		this.password = password;
		this.gender = gender;
		this.role = role;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "usersentity [id=" + id + ", username=" + username + ", emailid=" + emailid + ", password=" + password
				+ ", gender=" + gender + ", role=" + role + ", address=" + address + "]";
	}
	
}
