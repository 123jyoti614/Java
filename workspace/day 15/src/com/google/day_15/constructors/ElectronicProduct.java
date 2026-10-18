package com.google.day_15.constructors;

public class ElectronicProduct extends Product {
 
	int warranty;
	
	public ElectronicProduct(String _name,int _price,String _productId,String _brandName ,int _warranty){
		super(_name,_price,_productId,_brandName); //init the default fields
		
		this.warranty=_warranty;
		
	}
}
