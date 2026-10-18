package com.paytm.arrays;

public class Driver {

	public static void main(String[] args) {
		
		User user1= new User("Jyoti", "245858946042");
		User user2= new User("shiv", "24585899348");
		User user3= new User("Akash", "24585894696");
		User user4= new User("Rishita", "2458589435");
		User user5= new User("vishnu", "245858343");
		
		//store user objects in an array
		User users[] = new User[5];
		users[0]=user1;
		users[1]=user2;
		users[2]=user3;
		users[3]=user4;
		users[4]=user5;
		
		System.out.println(users);

	}

}
