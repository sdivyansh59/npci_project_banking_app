package com.npcibankingproject.npcibankingproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npcibankingproject.npcibankingproject.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long>{
	
}
