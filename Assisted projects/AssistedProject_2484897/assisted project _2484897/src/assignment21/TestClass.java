package assignment21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClass {
public static void main(String[]args) {
	Student st1=new Student(100,"Bill");
	Student st2=new Student(101,"Gates");
	//writing Objects to file
	try {
		FileOutputStream fos=new FileOutputStream(new File("D:\\javaObjects.txt"));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//write objects to file 
		oos.writeObject(st1);
        oos.writeObject(st2);
        oos.close();
        fos.close();
}
	catch (IOException e) {
		e.printStackTrace();
	}
	//read objects from file
	try {
		FileInputStream fis=new FileInputStream(new File("D:\\javaobjects.txt"));
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s1=(Student) ois.readObject();
		Student s2=(Student) ois.readObject();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		fis.close();
		ois.close();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}

