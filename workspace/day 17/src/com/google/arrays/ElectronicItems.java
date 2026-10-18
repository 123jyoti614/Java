package com.google.arrays;

public class ElectronicItems {

	public static void main(String[] args) {
		
		//creating an array of electronic items with their price
		
		String itemName[] = {"Laptop","Smartphone","Smartwatch","Smarttv","Tablet"};
		
		int price[]= {90000,20000,2000,40000,5000};
		//variable to store the index of highest price
		int maxPriceIndex=0;
		
		//find the highest price
		for(int i=0;i<price.length;i++) {
			if(price[i]>price[maxPriceIndex]) {
				maxPriceIndex=i;
			}
		}
		//print the product with highest price
		System.out.println("The product with highest price is :"+itemName[maxPriceIndex] + " with a price of "+price[maxPriceIndex]);
		

	}

}
