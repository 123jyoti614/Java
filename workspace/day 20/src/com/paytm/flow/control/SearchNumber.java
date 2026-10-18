package com.paytm.flow.control;

public class SearchNumber {

	public static void main(String[] args) {
		int number=23;
		int arr[]= {12,2,3,5,7,23,45,67,87};
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==number) {
				System.out.println("Number found "+arr[i]);
				break;
			}
		}

	}

}
