package com.npcibankingproject.npcibankingproject.services;

import java.util.List;

import com.npcibankingproject.npcibankingproject.entity.Transaction;

public interface TransactionService {

	public List<Transaction> getTransactionById(Long c_id);
	public List<Transaction> getAllTransaction();
	public void addTransaction(Transaction transaction) throws Exception;
	
}
