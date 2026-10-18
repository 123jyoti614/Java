package com.google.Constructors1;

public class Account {

	int amount;
	String name;

	// if driver is not providing any constructor in a class
	// then compiler create constructor with no arguments

	Account() {
		System.out.println("inside Account()");
	}

	Account(int _amount, String _name) {
		System.out.println("inside Account(int _amount,String _name) ");
		this.amount = _amount;
		this.name = _name;
	}
}
