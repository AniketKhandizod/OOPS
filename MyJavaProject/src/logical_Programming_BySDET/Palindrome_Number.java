package logical_Programming_BySDET;
import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		Scanner SC =new Scanner(System.in);
		System.out.println("Put Palindrome Number");
		int num = SC.nextInt();
		int REF = num;
		int rev = 0;
	
		while (num != 0) {			
			
		    rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(REF == rev) {System.out.println(rev + " = Is Rev number");}
		else  {System.out.println(rev + " = Is NOT Rev number");}
	}

}
