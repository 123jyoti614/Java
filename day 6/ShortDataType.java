public class ShortDataType{

    public static void main(String args[]){
	
	   short var=24;
	   System.out.println(" value of var is : "+ var);
	   System.out.println("Short size is :" + Short.SIZE + "bits");
	   
	   System.out.println("Short range is :" + Short.MIN_VALUE + " to" + Short.MAX_VALUE);
	   
	   int var2= 456;
	   System.out.println(" integer value is : " + var2);
	   System.out.println("integer size is :" + Integer.SIZE + "bits");
	   System.out.println("integer range is :" + Integer.MIN_VALUE + "to" + Integer.MAX_VALUE);
	   
	   long var3=8976;
	   System.out.println(" long value is :" +  var3);
	   System.out.println("long size is :" + Long.SIZE);
       System.out.println("long range is : " + Long.MIN_VALUE + "to" + Long.MAX_VALUE);   
	}
}