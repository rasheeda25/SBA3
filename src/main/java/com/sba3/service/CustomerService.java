package com.sba3.service;

import java.util.List;

import com.sba3.model.Customer;


public interface CustomerService {
	
	List<Customer> getAllCustomers();
	void addCustomer(Customer customer);

}

