package assignment13;

public class Que13Threads  extends Thread
{
		public void run()
		{
		try {
			System.out.println("Thread :"+Thread.currentThread().getId() +" is Running");
		}
			
		catch (Exception e){
			System.out.println("Exception Caught here ");
		}
	 }

		
		public static void main (String [] args){
			int n =15;
			for (int i=0; i < n;i++)
			{
				
				Que13Threads object = new Que13Threads() ;
				object.start();
				
			}
		}
	}

