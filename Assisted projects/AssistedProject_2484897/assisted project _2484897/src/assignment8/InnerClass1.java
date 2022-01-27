package assignment8;

public class InnerClass1 {
private String msg="Inner Classes";
void display() {
	class Inner{
		void msg() {
			System.out.println(msg);
		}
	}
	Inner I=new Inner();
	I.msg();
}

public static void main(String[]args) {
	InnerClass1 obj=new InnerClass1();
	obj.display();
}
}