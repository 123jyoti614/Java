package com.ixigo.string1;

public class StringLiteral {

	public static void main(String[] args) {
		
		String s1 ="Java";  //scp
		String s2=new String("backend "); //2 object --> 1 object in scp
		//+1 object on heap
		/**
		 * Why creating on scp
		 * whatever written in double quote will go to scp
		 * and new object will create inside heap by jvm
		 * backend copy created on scp will be pointed by original (local refrence of string class)
		 * 
		 */
		System.out.println(s1==s2);
		
		String s3= new String("Java");//heap 
		System.out.println(s1==s3);//compare address
		String s4=new String("Java");//in heap  area new keyword will 
		//always create new object irrespective of content
		System.out.println(s4==s3);
		System.out.println(s4.equals(s3));//content compare
	}

}
