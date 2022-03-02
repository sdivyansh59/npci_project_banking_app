package com.npcibankingproject.npcibankingproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npcibankingproject.npcibankingproject.dao.CustomerDao;
import com.npcibankingproject.npcibankingproject.dao.TransactionDao;
import com.npcibankingproject.npcibankingproject.entity.Customer;
import com.npcibankingproject.npcibankingproject.entity.Transaction;
import com.npcibankingproject.npcibankingproject.exception.CustomerDoesNotExist;
import com.npcibankingproject.npcibankingproject.exception.InSufficientBalance;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
	private TransactionDao transactionDao ;

    @Autowired
	private CustomerDao customerDao;
    
	@Override
	public List<Transaction> getTransactionById(Long c_id) {
		// TODO Auto-generated method stub
		if(customerDao.getById(c_id)== null) {
			throw new CustomerDoesNotExist("customer not found");
		}
		return transactionDao.findByFromCId(c_id);
	}

	@Override
	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return transactionDao.findAll();
	}

	@Override
	public void addTransaction(Transaction transaction) {
//        System.out.println(transaction);
        Long c_id = transaction.getFromCId();
        
        Customer entity = customerDao.getById(c_id);
        if(entity == null) {
        	throw new CustomerDoesNotExist("customer not found");
        }
        
        double customer_Balance = entity.getAccountBalance();
        double trans_amount =  transaction.getTransAmount();
        
        if(customer_Balance >=trans_amount ) {
        	
        	// deduct sender  customer balance
        	entity.setAccountBalance(customer_Balance-trans_amount);
        	customerDao.save(entity);
        	transactionDao.save(transaction);
        	
        	// add target customer  balance 
        	 Long c_id2 = transaction.getToCId();
             Customer entity2 = customerDao.getById(c_id2);
             if(entity2 == null) {
             	throw new CustomerDoesNotExist("customer not found");
             }
             
             entity2.setAccountBalance(entity2.getAccountBalance()+trans_amount);
         	 customerDao.save(entity2);
        	
        }else {
        	throw new InSufficientBalance ("Insufficient Balance, Can't perform Transaction. ");
        }
        
	}

	

    
    
}
