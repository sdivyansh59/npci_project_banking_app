package com.npcibankingproject.npcibankingproject.services;

import java.util.List;

import com.npcibankingproject.npcibankingproject.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomer();
	public Customer getCustomer(Long customerId);
	public void addCustomer(Customer customer);
	public void deleteCustomer(Long customerId) ;
	public void updateCustomerById( Long customerId, Customer customer);
	
}
