package com.google.loops2;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {

		// taking user input int age,string name,double salary and validate them

		Scanner sc = new Scanner(System.in);
		// 1. validate age

		System.out.println("Enter your age..");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid user input!");
			sc.next();// clear the invalid input from user
		}
		int age = sc.nextInt();
		System.out.println("age is " + age);
		sc.nextLine();// consumes the leftover new line character after nextint()

		// 2. validate name
		String name;
		do {
			System.out.println("enter your name..");
			name = sc.nextLine().trim();
			if (name.isEmpty() || !name.matches("[a-zA-Z\\s]+")) {
				System.out.println("Invalid user input! (Letters and space only)");

			}

		} while (name.isEmpty() || !name.matches("[a-zA-Z\\s]+"));
		System.out.println("name is :" + name);

		// 3.validate salary

		System.out.println("Enter your salary...");
		while (!sc.hasNextDouble()) {
			System.out.println("Invalid user input..");
			sc.next();
		}
		double salary = sc.nextDouble();
		System.out.println("salary is " + salary);
		sc.close();
	}

}
