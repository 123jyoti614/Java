package com.phonepe.contol.flow.task;

public class DiscountApp {

	public void discountCalc(double purchaseAmount,String custType) {
		double discount;
		
		if(purchaseAmount>1000) {
			switch (custType) {
			case "Gold":
				discount = 0.2*purchaseAmount;
				if(discount>2500) {
					discount=2500;
				}
				System.out.println(discount);
				break;
			case "Silver":
				discount = 0.1*purchaseAmount;
				if(discount>2500) {
					discount=2500;
				}
				System.out.println(discount);
				break;
			case "Regular":
				discount=0.05*purchaseAmount;
				if(discount>2500) {
					discount=2500;
				}
				System.out.println(discount);
				break;

			default:
				System.out.println("not valid input");
				break;
			}
		}
		
	}
}
