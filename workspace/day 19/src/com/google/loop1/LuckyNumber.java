package com.google.loop1;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
	
		int luckyNumber=10;
		int userGuess=0;  //start with a initial user guess 0
		//create a scanner to read user input
		
		Scanner sc= new Scanner(System.in);
		
		while(userGuess != luckyNumber) {  //loop runs until user guess correct
			 
			userGuess=sc.nextInt();  /// taking user input 
			if(userGuess == luckyNumber) {  //check user guess is equal to lucky number
				
				System.out.println("Congratulations! you won");
				
			}
			else {
				System.out.println("Better luck next time");
			}
		}
		sc.close();
		
	}

}
