package com.paytm.arrays1;

public class Driver {

	public static void main(String[] args) {


		SbiAccountUser acc1= new SbiAccountUser("Jyoti",200000, "27314614");
		SbiAccountUser acc2= new SbiAccountUser("Roshni",2000000, "27314378930");
		SbiAccountUser acc3= new SbiAccountUser("Shikha",2000, "2731464356");
		SbiAccountUser acc4= new SbiAccountUser("Amul",200, "2731461463");
		SbiAccountUser acc5= new SbiAccountUser("Apoorva",200, "27314");
		SbiAccountUser acc6= new SbiAccountUser("Aradhya",20, "2731461425");
		SbiAccountUser acc7= new SbiAccountUser("'Arpita",200, "273146143847");
		
		SbiAccountUser user[] = new SbiAccountUser[7];
		user[0]=acc1;
		user[1]=acc2;
		user[2]=acc3;
		user[3]=acc4;
		user[4]=acc5;
		user[5]=acc6;
		user[6]=acc7;
		
		
		for(int index=0;index<user.length;index++) {
			if(user[index].balance<2000) {
				System.out.println("Name of the customer whose balance is less than 2k "+user[index].name +" and amount is "+user[index].balance);
			}
		}
		
		
		
		

	}

}
