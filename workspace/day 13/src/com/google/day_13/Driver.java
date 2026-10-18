package com.google.day_13;

class Invoice {
	static int gst = 18;

	int amount;
	String itemName;
	String billingAddress;
	String custId;
	String custName;

	Invoice(int _amount, String _itemName, String _billingAddress, String _custId, String _custName) {
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.custId = _custId;
		this.custName = _custName;

	}

}

public class Driver {

	public static void main(String[] args) {
		Invoice inv = new Invoice(17000, "iphone18", "delhi", "c43", "jyoti");

		Invoice inv1 = new Invoice(18000, "iphone12", "delhi", "c41", "abc");
		System.out.println("first invoice" + inv.amount + " , " + inv.custId + " , " + inv.gst);
		System.out.println("2nd invoice" + inv1.amount + " , " + inv1.custId + " , " + inv1.gst);

	}

}
