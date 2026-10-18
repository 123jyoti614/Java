package com.paytm.arrays1;

public class SbiAccountUser {

	// requirments : you have sbi bank customers and foolowing attributes
	// of coustomer
	/**
	 * customer name , amount balance,mobile number you need to find the customers
	 * whose balance is less than 2000 print the name and balance of customer
	 */

	String name;
	int balance;
	String mobileNumber;

	public SbiAccountUser(String _name, int _balance, String _mobileNumber) {

		this.name = _name;
		this.balance = _balance;
		this.mobileNumber = _mobileNumber;

	}

}
