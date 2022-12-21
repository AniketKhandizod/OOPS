package classProgramming;

import java.util.Scanner;

public class Casting {
	
	static long M1() {

		Scanner OBJ = new Scanner (System.in);
		System.out.print("Inpute = ");
		long A = (long) OBJ.nextDouble();
		System.out.println(A);
		long Store = 0;
		
		while (A!=0) {
			
			long D = A%10;
			
			Store = Store * 10 + D;
			
			A/=10;
		
		}
			return Store;
	}
	static void M2() {
		int V = 0;
		int MB = 1024;
		
		for (int i = 0; i < 100000; i++) {		
		
		long A = (byte) i;
		
		//System.out.println(V);
		
		if (V==i) {System.out.println(i +" to byte = "+ A);V=V+MB;}
		//else {System.out.println("Skip");}
       }
		
	}

	public static void main(String[] args) {

		//System.out.println(M1());
		 M2();
	}

}
