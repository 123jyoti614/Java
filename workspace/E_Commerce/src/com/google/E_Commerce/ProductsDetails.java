package com.google.E_Commerce;

public class ProductsDetails {
	
	String productName;
	int productPrice;
	String productDes;
	int productQty;
	
	ProductsDetails(){
		
	}
	
	ProductsDetails(String _productName , int _productPrice, String _productDes, int _productQty){
		
		this.productName= _productName;
		this.productPrice = _productPrice;
		this.productDes= _productDes;
		this.productQty = _productQty;
	}

}
