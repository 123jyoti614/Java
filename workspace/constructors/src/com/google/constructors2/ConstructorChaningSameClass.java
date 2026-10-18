package com.google.constructors2;

public class ConstructorChaningSameClass {
	
	String dbName,user,password;
	
	
	ConstructorChaningSameClass(){// default constructor calling parametrized constructor
		this("mydb","root","admin123"); //calls the next constructor
		
	}
	//parametrized constructor
	ConstructorChaningSameClass(String _dbName,String _user,String _password){
		this.dbName=_dbName;
		this.user=_user;
		this.password=_password;
		connect();
	}
	
	void connect() {
		System.out.println("Connecting to db");
	}

	public static void main(String[] args) {


		ConstructorChaningSameClass db1=new ConstructorChaningSameClass();
		ConstructorChaningSameClass db2=new ConstructorChaningSameClass();
		

	}

}
