package logical_Programming_BySDET;

import java.util.Scanner;

public class Digit_Count {

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.print("Give inpute for count = ");
		int num = SC.nextInt();
		
		int i=0;
		while (num!=0) {    //>this sign also woke there
			num/=10;		
		    ++i;
		}System.out.println(i);
	}

}
