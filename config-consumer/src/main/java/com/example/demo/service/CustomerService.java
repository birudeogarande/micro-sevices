package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.commons.model.Customer;

public interface CustomerService {
	public Customer save(Customer customer);
	public Optional<Customer> get(Integer id);
	public Optional<List<Customer>> getAll();
}
