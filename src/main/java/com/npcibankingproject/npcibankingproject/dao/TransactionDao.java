package com.npcibankingproject.npcibankingproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npcibankingproject.npcibankingproject.entity.Transaction;


@Repository
public interface TransactionDao extends JpaRepository<Transaction, Long>{
	List<Transaction> findByFromCId(Long c_id);
	List<Transaction> findByToCId(Long c_id);
}
