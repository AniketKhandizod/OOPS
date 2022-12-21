package com.my_first_package;
import java.util.Scanner;  // Import the Scanner class
public class If_else {

	//public static void loopStatment() ;
		
		
		
	
	
	public static void main (String args[]) {
		for (int i =5;i<=500000;i++) {
			
			
			 
			/*Scanner sc=new Scanner(System.in);  //object of the Scanner class 
			System.out.print("Enter a number: ");  //invoking nextInt() method that reads an integer input by keyboard			 
			int num = sc.nextInt();  //storing the input number in a variable num 		  
			sc.close();  //closing the Scanner after use		 
			//System.out.println("The number entered by the user is: "+num);  //prints the number*/ 
			
			if (  i <= 10) {
				System.out.println("num lower than 55");
			}
			else {
				
				System.out.println("Brain storm = " + i*2);
			}
			System.out.println("value of i is = " + i);
		}
	}
}
