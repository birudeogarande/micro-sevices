package com.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String zipCode;
	private String diNumber;
	public Customer(Integer id, String firstName, String lastName, String zipCode, String diNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
		this.diNumber = diNumber;
	}
	public Customer() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getDiNumber() {
		return diNumber;
	}
	public void setDiNumber(String diNumber) {
		this.diNumber = diNumber;
	}
	
}
