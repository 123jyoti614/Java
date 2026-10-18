package com.paytm.string.example;

public class StringExample {

	public static void main(String[] args) {
		
		//create a string object
		//object created in scp-string content pool
		//object with same content will refer existing content
		String firstName="Jyoti";
		String lastName="Jyoti";
		//String firstName=new String("Jyoti");
		
		//will compare the address of an object
		System.out.println(firstName==lastName);

	}

}
