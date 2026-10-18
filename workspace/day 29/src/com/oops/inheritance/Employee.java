package com.oops.inheritance;

 class Employee {
	
	String name="Amit";
	String address="Banglore";
	
	private String empCode="10032";
	
	public void markIn(String empId) {
		System.out.println("Marking in "+empId);
		
	}

	class Manager extends Employee{
		public void doSomething() {
			System.out.println(name); // using the parent class attributes
			System.out.println(address);
			
			markIn(empCode);  // using the parent class method
		}
	}
}
