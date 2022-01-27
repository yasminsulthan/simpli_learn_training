package assignment17;

import java.io.IOException;
import java.util.Scanner;

public class Que17CustomExcepextendsException{
	
	static void validate (int age) throws IOException {
		if (age<18)
		{
			throw new IOException ("Age is not valid"); 
		}
		else
		{
			System.out.println("welcome to vote");   
		}
	}
	public static void main (String [] args){
		try
		{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age");
		int a=sc.nextInt();
		sc.close();
		validate(a);
		}
		catch (Exception e)
		{
			System.out.println("Exception occured : Age is not Valid");  
		}
		finally{
			System.out.println("Rest Of the code");  
		}
	}
}


