package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
