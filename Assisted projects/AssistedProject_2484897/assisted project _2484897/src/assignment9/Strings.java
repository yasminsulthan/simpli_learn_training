package assignment9;

public class Strings {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String sl=new String("Hello World");
		System.out.println(sl.length());
		//substring
				String sub=new String("Welcome");
				System.out.println(sub.substring(2));

				//String Comparison
				String s1="Hello";
				String s2="Heldo";
				System.out.println(s1.compareTo(s2));

				//IsEmpty
				String s4="";
				System.out.println(s4.isEmpty());

				//toLowerCase
				String s5="Hello";
				System.out.println(s5.toLowerCase());
				
				//replace
				String s6="Heldo";
				String replace=s6.replace('d', 'l');
				System.out.println(replace);

				//equals
				String x="Welcome to Java";
				String y="WeLcOmE tO JaVa";
				System.out.println(x.equals(y));
		 
				System.out.println("\n");
				System.out.println("Creating StringBuffer");
				//Creating StringBuffer and append method
				StringBuffer s=new StringBuffer("Welcome to Java!");
				s.append("Enjoy your learning");
				System.out.println(s);
				
				System.out.println(s.delete(0, 1));

				System.out.println(s.insert(1, "Welcome"));

				System.out.println(s.reverse());
						
				//conversion	
				System.out.println("\n");
				System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				String str = "Hello"; 
		        
		        // conversion from String object to StringBuffer 
		        StringBuffer sbr = new StringBuffer(str); 
		        sbr.reverse(); 
		        System.out.println("String to StringBuffer");
		        System.out.println(sbr); 
		          
		        // conversion from String object to StringBuilder 
		        StringBuilder sbl = new StringBuilder(str); 
		        sbl.append("world"); 
		        System.out.println("String to StringBuilder");
		        System.out.println(sbl);              		
			}
		}




