package assignment8;

public class InnerClasses {
private String msg="Welcome to java";
	class inner{
		void hello()
		{
			System.out.println(msg+"Let us start learning Classes");
		}
	}
	public static void main(String[]args) {
		InnerClasses obj=new InnerClasses();
		inner in=obj.new inner();
		in.hello();
	}
}