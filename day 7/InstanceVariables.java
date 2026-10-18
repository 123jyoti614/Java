public class InstanceVariables{

   //int balance=30; //declaring and assigning instance variables
   int amount;
   
   public InstanceVariables(){
	   
	   this.amount=20;
   }
   
   public static void main(String args[]){
	   
	   InstanceVariables instanceVar = new InstanceVariables();
	   
	   //System.out.println("Balance :" + instanceVar.balance);
	   
	   System.out.println("Amount is :" + instanceVar.amount);
	   
	   
   }
}