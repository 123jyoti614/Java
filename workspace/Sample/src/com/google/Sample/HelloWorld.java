package com.google.Sample;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		int amount = 200;
		System.out.println("amount" + amount);
		System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);
		HelloWorld.doSomething();
	}

	public static void doSomething() {
		System.out.println("HelloWorld.doSomething()");
	}

}
