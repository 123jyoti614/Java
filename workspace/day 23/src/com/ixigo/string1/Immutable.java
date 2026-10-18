package com.ixigo.string1;

public class Immutable {

	public static void main(String[] args) {


		String s="Kodewala";  //scp
		
		s.concat(" Academy");  // trying to change the object this will create new object
		//object created in heap with content kodewala academy
		//immutable for security and scp for memory mgmt 
		
		System.out.println(s); 
		

	}

}
