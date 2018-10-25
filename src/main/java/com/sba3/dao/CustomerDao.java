package com.sba3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sba3.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	

}
