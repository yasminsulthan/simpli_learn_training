package assignment20;

public class Que20implementsParent1Parent2 implements Parent1, Parent2 {
	public void Show(){
		Parent1.super.show();
		Parent2.super.Show();
	}
 public static void main (String [] args){
	 Que20implementsParent1Parent2 tc =new   Que20implementsParent1Parent2();
	 tc.Show();
 }
}
