package com.sba3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sba3.model.Customer;
import com.sba3.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService custserv;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return new ResponseEntity<>(custserv.getAllCustomers(),HttpStatus.OK);
	}
	
	@PostMapping
	public void addCustomer(@RequestBody Customer customer) {
		custserv.addCustomer(customer);
	}
	
	

}