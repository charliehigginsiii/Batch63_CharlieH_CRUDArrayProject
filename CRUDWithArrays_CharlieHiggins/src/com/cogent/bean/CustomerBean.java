package com.cogent.bean;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 26, 2022
 */
public class CustomerBean {
	private String customerName;
	private long customerId;
	public CustomerBean(String customerName, long customerId) {
		this.customerName=customerName;
		this.customerId=customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
}
