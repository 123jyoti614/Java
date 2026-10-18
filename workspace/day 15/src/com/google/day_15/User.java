package com.google.day_15;

/**
 * This class represent hotstar user.
 */

public class User {

	String name;
	String type;
	String country;
	
	User(String _name,String _type, String _country){
		
		this.name= _name;
		this.type =_type;
		this.country=_country;
		
	}
	/*
	 * no arg cunstructor 
	 * Default value for guest user
	 */
	public User() {
		
		this("user1","guest","IN");
	}
	
}
