package com.google.arrays;

public class Books {

	public static void main(String[] args) {
		//created an array of book tiles and their prices
		
		String bookTitle[]= {"programming","compiler","OS","java","Ai"};
		int bookPrices[]= {400,300,500,800,670};
		
		//print the list of books and their prices
		for(int i=0;i<bookPrices.length;i++) {
			System.out.println("The title of the book is :"+bookTitle[i] + " and their price is "+ bookPrices[i]);
		}
		

	}

}
