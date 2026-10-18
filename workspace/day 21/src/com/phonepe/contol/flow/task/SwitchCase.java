package com.phonepe.contol.flow.task;

public class SwitchCase {

	public static void main(String[] args) {
		/**
		 * As a part of e-commerce application we need to develop 
		 * discount app() which will calculate the discount based on customer type
		 * customer type:
		 * 1.Gold ->20%
		 * 2.silver->10%
		 * 3.regular->5%
		 * max discount :2500
		 * min purchase:1000 -> if customer purchase value is >1000 then discount applicable
		 
		 */
		double purchaseAmount=Integer.parseInt(args[0]);
		String custType=args[1];
		DiscountApp discountApp = new DiscountApp();
		discountApp.discountCalc(purchaseAmount,custType);

	}

}
