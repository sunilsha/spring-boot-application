package com.example.demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CustomerService;
import com.example.demo.model.Customer;

@RestController
public class DefaultController {

	// Dependency Injection
	@Autowired
	private CustomerService customerService;
	

	// Should be accessible at http://localhost:8080
	@RequestMapping("/")
	public String defaultPage() {
		return "Default Application Page";
	}
	
	@RequestMapping("/home")
	public String home() {
		Random rand = new Random();		
		return "Welcome to home page "+rand.nextInt(10000);
	}
	
	@RequestMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.CreateCustoemr(customer);
	}
}
