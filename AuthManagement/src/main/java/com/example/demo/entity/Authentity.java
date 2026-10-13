package com.example.demo.entity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usersauth")
public class Authentity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String email;
private String password;
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
public Authentity(Long id, String email, String password) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
}
public Authentity() {
	super();
	// TODO Auto-generated constructor stub
}
	

	


}
