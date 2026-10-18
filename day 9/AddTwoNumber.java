class AddTwoNumber{

    public static void main(String args[]){
	   
	   int num1= Integer.parseInt(args[0]);
	   int num2 = Integer.parseInt(args[1]);
	   
	   int result = AddTwoNumber.addNumber(num1,num2);
	   System.out.println(" sum of two number is :" + result);
	
	
	}
	
	static int addNumber(int num1, int num2){
		
		int sum = num1 + num2;
		
		return sum;
		
		
	}
	
	

}