package com.npcibankingproject.npcibankingproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npcibankingproject.npcibankingproject.entity.Customer;
import com.npcibankingproject.npcibankingproject.entity.Transaction;
import com.npcibankingproject.npcibankingproject.services.CustomerServiceImpl;
import com.npcibankingproject.npcibankingproject.services.TransactionServiceImpl;

@RestController
@RequestMapping("/api/customer")
public class MyController {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl ;
	
	
	
/*******   Customer Controller  ************/

	@GetMapping
	public List<Customer> getAllCustomer(){
		try {
			return customerServiceImpl.getAllCustomer();
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
	
	@GetMapping("/{customerId}")
	public Customer getCustomer(@PathVariable String customerId) {
		try {
			return customerServiceImpl.getCustomer( Long.parseLong(customerId));

		}catch(Exception e) {
			System.out.println(e);
			Customer c = null;
			return c;
		}
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> addCustomer(@RequestBody Customer customer) {
		try {
			customerServiceImpl.addCustomer(customer);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
	
	
	@PutMapping
	public ResponseEntity<HttpStatus> updateCustomerById( @RequestBody Customer customer) {
		try {
			customerServiceImpl.updateCustomerById( customer);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@DeleteMapping("{customerId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String customerId ) {
		try {
			customerServiceImpl.deleteCustomer(Long.parseLong(customerId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	
	
}
