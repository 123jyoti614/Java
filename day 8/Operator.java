class Operator{

    public static void main(String args[]){
		
	int minAge = 18; 
	int userAge = Integer.parseInt(args[0]);
	int maxAge= 60;
	String userName = args[1];
	System.out.println("apply dl for : " + userName);
	
	System.out.println("Allowed to apply foe dl :" + (minAge <= userAge));	
	System.out.println("allowed to apply for dl :" + ((minAge < userAge) && (userAge < maxAge)));
	
	String message = minAge < userAge ? "allowed" : "not allowed";
		
	}

}