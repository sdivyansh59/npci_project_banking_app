package com.npcibankingproject.npcibankingproject.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private Long transId;
	
	@Column(nullable = false)
	private double transAmount;
	
	@Column(nullable = false)
	private Long fromCId;
	
	@Column(nullable = false)
	private Long toCId;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(Long transId, double transAmount, Long fromCId, Long toCId) {
		super();
		this.transId = transId;
		this.transAmount = transAmount;
		this.fromCId = fromCId;
		this.toCId = toCId;
	}

	public Long getTransId() {
		return transId;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public Long getFromCId() {
		return fromCId;
	}

	public void setFromCId(Long fromCId) {
		this.fromCId = fromCId;
	}

	public Long getToCId() {
		return toCId;
	}

	public void setToCId(Long toCId) {
		this.toCId = toCId;
	}
	
	

	
}
