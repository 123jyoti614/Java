package com.phonepe.strings1;

public class Driver {

	public static void main(String[] args) {


		//string literal automatically stored in the scp
		String s1="Kodewala Academy";
		
		//create a new string object on the heap
		String s2= new String("Kodewala Academy");
		
		System.out.println(s1==s2);  //False because s2 points to new object on heap
		//but s1 points to scp
		
		//Interning s2: this checks the scp and returns the refrence to the string in scp
		String s3= s2.intern();
		
		System.out.println(s1==s3);  // now s3 refers the same reference in the scp as s1

	}

}
