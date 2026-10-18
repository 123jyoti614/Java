package com.kodewala.string;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Kodewala";
		// 1. length()
		System.out.println(str.length());
		
		//2. charAt(int index)
		System.out.println(str.charAt(2));
		
		String s2="Kodewala";
		//3. equals(Object obj)
		System.out.println(str.equals(s2));
		
		String s3="KODEWALA";
		// 4. equalsIgnoreCase(String anotherString)
		System.out.println(s2.equalsIgnoreCase(s3));

	}

}
