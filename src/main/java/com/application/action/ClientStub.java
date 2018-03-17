/**
 * 
 */
package com.application.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.delegator.CustomerDelegator;
import com.application.model.Customer;

/**
 * @author Deb
 *
 */
public class ClientStub {

	static ApplicationContext applicationContext = null;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDelegator delegator = applicationContext.getBean("customerDelegator", CustomerDelegator.class);
		Customer customer = applicationContext.getBean("customer", Customer.class);
		delegator.addCustomer(customer);
		
		Customer customer1 = applicationContext.getBean("customer1", Customer.class);
		customer1.setCustomerId(Double.toString(Math.random()));
		customer1.setFirstName("Snigdhadeb");
		customer1.setLastName("Chatterjee");
		customer1.setLocation("Kolkata");
		delegator.addCustomer(customer1);

		List<Customer> customers = delegator.findAll();
		customers.forEach(u -> System.out.println(u));
	}

}
