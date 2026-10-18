package com.kodewala.string2;

public class Driver {

	public static void main(String[] args) {


		String str="Kodewala";
		
		//toUpperCase() -- convert all character to uppercase
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());  // convert to lower case
		
		//trim -- removes leading and trailing whitespace 
		
		String s=" Academy   ";
		System.out.println(s.trim());
		
		//replace(old.new) -- replaces all occurence of character with another one
		System.out.println(str.replace('w', 'v'));

	}

}
