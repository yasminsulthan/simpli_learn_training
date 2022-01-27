package assignment6;

import java.util.*;

public class LinkedList {
	
	public static void main(String[] args)
	{
	System.out.println("\nLinkedList");
    java.util.LinkedList<String> names=new java.util.LinkedList<String>();  
    names.add("kamala");  
    names.add("sneha");            
    Iterator<String> itr=names.iterator();  
    while(itr.hasNext()){  
     System.out.println(itr.next());  
     
    }
	}
}
