package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commons.model.Customer;
import com.example.demo.repos.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	@Override
	public Optional<Customer> get(Integer id) {
		return customerRepository.findById(id);
	}
	@Override
	public Optional<List<Customer>> getAll() {
		return Optional.of(customerRepository.findAll());
	}
	
}
