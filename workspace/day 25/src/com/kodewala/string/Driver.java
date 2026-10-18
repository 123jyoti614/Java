package com.kodewala.string;

class AccountMgmt{
	final int UPI_LIMIT=100000;  //constant
	
	public final void doSomething1() {
		//UPI_LIMIT=20000; cannot change because of final
		
	}
	public void doSomething2() {
		 //some fun ....
	}
}

class Account extends AccountMgmt{
	@Override
	public void doSomething2() {
		
	}
}

public class Driver {

	public static void main(String[] args) {

		

	}

}
