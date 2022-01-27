package assignment2;

public class PrivateSpe
{

	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	   public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			PrivateSpe  obj = new PrivateSpe(); 
	        obj.display();
	      //trying to access private method of another class it will throw an error

		}


}

