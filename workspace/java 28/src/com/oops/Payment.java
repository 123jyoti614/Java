package com.oops;

//this class is not well encapsulated
public class Payment {

	//Other classes can change the vaiable w/o your(payment)class permission
	
	//public int balance; 
	private int balance; // data or vAariable

	public Payment(int balance) {
		super();
		this.balance = balance;
	}

	public void doDebit(int _amount) {
		// modifing the data
		balance = balance - _amount;

	}

	public void doCredit(int _amount) {
		// modifing the data
		if (_amount > 0) {
			balance = balance + _amount;
		}
	}

	public int getBalance() {
		return balance;
	}

}
