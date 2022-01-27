package assignment11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
	public static void main(String[] args) {

	    String pattern = "[a-z]+";
	    String check = "Regular Expressions Example";
	    Pattern a = Pattern.compile(pattern);
	    Matcher b = a.matcher(check);
	    
	    while (b.find())
	          System.out.println( check.substring( b.start(), b.end() ) );
	    
	}
}
