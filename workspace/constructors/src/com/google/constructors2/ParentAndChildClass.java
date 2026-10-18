package com.google.constructors2;

class Employee {
	// Employee constructor
	String name;

	public Employee(String _name) {

		this.name = _name;
		System.out.println(name + " is an employee");
	}
}
public class ParentAndChildClass extends Employee {

	String dept;

	// ParentAndChildClass constructor calls employee constructor
	ParentAndChildClass(String _name, String _dept) {
		super(_name);
		this.dept = _dept;
		System.out.println(name + " is a manager of " + dept);
	}
	public static void main(String[] args) {

		ParentAndChildClass m = new ParentAndChildClass("Jyoti", "IT");
	}
}
