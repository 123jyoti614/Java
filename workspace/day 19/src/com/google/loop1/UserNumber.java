package com.google.loop1;

import java.util.Scanner;

public class UserNumber {

	public static void main(String[] args) {

		int userInput = 0;
		Scanner sc = new Scanner(System.in);
		while (userInput < 10) {

			userInput = sc.nextInt();
			if (userInput > 10) {
				System.out.println("Number is greater than 10 :" + userInput);

			}
		}
		sc.close();
	}

}
