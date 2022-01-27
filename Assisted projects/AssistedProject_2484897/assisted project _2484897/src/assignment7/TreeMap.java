package assignment7;

import java.util.Map;

public class TreeMap {
	public static void main(String[] args)
	{
   java.util.TreeMap<Integer,String> map=new java.util.TreeMap<Integer,String>();    
    map.put(8,"Erangle");    
    map.put(9,"Livik");    
    map.put(10,"TDM");       
    
    System.out.println("\nThe elements of TreeMap are ");  
    for(@SuppressWarnings("rawtypes") Map.Entry l:map.entrySet()){    
     System.out.println(l.getKey()+" "+l.getValue());    
    }    
    
	}
 }  