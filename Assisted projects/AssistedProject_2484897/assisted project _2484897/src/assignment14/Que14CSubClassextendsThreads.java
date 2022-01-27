package assignment14;

public class Que14CSubClassextendsThreads {
public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		Que14extendsThread  a = new Que14extendsThread();
		Que14BextendsThread xc = new Que14BextendsThread();
		Que14CSubClassextendsThreads c = new Que14CSubClassextendsThreads();
		 a.start();
		 xc.sleep();
		 c.wait();
		 
		 System.out.println("MultiThreading is over");

	}
			
	
	
}
