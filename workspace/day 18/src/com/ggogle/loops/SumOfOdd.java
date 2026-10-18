package com.ggogle.loops;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		

		int numbers[] = new int[10];
		Scanner sc = new Scanner(System.in);
		// taking user input in arrays
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				sum = sum + numbers[i];
			}
		}
		System.out.println("sum of odd numbers is :" + sum);
		sc.close();
	}

}
