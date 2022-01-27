package assignment5;

//default constructor 

public class Employee {
	int id;
	String name ;
	public void display()
	{
		System.out.println(id + " "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.display();
	}
}
