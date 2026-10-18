package com.phonepe.contol.flow2;

public class Driver {

	public static void main(String[] args) {
	
		Driver driver=new Driver();
		//command line input and parsing it to int
		int day=Integer.parseInt(args[0]);
		driver.identifyDay(day);

	}
	
	//identify the day based on the number supplied
	public void identifyDay(int number) {
		switch (number) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;

		default:
			System.out.println("unkown number");
			break;
		}
	}

}
