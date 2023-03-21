package com.raycodes;

import org.springframework.stereotype.Component;

@Component
public class AccountDetails {

	private String accountId;
	private String customerName;
	private String address;
	

	public AccountDetails() {
		System.out.println("Invoke default constructor of AccountDetails");
	}
	
	
	public AccountDetails(String accountId, String customerName, String address) {
		super();
		this.accountId = accountId;
		this.customerName = customerName;
		this.address = address;
	}


	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountId=" + accountId + ", customerName=" + customerName + ", address=" + address
				+ "]";
	}
	
	
}
