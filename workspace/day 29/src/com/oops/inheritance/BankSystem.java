package com.oops.inheritance;

class SavingAccount extends Account{
	double interestRate;

	public SavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	public void calculateInterest() {
		double interest=balance*interestRate/100;
		System.out.println("Interest eared "+interest);
	}
}

public class BankSystem {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(100000, 5);
		sa.showBalance();
		sa.calculateInterest();

	}

}
