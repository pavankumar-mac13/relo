package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Authentity;
import com.example.demo.repository.Authrepo;
@RestController
public class Authcontroller {
   
	
	@Autowired
   public Authrepo repo;
   

@PostMapping("/register")
public String register(@RequestBody Authentity auth) {
	try {
		if(repo.findByEmail(auth.getEmail()) != null){
			return "email already exist";
		}
		repo.save(auth);
		return "user registered successfully";
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
@PostMapping("/login")
public String login(@RequestBody Authentity auth) {
	try {
		Authentity a=repo.findByEmail(auth.getEmail());
		if(a !=null & a.getPassword().equals(auth.getPassword())) {
			return"Login successful:" + a.getEmail();
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	return null;
}
}