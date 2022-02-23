package com.npcibankingproject.npcibankingproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npcibankingproject.npcibankingproject.dao.TransactionDao;
import com.npcibankingproject.npcibankingproject.entity.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
	private TransactionDao transactionDao ;

	@Override
	public List<Transaction> getTransactionById(Long c_id) {
		// TODO Auto-generated method stub
		return transactionDao.findByFromCId(c_id);
	}

	@Override
	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return transactionDao.findAll();
	}

	@Override
	public void addTransaction(Transaction transaction) {
        System.out.println(transaction);
		transactionDao.save(transaction);

	}

	

    
    
}
