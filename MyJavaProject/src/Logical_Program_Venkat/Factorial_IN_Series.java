package Logical_Program_Venkat;
import java.util.Scanner;
public class Factorial_IN_Series {
	

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		System.out.print("Give limit = ");
		int Lt = SC.nextInt();
		int Limit = 1;
		
		for (int i = 1; i <= Lt; i++) {
			  Limit = i;int Store = 1;int A = i;
			  System.out.print(i+"! = "); if (A==0) {System.out.print(A);};
			  
			for (int j = 0; j < i ; j++) {				 
				System.out.print( (A) );
				
			  if (A!=1) {System.out.print( " * " );} else {}
			  if (A!=0) {Store = Store*A;}else {}	
				A--;
				
			  	
			}
			
			 {System.out.print(" = "+Store);}
			
			System.out.println();
			
		}
		
		
	}

}
