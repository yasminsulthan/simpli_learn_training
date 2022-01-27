package assignment7;

import java.util.*;

public class HashTable {

	public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
        ht.put(4,"Akm");  
        ht.put(5,"M4");  
        ht.put(6,"Kar98");  
        ht.put(7,"Awm");  

        System.out.println("\nThe elements of HashTable are ");  
        for(@SuppressWarnings("rawtypes") Map.Entry n:ht.entrySet()){    
         System.out.println(n.getKey()+" "+n.getValue());    
        }
	}
}
