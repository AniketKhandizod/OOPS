package Experiment;

import java.util.Scanner;

public class EVE_ODD_BOOST {
	public static void main(String[] args) {

		Scanner SC = new Scanner (System.in);
		System.out.print("Give inpute for count = ");
		long num = SC.nextLong();
		System.out.println("How many time u want to loop");
		long Loop = SC.nextLong();
		long EVE=0,ODD=0,St=0,REV=0,EVE_Count=0,ODD_Count=0,Total_count=0,compare = num ;
		
		for (int i=0;i<=Loop;i++) {System.out.println(">>Number = "+num);
		
		while(num!=0) {
			St=num%10;
			num/=10;
			REV = REV*10 + St;
			Total_count++;
			
			if (St%2 == 0) {
				EVE = EVE*10 + St;EVE_Count++;
				
			}else {ODD = ODD*10+St; ODD_Count++;}
				
			}
		System.out.println(">>Total number inpute count = "+ Total_count);
		System.out.println(">>Reverse of digit = "+REV);
		System.out.println(">>Even number = "+EVE+" is = "+EVE_Count );
		System.out.println(">>Odd number = "+ODD+" is = "+ODD_Count);
		
			if (compare==REV) {
				System.out.println(">>NUmber is Palindrom");
			}else {System.out.println(">>Number is NOT Palindrom");}num=compare*100;
			System.out.println();
		}
	}
}
