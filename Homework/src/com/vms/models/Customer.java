package com.vms.models;

public class Customer {
	private String customerId;
	private String name;
	private ContactInfo contactInfo;
	
	public Customer(String customerId, String name, ContactInfo contactInfo) {
		this.customerId = customerId;
		this.name = name;
		this.contactInfo = contactInfo;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	@Override
	public String toString() {
		return String.format("Customer name: %s\n %s", this.name, this.contactInfo);
	}
	
}
