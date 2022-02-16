package com.npcibankingproject.npcibankingproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npcibankingproject.npcibankingproject.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long>{

}
