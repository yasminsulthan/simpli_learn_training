package assignment14;

public class Que14extendsThread {
	 public void run(){
			int a=3;
			for (int k = 0; k< a; k++)
			{
			System.out.println("Thread : "+Thread.currentThread().getId()+" is running thread in A");
					
				}
			System.out.println("EXit From A");
			}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Thread starts");
	}

	
			
}
