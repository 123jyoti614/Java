package com.google.loop1;

import java.util.Scanner;

public class ValidatingUserInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your age...");

	//validating user input
		while(!sc.hasNextInt()) {
			System.out.println("Invalid user input ! please enetr a valid integer...");
			sc.next();   // clear the invalid input from the scanner
			
		}
		int age= sc.nextInt();
		System.out.println("age is :"+age);
	}

}
