package com.my_first_package;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);        // creat scanner object and import scanner
		
		System.out.println("What is your name");      // to get alphabates
		String name = scan.next();                    // this scan only till space after space they never store anyting
		name += scan.nextLine();                      // this can store all value after space also till we press enter button
		                                              // we can right - {name = name scan.nextLine();} also
		
		
		System.out.println("What is your Age");        // to get number
		int age = scan.nextInt();
		
		
		System.out.println("Hello " + name + " Your age is " + age ); 
		
		
		

	}

}
