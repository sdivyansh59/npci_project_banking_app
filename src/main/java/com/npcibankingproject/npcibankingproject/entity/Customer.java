package com.npcibankingproject.npcibankingproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
 private Long  c_id;

 private String  npci_account;
 private String name;
 private String email;
 private String phone;
 private double age;
 private char gender ;
 private String address ;
 
 
 //***** constructor  *******
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(Long c_id, String npci_account, String name, String email, String phone, double age, char gender,
		String address) {
	super();
	this.c_id = c_id;
	this.npci_account = npci_account;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.age = age;
	this.gender = gender;
	this.address = address;
}


// **** constructor *****
public Long getC_id() {
	return c_id;
}

public void setC_id(Long c_id) {
	this.c_id = c_id;
}

public String getNpci_account() {
	return npci_account;
}

public void setNpci_account(String npci_account) {
	this.npci_account = npci_account;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public double getAge() {
	return age;
}

public void setAge(float age) {
	this.age = age;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
 
 
 
}
