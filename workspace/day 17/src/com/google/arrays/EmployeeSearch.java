package com.google.arrays;

import java.util.Scanner;

public class EmployeeSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// creating an array of employee name
		String employees[]= new String[5];
		
		employees[0] = "Mohit";
		employees[1]= "Raj";
		employees[2]="shiv";
		employees[3]="rohit";
		employees[4]="vishnu";
		
		// ask user to enter employee name for search
		System.out.println("Enter employee name to search: ");
		String searchName= sc.nextLine();
		boolean found=false;
		
		for(int i=0;i<employees.length;i++) {
			if(employees[i].equalsIgnoreCase(searchName)) {
				System.out.println("Employee found: "+ employees[i]);
				found=true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Employee not found "+ searchName);
		}

		sc.close();
	}

}
