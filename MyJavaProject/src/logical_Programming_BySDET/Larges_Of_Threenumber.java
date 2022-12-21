package logical_Programming_BySDET;

import java.util.Scanner;

public class Larges_Of_Threenumber {
	public static void Using_Ternory_OP() {
		Scanner SC = new Scanner (System.in);
		System.out.print("First input = ");		
		long F = SC.nextLong();
		System.out.print("Second input = ");		
		long S = SC.nextLong();
		System.out.print("Thired input = ");		
		long T = SC.nextLong();
		
		long Big = F>S?F:S;
		Big = T>Big?T:Big;
		
		System.out.println("Largest value is = "+Big);		
	}
	public static void Using_Ternory_OP2() {
		Scanner SC = new Scanner (System.in);
		System.out.print("First input = ");		
		long F = SC.nextLong();
		System.out.print("Second input = ");		
		long S = SC.nextLong();
		System.out.print("Thired input = ");		
		long T = SC.nextLong();
		
		long Big =F>(S>T?S:T)?F:(S>T?S:T);
		System.out.println("Largest value is = "+Big);
	}
	public static void If_Else() {
		Scanner SC = new Scanner (System.in);
		System.out.print("First input = ");		
		long F = SC.nextLong();
		System.out.print("Second input = ");		
		long S = SC.nextLong();
		System.out.print("Thired input = ");		
		long T = SC.nextLong();
		
		if (F>S && F >T) {
			System.out.println("First values is big");
		}
		else if (S>F && S >T) {
			System.out.println("Second values is big");
		}
		else if (T>S && T>F)  {
		System.out.println("Thired values is big");}
		else {System.out.println("AAA");}
	}
	

	public static void main(String[] args) {

	
		//Using_Ternory_OP();
		Using_Ternory_OP2();
		//If_Else();
		
	}

}
















