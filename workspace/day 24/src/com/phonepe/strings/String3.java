package com.phonepe.strings;

public class String3 {

	public static void main(String[] args) {


		String s1="This " +"is from" +"kodewala";
		System.out.println(s1);
		
		String s2="Jyoti";//
		String s3="chauhan";
		
		String s4=s2+s3;//heap->new StringBuilder()
		System.out.println(s4);
		
		String s5="Jyotichauhan";//scp
		System.out.println(s5==s4);
		
		//intern() -> start referring object from scp if exist else it will copy to scp from heap
		
		System.out.println(s5==s4.intern());

	}

}
