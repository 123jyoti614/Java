
package com.ggogle.loops;

public class StarPattern {

	public static void main(String[] args) {
		
		//nested loop
		//outer loop track rows
		for(int i=1;i<=5;i++) {
			//inner loop track col 
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
