package com.practice.oops;

public class ATM {

	//private data
	private double balance;
	private String pin;
	
	
	public ATM(double balance, String pin) {
		super();
		this.balance = balance;
		this.pin = pin;
	}
	
	//public method to withdraw money
	public void withdraw(double amountToWithdraw,String enterPin) {
		System.out.println("Current balance is "+balance);
		if(enterPin.equals(pin) && amountToWithdraw<=balance) {
			balance=balance-amountToWithdraw;
			System.out.println("Balance after withdrawn "+balance);
		}else {
			System.out.println("Incorrect pin or insufficient fund");
		}
	}
	//public method to deposit money
	public void deposit(double amount,String enterPin) {
		if(enterPin.equals(pin)) {
			balance=balance+amount;
			System.out.println(amount + "deposited. New balance is "+balance);
		}else {
			System.out.println("Incorrect pin");
		}
	}
	
}
