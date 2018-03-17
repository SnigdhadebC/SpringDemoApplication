package com.application.delegator;

import java.util.List;

import com.application.model.Customer;

public interface CustomerDelegator {

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