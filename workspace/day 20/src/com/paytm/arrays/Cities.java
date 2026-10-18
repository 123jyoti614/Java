package com.paytm.arrays;

public class Cities {

	public static void main(String[] args) {


		String[] cities=new String[5];
		
		cities[0]="Srinagar";
		cities[1]="Shimla";
		cities[2]="Jammu";
		cities[3]="delhi";
		cities[4]="Hyderabad";
		
		for(int index=0; index<cities.length;index++) {
			if(cities[index].startsWith("S")) {
				System.out.println("City name starts with S " +cities[index]);
			}
		}
		

	}

}
