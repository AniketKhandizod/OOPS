package Logical_Program_Venkat;

import java.util.Scanner;

public class Recursion_Factorial {

	static int temp = 1,store=1;
	static int temps = 0,stores=1;
	
	static void pattern1(int D) {
		if (D<10) {
			for (int i=D;i>=1;i--) {
				System.out.print(D);
			}System.out.println();
			
			pattern1(D+1);
		}
	}
	
	static void pattern(int D) {
		if (D>0) {
			for (int i=1;i<=D;i++) {
				System.out.print(D);
			}System.out.println();
			
			pattern(D-1);
		}
	}
	
	static int sum(int B) {
		if (B>0) {
			temps = temps + B;
			sum(B-1);
			System.out.println(B);
		}
		return temps;
	}
	
	public static void Factorial(int A) {
		if (A>0) {
		temp=A-1;if (temp!=0) {store =store*temp;}
		System.out.print(temp);
		if(A!=1) {System.out.print(" * ");}else {System.out.println(" = "+store);}
		Factorial(A-1);}
	}
	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		//System.out.println("Inpute = ");
		//int A = SC.nextInt();
		//Factorial(A);
		//System.out.print(sum(5)+" ");
		pattern(9);
		pattern1(2);
	}
}
