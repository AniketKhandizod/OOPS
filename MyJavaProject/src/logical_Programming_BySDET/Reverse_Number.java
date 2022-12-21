package logical_Programming_BySDET;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {

		Scanner SC = new Scanner (System.in);
		System.out.print("Give inpute for return = ");
		int A = SC.nextInt();
		
		
		
		 int num = A, reversed = 0;
		    
		   while(num != 0) {
		    
		     
		      int digit = num % 10;
		      
		      reversed = reversed * 10 + digit;
		   
		     
		      num /= 10;
		    }   
		    System.out.println("Reversed Number: " + reversed);
		  
		
		
	}

}
