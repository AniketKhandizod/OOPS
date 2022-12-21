package Experiment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	  public static void main( String args[] ) {
	   	      
	      
	      //Compiling the regular expression
	      Pattern pattern = Pattern.compile("[aeiouAEIOU]");
	      Matcher matcher = pattern.matcher("zzzzzz");
	      
	      
	      if(matcher.find()) {
	         
	    System.out.println("Found");
	      }
	      
	      
	     boolean A = Pattern.compile(".s").matcher("As").matches();
	     System.out.println(A);
	    
	   }
	}


