package assignment16;

import java.util.Scanner;

public class Que16 {
	 void div(int a, int b) throws ArithmeticException
		{
			if(b==0){
				throw new ArithmeticException();
			}
			else {
				int c=a/b;
				System.out.println(c);
			}
		}
		 public static void main (String[] args){

			 Scanner sc= new Scanner(System.in);
				System.out.println("Enter the value of A :");
				int a=sc.nextInt();
				System.out.println("Enter the value of B :");
				int b=sc.nextInt();
				
			Que16 tc = new Que16();
				
			try{
			tc.div(a, b);
			   }
			catch (Exception e)
			{
				System.out.println("Exception Occured : The value of B is O");
			}
			
			finally{
				System.out.println("Succesfully Oparated The Code");
		
		}
			sc.close();
		}
	
}
