package com.google.arrays;

public class Arrays {
	
	public static void main(String args[]) {
		
		//creating an array called numbers of type integer and size 5
		int numbers[] = new int[5];
		
		// assigning the value to the array
		numbers[0]=12;
		numbers[1]=11;
		numbers[2]=1;
		numbers[3]=2;
		
		
		//access and print the array values
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);// default value assigned 0
		
		//length of the array
		int length= numbers.length;
		System.out.println(length);
	}
	

}
