package com.go.testboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.go.testboot.Identifiable;

@Entity
public class Users implements Identifiable<Long> {
	@Id
	@GenericGenerator(name = "test_sequence", strategy = "com.go.testboot.CustomUserIDGenerator")
    @GeneratedValue(generator = "test_sequence", 
            strategy = GenerationType.IDENTITY)
	private String userID;
	private String name;
	private String address;
	

	private String password;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

}
