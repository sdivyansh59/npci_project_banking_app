package com.npcibankingproject.npcibankingproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false)
 private Long  cId;

@Column(nullable = false)
 private double accountBalance ;

@Column(nullable = false)
 private String  npciAccount;

@Column(nullable = false)
 private String name;

@Column(nullable = false )
 private String email;

@Column(nullable = false)
 private String phone;


 private double age;

 private char gender ;
 
 @Column(nullable = false)
 private String address ;
 

 //***** constructor  *******
 public Customer() {
	super();
	// TODO Auto-generated constructor stub
 }


public Customer(Long cId, String npciAccount, String name, String email, String phone, double age, char gender,
		String address, double accountBalance) {
	super();
	this.cId = cId;
	this.npciAccount = npciAccount;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.age = age;
	this.gender = gender;
	this.address = address;
	this.accountBalance = accountBalance;
}


public Long getcId() {
	return cId;
}

public void setcId(Long cId) {
	this.cId = cId;
}

public String getNpciAccount() {
	return npciAccount;
}

public void setNpciAccount(String npciAccount) {
	this.npciAccount = npciAccount;
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

public void setAge(double age) {
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


public double getAccountBalance() {
	return accountBalance;
}


public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}


}
