package com.jyoti.String;

public class StringMethods {

	public static void main(String[] args) {


		String s= "Jyoti";
		int vowels =0;
		char[] chars=s.toCharArray();
		for(char c :chars) {
			if(c == 'a' || c=='e' || c=='i'||c=='o' || c=='u') {
				
				vowels++;
			}
		}
		System.out.println(vowels);

	}

}
