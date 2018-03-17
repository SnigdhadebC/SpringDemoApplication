package com.application.model;

public class Customer {

	private String firstName;
	private String lastName;
	private String customerId;
	private String location;

	
	/**
	 * @param firstName
	 * @param lastName
	 * @param customerId
	 * @param location
	 */
	private Customer(String firstName, String lastName, String customerId, String location) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerId;
		this.location = location;
	}
	
		
	/**
	 * 
	 */
	private Customer() {
		super();
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", customerId=" + customerId
				+ ", location=" + location + "]";
	}
	
	
}
