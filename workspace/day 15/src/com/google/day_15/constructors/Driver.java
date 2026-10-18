package com.google.day_15.constructors;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectronicProduct electronicProduct = new ElectronicProduct("iphone", 150000, "PC001", "Apple", 1);
		
		System.out.println(electronicProduct.name);
		System.out.println(electronicProduct.price);
		System.out.println(electronicProduct.brandName);
		System.out.println(electronicProduct.productId);
		System.out.println(electronicProduct.warranty);

	}

}
