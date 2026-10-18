package com.google.loop1;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {

		// create a Scanner object and connect scanner with system.in
		Scanner sc = new Scanner(System.in);
		// using nextint to read an integer
		System.out.println("Enter you age");
		int age = sc.nextInt();

		// clear the buffer
		sc.nextLine(); // consume the leftover new line character after nextInt()

		// using nextLine() to read a full line of text
		System.out.println("Enter your name");
		String fullName = sc.nextLine();

		// using next() to read a single word
		System.out.println("Enter your favourite colour");
		String color = sc.next();

		// using nextDouble() to read a decimal number
		System.out.println("Enter your weight..");
		double weight = sc.nextDouble();

		System.out.println("Age is " + age);
		System.out.println("Full name is " + fullName);
		System.out.println("colour is " + color);
		System.out.println("weight is " + weight);
		sc.close();
	}

}
