package com.jyoti.objects;

public class User {
	
	String userName;
	String userId;
	String mobileNumber;
	
	//static block will executed just after the class loading
	static {
		System.out.println("I am in static init block");
	}

	public User(String userName, String userId, String mobileNumber) {
		super();
		
		System.out.println("User constructor...");
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}
	
	

}
