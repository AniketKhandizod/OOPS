package logical_Programming_BySDET;
import java.util.Scanner;
public class Palindrome_String {
	

	public static void main(String[] args) {

		Scanner SC = new Scanner (System.in);
		System.out.println("Enter a String");
		String S = SC.nextLine();
		String COMP = S;
		
		String REV ="";
		int LENT = S.length();
		
		for (int i = LENT - 1;i>=0;i--) {
			REV = REV + S.charAt(i);
		}
		if (COMP.equals(REV)) {System.out.println(REV+" = Is Palindrome String");}
		else {System.out.println(REV+" = Is NOT Palindrome String");}
			
		
	}

}
