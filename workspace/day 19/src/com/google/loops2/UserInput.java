package com.google.loops2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		//take user input age(int),name(string),salary(double)
		
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		double salary=sc.nextDouble();
		
		System.out.println("age of the imployee is :"+age);
		System.out.println("name of the employee is :"+name);
		System.out.println("salary of the employee is :"+salary);
		
		sc.close();

	}

}
