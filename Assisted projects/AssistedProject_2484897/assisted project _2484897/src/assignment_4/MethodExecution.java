package assignment_4;

import java.util.Scanner;

public class MethodExecution {

	 Scanner sc = new Scanner(System.in) ;
	 public  int add()
     {
        	
    	 System.out.println("Enter first number");
 	   int  a = sc.nextInt();
 	    System.out.println("Enter second number");
 	    int  b= sc.nextInt();
    	int  c=a+b ;
    	System.out.println(c);
    	 System.out.println("The return type of the method is Integer");
    	 return c ;
     }
  public  void dispaly()
  {
	  System.out.println("Hello Mphasis");
	  System.out.println("The return type of the method is void");
  }
  
 public float multiply()
 {
	 System.out.println("Enter first number");
	   float m = sc.nextFloat();
	    System.out.println("Enter second number");
	   float  n= sc.nextFloat();
  	float p=m*n ;
  	System.out.println("The Product is : " + p);
  	System.out.println("The return type of the method is float");
  	return p;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		MethodExecution m=new MethodExecution();
  m.add();
  m.dispaly();
  m.multiply();
}
}
