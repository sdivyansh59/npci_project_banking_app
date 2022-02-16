package com.npcibankingproject.npcibankingproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.npcibankingproject.npcibankingproject.entity.Customer;
import com.npcibankingproject.npcibankingproject.services.CustomerServiceImpl;

@RestController
public class MyController {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl ;
	
	@GetMapping("/")
	public String home() {
		return "This is home page!";
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return customerServiceImpl.getAllCustomer();
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer getCustomer(@PathVariable String customerId) {
		return customerServiceImpl.getCustomer( Long.parseLong(customerId));
	}
	
	@PostMapping("/customer")
	public void addCustomer(@RequestBody Customer customer) {
		customerServiceImpl.addCustomer(customer);
		return;
	}
	
	@PatchMapping("/customer/{customerId}")
	public void updateCustomerById(@PathVariable String  customerId , @RequestBody Customer customer) {
		customerServiceImpl.updateCustomerById(Long.parseLong(customerId), customer);	
		return ;
	}
	
	@DeleteMapping("/customer/{customerId}")
	public void deleteCustomer(@PathVariable String customerId ) {
		customerServiceImpl.deleteCustomer(Long.parseLong(customerId));
		return ;
	}
	
}
