package assignment19;

public class Que19Employee {
	private static int id;
	private static String Name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		Que19Employee.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Que19Employee(int id, String name) {
		super();
		Que19Employee.id = id;
		Name = name;
	}


	public static void main (String [] args){
		
		Que19Employee emp1 = new Que19Employee(30,"Yasmin");
		System.out.println(emp1.toString());
		System.out.println(emp1.hashCode());

	}
	@Override
	public String toString(){
		
	return "Employee ID : "+id +"Employee Name :"+Name;
	  	   
   }
	@Override
	public int hashCode(){
		return id ;
	}
}
