package logical_Programming_BySDET;

import java.util.Scanner;

public class String_CountWords {
	
	public static void M1() {
		
		Scanner SC = new Scanner (System.in);
		System.out.println("Inpute");
		String S = SC.nextLine();
		int count =0;
		
		for (int i = 0; i < S.length(); i++) {
			
			if (S.charAt(i) == ' ') {
				continue;
			}
			count ++;
			
		}
		System.out.println("Number of charachter is : "+count);
	}
	public static void M2() {
		
		Scanner SC = new Scanner (System.in);
		System.out.println("Inpute");
		String S = SC.nextLine();
		int count =1;
		
		for (int i = 0; i < S.length()-1; i++) {
			
			if ((S.charAt(i)) == ' '&& (S.charAt(i+1) != ' ')) {
				count ++;
			}			
		}
		System.out.println("Number of charachter is : "+count);
	}

	public static void main(String[] args) {
		M1();
		M2();
	}

}
