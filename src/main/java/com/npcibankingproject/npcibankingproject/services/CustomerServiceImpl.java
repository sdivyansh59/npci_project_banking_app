package com.npcibankingproject.npcibankingproject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npcibankingproject.npcibankingproject.dao.CustomerDao;
import com.npcibankingproject.npcibankingproject.entity.Customer;
import com.npcibankingproject.npcibankingproject.exception.CustomerDoesNotExist;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> customerList =  new ArrayList <Customer>();
		try {
			customerList = customerDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerList ;
	}

	

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			customerDao.save(customer);
		}catch (Exception e) {
			System.out.println(e);
		}
		return ;
	}

	@Override
	public void deleteCustomer( Long customerId)  {
			Customer entity = customerDao.getById(customerId);
			System.out.println(entity);
			customerDao.delete(entity);	
	}
		
		
	@Override
	public void updateCustomerById( Customer customer)  throws Exception{
		customerDao.save(customer);	
	}

	@Override
	public Customer getCustomer(Long customerId) {
		Customer c = null;
		c= customerDao.getById(customerId);
		if ( c == null) {
			throw new CustomerDoesNotExist("Customer with customer ID = "+customerId + " does not exist in DB");	
		}
		return c;
	}
	
	
	
}
