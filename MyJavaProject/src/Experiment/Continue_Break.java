package Experiment;

import java.util.Scanner;

public class Continue_Break {

	public static void main(String[] args) {

		/*for (int i = 10 ; i>=1;i--) {
			System.out.println(i);
			break;
		}*/
		Scanner SC = new Scanner (System.in);
		
		
		for (; ;) {
			
			System.out.println();
			System.out.println("10=addition");
			System.out.println("11=Substraction");
			System.out.println("12=Multiplication");
			System.out.println();
			System.out.print("Ur input = ");
			int Z=SC.nextInt();
			
			if (10==Z) { 
				System.out.println("input for Addition = ");
				double A = SC.nextInt()	;
				System.out.println("input for Addition = ");
				double B = SC.nextInt()	;
				
				System.out.println("Addition = "+A+B);
				
			}
			if (11==Z) { 
				System.out.println("input for Substraction  = ");
				double A = SC.nextInt()	;
				System.out.println("input for Substraction  = ");
				double B = SC.nextInt()	;
				
				System.out.println("Substraction = "+ (A-B));
				
			}
			if (12==Z) { 
				System.out.println("input for Multiplication = ");
				double A = SC.nextInt()	;
				System.out.println("input for Multiplication = ");
				double B = SC.nextInt()	;
				
				System.out.println("Multiplication = "+A*B);
				
			}
			//else {System.out.print("Wrong number");}
			
			
			
		} 
	}

}
