package com.npcibankingproject.npcibankingproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npcibankingproject.npcibankingproject.entity.Transaction;
import com.npcibankingproject.npcibankingproject.services.TransactionServiceImpl;


@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionServiceImpl transactionServiceImpl ;
	
/*********  Transaction Controller ******/	
	@GetMapping
	public List<Transaction> getAlltransaction(){
		try {
			return transactionServiceImpl.getAllTransaction();
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}	
	}
	
	@GetMapping("/{customerId}")
	public List<Transaction> getTransactionByTransactionOriginCustomerId(@PathVariable String customerId) {
		try {
			return transactionServiceImpl.getTransactionById(Long.parseLong(customerId));
		}catch(Exception e){
			System.out.println(e);
			return null;
		}
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> addTransaction(@RequestBody Transaction transaction){
		try {
			transactionServiceImpl.addTransaction(transaction);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	
}
