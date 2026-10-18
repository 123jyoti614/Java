package com.kodewala.string4;

public class Driver2 {

	public static void main(String[] args) {


		//toCharArray() -convert string to character array
		String str="Kodewala";
		char[] chars=str.toCharArray();
		
		for(char c: chars) {
			System.out.print(c+ " ");
		}
		
		//string concatenation using + and concat() method
		
		String s1="Kodewala";
		String s2="Academy";
		//String result=s1+s2;
		//System.out.println(result);
		
		String result=s1.concat(s2);
		System.out.println(result);
		
		

	}

}
