package com.example.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


// This bean class represents a registered user that will be persisted in the database.
@Entity
@Table(name = "security")
public class Security {
	
	// UUID did not work for userID because hibernate could not convert big decimal into UUID.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	int userID;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "password")
	String password;
	
	// Contains security roles.
	@Column(name = "roles")
	private String roles = "";

	public String getRoles() {
		return roles;
	}

	public int getUserID() {
		return userID;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	public List<String> getRoleList(){
        if(this.roles.length() > 0){
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }
	
	public Security(int userID, String email, String password) {
		super();
		this.userID = userID;
		this.email = email;
		this.password = password;
	}
	
	// Constructor for initializing the database with encrypted passwords.
	public Security(String email, String password, String roles) {
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public Security() {
		super();
		// TODO Auto-generated constructor stub
	}

}
