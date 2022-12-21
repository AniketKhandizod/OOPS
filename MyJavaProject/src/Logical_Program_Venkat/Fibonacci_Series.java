package Logical_Program_Venkat;

import java.util.Scanner;

public class Fibonacci_Series {
	
	public static void M1() {
		Scanner SC = new Scanner (System.in);
		System.out.println("Give limit = ");
		int Limit = SC.nextInt();
		int A = 1;
		int B = 0;
		int STORE;
		for (int i = 0;i<Limit;i++) {
			STORE =A+B;System.out.println(A+"+"+B+"="+STORE);
			B=A;
			A=STORE;
			
			
		}
	}
	public static void M2() {
		Scanner SC = new Scanner (System.in);
		System.out.println("Give limit = ");
		int Limit = SC.nextInt();
		int A = 1;
		int B = 0;
		int STORE;
		do {
			STORE =A+B;System.out.println(A+"+"+B+"="+STORE);
			B=A;
			A=STORE;
			Limit--;
			
		}while (Limit>0);
	}
	public static void main(String[] args) {

		M2();
	
	}

}
























