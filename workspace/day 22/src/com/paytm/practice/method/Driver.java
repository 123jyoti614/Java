package com.paytm.practice.method;

public class Driver {

	public static void main(String[] args) {


		//create object of the CreatingMethods class

		CreatingMethods calc= new CreatingMethods();
		
		//call the non static method using the object
		int result=calc.addNumbers(15,25);
		
		//print the result
		System.out.println("The sum is "+result);

	}

}
