package Logical_Program_Venkat;

import java.util.Scanner;

public class Sum_Of_Natural_Number {

	public static void main(String[] args) {

		Scanner SC = new Scanner (System.in);
		System.out.print("Till Inpute = ");
		int Last_Val = SC.nextInt();
		System.out.println("From Inpute = ");
		int First_Val = SC.nextInt();
		int S=0;
		
		
		for (int i = First_Val; i <= Last_Val; i++) {
			System.out.print(i);
			if (i==(Last_Val)) {System.out.print("=");
			}else {System.out.print("+");}
             S = S + i;
            
            
            
			 
			 
			 
		}
		
		System.out.println(S);
	}

}
