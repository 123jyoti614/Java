package com.paytm.flow.control;

public class Break {

	public static void main(String[] args) {


		String products[]= {"apple16","samsung","LG","nokia","Tata","apple16","samusng"};
		
		for(int i=0;i<products.length;i++) {
			if(products[i]=="apple16") {
				System.out.println("I found my product "+products[i]);
				break;
			}
		}

	}

}
