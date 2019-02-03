package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public class CustomerService {

	public Customer getCustomer(int customerId) {
		return new Customer("Sunil", "Sharma", "Sunil@thesunilsharma.com", "MyAddress");
	}
	
	public Customer CreateCustoemr (Customer customer) {
		//@TODO : Save to Database.
		return customer;
	}
}
