package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commons.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<Customer> get(@PathVariable(value = "id") Integer id) {
		
		Optional<Customer> optional= customerService.get(id);
		if(optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());
		}
		return ResponseEntity.notFound().build(); 
	}
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getAll() {
		
		Optional<List<Customer>> optional= customerService.getAll();
		if(optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());
		}
		return ResponseEntity.notFound().build(); 
	}
}
