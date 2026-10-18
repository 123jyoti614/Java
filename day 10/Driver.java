class Driver{

   public static void main(String args[]){
   
   System.out.println("driver.main() start");
    //call the placeOrder() method of OrderMgmt class
	 OrderMgmt objMgmt = new OrderMgmt();
	
	objMgmt.placeOrder("iphone 18");
	
	//System.out.println("order value is :" + objMgmt.orderValue);
	System.out.println("driver.main() end");
	
	
	
   
   }




}