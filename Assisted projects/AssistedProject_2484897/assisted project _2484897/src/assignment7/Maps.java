package assignment7;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();      
          hm.put(1,"Mortal");    
          hm.put(2,"Scout");    
          hm.put(3,"Carryminati");   
           
          System.out.println("\nThe elements of HashMap are ");  
          for(@SuppressWarnings("rawtypes") Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }
	}

}
