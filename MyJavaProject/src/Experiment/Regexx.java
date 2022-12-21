package Experiment;

import java.util.regex.Pattern;

public class Regexx {

	public static void main(String[] args) {

	    System.out.println(Pattern.matches("....n", "Annnn"));
		System.out.println(Pattern.matches("[A-Z]", "A")); //not ->AA
		System.out.println(Pattern.matches("[A-Z]?", "A")); //not ->AA
		System.out.println(Pattern.matches("[A-Z]+", "AACC")); 
		System.out.println(Pattern.matches("[A-Z]*", "ZZZZ")); //-->if empty then also give true
		System.out.println(Pattern.matches("\\d*", "111"));
		System.out.println(Pattern.matches("\\D", "A"));
		System.out.println(Pattern.matches("\\D*", "AAA"));
		System.out.println(Pattern.matches("\\w*", "AAA345"));
		
	}

}
 