/**
 * 
 */
package com.application.dao;

import java.util.ArrayList;
import java.util.List;

import com.application.model.Customer;

/**
 * @author Deb
 *
 */
public class CustomerDaoImpl implements CustomerDao {

	static List<Customer> customerList = new ArrayList<>();

	/* (non-Javadoc)
	 * @see com.application.dao.CustomerDao#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerList;
	}

	/* (non-Javadoc)
	 * @see com.application.dao.CustomerDao#addCustomer(com.application.model.Customer)
	 */
	@Override
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}

}
