package com.paytm.flow.control;

public class Continue {

	public static void main(String[] args) {


		//program to count total number of products in a array
		//excluding those starts with apple
		
		String products[]= {"apple16","samsung","lg","nokia","tata","apple16","samsung","apple17"};
		
		int productCount=0;
		for(int i=0;i<products.length;i++) {
			if(products[i].startsWith("apple")) {
				continue;
			}
			productCount++;
		}
		System.out.println("Total number of products is "+productCount);

	}

}
