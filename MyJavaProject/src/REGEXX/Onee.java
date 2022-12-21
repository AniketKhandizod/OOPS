package REGEXX;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Onee {
	public static void M1() {

		String Z = "ANIKET";
		Pattern p = Pattern.compile("ANIKET");
		Matcher m = p.matcher(Z);
		boolean b = m.matches();
		System.out.println(b);
	}

	public static void M2() {

		Pattern p = Pattern.compile(".s");// . represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);

	}

	public static void M3() {
		boolean b = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b);
	}

	public static void M4() {
		boolean b = Pattern.matches(".s", "as");
		System.out.println(b);
	}

	public static void M5() {
		System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
		System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is not s)
		System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
		System.out.println(Pattern.matches(".s", "amms"));// false (has more than 2 char)
		System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)
	   }
	public static void M6(){  
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
		}
	public static void M7(){  
		System.out.println("? quantifier ....");  
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
		  
		System.out.println("+ quantifier ....");  
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
		  
		System.out.println("* quantifier ....");  
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
		  
		}
	public static void M8(){
		System.out.println("metacharacters d...."); //d means digit  
		  
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		  
		System.out.println("metacharacters D...."); //D means non-digit  
		  
		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
		  
		System.out.println("metacharacters D with quantifier....");  
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times) 
	}
	public static void M9() {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  
	}
	public static void M10() {
		System.out.println("by character classes and quantifiers ...");  
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
		  
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
		  
		System.out.println("by metacharacters ...");  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3) 
	}
	public static void M11() {
		  Scanner sc=new Scanner(System.in);  
	        while (true) {    
	            System.out.println("Enter regex pattern:");  
	            Pattern pattern = Pattern.compile(sc.nextLine());    
	            System.out.println("Enter text:");  
	            Matcher matcher = pattern.matcher(sc.nextLine());    
	            boolean found = false;    
	            while (matcher.find()) {    
	                System.out.println("I found the text "+matcher.group()+" starting at index "+    
	                 matcher.start()+" and ending at index "+matcher.end());    
	                found = true;    
	            }    
	            if(!found){    
	                System.out.println("No match found.");    
	            }    
	        }
	}
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Put Which u want to run = ");

		switch (SC.nextInt()) {
		case 1 : M1(); break;
		case 2 : M2(); break;
		case 3 : M3(); break;
		case 4 : M4(); break;
		case 5 : M5(); break;
		case 6 : M6(); break;
		case 7 : M7(); break;
		case 8 : M8(); break;
		case 9 : M9(); break;
		case 10 : M10(); break;
		case 11 : M11(); break;
		}
	}

}
