package com.oops.inheritance;

class Account{
	double balance;
	//constructor
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println("Balance is  :"+ balance);
	}
		
}

