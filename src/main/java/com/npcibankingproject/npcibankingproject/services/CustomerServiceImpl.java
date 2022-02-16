package com.npcibankingproject.npcibankingproject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.npcibankingproject.npcibankingproject.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	List<Customer> customerList ;

	// constructor to initialize 2 dummy data
	public CustomerServiceImpl() {
		super();
		customerList = new ArrayList <Customer>();
		// add some dummy customer in list
		customerList.add(new Customer(1L , "111npci.co" , "Divyansh" , "sdivyansh59@gmail.com", "999955555444", 22.08 ,'M', "gkp UP India" ));
		customerList.add(new Customer(2L , "222npci.co" , "Vedansh" , "svedansh559@gmail.com", "999955555333", 20.08 ,'M', "gkp UP India" ));
	
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerList;
	}

	

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerList.add(customer);
		return ;
	}

	@Override
	public void deleteCustomer( Long customerId) {
		// TODO Auto-generated method stub
		for( Customer customer : customerList) {
			if(customer.getC_id() == customerId) {
				customerList.remove(customer);
				break;
			}
		}
		return ;
	}

	
	@Override
	public void updateCustomerById(Long customerId, Customer customer) {
		// TODO Auto-generated method stub
		for(Customer tempCustomer : customerList) {
			if(tempCustomer.getC_id() == customerId) {
				customerList.remove(tempCustomer);
				customerList.add(customer);
				break;
			}
		}
		return ;
	}

	@Override
	public Customer getCustomer(Long customerId) {
		// TODO Auto-generated method stub
		Customer c = null;
		for(Customer customer : customerList) {
			if(customer.getC_id() == customerId) {
				c = customer;
				break;
			}
		}
		return c;
	}
	
	
	
}
