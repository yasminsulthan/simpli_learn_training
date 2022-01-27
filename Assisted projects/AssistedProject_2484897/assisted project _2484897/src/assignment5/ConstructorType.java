package assignment5;

//parameterized constructor 
public class ConstructorType {
	int id;
	String name;

	ConstructorType(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorType c1= new ConstructorType(10,"Yasmin");
		ConstructorType c2= new ConstructorType(21,"Taslim");
		c1.display();
		c2.display();
		
	}

}
