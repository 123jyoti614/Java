class FundTransfer{

  public static void main(String args[]){
	  
    	System.out.println("starting main()");
		// input : amount to be trasfered,senderacc, recieveracc
		boolean result = FundTransfer.doTransaction(10,"98456","23567");
		System.out.println("is txn successful " + result);
		
		System.out.println("ending main()");
		

	 
    } 
	static boolean doTransaction(int amountToBeTxn, String senderAccNo,String recAccNo ){
		
	    System.out.println("Input received" + amountToBeTxn + " " + senderAccNo +" " + recAccNo);
      	//some biz logic
		
		
        return true;
		
		
		
		
		
	}
   
}