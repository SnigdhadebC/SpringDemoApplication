package com.application.dao;

import java.util.List;

import com.application.model.Customer;

public interface CustomerDao {

	/**
	 * 
	 * @return
	 */
	List<Customer> findAll();

	/**
	 * 
	 * @param customer
	 */
	void addCustomer(Customer customer);

}