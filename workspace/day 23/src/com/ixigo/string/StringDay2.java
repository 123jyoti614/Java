package com.ixigo.string;

public class StringDay2 {

	public static void main(String[] args) {


		String s1="Jyoti";//scp
		String s2=new String("Chauhan");//1 object in scp +1 heap
		System.out.println(s1==s2);
		
		String s3= new String("jyoti");
		String s4=new String("Jyoti");
		
		System.out.println(s4==s3);
		System.out.println(s4.equals(s3));
	}

}
