/**
 * 
 */
package com.application.delegator;

import java.util.List;

import com.application.dao.CustomerDao;
import com.application.model.Customer;

/**
 * @author Deb
 *
 */
public class CustomerDelegatorImpl implements CustomerDelegator {
	CustomerDao customerDao;

	/**
	 * @param customerDao
	 *            the customerDao to set
	 */
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.application.delegator.CustomerDelegator#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.application.delegator.CustomerDelegator#addCustomer(com.application.model
	 * .Customer)
	 */
	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		System.out.println("Customer Details are added..");
	}

}
