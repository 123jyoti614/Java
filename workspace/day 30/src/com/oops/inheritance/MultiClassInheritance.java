package com.oops.inheritance;

class Account{
	
	public void openAccount(String UserId) {
		System.out.println("Acc Opened");
	}
}
class SavingAcc extends Account{
	@Override  //changing the super class method functionalities
	
	public void openAccount(String UserId) {
		System.out.println("saving acc");
	}
}
class SrCitizenAcc extends SavingAcc{
	@Override
	public void openAccount(String UserId) {
		System.out.println("srcitizen acc");
	}
}
class PensionAcc extends SrCitizenAcc{
	@Override
	public void openAccount(String UserId) {
		System.out.println("pension acc");
	}
}

public class MultiClassInheritance {

	public static void main(String[] args) {

	}

}
