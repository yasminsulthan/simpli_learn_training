package assignment6;

import java.util.*;

public class HashSet 
{
	public static void main(String[] args)
	{
	System.out.println("\nHashSet");
	java.util.HashSet<Integer> set=new java.util.HashSet<Integer>();  
    set.add(11);  
    set.add(13);  
    set.add(12);
    set.add(14);
    System.out.println(set);
    System.out.println("\n");
    System.out.println("LinkedHashSet");
    LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
    set2.add(1);  
    set2.add(2);  
    set2.add(3);
    set2.add(4);           
    System.out.println(set2);
       } 
   }
